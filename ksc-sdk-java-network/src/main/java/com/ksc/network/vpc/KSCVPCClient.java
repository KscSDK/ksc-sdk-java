package com.ksc.network.vpc;

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
import com.ksc.network.vpc.model.AvailabilityZone.DescribeAvailabilityZonesRequest;
import com.ksc.network.vpc.model.AvailabilityZone.DescribeAvailabilityZonesResult;
import com.ksc.network.vpc.model.InternetGateways.DescribeInternetGatewaysRequest;
import com.ksc.network.vpc.model.InternetGateways.DescribeInternetGatewaysResult;
import com.ksc.network.vpc.model.Nat.*;
import com.ksc.network.vpc.model.NetworkAcl.*;
import com.ksc.network.vpc.model.NetworkInterface.DescribeNetworkInterfacesRequest;
import com.ksc.network.vpc.model.NetworkInterface.DescribeNetworkInterfacesResult;
import com.ksc.network.vpc.model.Route.*;
import com.ksc.network.vpc.model.SecurityGroups.*;
import com.ksc.network.vpc.model.subnet.*;
import com.ksc.network.vpc.model.vpc.*;
import com.ksc.network.vpc.model.peering.*;
import com.ksc.network.vpc.transform.AvailabilityZone.DescribeAvailabilityZonesRequestMarshaller;
import com.ksc.network.vpc.transform.AvailabilityZone.DescribeAvailabilityZonesResultStaxUnmarshaller;
import com.ksc.network.vpc.transform.InternetGateways.DescribeInternetGatewaysRequestMarshaller;
import com.ksc.network.vpc.transform.InternetGateways.DescribeInternetGatewaysResultStaxUnmarshaller;
import com.ksc.network.vpc.transform.Nat.*;
import com.ksc.network.vpc.transform.NetworkAcl.*;
import com.ksc.network.vpc.transform.NetworkInterface.DescribeNetworkInterfacesRequestMarshaller;
import com.ksc.network.vpc.transform.NetworkInterface.DescribeNetworkInterfacesResultStaxUnmarshaller;
import com.ksc.network.vpc.transform.Routes.*;
import com.ksc.network.vpc.transform.SecurityGroups.*;
import com.ksc.network.vpc.transform.subnet.*;
import com.ksc.network.vpc.transform.vpc.*;
import com.ksc.network.vpc.transform.peering.*;
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class KSCVPCClient extends KscWebServiceClient implements KSCVPC {
	/**
	 * Provider for AWS credentials.
	 */
	private AWSCredentialsProvider kscCredentialsProvider;

	/**
	 * Default signing name for the service.
	 */
	private static final String DEFAULT_SIGNING_NAME = "vpc";

	/**
	 * The region metadata service name for computing region endpoints.
	 */
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
	 * <p>
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
	 * <p>
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 *
	 * @param clientConfiguration
	 *            The client configuration options controlling how this client
	 *            connects to KSC (ex: proxy settings, retry counts, etc.).
	 * @see DefaultAWSCredentialsProviderChain
	 */
	public KSCVPCClient(ClientConfiguration clientConfiguration) {
		this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
	}

	/**
	 * Constructs a new client to invoke service methods on VPC using the
	 * specified AWS account credentials.
	 * <p>
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
	 * <p>
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
	public KSCVPCClient(
			AWSCredentials awsCredentials,
			ClientConfiguration clientConfiguration) {
		super(clientConfiguration);
		this.kscCredentialsProvider = new StaticCredentialsProvider(
				awsCredentials);
		init();
	}

	/**
	 * Constructs a new client to invoke service methods on VPC using the
	 * specified AWS account credentials provider.
	 * <p>
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
	 * <p>
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
	public KSCVPCClient(
			AWSCredentialsProvider awsCredentialsProvider,
			ClientConfiguration clientConfiguration) {
		this(awsCredentialsProvider, clientConfiguration, null);
	}

	/**
	 * Constructs a new client to invoke service methods on VPC using the
	 * specified KSC account credentials provider, client configuration options,
	 * and request metric collector.
	 * <p>
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
	public KSCVPCClient(
			AWSCredentialsProvider awsCredentialsProvider,
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
		ExecutionContext executionContext = createExecutionContext(
				describeVpcsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeVpcsRequest> request = null;
		Response<DescribeVpcsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeVpcsRequestMarshaller()
						.marshall(super.beforeMarshalling(describeVpcsRequest));
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
	public DescribeAvailabilityZonesResult describeAvailabilityZones(
			DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) {
		ExecutionContext executionContext = createExecutionContext(
				describeAvailabilityZonesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeAvailabilityZonesRequest> request = null;
		Response<DescribeAvailabilityZonesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeAvailabilityZonesRequestMarshaller()
						.marshall(super.beforeMarshalling(
								describeAvailabilityZonesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeAvailabilityZonesResult> responseHandler = new StaxResponseHandler<DescribeAvailabilityZonesResult>(
					new DescribeAvailabilityZonesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeNetworkInterfacesResult describeNetworkInterfaces(
			DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest) {
		ExecutionContext executionContext = createExecutionContext(
				describeNetworkInterfacesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeNetworkInterfacesRequest> request = null;
		Response<DescribeNetworkInterfacesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeNetworkInterfacesRequestMarshaller()
						.marshall(super.beforeMarshalling(
								describeNetworkInterfacesRequest));
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
	public DescribeSubnetsResult describeSubnets(
			DescribeSubnetsRequest describeSubnetsRequest) {
		ExecutionContext executionContext = createExecutionContext(
				describeSubnetsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeSubnetsRequest> request = null;
		Response<DescribeSubnetsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeSubnetsRequestMarshaller().marshall(
						super.beforeMarshalling(describeSubnetsRequest));
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
		ExecutionContext executionContext = createExecutionContext(
				describeSecurityGroupsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeSecurityGroupsRequest> request = null;
		Response<DescribeSecurityGroupsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeSecurityGroupsRequestMarshaller()
						.marshall(super.beforeMarshalling(
								describeSecurityGroupsRequest));
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
		ExecutionContext executionContext = createExecutionContext(
				describeInternetGatewaysRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeInternetGatewaysRequest> request = null;
		Response<DescribeInternetGatewaysResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeInternetGatewaysRequestMarshaller()
						.marshall(super.beforeMarshalling(
								describeInternetGatewaysRequest));
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

	@Override
	public CreateVpcResult createVpc(CreateVpcRequest createVpcRequest) {
		ExecutionContext executionContext = createExecutionContext(
				createVpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateVpcRequest> request = null;
		Response<CreateVpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateVpcRequestMarshaller()
						.marshall(super.beforeMarshalling(createVpcRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<CreateVpcResult> responseHandler = new StaxResponseHandler<CreateVpcResult>(
					new CreateVpcResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteVpcResult deleteVpc(DeleteVpcRequest deleteVpcRequest) {
		ExecutionContext executionContext = createExecutionContext(
				deleteVpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteVpcRequest> request = null;
		Response<DeleteVpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteVpcRequestMarshaller()
						.marshall(super.beforeMarshalling(deleteVpcRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DeleteVpcResult> responseHandler = new StaxResponseHandler<DeleteVpcResult>(
					new DeleteVpcResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateSubnetResult createSubnet(
			CreateSubnetRequest createSubnetRequest) {
		ExecutionContext executionContext = createExecutionContext(
				createSubnetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateSubnetRequest> request = null;
		Response<CreateSubnetResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateSubnetRequestMarshaller()
						.marshall(super.beforeMarshalling(createSubnetRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<CreateSubnetResult> responseHandler = new StaxResponseHandler<CreateSubnetResult>(
					new CreateSubnetResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteSubnetResult deleteSubnet(
			DeleteSubnetRequest deleteSubnetRequest) {
		ExecutionContext executionContext = createExecutionContext(
				deleteSubnetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteSubnetRequest> request = null;
		Response<DeleteSubnetResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteSubnetRequestMarshaller()
						.marshall(super.beforeMarshalling(deleteSubnetRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DeleteSubnetResult> responseHandler = new StaxResponseHandler<DeleteSubnetResult>(
					new DeleteSubnetResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateSecurityGroupResult createSecurityGroup(
			CreateSecurityGroupRequest createSecurityGroupRequest) {
		ExecutionContext executionContext = createExecutionContext(
				createSecurityGroupRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateSecurityGroupRequest> request = null;
		Response<CreateSecurityGroupResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateSecurityGroupRequestMarshaller().marshall(
						super.beforeMarshalling(createSecurityGroupRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<CreateSecurityGroupResult> responseHandler = new StaxResponseHandler<CreateSecurityGroupResult>(
					new CreateSecurityGroupResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteSecurityGroupResult deleteSecurityGroup(
			DeleteSecurityGroupRequest deleteSecurityGroupRequest) {
		ExecutionContext executionContext = createExecutionContext(
				deleteSecurityGroupRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteSecurityGroupRequest> request = null;
		Response<DeleteSecurityGroupResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteSecurityGroupRequestMarshaller().marshall(
						super.beforeMarshalling(deleteSecurityGroupRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DeleteSecurityGroupResult> responseHandler = new StaxResponseHandler<DeleteSecurityGroupResult>(
					new DeleteSecurityGroupResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifySecurityGroupResult modifySecurityGroup(
			ModifySecurityGroupRequest modifySecurityGroupRequest) {
		ExecutionContext executionContext = createExecutionContext(
				modifySecurityGroupRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifySecurityGroupRequest> request = null;
		Response<ModifySecurityGroupResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifySecurityGroupRequestMarshaller().marshall(
						super.beforeMarshalling(modifySecurityGroupRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<ModifySecurityGroupResult> responseHandler = new StaxResponseHandler<ModifySecurityGroupResult>(
					new ModifySecurityGroupResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public AuthorizeSecurityGroupEntryResult authorizeSecurityGroupEntry(
			AuthorizeSecurityGroupEntryRequest authorizeSecurityGroupEntryRequest) {
		ExecutionContext executionContext = createExecutionContext(
				authorizeSecurityGroupEntryRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<AuthorizeSecurityGroupEntryRequest> request = null;
		Response<AuthorizeSecurityGroupEntryResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new AuthorizeSecurityGroupEntryRequestMarshaller()
						.marshall(super.beforeMarshalling(
								authorizeSecurityGroupEntryRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<AuthorizeSecurityGroupEntryResult> responseHandler = new StaxResponseHandler<AuthorizeSecurityGroupEntryResult>(
					new AuthorizeSecurityGroupEntryResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public RevokeSecurityGroupEntryResult revokeSecurityGroupEntry(
			RevokeSecurityGroupEntryRequest revokeSecurityGroupEntryRequest) {
		ExecutionContext executionContext = createExecutionContext(
				revokeSecurityGroupEntryRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<RevokeSecurityGroupEntryRequest> request = null;
		Response<RevokeSecurityGroupEntryResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new RevokeSecurityGroupEntryRequestMarshaller()
						.marshall(super.beforeMarshalling(
								revokeSecurityGroupEntryRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<RevokeSecurityGroupEntryResult> responseHandler = new StaxResponseHandler<RevokeSecurityGroupEntryResult>(
					new RevokeSecurityGroupEntryResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateRouteResult createRoute(
			CreateRouteRequest createRouteRequest) {
		ExecutionContext executionContext = createExecutionContext(
				createRouteRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateRouteRequest> request = null;
		Response<CreateRouteResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateRouteRequestMarshaller()
						.marshall(super.beforeMarshalling(createRouteRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<CreateRouteResult> responseHandler = new StaxResponseHandler<CreateRouteResult>(
					new CreateRouteResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteRouteResult deleteRoute(
			DeleteRouteRequest deleteRouteRequest) {
		ExecutionContext executionContext = createExecutionContext(
				deleteRouteRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteRouteRequest> request = null;
		Response<DeleteRouteResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteRouteRequestMarshaller()
						.marshall(super.beforeMarshalling(deleteRouteRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DeleteRouteResult> responseHandler = new StaxResponseHandler<DeleteRouteResult>(
					new DeleteRouteResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeRoutesResult describeRoutes(
			DescribeRoutesRequest describeRoutesRequest) {
		ExecutionContext executionContext = createExecutionContext(
				describeRoutesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeRoutesRequest> request = null;
		Response<DescribeRoutesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeRoutesRequestMarshaller().marshall(
						super.beforeMarshalling(describeRoutesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);

			}

			StaxResponseHandler<DescribeRoutesResult> responseHandler = new StaxResponseHandler<DescribeRoutesResult>(
					new DescribeRoutesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifySubnetResult modifySubnet(
			ModifySubnetRequest modifySubnetRequest) {
		ExecutionContext executionContext = createExecutionContext(
				modifySubnetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifySubnetRequest> request = null;
		Response<ModifySubnetResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifySubnetRequestMarshaller().marshall(
						super.beforeMarshalling(modifySubnetRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<ModifySubnetResult> responseHandler = new StaxResponseHandler<ModifySubnetResult>(
					new ModifySubnetResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateNetworkAclResult createNetworkAcl(
			CreateNetworkAclRequest createNetworkAclRequest) {
		ExecutionContext executionContext = createExecutionContext(
				createNetworkAclRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateNetworkAclRequest> request = null;
		Response<CreateNetworkAclResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateNetworkAclRequestMarshaller()
						.marshall(super.beforeMarshalling(createNetworkAclRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<CreateNetworkAclResult> responseHandler = new StaxResponseHandler<CreateNetworkAclResult>(
					new CreateNetworkAclResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteNetworkAclResult deleteNetworkAcl(
			DeleteNetworkAclRequest deleteNetworkAclRequest) {
		ExecutionContext executionContext = createExecutionContext(
				deleteNetworkAclRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteNetworkAclRequest> request = null;
		Response<DeleteNetworkAclResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteNetworkAclRequestMarshaller()
						.marshall(super.beforeMarshalling(deleteNetworkAclRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DeleteNetworkAclResult> responseHandler = new StaxResponseHandler<DeleteNetworkAclResult>(
					new DeleteNetworkAclResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyNetworkAclResult modifyNetworkAcl(
			ModifyNetworkAclRequest modifyNetworkAclRequest) {
		ExecutionContext executionContext = createExecutionContext(
				modifyNetworkAclRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyNetworkAclRequest> request = null;
		Response<ModifyNetworkAclResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyNetworkAclRequestMarshaller().marshall(
						super.beforeMarshalling(modifyNetworkAclRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<ModifyNetworkAclResult> responseHandler = new StaxResponseHandler<ModifyNetworkAclResult>(
					new ModifyNetworkAclResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

    @Override
    public CreateNetworkAclEntryResult createNetworkAclEntry(
            CreateNetworkAclEntryRequest createNetworkAclEntryRequest) {
        ExecutionContext executionContext = createExecutionContext(
                createNetworkAclEntryRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNetworkAclEntryRequest> request = null;
        Response<CreateNetworkAclEntryResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNetworkAclEntryRequestMarshaller()
                        .marshall(super.beforeMarshalling(createNetworkAclEntryRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateNetworkAclEntryResult> responseHandler = new StaxResponseHandler<CreateNetworkAclEntryResult>(
                    new CreateNetworkAclEntryResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteNetworkAclEntryResult deleteNetworkAclEntry(
            DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest) {
        ExecutionContext executionContext = createExecutionContext(
                deleteNetworkAclEntryRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNetworkAclEntryRequest> request = null;
        Response<DeleteNetworkAclEntryResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNetworkAclEntryRequestMarshaller()
                        .marshall(super.beforeMarshalling(deleteNetworkAclEntryRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteNetworkAclEntryResult> responseHandler = new StaxResponseHandler<DeleteNetworkAclEntryResult>(
                    new DeleteNetworkAclEntryResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
	public DescribeNetworkAclsResult describeNetworkAcls(
			DescribeNetworkAclsRequest describeNetworkAclsRequest) {
		ExecutionContext executionContext = createExecutionContext(
				describeNetworkAclsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeNetworkAclsRequest> request = null;
		Response<DescribeNetworkAclsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeNetworkAclsRequestMarshaller()
						.marshall(super.beforeMarshalling(
								describeNetworkAclsRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeNetworkAclsResult> responseHandler = new StaxResponseHandler<DescribeNetworkAclsResult>(
					new DescribeNetworkAclsResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

    @Override
    public AssociateNetworkAclResult associateNetworkAcl(
            AssociateNetworkAclRequest associateNetworkAclRequest) {
        ExecutionContext executionContext = createExecutionContext(
                associateNetworkAclRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateNetworkAclRequest> request = null;
        Response<AssociateNetworkAclResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateNetworkAclRequestMarshaller().marshall(
                        super.beforeMarshalling(associateNetworkAclRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AssociateNetworkAclResult> responseHandler = new StaxResponseHandler<AssociateNetworkAclResult>(
                    new AssociateNetworkAclResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public DisassociateNetworkAclResult disassociateNetworkAcl(
            DisassociateNetworkAclRequest disassociateNetworkAclRequest) {
        ExecutionContext executionContext = createExecutionContext(
                disassociateNetworkAclRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateNetworkAclRequest> request = null;
        Response<DisassociateNetworkAclResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateNetworkAclRequestMarshaller().marshall(
                        super.beforeMarshalling(disassociateNetworkAclRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DisassociateNetworkAclResult> responseHandler = new StaxResponseHandler<DisassociateNetworkAclResult>(
                    new DisassociateNetworkAclResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeSubnetAvailableAddressesResult describeSubnetAvailableAddresses(
            DescribeSubnetAvailableAddressesRequest describeSubnetAvailableAddressesRequest) {
        ExecutionContext executionContext = createExecutionContext(
                describeSubnetAvailableAddressesRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubnetAvailableAddressesRequest> request = null;
        Response<DescribeSubnetAvailableAddressesResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubnetAvailableAddressesRequestMarshaller().marshall(
                        super.beforeMarshalling(describeSubnetAvailableAddressesRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeSubnetAvailableAddressesResult> responseHandler = new
                    StaxResponseHandler<DescribeSubnetAvailableAddressesResult>(new DescribeSubnetAvailableAddressesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }

	@Override
	public CreateNatResult createNat(
			CreateNatRequest createNatRequest) {
		ExecutionContext executionContext = createExecutionContext(
				createNatRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateNatRequest> request = null;
		Response<CreateNatResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateNatRequestMarshaller()
						.marshall(super.beforeMarshalling(createNatRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<CreateNatResult> responseHandler = new StaxResponseHandler<CreateNatResult>(
					new CreateNatResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

    @Override
    public DeleteNatResult deleteNat(
            DeleteNatRequest deleteNatRequest) {
        ExecutionContext executionContext = createExecutionContext(
                deleteNatRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNatRequest> request = null;
        Response<DeleteNatResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNatRequestMarshaller()
                        .marshall(super.beforeMarshalling(deleteNatRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteNatResult> responseHandler = new StaxResponseHandler<DeleteNatResult>(
                    new DeleteNatResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ModifyNatResult modifyNat(
            ModifyNatRequest modifyNatRequest) {
        ExecutionContext executionContext = createExecutionContext(
                modifyNatRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyNatRequest> request = null;
        Response<ModifyNatResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyNatRequestMarshaller().marshall(
                        super.beforeMarshalling(modifyNatRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyNatResult> responseHandler = new StaxResponseHandler<ModifyNatResult>(
                    new ModifyNatResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }

	@Override
	public AssociateNatResult associateNat(
			AssociateNatRequest associateNatRequest) {
		ExecutionContext executionContext = createExecutionContext(
				associateNatRequest);
		KscRequestMetrics kscRequestMetrics = executionContext
				.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<AssociateNatRequest> request = null;
		Response<AssociateNatResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new AssociateNatRequestMarshaller().marshall(
						super.beforeMarshalling(associateNatRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<AssociateNatResult> responseHandler = new StaxResponseHandler<AssociateNatResult>(
					new AssociateNatResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

    @Override
    public DisassociateNatResult disassociateNat(
            DisassociateNatRequest disassociateNatRequest) {
        ExecutionContext executionContext = createExecutionContext(
                disassociateNatRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateNatRequest> request = null;
        Response<DisassociateNatResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateNatRequestMarshaller().marshall(
                        super.beforeMarshalling(disassociateNatRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DisassociateNatResult> responseHandler = new StaxResponseHandler<DisassociateNatResult>(
                    new DisassociateNatResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeNatsResult describeNats(
            DescribeNatsRequest describeNatsRequest) {
        ExecutionContext executionContext = createExecutionContext(
                describeNatsRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNatsRequest> request = null;
        Response<DescribeNatsResult> response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNatsRequestMarshaller()
                        .marshall(super.beforeMarshalling(
                                describeNatsRequest));
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeNatsResult> responseHandler = new StaxResponseHandler<DescribeNatsResult>(
                    new DescribeNatsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getKscResponse();

        } finally {

            endClientExecution(kscRequestMetrics, request, response);
        }
    }

	@Override
	public CreateVpcPeeringConnectionResult createVpcPeeringConnection(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest) {
		ExecutionContext executionContext = createExecutionContext(createVpcPeeringConnectionRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateVpcPeeringConnectionRequest> request = null;
		Response<CreateVpcPeeringConnectionResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateVpcPeeringConnectionRequestMarshaller()
						.marshall(createVpcPeeringConnectionRequest);
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<CreateVpcPeeringConnectionResult> responseHandler = new StaxResponseHandler<CreateVpcPeeringConnectionResult>(
					new CreateVpcPeeringConnectionResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyVpcPeeringConnectionResult modifyVpcPeeringConnection(ModifyVpcPeeringConnectionRequest modifyVpcPeeringConnectionRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyVpcPeeringConnectionRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyVpcPeeringConnectionRequest> request = null;
		Response<ModifyVpcPeeringConnectionResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyVpcPeeringConnectionRequestMarshaller()
						.marshall(modifyVpcPeeringConnectionRequest);
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<ModifyVpcPeeringConnectionResult> responseHandler = new StaxResponseHandler<ModifyVpcPeeringConnectionResult>(
					new ModifyVpcPeeringConnectionResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest) {
		ExecutionContext executionContext = createExecutionContext(deleteVpcPeeringConnectionRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteVpcPeeringConnectionRequest> request = null;
		Response<DeleteVpcPeeringConnectionResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteVpcPeeringConnectionRequestMarshaller()
						.marshall(deleteVpcPeeringConnectionRequest);
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<DeleteVpcPeeringConnectionResult> responseHandler = new StaxResponseHandler<DeleteVpcPeeringConnectionResult>(
					new DeleteVpcPeeringConnectionResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeVpcPeeringConnectionsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeVpcPeeringConnectionsRequest> request = null;
		Response<DescribeVpcPeeringConnectionsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeVpcPeeringConnectionsRequestMarshaller()
						.marshall(describeVpcPeeringConnectionsRequest);
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<DescribeVpcPeeringConnectionsResult> responseHandler = new StaxResponseHandler<DescribeVpcPeeringConnectionsResult>(
					new DescribeVpcPeeringConnectionsResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest) {
		ExecutionContext executionContext = createExecutionContext(acceptVpcPeeringConnectionRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<AcceptVpcPeeringConnectionRequest> request = null;
		Response<AcceptVpcPeeringConnectionResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new AcceptVpcPeeringConnectionRequestMarshaller()
						.marshall(acceptVpcPeeringConnectionRequest);
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<AcceptVpcPeeringConnectionResult> responseHandler = new StaxResponseHandler<AcceptVpcPeeringConnectionResult>(
					new AcceptVpcPeeringConnectionResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public RejectVpcPeeringConnectionResult rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest) {
		ExecutionContext executionContext = createExecutionContext(rejectVpcPeeringConnectionRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<RejectVpcPeeringConnectionRequest> request = null;
		Response<RejectVpcPeeringConnectionResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new RejectVpcPeeringConnectionRequestMarshaller()
						.marshall(rejectVpcPeeringConnectionRequest);
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<RejectVpcPeeringConnectionResult> responseHandler = new StaxResponseHandler<RejectVpcPeeringConnectionResult>(
					new RejectVpcPeeringConnectionResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

}
