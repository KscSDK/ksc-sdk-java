package com.ksc.kec;

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
import com.ksc.kec.model.CreateImageRequest;
import com.ksc.kec.model.CreateImageResult;
import com.ksc.kec.model.CreateLocalVolumeSnapshotRequest;
import com.ksc.kec.model.CreateLocalVolumeSnapshotResult;
import com.ksc.kec.model.DeleteLocalVolumeSnapshotRequest;
import com.ksc.kec.model.DeleteLocalVolumeSnapshotResult;
import com.ksc.kec.model.DescribeImagesRequest;
import com.ksc.kec.model.DescribeImagesResult;
import com.ksc.kec.model.DescribeInstancesRequest;
import com.ksc.kec.model.DescribeInstancesResult;
import com.ksc.kec.model.ModifyImageAttributeRequest;
import com.ksc.kec.model.ModifyImageAttributeResult;
import com.ksc.kec.model.ModifyInstanceAttributeRequest;
import com.ksc.kec.model.ModifyInstanceAttributeResult;
import com.ksc.kec.model.MonitorInstancesRequest;
import com.ksc.kec.model.MonitorInstancesResult;
import com.ksc.kec.model.RebootInstancesRequest;
import com.ksc.kec.model.RebootInstancesResult;
import com.ksc.kec.model.RemoveImagesRequest;
import com.ksc.kec.model.RemoveImagesResult;
import com.ksc.kec.model.RollbackLocalVolumeRequest;
import com.ksc.kec.model.RollbackLocalVolumeResult;
import com.ksc.kec.model.RunInstancesRequest;
import com.ksc.kec.model.RunInstancesResult;
import com.ksc.kec.model.StartInstancesRequest;
import com.ksc.kec.model.StartInstancesResult;
import com.ksc.kec.model.StopInstancesRequest;
import com.ksc.kec.model.StopInstancesResult;
import com.ksc.kec.model.TerminateInstancesRequest;
import com.ksc.kec.model.TerminateInstancesResult;
import com.ksc.kec.model.UnmonitorInstancesRequest;
import com.ksc.kec.model.UnmonitorInstancesResult;
import com.ksc.kec.model.transform.CreateImageRequestMarshaller;
import com.ksc.kec.model.transform.CreateImageResultStaxUnmarshaller;
import com.ksc.kec.model.transform.CreateLocalVolumeSnapshotRequestMarshaller;
import com.ksc.kec.model.transform.CreateLocalVolumeSnapshotResultStaxUnmarshaller;
import com.ksc.kec.model.transform.DeleteLocalVolumeSnapshotRequestMarshaller;
import com.ksc.kec.model.transform.DeleteLocalVolumeSnapshotResultStaxUnmarshaller;
import com.ksc.kec.model.transform.DescribeImagesRequestMarshaller;
import com.ksc.kec.model.transform.DescribeImagesResultStaxUnmarshaller;
import com.ksc.kec.model.transform.DescribeInstancesRequestMarshaller;
import com.ksc.kec.model.transform.DescribeInstancesResultStaxUnmarshaller;
import com.ksc.kec.model.transform.ModifyImageAttributeRequestMarshaller;
import com.ksc.kec.model.transform.ModifyImageAttributeResultStaxUnmarshaller;
import com.ksc.kec.model.transform.ModifyInstanceAttributeRequestMarshaller;
import com.ksc.kec.model.transform.ModifyInstanceAttributeResultStaxUnmarshaller;
import com.ksc.kec.model.transform.MonitorInstancesRequestMarshaller;
import com.ksc.kec.model.transform.MonitorInstancesResultStaxUnmarshaller;
import com.ksc.kec.model.transform.RebootInstancesRequestMarshaller;
import com.ksc.kec.model.transform.RebootInstancesResultStaxUnmarshaller;
import com.ksc.kec.model.transform.RemoveImagesRequestMarshaller;
import com.ksc.kec.model.transform.RemoveImagesResultStaxUnmarshaller;
import com.ksc.kec.model.transform.RollbackLocalVolumeRequestMarshaller;
import com.ksc.kec.model.transform.RollbackLocalVolumeResultStaxUnmarshaller;
import com.ksc.kec.model.transform.RunInstancesRequestMarshaller;
import com.ksc.kec.model.transform.RunInstancesResultStaxUnmarshaller;
import com.ksc.kec.model.transform.StartInstancesRequestMarshaller;
import com.ksc.kec.model.transform.StartInstancesResultStaxUnmarshaller;
import com.ksc.kec.model.transform.StopInstancesRequestMarshaller;
import com.ksc.kec.model.transform.StopInstancesResultStaxUnmarshaller;
import com.ksc.kec.model.transform.TerminateInstancesRequestMarshaller;
import com.ksc.kec.model.transform.TerminateInstancesResultStaxUnmarshaller;
import com.ksc.kec.model.transform.UnmonitorInstancesRequestMarshaller;
import com.ksc.kec.model.transform.UnmonitorInstancesResultStaxUnmarshaller;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

public class KSCKECClient extends KscWebServiceClient implements KSCKEC {

	/** Provider for AWS credentials. */
	private AWSCredentialsProvider kscCredentialsProvider;

	/** Default signing name for the service. */
	private static final String DEFAULT_SIGNING_NAME = "kec";

	/** The region metadata service name for computing region endpoints. */
	private static final String DEFAULT_ENDPOINT_PREFIX = "kec";

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
	 * Constructs a new client to invoke service methods on KSC. A credentials
	 * provider chain will be used that searches for credentials in this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the KSC metadata
	 * service</li>
	 * </ul>
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 * 
	 * @see DefaultAWSCredentialsProviderChain
	 */
	public KSCKECClient() {
		this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on Amazon EC2. A
	 * credentials provider chain will be used that searches for credentials in
	 * this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the KSC metadata
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
	public KSCKECClient(ClientConfiguration clientConfiguration) {
		this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
	}

	/**
	 * Constructs a new client to invoke service methods on Amazon EC2 using the
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
	public KSCKECClient(AWSCredentials awsCredentials) {
		this(awsCredentials, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on Amazon EC2 using the
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
	 *            connects to Amazon EC2 (ex: proxy settings, retry counts,
	 *            etc.).
	 */
	public KSCKECClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
		super(clientConfiguration);
		this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
		init();
	}

	/**
	 * Constructs a new client to invoke service methods on Amazon EC2 using the
	 * specified AWS account credentials provider.
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 * 
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 */
	public KSCKECClient(AWSCredentialsProvider awsCredentialsProvider) {
		this(awsCredentialsProvider, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on Amazon EC2 using the
	 * specified AWS account credentials provider and client configuration
	 * options.
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 * 
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 * @param clientConfiguration
	 *            The client configuration options controlling how this client
	 *            connects to Amazon EC2 (ex: proxy settings, retry counts,
	 *            etc.).
	 */
	public KSCKECClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
		this(awsCredentialsProvider, clientConfiguration, null);
	}

	/**
	 * Constructs a new client to invoke service methods on Amazon EC2 using the
	 * specified AWS account credentials provider, client configuration options,
	 * and request metric collector.
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 * 
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 * @param clientConfiguration
	 *            The client configuration options controlling how this client
	 *            connects to Amazon EC2 (ex: proxy settings, retry counts,
	 *            etc.).
	 * @param requestMetricCollector
	 *            optional request metric collector
	 */
	public KSCKECClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(clientConfiguration, requestMetricCollector);
		this.kscCredentialsProvider = awsCredentialsProvider;
		init();
	}

	private void init() {
		exceptionUnmarshallers.add(new LegacyErrorUnmarshaller());
		exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

		setServiceNameIntern(DEFAULT_SIGNING_NAME);
		setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
		// calling this.setEndPoint(...) will also modify the signer accordingly
		setEndpoint("http://kec.cn-beijing-6.api.ksyun.com");
		//HandlerChainFactory chainFactory = new HandlerChainFactory();
		/*
		 * requestHandler2s .addAll(chainFactory
		 * .newRequestHandlerChain("/com/ksc/services/kec/request.handlers"));
		 * requestHandler2s .addAll(chainFactory
		 * .newRequestHandler2Chain("/com/ksc/services/kec/request.handler2s"));
		 */
	}

	@Override
	public DescribeInstancesResult describeInstances() {
		return describeInstances(new DescribeInstancesRequest());
	}

	@Override
	public DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest) {
		ExecutionContext executionContext = createExecutionContext(describeInstancesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeInstancesRequest> request = null;
		Response<DescribeInstancesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeInstancesRequestMarshaller()
						.marshall(super.beforeMarshalling(describeInstancesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeInstancesResult> responseHandler = new StaxResponseHandler<DescribeInstancesResult>(
					new DescribeInstancesResultStaxUnmarshaller());
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

		DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

		return client.execute(request, responseHandler, errorResponseHandler, executionContext);
	}

	@Override
	public StartInstancesResult startInstances(StartInstancesRequest startInstancesRequest) {
		ExecutionContext executionContext = createExecutionContext(startInstancesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<StartInstancesRequest> request = null;
		Response<StartInstancesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new StartInstancesRequestMarshaller().marshall(startInstancesRequest);
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<StartInstancesResult> responseHandler = new StaxResponseHandler<StartInstancesResult>(
					new StartInstancesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public StopInstancesResult stopInstances(StopInstancesRequest stopInstancesRequest) {
		ExecutionContext executionContext = createExecutionContext(stopInstancesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<StopInstancesRequest> request = null;
		Response<StopInstancesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new StopInstancesRequestMarshaller().marshall(stopInstancesRequest);
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<StopInstancesResult> responseHandler = new StaxResponseHandler<StopInstancesResult>(
					new StopInstancesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public RebootInstancesResult rebootInstances(RebootInstancesRequest rebootInstancesRequest) {
		ExecutionContext executionContext = createExecutionContext(rebootInstancesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<RebootInstancesRequest> request = null;
		Response<RebootInstancesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new RebootInstancesRequestMarshaller().marshall(rebootInstancesRequest);
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<RebootInstancesResult> responseHandler = new StaxResponseHandler<RebootInstancesResult>(
					new RebootInstancesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest) {
		// TODO Auto-generated method stub
		ExecutionContext executionContext = createExecutionContext(describeImagesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeImagesRequest> request = null;
		Response<DescribeImagesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeImagesRequestMarshaller().marshall(describeImagesRequest);
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DescribeImagesResult> responseHandler = new StaxResponseHandler<DescribeImagesResult>(
					new DescribeImagesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public RunInstancesResult runInstances(RunInstancesRequest runInstancesRequest) {
		ExecutionContext executionContext = createExecutionContext(runInstancesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<RunInstancesRequest> request = null;
		Response<RunInstancesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new RunInstancesRequestMarshaller()
						.marshall(super.beforeMarshalling(runInstancesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<RunInstancesResult> responseHandler = new StaxResponseHandler<RunInstancesResult>(
					new RunInstancesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public TerminateInstancesResult terminateInstances(TerminateInstancesRequest terminateInstancesRequest) {
		ExecutionContext executionContext = createExecutionContext(terminateInstancesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<TerminateInstancesRequest> request = null;
		Response<TerminateInstancesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new TerminateInstancesRequestMarshaller()
						.marshall(super.beforeMarshalling(terminateInstancesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<TerminateInstancesResult> responseHandler = new StaxResponseHandler<TerminateInstancesResult>(
					new TerminateInstancesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyInstanceAttributeResult modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyInstanceAttributeRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyInstanceAttributeRequest> request = null;
		Response<ModifyInstanceAttributeResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyInstanceAttributeRequestMarshaller()
						.marshall(super.beforeMarshalling(modifyInstanceAttributeRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<ModifyInstanceAttributeResult> responseHandler = new StaxResponseHandler<ModifyInstanceAttributeResult>(
					new ModifyInstanceAttributeResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public MonitorInstancesResult monitorInstances(MonitorInstancesRequest monitorInstancesRequest) {
		ExecutionContext executionContext = createExecutionContext(monitorInstancesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<MonitorInstancesRequest> request = null;
		Response<MonitorInstancesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new MonitorInstancesRequestMarshaller()
						.marshall(super.beforeMarshalling(monitorInstancesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<MonitorInstancesResult> responseHandler = new StaxResponseHandler<MonitorInstancesResult>(
					new MonitorInstancesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public UnmonitorInstancesResult unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest) {
		ExecutionContext executionContext = createExecutionContext(unmonitorInstancesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<UnmonitorInstancesRequest> request = null;
		Response<UnmonitorInstancesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new UnmonitorInstancesRequestMarshaller()
						.marshall(super.beforeMarshalling(unmonitorInstancesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<UnmonitorInstancesResult> responseHandler = new StaxResponseHandler<UnmonitorInstancesResult>(
					new UnmonitorInstancesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/**
	 * 创建镜像
	 */
	@Override
	public CreateImageResult createImage(CreateImageRequest createImageRequest){
		ExecutionContext executionContext = createExecutionContext(createImageRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateImageRequest> request = null;
		Response<CreateImageResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateImageRequestMarshaller()
						.marshall(super.beforeMarshalling(createImageRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<CreateImageResult> responseHandler = new StaxResponseHandler<CreateImageResult>(
					new CreateImageResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/**
	 * 修改镜像
	 */
	@Override
	public ModifyImageAttributeResult modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest){
		ExecutionContext executionContext = createExecutionContext(modifyImageAttributeRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyImageAttributeRequest> request = null;
		Response<ModifyImageAttributeResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyImageAttributeRequestMarshaller()
						.marshall(super.beforeMarshalling(modifyImageAttributeRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<ModifyImageAttributeResult> responseHandler = new StaxResponseHandler<ModifyImageAttributeResult>(
					new ModifyImageAttributeResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/**
	 * 刪除鏡像
	 */
	@Override
	public RemoveImagesResult removeImages(RemoveImagesRequest removeImagesRequest){
		ExecutionContext executionContext = createExecutionContext(removeImagesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<RemoveImagesRequest> request = null;
		Response<RemoveImagesResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new RemoveImagesRequestMarshaller()
						.marshall(super.beforeMarshalling(removeImagesRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<RemoveImagesResult> responseHandler = new StaxResponseHandler<RemoveImagesResult>(
					new RemoveImagesResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/**
	 * 創建本地盤快照
	 */
	@Override
	public CreateLocalVolumeSnapshotResult createLocalVolumeSnapshot(CreateLocalVolumeSnapshotRequest createLocalVolumeSnapshotRequest){
		ExecutionContext executionContext = createExecutionContext(createLocalVolumeSnapshotRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateLocalVolumeSnapshotRequest> request = null;
		Response<CreateLocalVolumeSnapshotResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateLocalVolumeSnapshotRequestMarshaller()
						.marshall(super.beforeMarshalling(createLocalVolumeSnapshotRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<CreateLocalVolumeSnapshotResult> responseHandler = new StaxResponseHandler<CreateLocalVolumeSnapshotResult>(
					new CreateLocalVolumeSnapshotResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/**
	 * 回滚本地盘快照
	 * @param rollbackLocalVolumeRequest
	 * @return
	 */
	@Override
	public RollbackLocalVolumeResult rollbackLocalVolume(RollbackLocalVolumeRequest rollbackLocalVolumeRequest){
		ExecutionContext executionContext = createExecutionContext(rollbackLocalVolumeRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<RollbackLocalVolumeRequest> request = null;
		Response<RollbackLocalVolumeResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new RollbackLocalVolumeRequestMarshaller()
						.marshall(super.beforeMarshalling(rollbackLocalVolumeRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<RollbackLocalVolumeResult> responseHandler = new StaxResponseHandler<RollbackLocalVolumeResult>(
					new RollbackLocalVolumeResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/**
	 * 刪除本地盤快照
	 * @param deleteLocalVolumeSnapshotRequest
	 * @return
	 */
	@Override
	public DeleteLocalVolumeSnapshotResult deleteLocalVolumeSnapshot(DeleteLocalVolumeSnapshotRequest deleteLocalVolumeSnapshotRequest){
		ExecutionContext executionContext = createExecutionContext(deleteLocalVolumeSnapshotRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteLocalVolumeSnapshotRequest> request = null;
		Response<DeleteLocalVolumeSnapshotResult> response = null;

		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteLocalVolumeSnapshotRequestMarshaller()
						.marshall(super.beforeMarshalling(deleteLocalVolumeSnapshotRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}

			StaxResponseHandler<DeleteLocalVolumeSnapshotResult> responseHandler = new StaxResponseHandler<DeleteLocalVolumeSnapshotResult>(
					new DeleteLocalVolumeSnapshotResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();

		} finally {

			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
}
