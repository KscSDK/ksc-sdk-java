package com.ksc.network.slb;

import java.util.ArrayList;
import java.util.List;

import com.ksc.network.slb.model.*;
import com.ksc.network.slb.model.transform.*;
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
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;

public class KSCSLBClient extends KscWebServiceClient implements KSCSLB{
	/** Provider for AWS credentials. */
	private AWSCredentialsProvider kscCredentialsProvider;

	/** Default signing name for the service. */
	private static final String DEFAULT_SIGNING_NAME = "slb";

	/** The region metadata service name for computing region endpoints. */
	private static final String DEFAULT_ENDPOINT_PREFIX = "slb";

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
	 * Constructs a new client to invoke service methods on SLB. A credentials
	 * provider chain will be used that searches for credentials in this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the SLB metadata
	 * service</li>
	 * </ul>
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 * 
	 * @see DefaultAWSCredentialsProviderChain
	 */
	public KSCSLBClient() {
		this(new DefaultAWSCredentialsProviderChain(), configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on SLB. A credentials
	 * provider chain will be used that searches for credentials in this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the SLB metadata
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
	public KSCSLBClient(ClientConfiguration clientConfiguration) {
		this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
	}

	/**
	 * Constructs a new client to invoke service methods on SLB using the
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
	public KSCSLBClient(AWSCredentials awsCredentials) {
		this(awsCredentials, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on SLB using the
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
	 *            connects to SLB (ex: proxy settings, retry counts, etc.).
	 */
	public KSCSLBClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
		super(clientConfiguration);
		this.kscCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
		init();
	}

	/**
	 * Constructs a new client to invoke service methods on SLB using the
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
	public KSCSLBClient(AWSCredentialsProvider awsCredentialsProvider) {
		this(awsCredentialsProvider, configFactory.getConfig());
	}

	/**
	 * Constructs a new client to invoke service methods on SLB using the
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
	 *            connects to SLB (ex: proxy settings, retry counts, etc.).
	 */
	public KSCSLBClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
		this(awsCredentialsProvider, clientConfiguration, null);
	}

	/**
	 * Constructs a new client to invoke service methods on SLB using the
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
	 *            connects to SLB (ex: proxy settings, retry counts, etc.).
	 * @param requestMetricCollector
	 *            optional request metric collector
	 */
	public KSCSLBClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(clientConfiguration, requestMetricCollector);
		this.kscCredentialsProvider = awsCredentialsProvider;
		init();
	}

	@Override
	public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest) {
		ExecutionContext executionContext = createExecutionContext(describeLoadBalancersRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeLoadBalancersRequest> request = null;
		Response<DescribeLoadBalancersResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeLoadBalancersRequestMarshaller()
						.marshall(describeLoadBalancersRequest);
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<DescribeLoadBalancersResult> responseHandler = new StaxResponseHandler<DescribeLoadBalancersResult>(
					new DescribeLoadBalancersResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
	public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest) {
		ExecutionContext executionContext = createExecutionContext(createLoadBalancerRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateLoadBalancerRequest> request = null;
		Response<CreateLoadBalancerResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateLoadBalancerRequestMarshaller()
						.marshall(createLoadBalancerRequest);
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<CreateLoadBalancerResult> responseHandler = new StaxResponseHandler<CreateLoadBalancerResult>(
					new CreateLoadBalancerResultStaxUnmarshaller());
			response = invoke(request, responseHandler, executionContext);

			return response.getKscResponse();
		} finally {
			endClientExecution(kscRequestMetrics, request, response);
		}
	}

	@Override
    public DeleteLoadBalancerResult deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest) {
	    ExecutionContext executionContext = createExecutionContext(deleteLoadBalancerRequest);
	    KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
	    kscRequestMetrics.startEvent(Field.ClientExecuteTime);
	    Request<DeleteLoadBalancerRequest> request = null;
	    Response<DeleteLoadBalancerResult> response = null;
	    try {
	        kscRequestMetrics.startEvent(Field.RequestMarshallTime);
	        try {
	            request = new DeleteLoadBalancerRequestMarshaller()
                        .marshall(deleteLoadBalancerRequest);
	            request.setKscRequestMetrics(kscRequestMetrics);
            }finally {
	            kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            StaxResponseHandler<DeleteLoadBalancerResult> responseHandler = new StaxResponseHandler<DeleteLoadBalancerResult>(
                    new DeleteLoadBalancerResultStaxUnmarshaller());
	        response = invoke(request, responseHandler, executionContext);

	        return response.getKscResponse();
        } finally {
	        endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ModifyLoadBalancerResult modifyLoadBalancer(ModifyLoadBalancerRequest modifyLoadBalancerRequest) {
	    ExecutionContext executionContext = createExecutionContext(modifyLoadBalancerRequest);
	    KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
	    kscRequestMetrics.startEvent(Field.ClientExecuteTime);
	    Request<ModifyLoadBalancerRequest> request = null;
	    Response<ModifyLoadBalancerResult> response = null;
	    try {
	        kscRequestMetrics.startEvent(Field.RequestMarshallTime);
	        try {
	            request = new ModifyLoadBalancerRequestMarshaller().marshall(modifyLoadBalancerRequest);
	            request.setKscRequestMetrics(kscRequestMetrics);
            }finally {
	            kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            StaxResponseHandler<ModifyLoadBalancerResult> responseHandler = new StaxResponseHandler<ModifyLoadBalancerResult>(
                    new ModifyLoadBalancerResultStaxUnmarshaller());
	        response = invoke(request, responseHandler, executionContext);

	        return response.getKscResponse();
        }finally {
	        endClientExecution(kscRequestMetrics,request,response);
        }
    }

	@Override
    public CreateListenersResult createListeners(CreateListenersRequest createListenersRequest) {
		ExecutionContext executionContext = createExecutionContext(createListenersRequest);
		KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
		kscRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<CreateListenersRequest> request = null;
		Response<CreateListenersResult> response = null;
		try {
			kscRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new CreateListenersRequestMarshaller()
						.marshall(createListenersRequest);
				// Binds the request metrics to the current request.
				request.setKscRequestMetrics(kscRequestMetrics);
			} finally {
				kscRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			StaxResponseHandler<CreateListenersResult> responseHandler = new StaxResponseHandler<CreateListenersResult>(
					new CreateListenersResultStaxUnmarshaller());
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
		setEndpoint("http://slb.cn-beijing-6.api.ksyun.com");
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
