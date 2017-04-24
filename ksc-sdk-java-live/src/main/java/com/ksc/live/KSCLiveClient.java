package com.ksc.live;

import com.ksc.auth.AWSCredentials;
import com.ksc.http.*;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.util.CredentialUtils;
import com.ksc.*;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.DefaultAWSCredentialsProviderChain;
import com.ksc.live.model.GetListRequest;
import com.ksc.live.model.LiveResult;
import com.ksc.live.model.transform.GetListRequestMarshaller;
import com.ksc.live.model.transform.LiveResultStaxUnmarshaller;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


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


    private static final Log log =
            LogFactory.getLog(KSCLiveClient.class);




//    public KSCLiveClient() {
//        this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
//    }
//
//
//    public KSCLiveClient(ClientConfiguration clientConfiguration) {
//        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
//    }
//
//
//    public KSCLiveClient(AWSCredentials awsCredentials) {
//        this(awsCredentials, configFactory.getConfig());
//    }
//
//
//    public KSCLiveClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
//                            RequestMetricCollector requestMetricCollector) {
//        super(clientConfiguration, requestMetricCollector);
//        this.kscCredentialsProvider = awsCredentialsProvider;
//        init();
//    }
//
//
//    public KSCLiveClient(DefaultAWSCredentialsProviderChain defaultAWSCredentialsProviderChain, ClientConfiguration clientConfiguration) {
//        super(clientConfiguration);
//    }

    /**
     * Constructs a new client to invoke service methods on EIP. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the EIP metadata
     * service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public KSCLiveClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on EIP. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the EIP metadata
     * service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *            The client configuration options controlling how this client
     *            connects to KSC (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public KSCLiveClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on EIP using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use when
     *            authenticating with AWS services.
     */
    public KSCLiveClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on EIP using the
     * specified AWS account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use when
     *            authenticating with AWS services.
     * @param clientConfiguration
     *            The client configuration options controlling how this client
     *            connects to EIP (ex: proxy settings, retry counts, etc.).
     */
    public KSCLiveClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on EIP using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials to
     *            authenticate requests with KSC services.
     */
    public KSCLiveClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on EIP using the
     * specified AWS account credentials provider and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials to
     *            authenticate requests with KSC services.
     * @param clientConfiguration
     *            The client configuration options controlling how this client
     *            connects to EIP (ex: proxy settings, retry counts, etc.).
     */
    public KSCLiveClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on EIP using the
     * specified KSC account credentials provider, client configuration options,
     * and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials to
     *            authenticate requests with KSC services.
     * @param clientConfiguration
     *            The client configuration options controlling how this client
     *            connects to EIP (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *            optional request metric collector
     */
    public KSCLiveClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
                            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.kscCredentialsProvider = awsCredentialsProvider;
        init();
    }



    private void init() {

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
//        setEndpoint("http://live.cn-beijing-6.api.ksyun.com/");
        setEndpoint("http://live.api.ksyun.com");
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

            HttpResponseHandler<KscWebServiceResponse<LiveResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new LiveResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
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


        HttpResponseHandler<KscServiceException> errorResponseHandler = protocolFactory
                .createErrorResponseHandler(new JsonErrorResponseMetadata());
        try{
            return client.execute(request, responseHandler, errorResponseHandler, executionContext);
        }catch(Exception e){
            log.error(e);
            return null;
        }
    }


}
