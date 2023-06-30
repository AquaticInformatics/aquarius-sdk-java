package com.aquaticinformatics.aquarius.sdk.timeseries;

import com.aquaticinformatics.aquarius.sdk.AquariusServerVersion;
import com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer;
import com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient;
import com.aquaticinformatics.aquarius.sdk.timeseries.serializers.*;
import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish;
import net.servicestack.client.IReturn;
import net.servicestack.client.Route;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.crypto.Cipher;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.SocketTimeoutException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class AquariusClient implements AutoCloseable {

    public final SdkServiceClient Publish, Provisioning, Acquisition;
    public final AquariusServerVersion ServerVersion;

    public static AquariusClient createConnectedClient(String hostname, String username, String password) {

        AquariusClient client = new AquariusClient(hostname);

        client.connect(username, password);

        return client;
    }

    public static AquariusClient createConnectedClient(String hostname, String accessToken) {
        AquariusClient client = new AquariusClient(hostname);

        client.connect(accessToken);

        return client;
    }

    private final Map<Object,Type> _typeAdapters;
    private final IFieldNamer _fieldNamer;

    private AquariusClient(String hostname){
        _typeAdapters = new HashMap<Object,Type>();
        _typeAdapters.put(new StatisticalDateTimeOffsetDeserializer(), com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.StatisticalDateTimeOffset.class);
        _typeAdapters.put(new InstantDeserializer(), Instant.class);
        _typeAdapters.put(new InstantSerializer(), Instant.class);
        _typeAdapters.put(new DurationDeserializer(), Duration.class);
        _typeAdapters.put(new DurationSerializer(), Duration.class);

        _fieldNamer = new FieldNamer();

        Provisioning = SdkServiceClient.Create(hostname, EndPoints.PROVISIONING, _typeAdapters, _fieldNamer);
        Publish = SdkServiceClient.Create(hostname, EndPoints.PUBLISHV2, _typeAdapters, _fieldNamer);
        Acquisition = SdkServiceClient.Create(hostname, EndPoints.ACQUISITIONV2, _typeAdapters, _fieldNamer);

        ServerVersion = getServerVersion(hostname);
    }

    private AquariusServerVersion getServerVersion(String hostname) {
        SdkServiceClient versionClient = SdkServiceClient.Create(hostname, EndPoints.ROOT + "/apps/v1", new HashMap<Object,Type>(), _fieldNamer);

        versionClient.RequestFilter = request -> {
            request.setConnectTimeout(10000);
            request.setReadTimeout(5000);
        };

        final int MaximumRetryCount = 3;

        int attemptCount = 1;

        while(true) {

            try {
                return AquariusServerVersion.Create(versionClient.get(new GetVersion()).ApiVersion);
            }
            catch (Exception e) {

                boolean isRetryableException = e instanceof SocketTimeoutException;

                if (isRetryableException && attemptCount < MaximumRetryCount) {
                    ++attemptCount;
                    continue;
                }

                return null;
            }
        }
    }

    @Route(Path="/version", Verbs="GET")
    private class GetVersion implements IReturn<VersionResponse> {

        public Object getResponseType() { return VersionResponse.class; }
    }

    private class VersionResponse {
        public String ApiVersion;
    }

    private void connect(String username, String password) {
        String sessionToken = Publish.authenticate(username, getEncryptedPassword(password));

        Provisioning.setAuthenticationToken(sessionToken);
        Publish.setAuthenticationToken(sessionToken);
        Acquisition.setAuthenticationToken(sessionToken);
    }

    private void connect(AquariusClient this, String accessToken) {
        this.Acquisition.setBearerToken(accessToken);
        this.Provisioning.setBearerToken(accessToken);
        this.Publish.setBearerToken(accessToken);
    }

    private String getEncryptedPassword(String plaintextPassword) {
        Publish.PublicKey publicKey = Publish.get(new Publish.GetPublicKey());

        InputSource source = new InputSource(new StringReader(publicKey.Xml));

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(source);

            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();

            String modulusText = xpath.evaluate("/RSAKeyValue/Modulus", document);
            String exponentText = xpath.evaluate("/RSAKeyValue/Exponent", document);

            byte[] modulusByes = DatatypeConverter.parseBase64Binary(modulusText);
            byte[] exponentBytes = DatatypeConverter.parseBase64Binary(exponentText);

            BigInteger modulus = new BigInteger(1, modulusByes);
            BigInteger exponent = new BigInteger(1, exponentBytes);

            RSAPublicKeySpec pubSpec = new RSAPublicKeySpec(modulus, exponent);
            // Now you can encrypt the password using the public key:
            KeyFactory factory = KeyFactory.getInstance("RSA");
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
            PublicKey pubKey = factory.generatePublic(pubSpec);
            cipher.init(Cipher.ENCRYPT_MODE, pubKey);

            byte[] encryptedPasswordBlob = cipher.doFinal(plaintextPassword.getBytes("UTF-8"));

            // And finally, you can transform the blob into a base-64 string to assign the to
            // the EncryptedPassword property of the login DTO:
            return DatatypeConverter.printBase64Binary(encryptedPasswordBlob);
        }
        catch(Exception e) {
            return plaintextPassword;
        }
    }

    private void disconnect(){
        deleteSession();
    }

    private void deleteSession(){
        Publish.logoff();
    }

    @Override
    public void close() throws Exception {
        disconnect();
    }
}
