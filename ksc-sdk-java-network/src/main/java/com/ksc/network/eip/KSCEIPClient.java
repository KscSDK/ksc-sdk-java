package com.ksc.network.eip;

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
import com.ksc.network.eip.model.AllocateAddressRequest;
import com.ksc.network.eip.model.AllocateAddressResult;
import com.ksc.network.eip.model.AssociateAddressRequest;
import com.ksc.network.eip.model.AssociateAddressResult;
import com.ksc.network.eip.model.DescribeAddressesRequest;
import com.ksc.network.eip.model.DescribeAddressesResult;
import com.ksc.network.eip.model.DisassociateAddressRequest;
import com.ksc.network.eip.model.DisassociateAddressResult;
import com.ksc.network.eip.model.GetLinesRequest;
import com.ksc.network.eip.model.GetLinesResult;
import com.ksc.network.eip.model.ReleaseAddressRequest;
import com.ksc.network.eip.model.ReleaseAddressResult;
import com.ksc.network.eip.model.transform.AllocateAddressRequestMarshaller;
import com.ksc.network.eip.model.transform.AllocateAddressResultStaxUnmarshaller;
import com.ksc.network.eip.model.transform.AssociateAddressRequestMarshaller;
import com.ksc.network.eip.model.transform.AssociateAddressResultStaxUnmarshaller;
import com.ksc.network.eip.model.transform.DescribeAddressesRequestMarshaller;
import com.ksc.network.eip.model.transform.DescribeAddressesResultStaxUnmarshaller;
import com.ksc.network.eip.model.transform.DisassociateAddressRequestMarshaller;
import com.ksc.network.eip.model.transform.DisassociateAddressResultStaxUnmarshaller;
import com.ksc.network.eip.model.transform.GetLinesRequestMarshaller;
import com.ksc.network.eip.model.transform.GetLinesResultStaxUnmarshaller;
import com.ksc.network.eip.model.transform.ReleaseAddressRequestMarshaller;
import com.ksc.network.eip.model.transform.ReleaseAddressResultStaxUnmarshaller;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryResult;
import com.ksc.network.vpc.transform.SecurityGroups.RevokeSecurityGroupEntryRequestMarshaller;
import com.ksc.network.vpc.transform.SecurityGroups.RevokeSecurityGroupEntryResultStaxUnmarshaller;
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

public class KSCEIPClient extends KscWebServiceClient implements KSCEIP{
	/** Provider for AWS credentials. */
	private AWSCredentialsProvider kscCredentialsProvider;

	/** Default signing name for the service. */
	private static final String DEFAULT_SIGNING_NAME = "eip";

	/** The region metadata service name for computing region endpoints. */
	private static final String DEFAULT_ENDPOINT_PREFIX = "eip";

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
	public KSCEIPClient() {
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
	public KSCEIPClient(ClientConfiguration clientConfiguration) {
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
	public KSCEIPClient(AWSCredentials awsCredentials) {
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
	public KSCEIPClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
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
	public KSCEIPClient(AWSCredentialsProvider awsCredentialsProvider) {
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
	public KSCEIPClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
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
	public KSCEIPClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(clientConfiguration, requestMetricCollector);
		this.kscCredentialsProvider = awsCredentialsProvider;
		init();
	}
	@Override
	public DescribeAddressesResult describeAddresses() {
		return this.describeAddresses(new DescribeAddressesRequest());
	}
	@Override
	public DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest) {
		ExecutionContext executionContext = createExecutionContext(describeAddressesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeAddressesRequest> request = null;
		Response<DescribeAddressesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeAddressesRequestMarshaller()
						.marshall(super.beforeMarshalling(describeAddressesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<DescribeAddressesResult> responseHandler = new StaxResponseHandler<DescribeAddressesResult>(
					new DescribeAddressesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}

	}
	@Override
	public GetLinesResult getLines() {
		GetLinesRequest getLinesRequest = new GetLinesRequest();
		return this.getLines(getLinesRequest);
	}
	@Override
	public GetLinesResult getLines(GetLinesRequest getLinesRequest) {
		ExecutionContext executionContext = createExecutionContext(getLinesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetLinesRequest> request = null;
		Response<GetLinesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetLinesRequestMarshaller().marshall(super.beforeMarshalling(getLinesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<GetLinesResult> responseHandler = new StaxResponseHandler<GetLinesResult>(
					new GetLinesResultStaxUnmarshaller());
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
		// calling this.setEndPoint(...) will also modify the signer accordingly
		setEndpoint("http://eip.cn-beijing-6.api.ksyun.com");
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
	
    @Override
    public AllocateAddressResult allocateAddress(AllocateAddressRequest allocateAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(allocateAddressRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateAddressRequest> request = null;
        Response<AllocateAddressResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateAddressRequestMarshaller().marshall(super
                        .beforeMarshalling(allocateAddressRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AllocateAddressResult> responseHandler = new StaxResponseHandler<AllocateAddressResult>(
                    new AllocateAddressResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }
    
    @Override
    public ReleaseAddressResult releaseAddress(ReleaseAddressRequest releaseAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(releaseAddressRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReleaseAddressRequest> request = null;
        Response<ReleaseAddressResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReleaseAddressRequestMarshaller().marshall(super
                        .beforeMarshalling(releaseAddressRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReleaseAddressResult> responseHandler = new StaxResponseHandler<ReleaseAddressResult>(
                    new ReleaseAddressResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }
    
    @Override
    public AssociateAddressResult associateAddress(AssociateAddressRequest associateAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(associateAddressRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAddressRequest> request = null;
        Response<AssociateAddressResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAddressRequestMarshaller().marshall(super
                        .beforeMarshalling(associateAddressRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AssociateAddressResult> responseHandler = new StaxResponseHandler<AssociateAddressResult>(
                    new AssociateAddressResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }
    
    @Override
    public DisassociateAddressResult disassociateAddress(DisassociateAddressRequest disassociateAddressRequest) {
        ExecutionContext executionContext = createExecutionContext(disassociateAddressRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAddressRequest> request = null;
        Response<DisassociateAddressResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAddressRequestMarshaller().marshall(super
                        .beforeMarshalling(disassociateAddressRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DisassociateAddressResult> responseHandler = new StaxResponseHandler<DisassociateAddressResult>(
                    new DisassociateAddressResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }



}
