package com.aquaticinformatics.aquarius.sdk.samples;

import com.aquaticinformatics.aquarius.sdk.AquariusServerVersion;
import com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer;
import com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient;
import com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer;
import com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantSerializer;

import java.lang.reflect.Type;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SamplesClient implements AutoCloseable {

    public final SdkServiceClient Api;
    public final SdkServiceClient SparseApi;
    public final AquariusServerVersion ServerVersion;

    public static SamplesClient createConnectedClient(String hostname, String apiToken) {

        SamplesClient client = new SamplesClient(hostname);

        client.connect(apiToken);

        return client;
    }

    private final Map<Object,Type> _typeAdapters;
    private final IFieldNamer _fieldNamer;

    private SamplesClient(String hostname) {
        _typeAdapters = new HashMap<Object,Type>();
        _typeAdapters.put(new InstantDeserializer(), Instant.class);
        _typeAdapters.put(new InstantSerializer(), Instant.class);

        _fieldNamer = new FieldNamer();

        Api = SdkServiceClient.Create(SdkServiceClient.resolveServerWithDefaultScheme(hostname, SdkServiceClient.HttpsScheme), EndPoints.ROOT, _typeAdapters, _fieldNamer);
        SparseApi = SdkServiceClient.Create(SdkServiceClient.resolveServerWithDefaultScheme(hostname, SdkServiceClient.HttpsScheme), EndPoints.ROOT, _typeAdapters, _fieldNamer, true);

        ServerVersion = getServerVersion();
    }

    private void connect(String apiToken) {
        Api.setApiToken(apiToken);
        SparseApi.setApiToken(apiToken);
    }

    private AquariusServerVersion getServerVersion() {
        ServiceModel.Status response = Api.get(new ServiceModel.GetStatus());

        return AquariusServerVersion.Create(response.ReleaseName);
    }

    private void disconnect() {
    }

    @Override
    public void close() throws Exception {
        disconnect();
    }

    // TODO: File uploads with all the special FineUploader emulation cruft: qqfile, qquuid, qqfilename, and qqtotalfilesize
    // public <TResponse> TResponse postFileWithRequest(InputStream contentToUpload, String fileName, IReturn<TResponse> requestDto)
    // {
    //    return postFileWithRequest(contentToUpload, fileName, requestDto, "upload");
    // }
    //
    // public <TResponse> TResponse postFileWithRequest(InputStream contentToUpload, String fileName, IReturn<TResponse> requestDto, String fieldName)


    public <TDomainObject> LazyResult<TDomainObject> lazyGet(Consumer<String> setCursorAction, Supplier<IPaginatedResponse<TDomainObject>> getNextPageFunc) {
        return new LazyResult<>(setCursorAction, getNextPageFunc);
    }

    public <TDomainObject> Stream<TDomainObject> lazyGetStream(Consumer<String> setCursorAction, Supplier<IPaginatedResponse<TDomainObject>> getNextPageFunc) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(lazyGet(setCursorAction, getNextPageFunc), Spliterator.ORDERED),
                false);
    }
}
