package com.ksc.ket;

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
import com.ksc.ket.model.DelPresetRequest;
import com.ksc.ket.model.ErrResult;
import com.ksc.ket.model.GetPresetDetailRequest;
import com.ksc.ket.model.GetPresetDetailResult;
import com.ksc.ket.model.GetPresetListRequest;
import com.ksc.ket.model.GetPresetListResult;
import com.ksc.ket.model.GetQuotaUsedRequest;
import com.ksc.ket.model.GetQuotaUsedResult;
import com.ksc.ket.model.GetStreamTranListRequest;
import com.ksc.ket.model.GetStreamTranListResult;
import com.ksc.ket.model.PresetRequest;
import com.ksc.ket.model.StartStreamPullRequest;
import com.ksc.ket.model.StopStreamPullRequest;
import com.ksc.ket.model.UpdatePresetRequest;
import com.ksc.ket.model.transform.DelPresetRequestMarshaller;
import com.ksc.ket.model.transform.ErrResultJsonUnmarshaller;
import com.ksc.ket.model.transform.GetPresetDetailRequestMarshaller;
import com.ksc.ket.model.transform.GetPresetDetailResultJsonUnmarshaller;
import com.ksc.ket.model.transform.GetPresetListRequestMarshaller;
import com.ksc.ket.model.transform.GetPresetListResultJsonUnmarshaller;
import com.ksc.ket.model.transform.GetQuotaUsedRequestMarshaller;
import com.ksc.ket.model.transform.GetQuotaUsedResultJsonUnmarshaller;
import com.ksc.ket.model.transform.GetStreamTranListRequestMarshaller;
import com.ksc.ket.model.transform.GetStreamTranListResultJsonUnmarshaller;
import com.ksc.ket.model.transform.PresetRequestMarshaller;
import com.ksc.ket.model.transform.StartStreamPullRequestMarshaller;
import com.ksc.ket.model.transform.StopStreamPullRequestMarshaller;
import com.ksc.ket.model.transform.UpdatePresetRequestMarshaller;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

public class KSCKETJsonClient extends KscWebServiceClient {
	/** Provider for AWS credentials. */
	private AWSCredentialsProvider kscCredentialsProvider;

	/** Default signing name for the service. */
	private static final String DEFAULT_SIGNING_NAME = "ket";

	/** The region metadata service name for computing region endpoints. */
	private static final String DEFAULT_ENDPOINT_PREFIX = "ket";

	/**
	 * Client configuration factory providing ClientConfigurations tailored to
	 * this client
	 */
	protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

	private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
			new JsonClientMetadata().withSupportsCbor(false));

	private static final Log log = LogFactory.getLog(KSCKETJsonClient.class);

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
	public KSCKETJsonClient() {
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
	public KSCKETJsonClient(ClientConfiguration clientConfiguration) {
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
	public KSCKETJsonClient(AWSCredentials awsCredentials) {
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
	public KSCKETJsonClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
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
	public KSCKETJsonClient(AWSCredentialsProvider awsCredentialsProvider) {
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
	public KSCKETJsonClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
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
	public KSCKETJsonClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(clientConfiguration, requestMetricCollector);
		this.kscCredentialsProvider = awsCredentialsProvider;
		init();
	}

	public ErrResult Preset(PresetRequest presetRequest) {
		ExecutionContext executionContext = createExecutionContext(presetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<PresetRequest> request = null;
		Response<ErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new PresetRequestMarshaller().marshall(super.beforeMarshalling(presetRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ErrResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	public ErrResult UpdatePreset(UpdatePresetRequest updatepresetRequest) {
		ExecutionContext executionContext = createExecutionContext(updatepresetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<UpdatePresetRequest> request = null;
		Response<ErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new UpdatePresetRequestMarshaller().marshall(super.beforeMarshalling(updatepresetRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ErrResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	public ErrResult DelPreset(DelPresetRequest delPresetRequest) {
		ExecutionContext executionContext = createExecutionContext(delPresetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DelPresetRequest> request = null;
		Response<ErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DelPresetRequestMarshaller().marshall(super.beforeMarshalling(delPresetRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ErrResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	public GetPresetDetailResult GetPresetDetail(GetPresetDetailRequest getPresetDetailRequest) {
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
							new GetPresetDetailResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	public GetPresetListResult GetPresetList(GetPresetListRequest getPresetListRequest) {
		ExecutionContext executionContext = createExecutionContext(getPresetListRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetPresetListRequest> request = null;
		Response<GetPresetListResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetPresetListRequestMarshaller().marshall(super.beforeMarshalling(getPresetListRequest));
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

	public GetStreamTranListResult GetStreamTranList(GetStreamTranListRequest getStreamTranListRequest) {
		ExecutionContext executionContext = createExecutionContext(getStreamTranListRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetStreamTranListRequest> request = null;
		Response<GetStreamTranListResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetStreamTranListRequestMarshaller()
						.marshall(super.beforeMarshalling(getStreamTranListRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<GetStreamTranListResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new GetStreamTranListResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	public ErrResult StartStreamPull(StartStreamPullRequest startStreamPullRequest) {
		ExecutionContext executionContext = createExecutionContext(startStreamPullRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<StartStreamPullRequest> request = null;
		Response<ErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new StartStreamPullRequestMarshaller()
						.marshall(super.beforeMarshalling(startStreamPullRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ErrResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	public ErrResult StopStreamPull(StopStreamPullRequest stopStreamPullRequest) {
		ExecutionContext executionContext = createExecutionContext(stopStreamPullRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<StopStreamPullRequest> request = null;
		Response<ErrResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new StopStreamPullRequestMarshaller()
						.marshall(super.beforeMarshalling(stopStreamPullRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ErrResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ErrResultJsonUnmarshaller());

			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	public GetQuotaUsedResult GetQuotaUsed(GetQuotaUsedRequest getQuotaUsedRequest) {
		ExecutionContext executionContext = createExecutionContext(getQuotaUsedRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetQuotaUsedRequest> request = null;
		Response<GetQuotaUsedResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetQuotaUsedRequestMarshaller().marshall(super.beforeMarshalling(getQuotaUsedRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<GetQuotaUsedResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new GetQuotaUsedResultJsonUnmarshaller());

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
		setEndpoint("http://ket.cn-beijing-6.api.ksyun.com/");
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
		try {
			return client.execute(request, responseHandler, errorResponseHandler, executionContext);
		} catch (Exception e) {
			log.error(e);
			return null;
		}
	}
}
