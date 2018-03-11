package com.aquaticinformatics.aquarius.sdk.samples;

import com.aquaticinformatics.aquarius.sdk.AquariusServerVersion;
import com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient;
import com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantDeserializer;
import com.aquaticinformatics.aquarius.sdk.samples.serializers.InstantSerializer;
import net.servicestack.client.HttpHeaders;
import net.servicestack.client.IReturn;
import net.servicestack.client.Route;

import java.lang.reflect.Type;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class SamplesClient implements AutoCloseable {

    public final SdkServiceClient Api;
    public final AquariusServerVersion ServerVersion;

    public static SamplesClient createConnectedClient(String hostname, String apiToken) {

        SamplesClient client = new SamplesClient(hostname);

        client.connect(apiToken);

        return client;
    }

    private final Map<Object,Type> _typeAdapters;

    private SamplesClient(String hostname) {
        _typeAdapters = new HashMap<Object,Type>();
        _typeAdapters.put(new InstantDeserializer(), Instant.class);
        _typeAdapters.put(new InstantSerializer(), Instant.class);

        Api = SdkServiceClient.Create(SdkServiceClient.resolveServerWithDefaultScheme(hostname, SdkServiceClient.HttpsScheme), EndPoints.ROOT, _typeAdapters);

        ServerVersion = getServerVersion();
    }

    private void connect(String apiToken) {
        Api.RequestFilter = request -> request.setRequestProperty(HttpHeaders.Authorization, "token " + apiToken);
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

    // TODO: void SparsePut(IReturnVoid requestDto)
    // TODO: public TResponse SparsePut<TResponse>(IReturn<TResponse> requestDto)

/*  TODO: Lazy gets

    public LazyResult<TDomainObject> LazyGet<TDomainObject, TRequest, TResponse>(TRequest requestDto)
    where TRequest : IPaginatedRequest, IReturn<TResponse>
    where TResponse : IPaginatedResponse<TDomainObject>

    {
        var responseDto = Get(requestDto);

        return new LazyResult<TDomainObject>
        {
            TotalCount = responseDto.TotalCount,
                    DomainObjects = GetPaginatedResults<TDomainObject, TRequest, TResponse>(requestDto, responseDto)
        };
    }

    private IEnumerable<TDomainObject> GetPaginatedResults<TDomainObject, TRequest, TResponse>(TRequest requestDto, TResponse responseDto)
    where TRequest : IPaginatedRequest, IReturn<TResponse>
    where TResponse : IPaginatedResponse<TDomainObject>
    {
        var totalCount = responseDto.TotalCount;

        for (var count = 0; count < totalCount;)
        {
            if (responseDto.DomainObjects == null)
                break;

            foreach (var domainObject in responseDto.DomainObjects)
            {
                yield return domainObject;
            }

            count += responseDto.DomainObjects.Count;

            if (count >= totalCount || count >= responseDto.TotalCount || !responseDto.DomainObjects.Any() || string.IsNullOrEmpty(responseDto.Cursor))
                break;

            requestDto.Cursor = responseDto.Cursor;

            responseDto = Get(requestDto);
        }
    }
*/

}
