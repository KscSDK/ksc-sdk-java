package com.ksc.live;

import com.ksc.auth.AWSCredentials;
import com.ksc.http.DefaultErrorResponseHandler;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import org.w3c.dom.Node;
import com.ksc.*;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.DefaultAWSCredentialsProviderChain;
import com.ksc.http.ExecutionContext;
import com.ksc.http.StaxResponseHandler;
import com.ksc.http.HttpResponseHandler;
import com.ksc.live.model.GetListRequest;
import com.ksc.live.model.LiveResult;
import com.ksc.live.model.transform.GetListRequestMarshaller;
import com.ksc.live.model.transform.LiveResultStaxUnmarshaller;
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

import java.util.ArrayList;
import java.util.List;


public class LiveClient extends KscWebServiceClient implements Live {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider kscCredentialsProvider;

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "live";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "live";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */

    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    protected final List<Unmarshaller<KscServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<KscServiceException, Node>>();

    public LiveClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
    }

    public LiveClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    public LiveClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }


    public LiveClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    public LiveClient(DefaultAWSCredentialsProviderChain defaultAWSCredentialsProviderChain, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
    }

    private void init() {

        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
//        setEndpoint("https://live.api.ksyun.com/?\n" +
//                "Action=llistPubStreamsInfo&Version=2016-09-25");
    }

    @Override
    public LiveResult listPubStreamsInfo(GetListRequest liveRequest) {
        ExecutionContext executionContext = createExecutionContext(liveRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetListRequest> request = null;
        Response<LiveResult> response = null;

        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetListRequestMarshaller()
                        .marshall(super.beforeMarshalling(liveRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<LiveResult> responseHandler = new StaxResponseHandler<LiveResult>(
                    new LiveResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getLiveResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }



    /**
     * Normal invoke with authentication. Credentials are required and may be
     * overriden at the request level.
     **/
    private <X, Y extends KscWebServiceRequest> Response<X> invoke(Request<Y> request,
                                                                   HttpResponseHandler<KscWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(
                CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), kscCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack
     * thereof) have been configured in the ExecutionContext beforehand.
     **/
    private <X, Y extends KscWebServiceRequest> Response<X> doInvoke(Request<Y> request,
                                                                     HttpResponseHandler<KscWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }


}
