package com.ksc.live;

import com.ksc.auth.AWSCredentials;
import com.ksc.http.*;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.live.model.transform.BaseJsonUnmarshaller;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.transform.Marshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;
import org.w3c.dom.Node;
import com.ksc.*;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.DefaultAWSCredentialsProviderChain;
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


public class KSCLiveClient extends KscWebServiceClient implements Live {

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

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
            new JsonClientMetadata().withSupportsCbor(false));

    protected final List<Unmarshaller<KscServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<KscServiceException, Node>>();

    public KSCLiveClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
    }

    public KSCLiveClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    public KSCLiveClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }


    public KSCLiveClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    public KSCLiveClient(DefaultAWSCredentialsProviderChain defaultAWSCredentialsProviderChain, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
    }

    private void init() {

        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
    }

    @Override
    public LiveResult listPubStreamsInfo(GetListRequest liveRequest) {
            return (LiveResult) this.makeApiCall(liveRequest,
                    GetListRequestMarshaller.getInstance(),
                    LiveResultStaxUnmarshaller.getInstance());
    }


    private Object makeApiCall(KscWebServiceRequest kscWebServiceRequest,
                               Marshaller marshaller, BaseJsonUnmarshaller unmarshaller) {
        ExecutionContext executionContext = createExecutionContext(kscWebServiceRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request request = null;
        Response response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = (Request) marshaller.marshall(super
                        .beforeMarshalling(kscWebServiceRequest));
                request.addHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.toString());
                request.setKscRequestMetrics(kscRequestMetrics);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<Object>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                                    .withPayloadJson(true)
                                    .withHasStreamingSuccessResponse(false),
                            unmarshaller);
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();
        } catch (Exception e) {
            e.printStackTrace();
            return unmarshaller.handleException(e);
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be
     * overriden at the request level.
     **/
    private <X, Y extends KscWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<KscWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils
                .getCredentialsProvider(request.getOriginalRequest(),
                        kscCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack
     * thereof) have been configured in the ExecutionContext beforehand.
     **/
    private <X, Y extends KscWebServiceRequest> Response<X> doInvoke(
            Request<Y> request,
            HttpResponseHandler<KscWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<KscServiceException> errorResponseHandler = protocolFactory
                .createErrorResponseHandler(new JsonErrorResponseMetadata());
        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }


}
