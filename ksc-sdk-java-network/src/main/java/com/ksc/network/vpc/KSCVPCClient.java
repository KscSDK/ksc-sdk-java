package com.ksc.network.vpc;

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
import com.ksc.network.vpc.model.DescribeInternetGatewaysRequest;
import com.ksc.network.vpc.model.DescribeInternetGatewaysResult;
import com.ksc.network.vpc.model.DescribeNetworkInterfacesRequest;
import com.ksc.network.vpc.model.DescribeNetworkInterfacesResult;
import com.ksc.network.vpc.model.DescribeSecurityGroupsRequest;
import com.ksc.network.vpc.model.DescribeSecurityGroupsResult;
import com.ksc.network.vpc.model.DescribeSubnetsRequest;
import com.ksc.network.vpc.model.DescribeSubnetsResult;
import com.ksc.network.vpc.model.DescribeVpcsRequest;
import com.ksc.network.vpc.model.DescribeVpcsResult;
import com.ksc.network.vpc.model.transform.DescribeInternetGatewaysRequestMarshaller;
import com.ksc.network.vpc.model.transform.DescribeInternetGatewaysResultStaxUnmarshaller;
import com.ksc.network.vpc.model.transform.DescribeNetworkInterfacesRequestMarshaller;
import com.ksc.network.vpc.model.transform.DescribeNetworkInterfacesResultStaxUnmarshaller;
import com.ksc.network.vpc.model.transform.DescribeSecurityGroupsRequestMarshaller;
import com.ksc.network.vpc.model.transform.DescribeSecurityGroupsResultStaxUnmarshaller;
import com.ksc.network.vpc.model.transform.DescribeSubnetsRequestMarshaller;
import com.ksc.network.vpc.model.transform.DescribeSubnetsResultStaxUnmarshaller;
import com.ksc.network.vpc.model.transform.DescribeVpcsRequestMarshaller;
import com.ksc.network.vpc.model.transform.DescribeVpcsResultStaxUnmarshaller;
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

public class KSCVPCClient extends KscWebServiceClient implements KSCVPC{
	/** Provider for AWS credentials. */
	private AWSCredentialsProvider kscCredentialsProvider;

	/** Default signing name for the service. */
	private static final String DEFAULT_SIGNING_NAME = "vpc";

	/** The region metadata service name for computing region endpoints. */
	private static final String DEFAULT_ENDPOINT_PREFIX = "vpc";

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
	 * Constructs a new client to invoke service methods on VPC. A credentials
	 * provider chain will be used that searches for credentials in this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the VPC metadata
	 * service</li>
	 * </ul>
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 * 
	 * @see DefaultAWSCredentialsProviderChain
	 */
	public KSCVPCClient() {
		this(new DefaultAWSCredentialsProviderChain(), configFactory
				.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on VPC. A credentials
	 * provider chain will be used that searches for credentials in this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the VPC metadata
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
	public KSCVPCClient(ClientConfiguration clientConfiguration) {
		this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
	}

	/**
	 * Constructs a new client to invoke service methods on VPC using the
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
	public KSCVPCClient(AWSCredentials awsCredentials) {
		this(awsCredentials, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on VPC using the
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
	 *            connects to vpc (ex: proxy settings, retry counts, etc.).
	 */
	public KSCVPCClient(AWSCredentials awsCredentials,
			ClientConfiguration clientConfiguration) {
		super(clientConfiguration);
		this.kscCredentialsProvider = new StaticCredentialsProvider(
				awsCredentials);
		init();
	}

	/**
	 * Constructs a new client to invoke service methods on VPC using the
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
	public KSCVPCClient(AWSCredentialsProvider awsCredentialsProvider) {
		this(awsCredentialsProvider, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on VPC using the
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
	 *            connects to VPC (ex: proxy settings, retry counts, etc.).
	 */
	public KSCVPCClient(AWSCredentialsProvider awsCredentialsProvider,
			ClientConfiguration clientConfiguration) {
		this(awsCredentialsProvider, clientConfiguration, null);
	}

	/**
	 * Constructs a new client to invoke service methods on VPC using the
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
	 *            connects to VPC (ex: proxy settings, retry counts, etc.).
	 * @param requestMetricCollector
	 *            optional request metric collector
	 */
	public KSCVPCClient(AWSCredentialsProvider awsCredentialsProvider,
			ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(clientConfiguration, requestMetricCollector);
		this.kscCredentialsProvider = awsCredentialsProvider;
		init();
	}

	@Override
	public DescribeVpcsResult describeVpcs() {
		return this.describeVpcs(new DescribeVpcsRequest());
	}

	@Override
	public DescribeVpcsResult describeVpcs(
			DescribeVpcsRequest describeVpcsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeVpcsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeVpcsRequest> request = null;
		Response<DescribeVpcsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeVpcsRequestMarshaller().marshall(super
						.beforeMarshalling(describeVpcsRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeVpcsResult> responseHandler = new StaxResponseHandler<DescribeVpcsResult>(
					new DescribeVpcsResultStaxUnmarshaller());
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
		setEndpoint("http://vpc.cn-beijing-6.api.ksyun.com");
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

		DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
				exceptionUnmarshallers);

		return client.execute(request, responseHandler, errorResponseHandler,
				executionContext);
	}

	@Override
	public DescribeNetworkInterfacesResult describeNetworkInterfaces(
			DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest) {
		ExecutionContext executionContext = createExecutionContext(describeNetworkInterfacesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeNetworkInterfacesRequest> request = null;
		Response<DescribeNetworkInterfacesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeNetworkInterfacesRequestMarshaller().marshall(super
						.beforeMarshalling(describeNetworkInterfacesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeNetworkInterfacesResult> responseHandler = new StaxResponseHandler<DescribeNetworkInterfacesResult>(
					new DescribeNetworkInterfacesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeSubnetsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeSubnetsRequest> request = null;
		Response<DescribeSubnetsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeSubnetsRequestMarshaller().marshall(super
						.beforeMarshalling(describeSubnetsRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeSubnetsResult> responseHandler = new StaxResponseHandler<DescribeSubnetsResult>(
					new DescribeSubnetsResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeSecurityGroupsResult describeSecurityGroups(
			DescribeSecurityGroupsRequest describeSecurityGroupsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeSecurityGroupsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeSecurityGroupsRequest> request = null;
		Response<DescribeSecurityGroupsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeSecurityGroupsRequestMarshaller().marshall(super
						.beforeMarshalling(describeSecurityGroupsRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeSecurityGroupsResult> responseHandler = new StaxResponseHandler<DescribeSecurityGroupsResult>(
					new DescribeSecurityGroupsResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeInternetGatewaysResult describeInternetGateways(
			DescribeInternetGatewaysRequest describeInternetGatewaysRequest) {
		ExecutionContext executionContext = createExecutionContext(describeInternetGatewaysRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeInternetGatewaysRequest> request = null;
		Response<DescribeInternetGatewaysResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeInternetGatewaysRequestMarshaller().marshall(super
						.beforeMarshalling(describeInternetGatewaysRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeInternetGatewaysResult> responseHandler = new StaxResponseHandler<DescribeInternetGatewaysResult>(
					new DescribeInternetGatewaysResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}
}
