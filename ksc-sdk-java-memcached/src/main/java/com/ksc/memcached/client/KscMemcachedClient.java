package com.ksc.memcached.client;

import com.ksc.*;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.DefaultAWSCredentialsProviderChain;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.StringUtils;

import java.util.UUID;

public class KscMemcachedClient extends KscWebServiceClient {
    /**
     * Provider for redis service
     */
    private String az;

    /**
     * Provider for AWS credentials.
     */
    private AWSCredentialsProvider kscCredentialsProvider;

    /**
     * Default signing name for the service.
     */
    public static final String DEFAULT_SIGNING_NAME = "memcached";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();
    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata().withSupportsCbor(false));

    /**
     * Constructs a new client to invoke service methods on MEMCACHED. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>instance profile credentials delivered through the MEMCACHED metadata
     * service</li>
     * </ul>
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public KscMemcachedClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig(), null);
    }

    /**
     * Constructs a new client to invoke service methods on MEMCACHED using the
     * specified AWS account credentials.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use when
     *                       authenticating with AWS services.
     */
    public KscMemcachedClient(AWSCredentials awsCredentials, String az) {
        this(awsCredentials, configFactory.getConfig(), az);
    }

    /**
     * Constructs a new client to invoke service methods on MEMCACHED using the
     * specified AWS account credentials and client configuration options.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials      The AWS credentials (access key ID and secret key) to use when
     *                            authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this client
     *                            connects to MEMCACHED (ex: proxy settings, retry counts, etc.).
     */
    public KscMemcachedClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, String az) {
        super(clientConfiguration);
        this.az = az;
        this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on MEMCACHED using the
     * specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will provide credentials to
     *                               authenticate requests with KSC services.
     * @param clientConfiguration    The client configuration options controlling how this client
     *                               connects to MEMCACHED (ex: proxy settings, retry counts, etc.).
     */
    public KscMemcachedClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, String az) {
        this(awsCredentialsProvider, clientConfiguration, null, az);
    }

    /**
     * Constructs a new client to invoke service methods on MEMCACHED using the
     * specified KSC account credentials provider, client configuration options,
     * and request metric collector.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will provide credentials to
     *                               authenticate requests with KSC services.
     * @param clientConfiguration    The client configuration options controlling how this client
     *                               connects to MEMCACHED (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public KscMemcachedClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector, String az) {
        super(clientConfiguration, requestMetricCollector);
        this.az = az;
        this.kscCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_SIGNING_NAME);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack
     * thereof) have been configured in the ExecutionContext beforehand.
     *
     * @param request
     * @param unmarshaller
     * @param <X>
     * @param <Y>
     * @return
     */
    protected <X, Y extends KscWebServiceRequest> Response<X> doAction(Request<Y> request, Unmarshaller<X, JsonUnmarshallerContext> unmarshaller) {
        ExecutionContext executionContext = createExecutionContext(request.getOriginalRequest());
        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), kscCredentialsProvider));
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Response<X> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request.addHeader("X-KSC-REQUEST-ID", UUID.randomUUID().toString());
                request.addHeader("Accept", "application/json");
                if (!StringUtils.isNullOrEmpty(az)) {
                    request.addHeader("X-KSC-AZ", az);
                }
                request.addParameter("Engine", "memcached");
                request.setKscRequestMetrics(kscRequestMetrics);
                request.setEndpoint(endpoint);
                request.setTimeOffset(timeOffset);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<X>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            unmarshaller);

            HttpResponseHandler<KscServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());
            return client.execute(request, responseHandler, errorResponseHandler, executionContext);
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }
}
