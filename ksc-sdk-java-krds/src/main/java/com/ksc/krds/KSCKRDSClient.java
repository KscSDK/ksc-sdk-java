package com.ksc.krds;

import com.ksc.*;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.DefaultAWSCredentialsProviderChain;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.krds.model.*;
import com.ksc.krds.model.krdsBackup.ListKrdsBackupRequest;
import com.ksc.krds.model.krdsBackup.ListKrdsBackupResponse;
import com.ksc.krds.model.krdsInstance.*;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupRequest;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupResponse;
import com.ksc.krds.transform.krdsBackup.ListKrdsBackupMarshaller;
import com.ksc.krds.transform.krdsBackup.ListKrdsBackupResponseJsonUnmarshaller;
import com.ksc.krds.transform.krdsInstance.*;
import com.ksc.krds.transform.securityGroup.DescribeSecurityGroupJsonUnmarshaller;
import com.ksc.krds.transform.securityGroup.DescribeSecurityGroupMarshaller;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;

public class KSCKRDSClient extends KscWebServiceClient {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider kscCredentialsProvider;

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "krds";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "krds";


    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();
    protected final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
            new JsonClientMetadata().withSupportsCbor(false));


    /**
     * Constructs a new client to invoke service methods on KRDS. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>krdsInstance profile credentials delivered through the KRDS metadata
     * service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public KSCKRDSClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on EPC using the
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
    public KSCKRDSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on EPC using the
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
     *            connects to EPC (ex: proxy settings, retry counts, etc.).
     */
    public KSCKRDSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on EPC using the
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
     *            connects to EPC (ex: proxy settings, retry counts, etc.).
     */
    public KSCKRDSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on KRDS using the
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
     *            connects to EPC (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *            optional request metric collector
     */
    public KSCKRDSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
                        RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.kscCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public ListKrdsResponse listkrds(ListKrdsRequest listKrdsRequest) {
        InstanceClient client = new InstanceClient(this.kscCredentialsProvider.getCredentials());
        client.setEndpoint(this.endpoint.toString());
        RdsResponse<DescribeInstanceResponse> rdsResponse = client.describeInstances(listKrdsRequest);
        return new ListKrdsResponse(rdsResponse.getData(), rdsResponse.getRequestId());

    }

    public KrdsResponse deleteKRDS(DeleteKrdsRequest deleteKrdsRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteKrdsRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<DeleteKrdsRequest> request = null;
        Response<KrdsResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new DeleteKrdsMarshaller().marshall(super.beforeMarshalling(deleteKrdsRequest));
                request.addHeader("Accept", "application/json");
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<KrdsResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new KrdsResponseJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }

    }

    public DescribeSecurityGroupResponse describeSecurityGroup(DescribeSecurityGroupRequest describeSecurityGroupRequest){
        ExecutionContext executionContext = createExecutionContext(describeSecurityGroupRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<DescribeSecurityGroupRequest> request = null;
        Response<DescribeSecurityGroupResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new DescribeSecurityGroupMarshaller().marshall(super.beforeMarshalling(describeSecurityGroupRequest));
                request.addHeader("Accept", "application/json");
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<DescribeSecurityGroupResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeSecurityGroupJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    public CreateKrdsResponse createKRDS(CreateKrdsRequest createKrdsRequest) {
        ExecutionContext executionContext = createExecutionContext(createKrdsRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<CreateKrdsRequest> request = null;
        Response<CreateKrdsResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new CreateKrdsMarshaller().marshall(super.beforeMarshalling(createKrdsRequest));
                request.addHeader("Accept", "application/json");
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<CreateKrdsResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateKrdsResponseJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }

    }

    public ListKrdsBackupResponse listKrdsBackup(ListKrdsBackupRequest listKrdsBackupRequest){
        ExecutionContext executionContext = createExecutionContext(listKrdsBackupRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ListKrdsBackupRequest> request = null;
        Response<ListKrdsBackupResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ListKrdsBackupMarshaller().marshall(super.beforeMarshalling(listKrdsBackupRequest));
                request.addHeader("Accept", "application/json");
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<ListKrdsBackupResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListKrdsBackupResponseJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }


    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be
     * overriden at the request level.
     **/
    protected  <X, Y extends KscWebServiceRequest> Response<X> invoke(Request<Y> request,
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

        //DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        HttpResponseHandler<KscServiceException> errorResponseHandler = protocolFactory
                .createErrorResponseHandler(new JsonErrorResponseMetadata());
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
