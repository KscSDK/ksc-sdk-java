package com.ksc.network.bws;

import com.ksc.*;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.DefaultAWSCredentialsProviderChain;
import com.ksc.http.DefaultErrorResponseHandler;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.http.StaxResponseHandler;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.network.bws.model.*;
import com.ksc.network.bws.model.transform.*;
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class KSCBWSClient extends KscWebServiceClient implements KSCBWS {
    /**
     * Provider for AWS credentials.
     */
    private AWSCredentialsProvider kscCredentialsProvider;

    /**
     * Default signing name for the service.
     */
    private static final String DEFAULT_SIGNING_NAME = "bws";

    /**
     * The region metadata service name for computing region endpoints.
     */
    private static final String DEFAULT_ENDPOINT_PREFIX = "bws";

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
     * Constructs a new client to invoke service methods on BWS. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the BWS metadata
     * service</li>
     * </ul>
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public KSCBWSClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on BWS. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the BWS metadata
     * service</li>
     * </ul>
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this client
     *                            connects to KSC (ex: proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    public KSCBWSClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on BWS using the
     * specified AWS account credentials.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use when
     *                       authenticating with AWS services.
     */
    public KSCBWSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on BWS using the
     * specified AWS account credentials and client configuration options.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials      The AWS credentials (access key ID and secret key) to use when
     *                            authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this client
     *                            connects to BWS (ex: proxy settings, retry counts, etc.).
     */
    public KSCBWSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on BWS using the
     * specified AWS account credentials provider.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will provide credentials to
     *                               authenticate requests with KSC services.
     */
    public KSCBWSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on BWS using the
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
     *                               connects to BWS (ex: proxy settings, retry counts, etc.).
     */
    public KSCBWSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on BWS using the
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
     *                               connects to BWS (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public KSCBWSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
                        RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.kscCredentialsProvider = awsCredentialsProvider;
        init();
    }

    @Override
    public CreateBandWidthShareResult createBandWidthShare(CreateBandWidthShareRequest createBandWidthShareRequest) {
        ExecutionContext executionContext = createExecutionContext(createBandWidthShareRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<CreateBandWidthShareRequest> request = null;
        Response<CreateBandWidthShareResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new CreateBandWidthShareRequestMarshaller()
                        .marshall(createBandWidthShareRequest);
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            StaxResponseHandler<CreateBandWidthShareResult> responseHandler = new StaxResponseHandler<CreateBandWidthShareResult>(
                    new CreateBandWidthShareResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ModifyBandWidthShareResult modifyBandWidthShare(ModifyBandWidthShareRequest modifyBandWidthShareRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyBandWidthShareRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyBandWidthShareRequest> request = null;
        Response<ModifyBandWidthShareResult> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ModifyBandWidthShareRequestMarshaller()
                        .marshall(modifyBandWidthShareRequest);
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            StaxResponseHandler<ModifyBandWidthShareResult> responseHandler = new StaxResponseHandler<ModifyBandWidthShareResult>(
                    new ModifyBandWidthShareResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteBandWidthShareResult deleteBandWidthShare(DeleteBandWidthShareRequest deleteBandWidthShareRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteBandWidthShareRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBandWidthShareRequest> request = null;
        Response<DeleteBandWidthShareResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBandWidthShareRequestMarshaller()
                        .marshall(deleteBandWidthShareRequest);
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            StaxResponseHandler<DeleteBandWidthShareResult> responseHandler = new StaxResponseHandler<DeleteBandWidthShareResult>(
                    new DeleteBandWidthShareResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeBandWidthSharesResult describeBandWidthShares(DescribeBandWidthSharesRequest describeBandWidthSharesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeBandWidthSharesRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBandWidthSharesRequest> request = null;
        Response<DescribeBandWidthSharesResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBandWidthSharesRequestMarshaller()
                        .marshall(describeBandWidthSharesRequest);
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            StaxResponseHandler<DescribeBandWidthSharesResult> responseHandler = new StaxResponseHandler<DescribeBandWidthSharesResult>(
                    new DescribeBandWidthSharesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public AssociateBandWidthShareResult associateBandWidthShare(AssociateBandWidthShareRequest associateBandWidthShareRequest) {
        ExecutionContext executionContext = createExecutionContext(associateBandWidthShareRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateBandWidthShareRequest> request = null;
        Response<AssociateBandWidthShareResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateBandWidthShareRequestMarshaller()
                        .marshall(associateBandWidthShareRequest);
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            StaxResponseHandler<AssociateBandWidthShareResult> responseHandler = new StaxResponseHandler<AssociateBandWidthShareResult>(
                    new AssociateBandWidthShareResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public DisassociateBandWidthShareResult disassociateBandWidthShare(DisassociateBandWidthShareRequest disassociateBandWidthShareRequest) {
        ExecutionContext executionContext = createExecutionContext(disassociateBandWidthShareRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateBandWidthShareRequest> request = null;
        Response<DisassociateBandWidthShareResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateBandWidthShareRequestMarshaller()
                        .marshall(disassociateBandWidthShareRequest);
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            StaxResponseHandler<DisassociateBandWidthShareResult> responseHandler = new StaxResponseHandler<DisassociateBandWidthShareResult>(
                    new DisassociateBandWidthShareResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }


    private void init() {
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        setEndpoint("http://kcm.cn-beijing-6.api.ksyun.com");
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
