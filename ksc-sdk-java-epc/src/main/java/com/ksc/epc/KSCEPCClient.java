package com.ksc.epc;

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
import com.ksc.epc.model.*;
import com.ksc.epc.model.transform.*;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

import java.util.HashMap;

public class KSCEPCClient extends KscWebServiceClient implements KSCEPC{
	/** Provider for AWS credentials. */
	private AWSCredentialsProvider kscCredentialsProvider;

	/** Default signing name for the service. */
	private static final String DEFAULT_SIGNING_NAME = "epc";

	/** The region metadata service name for computing region endpoints. */
	private static final String DEFAULT_ENDPOINT_PREFIX = "epc";

	/**
	 * Client configuration factory providing ClientConfigurations tailored to
	 * this client
	 */
	protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();
	private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
			new JsonClientMetadata().withSupportsCbor(false));

	/**
	 * Constructs a new client to invoke service methods on EPC. A credentials
	 * provider chain will be used that searches for credentials in this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the EPC metadata
	 * service</li>
	 * </ul>
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 * 
	 * @see DefaultAWSCredentialsProviderChain
	 */
	public KSCEPCClient() {
		this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on EPC. A credentials
	 * provider chain will be used that searches for credentials in this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the EPC metadata
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
	public KSCEPCClient(ClientConfiguration clientConfiguration) {
		this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
	}

	/**
	 * Constructs a new client to invoke service methods on EPC using the
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
	public KSCEPCClient(AWSCredentials awsCredentials) {
		this(awsCredentials, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on EPC using the
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
	 *            connects to EPC (ex: proxy settings, retry counts, etc.).
	 */
	public KSCEPCClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
		super(clientConfiguration);
		this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
		init();
	}

	/**
	 * Constructs a new client to invoke service methods on EPC using the
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
	public KSCEPCClient(AWSCredentialsProvider awsCredentialsProvider) {
		this(awsCredentialsProvider, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on EPC using the
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
	 *            connects to EPC (ex: proxy settings, retry counts, etc.).
	 */
	public KSCEPCClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
		this(awsCredentialsProvider, clientConfiguration, null);
	}

	/**
	 * Constructs a new client to invoke service methods on EPC using the
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
	 *            connects to EPC (ex: proxy settings, retry counts, etc.).
	 * @param requestMetricCollector
	 *            optional request metric collector
	 */
	public KSCEPCClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(clientConfiguration, requestMetricCollector);
		this.kscCredentialsProvider = awsCredentialsProvider;
		init();
	}

	private void init() {
		setServiceNameIntern(DEFAULT_SIGNING_NAME);
		setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
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

		//DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
		   HttpResponseHandler<KscServiceException> errorResponseHandler = protocolFactory
	                .createErrorResponseHandler(new JsonErrorResponseMetadata());
		return client.execute(request, responseHandler, errorResponseHandler, executionContext);
	}


	@Override
	public CreateEpcResult createEpc(CreateEpcRequest createEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(createEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateEpcRequest> request = null;
		Response<CreateEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateEpcRequestMarshaller()
						.marshall(createEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<CreateEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new CreateEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeEpcsResult describeEpcs(DescribeEpcsRequest describeEpcsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeEpcsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeEpcsRequest> request = null;
		Response<DescribeEpcsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeEpcsRequestMarshaller()
						.marshall(describeEpcsRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeEpcsResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeEpcsResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteEpcResult deleteEpc(DeleteEpcRequest deleteEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(deleteEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteEpcRequest> request = null;
		Response<DeleteEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteEpcRequestMarshaller()
						.marshall(deleteEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DeleteEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DeleteEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyEpcResult modifyEpc(ModifyEpcRequest modifyEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyEpcRequest> request = null;
		Response<ModifyEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyEpcRequestMarshaller()
						.marshall(modifyEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ModifyEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ModifyEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public StartEpcResult startEpc(StartEpcRequest startEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(startEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<StartEpcRequest> request = null;
		Response<StartEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new StartEpcRequestMarshaller()
						.marshall(startEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<StartEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new StartEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public StopEpcResult stopEpc(StopEpcRequest stopEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(stopEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<StopEpcRequest> request = null;
		Response<StopEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new StopEpcRequestMarshaller()
						.marshall(stopEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<StopEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new StopEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public RebootEpcResult rebootEpc(RebootEpcRequest rebootEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(rebootEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<RebootEpcRequest> request = null;
		Response<RebootEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new RebootEpcRequestMarshaller()
						.marshall(rebootEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<RebootEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new RebootEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ReinstallEpcResult reinstallEpc(ReinstallEpcRequest reinstallEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(reinstallEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ReinstallEpcRequest> request = null;
		Response<ReinstallEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ReinstallEpcRequestMarshaller()
						.marshall(reinstallEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ReinstallEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ReinstallEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ReinstallCustomerEpcResult reinstallCustomerEpc(ReinstallCustomerEpcRequest reinstallCustomerEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(reinstallCustomerEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ReinstallCustomerEpcRequest> request = null;
		Response<ReinstallCustomerEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ReinstallCustomerEpcRequestMarshaller()
						.marshall(reinstallCustomerEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ReinstallCustomerEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ReinstallCustomerEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ResetPasswordResult resetPassword(ResetPasswordRequest resetPasswordRequest) {
		ExecutionContext executionContext = createExecutionContext(resetPasswordRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ResetPasswordRequest> request = null;
		Response<ResetPasswordResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ResetPasswordRequestMarshaller()
						.marshall(resetPasswordRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ResetPasswordResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ResetPasswordResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyHyperThreadingResult modifyHyperThreading(ModifyHyperThreadingRequest modifyHyperThreadingRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyHyperThreadingRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyHyperThreadingRequest> request = null;
		Response<ModifyHyperThreadingResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyHyperThreadingRequestMarshaller()
						.marshall(modifyHyperThreadingRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ModifyHyperThreadingResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ModifyHyperThreadingResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateImageResult createImage(CreateImageRequest createImageRequest) {
		ExecutionContext executionContext = createExecutionContext(createImageRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateImageRequest> request = null;
		Response<CreateImageResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateImageRequestMarshaller()
						.marshall(createImageRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<CreateImageResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new CreateImageResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyImageResult modifyImage(ModifyImageRequest modifyImageRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyImageRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyImageRequest> request = null;
		Response<ModifyImageResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyImageRequestMarshaller()
						.marshall(modifyImageRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ModifyImageResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ModifyImageResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteImageResult deleteImage(DeleteImageRequest deleteImageRequest) {
		ExecutionContext executionContext = createExecutionContext(deleteImageRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteImageRequest> request = null;
		Response<DeleteImageResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteImageRequestMarshaller()
						.marshall(deleteImageRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DeleteImageResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DeleteImageResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest) {
		ExecutionContext executionContext = createExecutionContext(describeImagesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeImagesRequest> request = null;
		Response<DescribeImagesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeImagesRequestMarshaller()
						.marshall(describeImagesRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeImagesResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeImagesResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ImportKeyResult importKey(ImportKeyRequest importKeyRequest) {
		ExecutionContext executionContext = createExecutionContext(importKeyRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ImportKeyRequest> request = null;
		Response<ImportKeyResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ImportKeyRequestMarshaller()
						.marshall(importKeyRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ImportKeyResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ImportKeyResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteKeyResult deleteKey(DeleteKeyRequest deleteKeyRequest) {
		ExecutionContext executionContext = createExecutionContext(deleteKeyRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteKeyRequest> request = null;
		Response<DeleteKeyResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteKeyRequestMarshaller()
						.marshall(deleteKeyRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DeleteKeyResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DeleteKeyResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyKeyResult modifyKey(ModifyKeyRequest modifyKeyRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyKeyRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyKeyRequest> request = null;
		Response<ModifyKeyResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyKeyRequestMarshaller()
						.marshall(modifyKeyRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ModifyKeyResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ModifyKeyResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateKeyResult createKey(CreateKeyRequest createKeyRequest) {
		ExecutionContext executionContext = createExecutionContext(createKeyRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateKeyRequest> request = null;
		Response<CreateKeyResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateKeyRequestMarshaller()
						.marshall(createKeyRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<CreateKeyResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new CreateKeyResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeKeysResult describeKeys(DescribeKeysRequest describeKeysRequest) {
		ExecutionContext executionContext = createExecutionContext(describeKeysRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeKeysRequest> request = null;
		Response<DescribeKeysResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeKeysRequestMarshaller()
						.marshall(describeKeysRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeKeysResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeKeysResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribePhysicalMonitorResult describePhysicalMonitor(DescribePhysicalMonitorRequest describePhysicalMonitorRequest) {
		ExecutionContext executionContext = createExecutionContext(describePhysicalMonitorRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribePhysicalMonitorRequest> request = null;
		Response<DescribePhysicalMonitorResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribePhysicalMonitorRequestMarshaller()
						.marshall(describePhysicalMonitorRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribePhysicalMonitorResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribePhysicalMonitorResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyNetworkInterfaceAttributeResult modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyNetworkInterfaceAttributeRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyNetworkInterfaceAttributeRequest> request = null;
		Response<ModifyNetworkInterfaceAttributeResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyNetworkInterfaceAttributeRequestMarshaller()
						.marshall(modifyNetworkInterfaceAttributeRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ModifyNetworkInterfaceAttributeResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ModifyNetworkInterfaceAttributeResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyDnsResult modifyDns(ModifyDnsRequest modifyDnsRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyDnsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyDnsRequest> request = null;
		Response<ModifyDnsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyDnsRequestMarshaller()
						.marshall(modifyDnsRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ModifyDnsResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ModifyDnsResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifySecurityGroupResult modifySecurityGroup(ModifySecurityGroupRequest modifySecurityGroupRequest) {
		ExecutionContext executionContext = createExecutionContext(modifySecurityGroupRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifySecurityGroupRequest> request = null;
		Response<ModifySecurityGroupResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifySecurityGroupRequestMarshaller()
						.marshall(modifySecurityGroupRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ModifySecurityGroupResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ModifySecurityGroupResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeCabinetsResult describeCabinets(DescribeCabinetsRequest describeCabinetsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeCabinetsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeCabinetsRequest> request = null;
		Response<DescribeCabinetsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeCabinetsRequestMarshaller()
						.marshall(describeCabinetsRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeCabinetsResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeCabinetsResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeInspectionsResult describeInspections(DescribeInspectionsRequest describeInspectionsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeInspectionsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeInspectionsRequest> request = null;
		Response<DescribeInspectionsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeInspectionsRequestMarshaller()
						.marshall(describeInspectionsRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeInspectionsResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeInspectionsResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeEpcStocksResult describeEpcStocks(DescribeEpcStocksRequest describeEpcStocksRequest) {
		ExecutionContext executionContext = createExecutionContext(describeEpcStocksRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeEpcStocksRequest> request = null;
		Response<DescribeEpcStocksResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeEpcStocksRequestMarshaller()
						.marshall(describeEpcStocksRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeEpcStocksResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeEpcStocksResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeEpcDeviceAttributesResult describeEpcDeviceAttributes(DescribeEpcDeviceAttributesRequest describeEpcDeviceAttributesRequest) {
		ExecutionContext executionContext = createExecutionContext(describeEpcDeviceAttributesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeEpcDeviceAttributesRequest> request = null;
		Response<DescribeEpcDeviceAttributesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeEpcDeviceAttributesRequestMarshaller()
						.marshall(describeEpcDeviceAttributesRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeEpcDeviceAttributesResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeEpcDeviceAttributesResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeEpcTrashesResult describeEpcTrashes(DescribeEpcTrashesRequest describeEpcTrashesRequest) {
		ExecutionContext executionContext = createExecutionContext(describeEpcTrashesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeEpcTrashesRequest> request = null;
		Response<DescribeEpcTrashesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeEpcTrashesRequestMarshaller()
						.marshall(describeEpcTrashesRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeEpcTrashesResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeEpcTrashesResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ReturnEpcResult returnEpc(ReturnEpcRequest returnEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(returnEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ReturnEpcRequest> request = null;
		Response<ReturnEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ReturnEpcRequestMarshaller()
						.marshall(returnEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ReturnEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ReturnEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public RecoverEpcResult recoverEpc(RecoverEpcRequest recoverEpcRequest) {
		ExecutionContext executionContext = createExecutionContext(recoverEpcRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<RecoverEpcRequest> request = null;
		Response<RecoverEpcResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new RecoverEpcRequestMarshaller()
						.marshall(recoverEpcRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<RecoverEpcResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new RecoverEpcResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribePriceResult describePrice(DescribePriceRequest describePriceRequest) {
		ExecutionContext executionContext = createExecutionContext(describePriceRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribePriceRequest> request = null;
		Response<DescribePriceResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribePriceRequestMarshaller()
						.marshall(describePriceRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribePriceResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribePriceResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeAccessorysResult describeAccessorys(DescribeAccessorysRequest describeAccessorysRequest) {
		ExecutionContext executionContext = createExecutionContext(describeAccessorysRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeAccessorysRequest> request = null;
		Response<DescribeAccessorysResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeAccessorysRequestMarshaller()
						.marshall(describeAccessorysRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeAccessorysResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeAccessorysResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteAccessoryResult deleteAccessory(DeleteAccessoryRequest deleteAccessoryRequest) {
		ExecutionContext executionContext = createExecutionContext(deleteAccessoryRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteAccessoryRequest> request = null;
		Response<DeleteAccessoryResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteAccessoryRequestMarshaller()
						.marshall(deleteAccessoryRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DeleteAccessoryResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DeleteAccessoryResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateAccessoryResult createAccessory(CreateAccessoryRequest createAccessoryRequest) {
		ExecutionContext executionContext = createExecutionContext(createAccessoryRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateAccessoryRequest> request = null;
		Response<CreateAccessoryResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateAccessoryRequestMarshaller()
						.marshall(createAccessoryRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<CreateAccessoryResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new CreateAccessoryResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public BuyAccessoryResult buyAccessory(BuyAccessoryRequest buyAccessoryRequest) {
		ExecutionContext executionContext = createExecutionContext(buyAccessoryRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<BuyAccessoryRequest> request = null;
		Response<BuyAccessoryResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new BuyAccessoryRequestMarshaller()
						.marshall(buyAccessoryRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<BuyAccessoryResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new BuyAccessoryResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateCabinetResult createCabinet(CreateCabinetRequest createCabinetRequest) {
		ExecutionContext executionContext = createExecutionContext(createCabinetRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateCabinetRequest> request = null;
		Response<CreateCabinetResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateCabinetRequestMarshaller()
						.marshall(createCabinetRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<CreateCabinetResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new CreateCabinetResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeProcessesResult describeProcesses(DescribeProcessesRequest describeProcessesRequest) {
		ExecutionContext executionContext = createExecutionContext(describeProcessesRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeProcessesRequest> request = null;
		Response<DescribeProcessesResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeProcessesRequestMarshaller()
						.marshall(describeProcessesRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeProcessesResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeProcessesResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateProcessResult createProcess(CreateProcessRequest createProcessRequest) {
		ExecutionContext executionContext = createExecutionContext(createProcessRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateProcessRequest> request = null;
		Response<CreateProcessResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateProcessRequestMarshaller()
						.marshall(createProcessRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<CreateProcessResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new CreateProcessResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteProcessResult deleteProcess(DeleteProcessRequest deleteProcessRequest) {
		ExecutionContext executionContext = createExecutionContext(deleteProcessRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteProcessRequest> request = null;
		Response<DeleteProcessResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteProcessRequestMarshaller()
						.marshall(deleteProcessRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DeleteProcessResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DeleteProcessResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ReplyProcessResult replyProcess(ReplyProcessRequest replyProcessRequest) {
		ExecutionContext executionContext = createExecutionContext(replyProcessRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ReplyProcessRequest> request = null;
		Response<ReplyProcessResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ReplyProcessRequestMarshaller()
						.marshall(replyProcessRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ReplyProcessResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ReplyProcessResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateRemoteManagementResult createRemoteManagement(CreateRemoteManagementRequest createRemoteManagementRequest) {
		ExecutionContext executionContext = createExecutionContext(createRemoteManagementRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateRemoteManagementRequest> request = null;
		Response<CreateRemoteManagementResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateRemoteManagementRequestMarshaller()
						.marshall(createRemoteManagementRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<CreateRemoteManagementResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new CreateRemoteManagementResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public GetDynamicCodeResult getDynamicCode(GetDynamicCodeRequest getDynamicCodeRequest) {
		ExecutionContext executionContext = createExecutionContext(getDynamicCodeRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetDynamicCodeRequest> request = null;
		Response<GetDynamicCodeResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetDynamicCodeRequestMarshaller()
						.marshall(getDynamicCodeRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<GetDynamicCodeResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new GetDynamicCodeResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeRemoteManagementsResult describeRemoteManagements(DescribeRemoteManagementsRequest describeRemoteManagementsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeRemoteManagementsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeRemoteManagementsRequest> request = null;
		Response<DescribeRemoteManagementsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeRemoteManagementsRequestMarshaller()
						.marshall(describeRemoteManagementsRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeRemoteManagementsResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeRemoteManagementsResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyRemoteManagementResult modifyRemoteManagement(ModifyRemoteManagementRequest modifyRemoteManagementRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyRemoteManagementRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyRemoteManagementRequest> request = null;
		Response<ModifyRemoteManagementResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyRemoteManagementRequestMarshaller()
						.marshall(modifyRemoteManagementRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ModifyRemoteManagementResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ModifyRemoteManagementResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteRemoteManagementResult deleteRemoteManagement(DeleteRemoteManagementRequest deleteRemoteManagementRequest) {
		ExecutionContext executionContext = createExecutionContext(deleteRemoteManagementRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteRemoteManagementRequest> request = null;
		Response<DeleteRemoteManagementResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteRemoteManagementRequestMarshaller()
						.marshall(deleteRemoteManagementRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DeleteRemoteManagementResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DeleteRemoteManagementResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeEpcManagementsResult describeEpcManagements(DescribeEpcManagementsRequest describeEpcManagementsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeEpcManagementsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeEpcManagementsRequest> request = null;
		Response<DescribeEpcManagementsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeEpcManagementsRequestMarshaller()
						.marshall(describeEpcManagementsRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeEpcManagementsResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeEpcManagementsResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeVpnsResult describeVpns(DescribeVpnsRequest describeVpnsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeVpnsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeVpnsRequest> request = null;
		Response<DescribeVpnsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeVpnsRequestMarshaller()
						.marshall(describeVpnsRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeVpnsResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeVpnsResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateResourceRequirementResult createResourceRequirement(CreateResourceRequirementRequest createResourceRequirementRequest) {
		ExecutionContext executionContext = createExecutionContext(createResourceRequirementRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateResourceRequirementRequest> request = null;
		Response<CreateResourceRequirementResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateResourceRequirementRequestMarshaller()
						.marshall(createResourceRequirementRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<CreateResourceRequirementResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new CreateResourceRequirementResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ModifyResourceRequirementResult modifyResourceRequirement(ModifyResourceRequirementRequest modifyResourceRequirementRequest) {
		ExecutionContext executionContext = createExecutionContext(modifyResourceRequirementRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ModifyResourceRequirementRequest> request = null;
		Response<ModifyResourceRequirementResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ModifyResourceRequirementRequestMarshaller()
						.marshall(modifyResourceRequirementRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ModifyResourceRequirementResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ModifyResourceRequirementResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DeleteResourceRequirementResult deleteResourceRequirement(DeleteResourceRequirementRequest deleteResourceRequirementRequest) {
		ExecutionContext executionContext = createExecutionContext(deleteResourceRequirementRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DeleteResourceRequirementRequest> request = null;
		Response<DeleteResourceRequirementResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DeleteResourceRequirementRequestMarshaller()
						.marshall(deleteResourceRequirementRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DeleteResourceRequirementResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DeleteResourceRequirementResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public DescribeResourceRequirementsResult describeResourceRequirements(DescribeResourceRequirementsRequest describeResourceRequirementsRequest) {
		ExecutionContext executionContext = createExecutionContext(describeResourceRequirementsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeResourceRequirementsRequest> request = null;
		Response<DescribeResourceRequirementsResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeResourceRequirementsRequestMarshaller()
						.marshall(describeResourceRequirementsRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<DescribeResourceRequirementsResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new DescribeResourceRequirementsResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public ReplyResourceRequirementResult replyResourceRequirement(ReplyResourceRequirementRequest replyResourceRequirementRequest) {
		ExecutionContext executionContext = createExecutionContext(replyResourceRequirementRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ReplyResourceRequirementRequest> request = null;
		Response<ReplyResourceRequirementResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ReplyResourceRequirementRequestMarshaller()
						.marshall(replyResourceRequirementRequest);
				request.setHeaders(new HashMap<String, String>(){{
					put("Accept","application/json");
				}});
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			HttpResponseHandler<KscWebServiceResponse<ReplyResourceRequirementResult>> responseHandler = protocolFactory
					.createResponseHandler(
							new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
							new ReplyResourceRequirementResultJsonUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}


}
