package com.ksc.sts;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

import com.ksc.ClientConfiguration;
import com.ksc.ClientConfigurationFactory;
import com.ksc.KscServiceException;
import com.ksc.KscWebServiceClient;
import com.ksc.KscWebServiceRequest;
import com.ksc.KscWebServiceResponse;
import com.ksc.Request;
import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.DefaultAWSCredentialsProviderChain;
import com.ksc.http.DefaultErrorResponseHandler;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.http.StaxResponseHandler;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.sts.model.AssumeRoleRequest;
import com.ksc.sts.model.AssumeRoleResult;
import com.ksc.sts.model.transform.AssumeRoleRequestMarshaller;
import com.ksc.sts.model.transform.AssumeRoleStaxUnmarshaller;
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

/**
 * 金山云 STS 安全凭证服务客户端
 * @author wangbo9
 */
public class KSCSTSClient extends KscWebServiceClient implements KSCSTS {
    /** Provider for KSC credentials. */
    private AWSCredentialsProvider kscCredentialsProvider;

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sts";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "sts";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<KscServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<KscServiceException, Node>>();

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
    public KSCSTSClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                configFactory.getConfig());
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
    public KSCSTSClient(ClientConfiguration clientConfiguration) {
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
    public KSCSTSClient(AWSCredentials awsCredentials) {
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
    public KSCSTSClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.kscCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
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
    public KSCSTSClient(AWSCredentialsProvider awsCredentialsProvider) {
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
    public KSCSTSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
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
    public KSCSTSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.kscCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("http://sts.cn-beijing-6.api.ksyun.com");
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be
     * overriden at the request level.
     **/
    private <X, Y extends KscWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<KscWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext
                .setCredentialsProvider(CredentialUtils.getCredentialsProvider(
                        request.getOriginalRequest(), kscCredentialsProvider));

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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

    @Override
    public AssumeRoleResult assumeRole(AssumeRoleRequest assumeRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(
                assumeRoleRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeRoleRequest> request = null;
        Response<AssumeRoleResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeRoleRequestMarshaller()
                        .marshall(super.beforeMarshalling(assumeRoleRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            StaxResponseHandler<AssumeRoleResult> responseHandler = new StaxResponseHandler<AssumeRoleResult>(
                    new AssumeRoleStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

}
