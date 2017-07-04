package com.ksc.monitor;

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
import com.ksc.monitor.model.GetCustomMetricStatisticsRequest;
import com.ksc.monitor.model.GetCustomMetricStatisticsResponse;
import com.ksc.monitor.model.GetMetricStatisticsRequest;
import com.ksc.monitor.model.GetMetricStatisticsResponse;
import com.ksc.monitor.model.ListCustomMetricsRequest;
import com.ksc.monitor.model.ListCustomMetricsResponse;
import com.ksc.monitor.model.ListMetricsRequest;
import com.ksc.monitor.model.ListMetricsResponse;
import com.ksc.monitor.model.PutMetricDataRequest;
import com.ksc.monitor.model.PutMetricDataResponse;
import com.ksc.monitor.model.transform.GetCustomMetricStatisticsRequestMarshaller;
import com.ksc.monitor.model.transform.GetMetricStatisticsRequestMarshaller;
import com.ksc.monitor.model.transform.GetMetricStatisticsResponseStaxUnmarshaller;
import com.ksc.monitor.model.transform.GetMetricStatisticsResponseV1StaxUnmarshaller;
import com.ksc.monitor.model.transform.ListCustomMetricsRequestMarshaller;
import com.ksc.monitor.model.transform.ListMetricsRequestMarshaller;
import com.ksc.monitor.model.transform.ListMetricsResponseStaxUnmarshaller;
import com.ksc.monitor.model.transform.ListMetricsResponseV1StaxUnmarshaller;
import com.ksc.monitor.model.transform.PutMetricDataRequestMarshaller;
import com.ksc.monitor.model.transform.PutMetricDataResponseStaxUnmarshaller;
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

public class KSCMonitorClient extends KscWebServiceClient implements KSCMonitor {
	/** Provider for AWS credentials. */
	private AWSCredentialsProvider kscCredentialsProvider;

	/** Default signing name for the service. */
	private static final String DEFAULT_SIGNING_NAME = "monitor";

	/** The region metadata service name for computing region endpoints. */
	private static final String DEFAULT_ENDPOINT_PREFIX = "monitor";
	// private final SdkJsonProtocolFactory protocolFactory = new
	// SdkJsonProtocolFactory(
	// new JsonClientMetadata().withSupportsCbor(false));
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
	 * Constructs a new client to invoke service methods on monitor. A
	 * credentials provider chain will be used that searches for credentials in
	 * this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the monitor metadata
	 * service</li>
	 * </ul>
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 * 
	 * @see DefaultAWSCredentialsProviderChain
	 */
	public KSCMonitorClient() {
		this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on monitor. A
	 * credentials provider chain will be used that searches for credentials in
	 * this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the monitor metadata
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
	public KSCMonitorClient(ClientConfiguration clientConfiguration) {
		this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
	}

	/**
	 * Constructs a new client to invoke service methods on monitor using the
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
	public KSCMonitorClient(AWSCredentials awsCredentials) {
		this(awsCredentials, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on monitor using the
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
	 *            connects to monitor (ex: proxy settings, retry counts, etc.).
	 */
	public KSCMonitorClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
		super(clientConfiguration);
		this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
		init();
	}

	/**
	 * Constructs a new client to invoke service methods on monitor using the
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
	public KSCMonitorClient(AWSCredentialsProvider awsCredentialsProvider) {
		this(awsCredentialsProvider, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on monitor using the
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
	 *            connects to monitor (ex: proxy settings, retry counts, etc.).
	 */
	public KSCMonitorClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
		this(awsCredentialsProvider, clientConfiguration, null);
	}

	/**
	 * Constructs a new client to invoke service methods on monitor using the
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
	 *            connects to monitor (ex: proxy settings, retry counts, etc.).
	 * @param requestMetricCollector
	 *            optional request metric collector
	 */
	public KSCMonitorClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(clientConfiguration, requestMetricCollector);
		this.kscCredentialsProvider = awsCredentialsProvider;
		init();
	}

	@Override
	public GetMetricStatisticsResponse getMetricStatistics(GetMetricStatisticsRequest getMetricStatisticsRequest) {
		ExecutionContext executionContext = createExecutionContext(getMetricStatisticsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetMetricStatisticsRequest> request = null;
		
			Response<GetMetricStatisticsResponse> response = null;
			try {
				kscRequestMetrics.startEvent(Field.RequestMarshallTime);
				try {
					request = new GetMetricStatisticsRequestMarshaller()
							.marshall(super.beforeMarshalling(getMetricStatisticsRequest));
					// Binds the request metrics to the current request.
					request.setKscRequestMetrics(kscRequestMetrics);
				} finally {
					kscRequestMetrics.endEvent(Field.RequestMarshallTime);
				}
				StaxResponseHandler<GetMetricStatisticsResponse> responseHandler = new StaxResponseHandler<GetMetricStatisticsResponse>(
						new GetMetricStatisticsResponseStaxUnmarshaller());
				response = invoke(request, responseHandler, executionContext);

				return response.getKscResponse();
			} finally {
				endClientExecution(kscRequestMetrics, request, response);
			}
		

	}
	@Override
	public GetCustomMetricStatisticsResponse getCustomMetricStatistics(GetCustomMetricStatisticsRequest getCustomMetricStatisticsRequest) {
		ExecutionContext executionContext = createExecutionContext(getCustomMetricStatisticsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetCustomMetricStatisticsRequest> request = null;
			Response<GetCustomMetricStatisticsResponse> response = null;
			try {
				kscRequestMetrics.startEvent(Field.RequestMarshallTime);
				try {
					request = new GetCustomMetricStatisticsRequestMarshaller()
							.marshall(super.beforeMarshalling(getCustomMetricStatisticsRequest));
					// Binds the request metrics to the current request.
					request.setKscRequestMetrics(kscRequestMetrics);
				} finally {
					kscRequestMetrics.endEvent(Field.RequestMarshallTime);
				}
				StaxResponseHandler<GetCustomMetricStatisticsResponse> responseHandler = new StaxResponseHandler<GetCustomMetricStatisticsResponse>(
						new GetMetricStatisticsResponseV1StaxUnmarshaller());
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
		setEndpoint("http://monitor.cn-beijing-2.api.ksyun.com");
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
	public ListMetricsResponse listMetrics(ListMetricsRequest listMetricsRequest) {
		ExecutionContext executionContext = createExecutionContext(listMetricsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ListMetricsRequest> request = null;
		
			Response<ListMetricsResponse> response = null;
			try {
				kscRequestMetrics.startEvent(Field.RequestMarshallTime);
				try {
					request = new ListMetricsRequestMarshaller().marshall(super.beforeMarshalling(listMetricsRequest));
					// Binds the request metrics to the current request.
					request.setKscRequestMetrics(kscRequestMetrics);
				} finally {
					kscRequestMetrics.endEvent(Field.RequestMarshallTime);
				}
				StaxResponseHandler<ListMetricsResponse> responseHandler = new StaxResponseHandler<ListMetricsResponse>(
						new ListMetricsResponseStaxUnmarshaller());
				response = invoke(request, responseHandler, executionContext);

				return response.getKscResponse();
			} finally {
				endClientExecution(kscRequestMetrics, request, response);
			}

	}

	@Override
	public ListCustomMetricsResponse listCustomMetrics(ListCustomMetricsRequest listCustomMetricsRequest) {
		ExecutionContext executionContext = createExecutionContext(listCustomMetricsRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ListCustomMetricsRequest> request = null;
			Response<ListCustomMetricsResponse> response = null;
			try {
				kscRequestMetrics.startEvent(Field.RequestMarshallTime);
				try {
					request = new ListCustomMetricsRequestMarshaller().marshall(super.beforeMarshalling(listCustomMetricsRequest));
					// Binds the request metrics to the current request.
					request.setKscRequestMetrics(kscRequestMetrics);
				} finally {
					kscRequestMetrics.endEvent(Field.RequestMarshallTime);
				}
				StaxResponseHandler<ListCustomMetricsResponse> responseHandler = new StaxResponseHandler<ListCustomMetricsResponse>(
						new ListMetricsResponseV1StaxUnmarshaller());
				response = invoke(request, responseHandler, executionContext);

				return response.getKscResponse();
			} finally {
				endClientExecution(kscRequestMetrics, request, response);
			}

	}


	@Override
	public PutMetricDataResponse putMetricData(PutMetricDataRequest putMetricDataRequest) {
		ExecutionContext executionContext = createExecutionContext(putMetricDataRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<PutMetricDataRequest> request = null;
		Response<PutMetricDataResponse> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new PutMetricDataRequestMarshaller().marshall(super.beforeMarshalling(putMetricDataRequest));
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<PutMetricDataResponse> responseHandler = new StaxResponseHandler<PutMetricDataResponse>(
					new PutMetricDataResponseStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

}
