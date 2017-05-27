package com.ksc.kvs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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
import com.ksc.kvs.KSCKVSJsonClient;
import com.ksc.kvs.model.CreateTaskRequest;
import com.ksc.kvs.model.CreateTasklResult;
import com.ksc.kvs.model.DelTaskByTaskIDRequest;
import com.ksc.kvs.model.DeletePresetRequest;
import com.ksc.kvs.model.GetListRequest;
import com.ksc.kvs.model.GetPresetDetailRequest;
import com.ksc.kvs.model.GetPresetDetailResult;
import com.ksc.kvs.model.GetPresetListRequest;
import com.ksc.kvs.model.GetPresetListResult;
import com.ksc.kvs.model.GetTaskByTaskIDRequest;
import com.ksc.kvs.model.GetTaskByTaskIDResult;
import com.ksc.kvs.model.GetTaskListRequest;
import com.ksc.kvs.model.GetTaskListResult;
import com.ksc.kvs.model.GetTaskMetaRequest;
import com.ksc.kvs.model.GetTaskMetaResult;
import com.ksc.kvs.model.KvsErrResult;
import com.ksc.kvs.model.KvsResult;
import com.ksc.kvs.model.PresetRequest;
import com.ksc.kvs.model.TopTaskByTaskIDRequest;
import com.ksc.kvs.model.UpdatePresetRequest;
import com.ksc.kvs.model.transform.CreateTaskRequestMarshaller;
import com.ksc.kvs.model.transform.DeletePresetRequestMarshaller;
import com.ksc.kvs.model.transform.GetListRequestMarshaller;
import com.ksc.kvs.model.transform.GetPresetDetailRequestMarshaller;
import com.ksc.kvs.model.transform.GetPresetListRequestMarshaller;
import com.ksc.kvs.model.transform.GetPresetListResultJsonUnmarshaller;
import com.ksc.kvs.model.transform.GetTaskByTaskIDRequestMarshaller;
import com.ksc.kvs.model.transform.GetTaskByTaskIDResultJsonUnmarshaller;
import com.ksc.kvs.model.transform.GetTaskListRequestMarshaller;
import com.ksc.kvs.model.transform.GetTaskListResultJsonUnmarshaller;
import com.ksc.kvs.model.transform.GetTaskMetaRequestMarshaller;
import com.ksc.kvs.model.transform.GetTaskMetaResultJsonUnmarshaller;
import com.ksc.kvs.model.transform.KvsCreateTaskResultJsonUnmarshaller;
import com.ksc.kvs.model.transform.KvsDetailResultJsonUnmarshaller;
import com.ksc.kvs.model.transform.KvsErrResultJsonUnmarshaller;
import com.ksc.kvs.model.transform.KvsResultJsonUnmarshaller;
import com.ksc.kvs.model.transform.PresetRequestMarshaller;
import com.ksc.kvs.model.transform.DelTaskByTaskIDRequestMarshaller;
import com.ksc.kvs.model.transform.TopTaskByTaskIDRequestMarshaller;
import com.ksc.kvs.model.transform.UpdatePresetRequestMarshaller;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

public class KSCKVSJsonClient extends KscWebServiceClient {
	/** Provider for AWS credentials. */
	private AWSCredentialsProvider kscCredentialsProvider;

	/** Default signing name for the service. */
	private static final String DEFAULT_SIGNING_NAME = "kvs";

	/** The region metadata service name for computing region endpoints. */
	private static final String DEFAULT_ENDPOINT_PREFIX = "kvs";

	/**
	 * Client configuration factory providing ClientConfigurations tailored to
	 * this client
	 */
	protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();
	
	private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
			new JsonClientMetadata().withSupportsCbor(false));
	
	
	private static final Log log =
	        LogFactory.getLog(KSCKVSJsonClient.class);

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
	public KSCKVSJsonClient() {
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
	public KSCKVSJsonClient(ClientConfiguration clientConfiguration) {
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
	public KSCKVSJsonClient(AWSCredentials awsCredentials) {
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
	public KSCKVSJsonClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
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
	public KSCKVSJsonClient(AWSCredentialsProvider awsCredentialsProvider) {
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
	public KSCKVSJsonClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
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
	public KSCKVSJsonClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(clientConfiguration, requestMetricCollector);
		this.kscCredentialsProvider = awsCredentialsProvider;
		init();
	}
	

	public KvsErrResult Preset(PresetRequest presetRequest){
		ExecutionContext executionContext = createExecutionContext(presetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<PresetRequest> request = null;
		Response<KvsErrResult> response = null;
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
			HttpResponseHandler<KscWebServiceResponse<KvsErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new KvsErrResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	public GetPresetListResult GetPresetList(GetPresetListRequest kvsRequest) {
		ExecutionContext executionContext = createExecutionContext(kvsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetPresetListRequest> request = null;
		Response<GetPresetListResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetPresetListRequestMarshaller()
						.marshall(super.beforeMarshalling(kvsRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<GetPresetListResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new GetPresetListResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}

	}
	

	public KvsErrResult DelPreset(DeletePresetRequest deletePresetRequest){
		ExecutionContext executionContext = createExecutionContext(deletePresetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeletePresetRequest> request = null;
		Response<KvsErrResult> response = null;
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
			HttpResponseHandler<KscWebServiceResponse<KvsErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new KvsErrResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	

	public KvsErrResult UpdatePreset(UpdatePresetRequest updatePersetRequest){
		ExecutionContext executionContext = createExecutionContext(updatePersetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<UpdatePresetRequest> request = null;
		Response<KvsErrResult> response = null;
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
			HttpResponseHandler<KscWebServiceResponse<KvsErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new KvsErrResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	

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
							new KvsDetailResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	
	
	
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
							new KvsCreateTaskResultJsonUnmarshaller());
			
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	

	
	public KvsErrResult DelTaskByTaskID(DelTaskByTaskIDRequest delTaskByTaskIDRequest) {
		// TODO Auto-generated method stub
		ExecutionContext executionContext = createExecutionContext(delTaskByTaskIDRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DelTaskByTaskIDRequest> request = null;
		Response<KvsErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DelTaskByTaskIDRequestMarshaller()
							.marshall(super.beforeMarshalling(delTaskByTaskIDRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<KvsErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new KvsErrResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}
	

	public KvsErrResult TopTaskByTaskID(TopTaskByTaskIDRequest topTaskByTaskIDRequest) {
		ExecutionContext executionContext = createExecutionContext(topTaskByTaskIDRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<TopTaskByTaskIDRequest> request = null;
		Response<KvsErrResult> response = null;
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
			HttpResponseHandler<KscWebServiceResponse<KvsErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new KvsErrResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);
			
			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

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
	
	public GetTaskMetaResult GetTaskMetaInfo(GetTaskMetaRequest getTaskMetaInfoRequest) {
		ExecutionContext executionContext = createExecutionContext(getTaskMetaInfoRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetTaskMetaRequest> request = null;
		Response<GetTaskMetaResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetTaskMetaRequestMarshaller()
							.marshall(super.beforeMarshalling(getTaskMetaInfoRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			
			HttpResponseHandler<KscWebServiceResponse<GetTaskMetaResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new GetTaskMetaResultJsonUnmarshaller());

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
		setEndpoint("http://kvs.cn-beijing-6.api.ksyun.com/");
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

}
