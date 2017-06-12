package com.ksc.kls;


import com.ksc.*;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.DefaultAWSCredentialsProviderChain;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.kls.model.*;
import com.ksc.kls.model.transform.*;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by yangfan on 2017/4/24.
 */
public class KSCKSLClient extends KscWebServiceClient implements KSCKLS {


    /** Provider for AWS credentials. */
    private AWSCredentialsProvider kscCredentialsProvider;


    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kls";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "kls";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
            new JsonClientMetadata().withSupportsCbor(false));


    private static final Log log = LogFactory.getLog(KSCKSLClient.class);

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
    public KSCKSLClient() {
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
    public KSCKSLClient(ClientConfiguration clientConfiguration) {
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
    public KSCKSLClient(AWSCredentials awsCredentials) {
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
    public KSCKSLClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
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
    public KSCKSLClient(AWSCredentialsProvider awsCredentialsProvider) {
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
    public KSCKSLClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
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
    public KSCKSLClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
                        RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.kscCredentialsProvider = awsCredentialsProvider;
        init();
    }


    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        setEndpoint("http://kls.cn-beijing-6.api.ksyun.com/");
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

    @Override
    public CreateRecordResult createRecordTask(CreateRecordRequest createRecordRequest) {
        ExecutionContext executionContext = createExecutionContext(createRecordRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<CreateRecordRequest> request = null;
        Response<CreateRecordResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new CreateRecordRequestMarshaller()
                        .marshall(super.beforeMarshalling(createRecordRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<CreateRecordResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateRecordResultUnmarshaller());

            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }


    @Override
    public CancelRecordResult cancelRecordTask(CancelRecordRequest cancelRecordRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelRecordRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<CancelRecordRequest> request = null;
        Response<CancelRecordResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new CancelRecordRequestMarshaller()
                        .marshall(super.beforeMarshalling(cancelRecordRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<CancelRecordResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CancelRecordResultUnmarshaller());

            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }


    @Override
    public GetRecordTaskResult getRecordTask(GetRecordTaskRequest getRecordTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(getRecordTaskRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<GetRecordTaskRequest> request = null;
        Response<GetRecordTaskResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new GetRecordTaskMarshaller()
                        .marshall(super.beforeMarshalling(getRecordTaskRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<GetRecordTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetRecordTaskUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ListHistoryRecordTasksResult listHistoryRecordTasks(ListHistoryRecordTasksRequest listHistoryRecordTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(listHistoryRecordTasksRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ListHistoryRecordTasksRequest> request = null;
        Response<ListHistoryRecordTasksResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ListHistoryRecordTaskMarshaller()
                        .marshall(super.beforeMarshalling(listHistoryRecordTasksRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<ListHistoryRecordTasksResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListHistoryRecordTaskUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public StartStreamRecordResult startStreamRecord(StartStreamRecordRequest startStreamRecordRequest) {
        ExecutionContext executionContext = createExecutionContext(startStreamRecordRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<StartStreamRecordRequest> request = null;
        Response<StartStreamRecordResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new StartStreamRecordMarshaller()
                        .marshall(super.beforeMarshalling(startStreamRecordRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<StartStreamRecordResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartStreamRecordUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public StopStreamRecordResult stopStreamRecord(StopStreamRecordRequest stopStreamRecordRequest) {
        ExecutionContext executionContext = createExecutionContext(stopStreamRecordRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<StopStreamRecordRequest> request = null;
        Response<StopStreamRecordResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new StopStreamRecordMarshaller()
                        .marshall(super.beforeMarshalling(stopStreamRecordRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<StopStreamRecordResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StopStreamRecordUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ListRecordingTasksResult listRecordingTasks(ListRecordingTasksRequest listRecordingTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(listRecordingTasksRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ListRecordingTasksRequest> request = null;
        Response<ListRecordingTasksResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ListRecordingTasksMarshaller()
                        .marshall(super.beforeMarshalling(listRecordingTasksRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<ListRecordingTasksResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListRecordingTasksUnmarshaller());


            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ListStreamDurationsResult listStreamDurations(ListStreamDurationsRequest listStreamDurationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listStreamDurationsRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ListStreamDurationsRequest> request = null;
        Response<ListStreamDurationsResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ListStreamDurationsMarshaller()
                        .marshall(super.beforeMarshalling(listStreamDurationsRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<ListStreamDurationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListStreamDurationsUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public KillStreamCacheResult killStreamCache(KillStreamCacheRequest killStreamCacheRequest) {
        ExecutionContext executionContext = createExecutionContext(killStreamCacheRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<KillStreamCacheRequest> request = null;
        Response<KillStreamCacheResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new KillStreamCacheMarshaller()
                        .marshall(super.beforeMarshalling(killStreamCacheRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<KillStreamCacheResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new KillStreamCacheUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ListHistoryPubStreamsErrInfoResult listHistoryPubStreamsErrInfo(ListHistoryPubStreamsErrInfoRequest listHistoryPubStreamsErrInfoRequest) {
        ExecutionContext executionContext = createExecutionContext(listHistoryPubStreamsErrInfoRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ListHistoryPubStreamsErrInfoRequest> request = null;
        Response<ListHistoryPubStreamsErrInfoResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ListHistoryPubStreamsErrInfoMarshaller()
                        .marshall(super.beforeMarshalling(listHistoryPubStreamsErrInfoRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<ListHistoryPubStreamsErrInfoResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListHistoryPubStreamsErrInfoUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ListHistoryPubStreamsErrInfoResult listHistoryPubStreamsInfo(ListHistoryPubStreamsErrInfoRequest listHistoryPubStreamsErrInfoRequest) {
        ExecutionContext executionContext = createExecutionContext(listHistoryPubStreamsErrInfoRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ListHistoryPubStreamsErrInfoRequest> request = null;
        Response<ListHistoryPubStreamsErrInfoResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ListHistoryPubStreamsErrInfoMarshaller()
                        .marshall(super.beforeMarshalling(listHistoryPubStreamsErrInfoRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<ListHistoryPubStreamsErrInfoResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListHistoryPubStreamsErrInfoUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ListRealtimePubStreamsInfoResult listRealtimePubStreamsInfo(ListRealtimePubStreamsInfoRequest listRealtimePubStreamsInfoRequest) {
        ExecutionContext executionContext = createExecutionContext(listRealtimePubStreamsInfoRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ListRealtimePubStreamsInfoRequest> request = null;
        Response<ListRealtimePubStreamsInfoResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ListRealtimePubStreamsInfoMarshaller()
                        .marshall(super.beforeMarshalling(listRealtimePubStreamsInfoRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<ListRealtimePubStreamsInfoResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListRealtimePubStreamsInfoUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }
}
