package com.ksc.offline;

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
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.offline.model.CreateTaskRequest;
import com.ksc.offline.model.CreateTasklResult;
import com.ksc.offline.model.DeletePresetRequest;
import com.ksc.offline.model.GetListRequest;
import com.ksc.offline.model.GetPresetDetailRequest;
import com.ksc.offline.model.GetPresetDetailResult;
import com.ksc.offline.model.GetTaskByTaskIDRequest;
import com.ksc.offline.model.GetTaskByTaskIDResult;
import com.ksc.offline.model.GetTaskListRequest;
import com.ksc.offline.model.GetTaskListResult;
import com.ksc.offline.model.OfflineErrResult;
import com.ksc.offline.model.OfflineResult;
import com.ksc.offline.model.PresetRequest;
import com.ksc.offline.model.TaskRequest;
import com.ksc.offline.model.TopTaskByTaskIDRequest;
import com.ksc.offline.model.UpdatePersetRequest;
import com.ksc.offline.model.transform.CreateTaskRequestMarshaller;
import com.ksc.offline.model.transform.DeletePresetRequestMarshaller;
import com.ksc.offline.model.transform.GetListRequestMarshaller;
import com.ksc.offline.model.transform.GetPresetDetailRequestMarshaller;
import com.ksc.offline.model.transform.GetTaskByTaskIDRequestMarshaller;
import com.ksc.offline.model.transform.GetTaskByTaskIDResultJsonUnmarshaller;
import com.ksc.offline.model.transform.GetTaskListRequestMarshaller;
import com.ksc.offline.model.transform.GetTaskListResultJsonUnmarshaller;
import com.ksc.offline.model.transform.OfflineCreateTaskResultJsonUnmarshaller;
import com.ksc.offline.model.transform.OfflineDetailResultJsonUnmarshaller;
import com.ksc.offline.model.transform.OfflineErrResultJsonUnmarshaller;
import com.ksc.offline.model.transform.OfflineResultJsonUnmarshaller;
import com.ksc.offline.model.transform.PresetRequestMarshaller;
import com.ksc.offline.model.transform.TaskRequestMarshaller;
import com.ksc.offline.model.transform.TopTaskByTaskIDRequestMarshaller;
import com.ksc.offline.model.transform.UpdatePresetRequestMarshaller;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

public class KSCOFFJsonClient extends KscWebServiceClient{
	/** Provider for AWS credentials. */
	private AWSCredentialsProvider kscCredentialsProvider;

	/** Default signing name for the service. */
	private static final String DEFAULT_SIGNING_NAME = "offline";

	/** The region metadata service name for computing region endpoints. */
	private static final String DEFAULT_ENDPOINT_PREFIX = "offline";

	/**
	 * Client configuration factory providing ClientConfigurations tailored to
	 * this client
	 */
	protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();
	
	private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
			new JsonClientMetadata().withSupportsCbor(false));

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
	public KSCOFFJsonClient() {
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
	public KSCOFFJsonClient(ClientConfiguration clientConfiguration) {
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
	public KSCOFFJsonClient(AWSCredentials awsCredentials) {
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
	public KSCOFFJsonClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
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
	public KSCOFFJsonClient(AWSCredentialsProvider awsCredentialsProvider) {
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
	public KSCOFFJsonClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
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
	public KSCOFFJsonClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(clientConfiguration, requestMetricCollector);
		this.kscCredentialsProvider = awsCredentialsProvider;
		init();
	}
	
	/*
	 * 发起post请求，请求添加模板
	 */
	public OfflineErrResult Preset(PresetRequest presetRequest){
		ExecutionContext executionContext = createExecutionContext(presetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<PresetRequest> request = null;
		Response<OfflineErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new PresetRequestMarshaller()
						.marshall(super.beforeMarshalling(presetRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<OfflineErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new OfflineErrResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/*
	 * 发起get请求，请求获取模板列表
	 */
	
	
	public OfflineResult GetPresetList(GetListRequest offlineRequest) {
		ExecutionContext executionContext = createExecutionContext(offlineRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetListRequest> request = null;
		Response<OfflineResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetListRequestMarshaller()
						.marshall(super.beforeMarshalling(offlineRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<OfflineResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new OfflineResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}

	}
	
	/*
	 * 发送get请求，删除模板
	 * 
	 */
	public OfflineErrResult DelPreset(DeletePresetRequest deletePresetRequest){
		ExecutionContext executionContext = createExecutionContext(deletePresetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeletePresetRequest> request = null;
		Response<OfflineErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeletePresetRequestMarshaller()
						.marshall(super.beforeMarshalling(deletePresetRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<OfflineErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new OfflineErrResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/*
	 * 发起get请求，更新模板
	 */
	public OfflineErrResult UpdatePreset(UpdatePersetRequest updatePersetRequest){
		ExecutionContext executionContext = createExecutionContext(updatePersetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<UpdatePersetRequest> request = null;
		Response<OfflineErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new UpdatePresetRequestMarshaller()
						.marshall(super.beforeMarshalling(updatePersetRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<OfflineErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new OfflineErrResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/*
	 * 发起get请求，获取模板详情
	 */
	public GetPresetDetailResult GetPresetDetail(GetPresetDetailRequest getPresetDetailRequest){
		ExecutionContext executionContext = createExecutionContext(getPresetDetailRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetPresetDetailRequest> request = null;
		Response<GetPresetDetailResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetPresetDetailRequestMarshaller()
						.marshall(super.beforeMarshalling(getPresetDetailRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<GetPresetDetailResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new OfflineDetailResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	
	/*
	 * 发送post请求，新建模板
	 */
	public CreateTasklResult CreateTask(CreateTaskRequest createTaskRequest){
		ExecutionContext executionContext = createExecutionContext(createTaskRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateTaskRequest> request = null;
		Response<CreateTasklResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateTaskRequestMarshaller()
						.marshall(super.beforeMarshalling(createTaskRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<CreateTasklResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new OfflineCreateTaskResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/*
	 * 使用get请求，删除任务
	 * 
	 */
	
	
	public OfflineErrResult DelTaskByTaskID(TaskRequest tashRequest) {
		// TODO Auto-generated method stub
		ExecutionContext executionContext = createExecutionContext(tashRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<TaskRequest> request = null;
		Response<OfflineErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new TaskRequestMarshaller()
							.marshall(super.beforeMarshalling(tashRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<OfflineErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new OfflineErrResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	/*
	 * 发送get请求，置顶任务
	 * 
	 */
	public OfflineErrResult TopTaskByTaskID(TopTaskByTaskIDRequest topTaskByTaskIDRequest) {
		ExecutionContext executionContext = createExecutionContext(topTaskByTaskIDRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<TopTaskByTaskIDRequest> request = null;
		Response<OfflineErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new TopTaskByTaskIDRequestMarshaller()
							.marshall(super.beforeMarshalling(topTaskByTaskIDRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<OfflineErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new OfflineErrResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);
			
			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	/*
	 * 发送get请求，获取任务列表
	 */
	public GetTaskListResult GetTaskList(GetTaskListRequest getTaskListRequest){
		ExecutionContext executionContext = createExecutionContext(getTaskListRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetTaskListRequest> request = null;
		Response<GetTaskListResult> response = null;
		try {
			
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetTaskListRequestMarshaller()
							.marshall(super.beforeMarshalling(getTaskListRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			
			HttpResponseHandler<KscWebServiceResponse<GetTaskListResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new GetTaskListResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);
			
			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
		
		
	}
	
	/*
	 * 发送get请求查询任务详情
	 */
	
	public GetTaskByTaskIDResult GetTaskByTaskID(GetTaskByTaskIDRequest getTaskByTaskIDRequest) {
		// TODO Auto-generated method stub
		ExecutionContext executionContext = createExecutionContext(getTaskByTaskIDRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetTaskByTaskIDRequest> request = null;
		Response<GetTaskByTaskIDResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetTaskByTaskIDRequestMarshaller()
							.marshall(super.beforeMarshalling(getTaskByTaskIDRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			
			HttpResponseHandler<KscWebServiceResponse<GetTaskByTaskIDResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new GetTaskByTaskIDResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);
			return response.getKscResponse();
			
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	private void init() {
		setServiceNameIntern(DEFAULT_SIGNING_NAME);
		setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
		// calling this.setEndPoint(...) will also modify the signer accordingly
		setEndpoint("http://offline.cn-beijing-6.api.ksyun.com/");
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
		return client.execute(request, responseHandler, errorResponseHandler, executionContext);
	}

	

	
	
}
