package com.aquaticinformatics.aquarius.sdk.timeseries;

import com.aquaticinformatics.aquarius.sdk.AquariusServerVersion;
import com.aquaticinformatics.aquarius.sdk.helpers.IFieldNamer;
import com.aquaticinformatics.aquarius.sdk.helpers.SdkServiceClient;
import com.aquaticinformatics.aquarius.sdk.timeseries.serializers.*;
import net.servicestack.client.IReturn;
import net.servicestack.client.Route;

import java.lang.reflect.Type;
import java.net.SocketTimeoutException;
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
        String sessionToken = Publish.authenticate(username, password);

        Provisioning.setAuthenticationToken(sessionToken);
        Publish.setAuthenticationToken(sessionToken);
        Acquisition.setAuthenticationToken(sessionToken);
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
