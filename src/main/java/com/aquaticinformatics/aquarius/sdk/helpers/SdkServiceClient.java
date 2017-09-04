package com.aquaticinformatics.aquarius.sdk.helpers;

import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Provisioning;
import com.google.gson.GsonBuilder;
import net.servicestack.client.*;
import net.servicestack.func.Func;
import net.servicestack.func.Predicate;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SdkServiceClient extends net.servicestack.client.JsonServiceClient {
    private String endpointUrl;

    private final Map<Object,Type> _typeAdapters;

    private SdkServiceClient(String baseUrl, Map<Object,Type> typeAdapters) {
        super(baseUrl);
        _typeAdapters = typeAdapters;
    }

    public static SdkServiceClient Create(String server, String baseUrl, Map<Object,Type> typeAdapters)
    {
        setUserAgent();

        if (!server.startsWith("http")) {
            server = "http://" + server;
        }

        return new SdkServiceClient(server + baseUrl, typeAdapters);
    }

    private static void setUserAgent() {
        buildUserAgentOnce();
        System.setProperty("http.agent", userAgent);
    }

    private static String userAgent = null;

    private static void buildUserAgentOnce() {

        if (userAgent != null)
            return;

        // Build a useful agent string from: SDK version, ServiceStack version (and " Java/JVM version" by default)
        StringBuilder builder = new StringBuilder();

        MavenXpp3Reader reader = new MavenXpp3Reader();

        try {
            Model model = reader.read(new FileReader("pom.xml"));

            // TODO: Finding the outermost class name is too slow/unreliable in Java
            builder.append(model.getArtifactId());
            builder.append(':');
            builder.append(model.getVersion());

            for (Dependency dep: model.getDependencies() ) {
                if (dep.getGroupId().contains("servicestack")){
                    builder.append('/');
                    builder.append(dep.getGroupId());
                    builder.append('.');
                    builder.append(dep.getArtifactId());
                    builder.append(':');
                    builder.append(dep.getVersion());
                    break;
                }
            }
        } catch (IOException | XmlPullParserException ignored) {
        }

        userAgent = builder.toString();
    }

    public String authenticate(String username, String password)
    {
        return post( new Provisioning.PostSession()
                .setUsername(username)
                .setEncryptedPassword(password));
    }

    public void logoff()
    {
        delete(new Provisioning.DeleteSession());
    }

    public void setAuthenticationToken(String authenticationToken)
    {
        RequestFilter = request -> request.setRequestProperty("X-Authentication-Token", authenticationToken);
    }

    @Override
    public GsonBuilder getGsonBuilder() {
        GsonBuilder gsonBuilder = super.getGsonBuilder();

        _typeAdapters.forEach((object, type) -> gsonBuilder.registerTypeAdapter(type, object));

        return gsonBuilder;
    }

    public <TResponse> TResponse postFileWithRequest(File fileToUpload, IReturn<TResponse> requestDto)
    {
        try (FileInputStream contentToUpload = new FileInputStream(fileToUpload.getPath())) {
            return postFileWithRequest(contentToUpload, fileToUpload.getName(), requestDto);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public <TResponse> TResponse postFileWithRequest(InputStream contentToUpload, String fileName, IReturn<TResponse> requestDto)
    {
        return postFileWithRequest(contentToUpload, fileName, requestDto, "upload");
    }

    public <TResponse> TResponse postFileWithRequest(InputStream contentToUpload, String fileName, IReturn<TResponse> requestDto, String fieldName)
    {
        Route route = getRoute(requestDto);

        if (route == null)
            throw new RuntimeException("No REST route found for " + requestDto.getClass().getName());

        StringBuffer urlBuffer = new StringBuffer(this.endpointUrl);

        Map<String,String> propertyMap = ResolveTemplateParameters(route, urlBuffer, requestDto);

        String requestUrl = urlBuffer.toString();

        MultipartBuilder builder = new MultipartBuilder();
        builder.addFileContent(fieldName, fileName, contentToUpload);

        propertyMap.forEach((name,value) -> builder.addField(name, value));
        builder.finish();

        return send(requestUrl, HttpMethods.Post, builder.toByteArray(), builder.getContentType(), requestDto.getResponseType());
    }

    // The remaining overrides are required so that all requests are sent to routes that match the .NET SDK behaviour.
    // When a DTO has one-and-only-one @Route attribute (which is true for all AQTS public APIs, but not for all
    // possible ServiceStack consumers), then prefer the named route.
    // Else, fall back to the "/json/reply/{DtoClassName}" route.

    @Override
    public void setBaseUrl(String baseUrl){
        this.endpointUrl = Utils.trimEnd(baseUrl, '/');
        super.setBaseUrl(baseUrl);
    }

    private static Pattern templateParameterPattern;

    static {
        templateParameterPattern = Pattern.compile("\\{(\\w+)\\}");
    }

    private Map<String,String> ResolveTemplateParameters(Route route, StringBuffer urlBuffer, Object requestDto) {
        ArrayList<Field> fields = Func.toList(Utils.getSerializableFields(requestDto.getClass()));

        try {
            Matcher m = templateParameterPattern.matcher(route.Path());

            while (m.find()) {
                String parameterName = m.group(1);

                Field f = Func.first(fields, new Predicate<Field>() {
                    @Override
                    public boolean apply(Field field) {
                        return field.getName().equalsIgnoreCase(parameterName);
                    }
                });

                if (f == null)
                    continue;

                Object val = f.get(requestDto);

                if (val == null)
                    continue;

                m.appendReplacement(urlBuffer, URLEncoder.encode(Utils.stripQuotes(getGson().toJson(val)), "UTF-8"));

                fields.remove(f);
            }

            m.appendTail(urlBuffer);

        } catch (IllegalAccessException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        return createJsvPropertyMap(requestDto, fields);
    }

    private Map<String,String> createJsvPropertyMap(Object requestDto, ArrayList<Field> fields) {

        Map<String,String> propertyMap = new HashMap<String,String>();

        try {
            for (Field f : fields) {
                Object val = f.get(requestDto);

                if (val == null)
                    continue;

                String name = f.getName();
                String value = Utils.stripQuotes(getGson().toJson(val));

                propertyMap.put(name, value);
            }

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return propertyMap;
    }

    @Override
    public String createUrl(Object requestDto, Map<String,String> query){
        return createUrl(requestDto, query, HttpMethods.Get);
    }

    public String createUrl(Object requestDto, String httpMethod){
        return createUrl(requestDto, null, httpMethod);
    }

    public String createUrl(Object requestDto, Map<String,String> query, String httpMethod){

        Route route = getRoute(requestDto);

        if (route == null)
            return super.createUrl(requestDto, query);

        StringBuffer urlBuffer = new StringBuffer(this.endpointUrl);
        StringBuilder queryBuilder = new StringBuilder();

        Map<String,String> propertyMap = ResolveTemplateParameters(route, urlBuffer, requestDto);

        if (httpMethod == HttpMethods.Get) {

            propertyMap.forEach((name,value) -> appendQueryParameter(queryBuilder, name, value));

            if (query != null) {
                query.forEach((key, val) -> appendQueryParameter(queryBuilder, key, val));
            }
        }

        urlBuffer.append(queryBuilder.toString());

        return urlBuffer.toString();
    }

    private Route getRoute(Object requestDto) {
        Class<?> requestDtoClass = requestDto.getClass();
        Route[] routes = requestDtoClass.getDeclaredAnnotationsByType(Route.class);

        if (routes.length != 1)
            return null;

        return routes[0];
    }

    private void appendQueryParameter(StringBuilder queryBuilder, String name, String value) {
        try {
            queryBuilder.append(queryBuilder.length() == 0 ? "?" : "&");

            queryBuilder.append(URLEncoder.encode(name, "UTF-8"));
            queryBuilder.append("=");

            if (value != null) {
                queryBuilder.append(URLEncoder.encode(value, "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    // Utils.combinePath(replyUrl, typeName(request)) => 6 usages

    @Override
    public <TResponse> TResponse post(IReturn<TResponse> request) {
        return send(createUrl(request, HttpMethods.Post), HttpMethods.Post, request, request.getResponseType());
    }

    @Override
    public void post(IReturnVoid request) {
        send(createUrl(request, HttpMethods.Post), HttpMethods.Post, request, IReturnVoid.class);
    }

    @Override
    public <TResponse> TResponse put(IReturn<TResponse> request) {
        return send(createUrl(request, HttpMethods.Put), HttpMethods.Put, request, request.getResponseType());
    }

    @Override
    public void put(IReturnVoid request) {
        send(createUrl(request, HttpMethods.Put), HttpMethods.Put, request, IReturnVoid.class);
    }

    @Override
    public void send(IReturnVoid request) {
        String httpMethod = GetSendMethod(request);
        send(createUrl(request, httpMethod), httpMethod, request, IReturnVoid.class);
    }

    @Override
    public <TResponse> TResponse sendRequest(Object request, Object responseClass) {
        String httpMethod = GetSendMethod(request);
        String url = createUrl(request, httpMethod);
        if (hasRequestBody(httpMethod)){
            return send(url, httpMethod, request, responseClass);
        } else {
            return send(url, httpMethod, null, null, responseClass);
        }
    }

    // Other
    @Override
    public <TResponse> TResponse delete(IReturn<TResponse> request) {
        return send(createUrl(request, HttpMethods.Delete), HttpMethods.Delete, request.getResponseType());
    }

    @Override
    public void delete(IReturnVoid request) {
        send(createUrl(request, HttpMethods.Delete), HttpMethods.Delete, IReturnVoid.class);
    }

    @Override
    public <TResponse> TResponse delete(IReturn<TResponse> request, Map<String, String> queryParams) {
        return send(createUrl(request, queryParams, HttpMethods.Delete), HttpMethods.Delete, request.getResponseType());
    }
}
