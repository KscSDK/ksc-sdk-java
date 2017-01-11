package com.ksc.vcs;

import com.ksc.*;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.AWSCredentialsProvider;
import com.ksc.auth.DefaultAWSCredentialsProviderChain;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.internal.StaticCredentialsProvider;
import com.ksc.metrics.RequestMetricCollector;
import com.ksc.protocol.json.JsonClientMetadata;
import com.ksc.protocol.json.JsonErrorResponseMetadata;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.protocol.json.SdkJsonProtocolFactory;
import com.ksc.transform.LegacyErrorUnmarshaller;
import com.ksc.transform.Marshaller;
import com.ksc.transform.StandardErrorUnmarshaller;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.CredentialUtils;
import com.ksc.util.KscRequestMetrics;
import com.ksc.util.KscRequestMetrics.Field;
import com.ksc.vcs.model.*;
import com.ksc.vcs.model.transform.*;
import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class KSCVCSClient extends KscWebServiceClient implements KSCVCS {

    /**
     * Provider for AWS credentials.
     */
    private AWSCredentialsProvider kscCredentialsProvider;

    /**
     * Default signing name for the service.
     */
    private static final String DEFAULT_SIGNING_NAME = "vcs";

    /**
     * The region metadata service name for computing region endpoints.
     */
    private static final String DEFAULT_ENDPOINT_PREFIX = "vcs";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
            new JsonClientMetadata().withSupportsCbor(false));

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
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public KSCVCSClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
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
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this client
     *                            connects to KSC (ex: proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    public KSCVCSClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EC2 using the
     * specified AWS account credentials.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use when
     *                       authenticating with AWS services.
     */
    public KSCVCSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EC2 using the
     * specified AWS account credentials and client configuration options.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials      The AWS credentials (access key ID and secret key) to use when
     *                            authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this client
     *                            connects to Amazon EC2 (ex: proxy settings, retry counts,
     *                            etc.).
     */
    public KSCVCSClient(AWSCredentials awsCredentials,
                        ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.kscCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EC2 using the
     * specified AWS account credentials provider.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will provide credentials to
     *                               authenticate requests with AWS services.
     */
    public KSCVCSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EC2 using the
     * specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will provide credentials to
     *                               authenticate requests with AWS services.
     * @param clientConfiguration    The client configuration options controlling how this client
     *                               connects to Amazon EC2 (ex: proxy settings, retry counts,
     *                               etc.).
     */
    public KSCVCSClient(AWSCredentialsProvider awsCredentialsProvider,
                        ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EC2 using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
     * <p>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will provide credentials to
     *                               authenticate requests with AWS services.
     * @param clientConfiguration    The client configuration options controlling how this client
     *                               connects to Amazon EC2 (ex: proxy settings, retry counts,
     *                               etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public KSCVCSClient(AWSCredentialsProvider awsCredentialsProvider,
                        ClientConfiguration clientConfiguration,
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
        setEndpoint("http://vcs.cn-beijing-6.api.ksyun.com");
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

        HttpResponseHandler<KscServiceException> errorResponseHandler = protocolFactory
                .createErrorResponseHandler(new JsonErrorResponseMetadata());
        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private Object makeApiCall(KscWebServiceRequest kscWebServiceRequest,
                               Marshaller marshaller, BaseJsonUnmarshaller unmarshaller) {
        ExecutionContext executionContext = createExecutionContext(kscWebServiceRequest);
        KscRequestMetrics kscRequestMetrics = executionContext
                .getKscRequestMetrics();
        kscRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request request = null;
        Response response = null;
        try {
            kscRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = (Request) marshaller.marshall(super
                        .beforeMarshalling(kscWebServiceRequest));
                request.addHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.toString());
                // Binds the request metrics to the current request.
                request.setKscRequestMetrics(kscRequestMetrics);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                kscRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<Object>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                                    .withPayloadJson(true)
                                    .withHasStreamingSuccessResponse(false),
                            unmarshaller);
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();
        } catch (Exception e) {
            e.printStackTrace();
            return unmarshaller.handleException(e);
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    @Override
    public ListUniqueNamesResult listUniqueNames(
            ListUniqueNamesRequest listUniqueNamesRequest) {
        return (ListUniqueNamesResult) this.makeApiCall(listUniqueNamesRequest,
                ListUniqueNamesRequestMarshaller.getInstance(),
                ListUniqueNamesResultUnmarshaller.getInstance());
    }

    @Override
    public ListAppsResult listApps(
            ListAppsRequest listAppsRequest) {
        return (ListAppsResult) this.makeApiCall(listAppsRequest,
                ListAppsRequestMarshaller.getInstance(),
                ListAppsResultUnmarshaller.getInstance());
    }

    @Override
    public GetRecogCfgResult getRecogCfg(
            GetRecogCfgRequest getRecogCfgRequest) {
        return (GetRecogCfgResult) this.makeApiCall(getRecogCfgRequest,
                GetRecogCfgRequestMarshaller.getInstance(),
                GetRecogCfgResultUnmarshaller.getInstance());
    }

    @Override
    public UpdateRecogCfgResult updateRecogCfg(
            UpdateRecogCfgRequest updateRecogCfgRequest) {
        return (UpdateRecogCfgResult) this.makeApiCall(updateRecogCfgRequest,
                UpdateRecogCfgRequestMarshaller.getInstance(),
                UpdateRecogCfgResultUnmarshaller.getInstance());
    }

    @Override
    public GetNotifyCfgResult getNotifyCfg(
            GetNotifyCfgRequest getNotifyCfgRequest) {
        return (GetNotifyCfgResult) this.makeApiCall(getNotifyCfgRequest,
                GetNotifyCfgRequestMarshaller.getInstance(),
                GetNotifyCfgResultUnmarshaller.getInstance());
    }

    @Override
    public GetArchiveCfgResult getArchiveCfg(
            GetArchiveCfgRequest getArchiveCfgRequest) {
        return (GetArchiveCfgResult) this.makeApiCall(getArchiveCfgRequest,
                GetArchiveCfgRequestMarshaller.getInstance(),
                GetArchiveCfgResultUnmarshaller.getInstance());
    }

    @Override
    public GetBlockedStreamsResult getBlockedStreams(
            GetBlockedStreamsRequest getBlockedStreamsRequest) {
        return (GetBlockedStreamsResult) this.makeApiCall(
                getBlockedStreamsRequest,
                GetBlockedStreamsRequestMarshaller.getInstance(),
                GetBlockedStreamsResultUnmarshaller.getInstance());
    }

    @Override
    public ListWarningStreamsResult listWarningStreams(
            ListWarningStreamsRequest listWarningStreamsRequest) {
        return (ListWarningStreamsResult) this.makeApiCall(
                listWarningStreamsRequest,
                ListWarningStreamsRequestMarshaller.getInstance(),
                ListWarningStreamsResultUnmarshaller.getInstance());
    }

    @Override
    public UpdateArchiveCfgResult updateArchiveCfg(
            UpdateArchiveCfgRequest updateArchiveCfgRequest) {
        return (UpdateArchiveCfgResult) this.makeApiCall(
                updateArchiveCfgRequest,
                UpdateArchiveCfgRequestMarshaller.getInstance(),
                UpdateArchiveCfgResultUnmarshaller.getInstance());
    }

    @Override
    public BlockStreamResult blockStream(
            BlockStreamRequest blockStreamRequest) {
        return (BlockStreamResult) this.makeApiCall(blockStreamRequest,
                BlockStreamRequestMarshaller.getInstance(),
                BlockStreamResultUnmarshaller.getInstance());
    }

    @Override
    public CreateConfigurationResult createConfiguration(
            CreateConfigurationRequest createConfigurationRequest) {
        return (CreateConfigurationResult) this.makeApiCall(
                createConfigurationRequest,
                CreateConfigurationRequestMarshaller.getInstance(),
                CreateConfigurationResultUnmarshaller.getInstance());
    }

    @Override
    public ListConfigurationsResult listConfigurations(
            ListConfigurationsRequest listConfigurationsRequest) {
        return (ListConfigurationsResult) this.makeApiCall(
                listConfigurationsRequest,
                ListConfigurationsRequestMarshaller.getInstance(),
                ListConfigurationsResultUnmarshaller.getInstance());
    }

    @Override
    public GetConfigurationResult getConfiguration(
            GetConfigurationRequest getConfigurationRequest) {
        return (GetConfigurationResult) this.makeApiCall(
                getConfigurationRequest,
                GetConfigurationRequestMarshaller.getInstance(),
                GetConfigurationResultUnmarshaller.getInstance());
    }

    @Override
    public DeleteConfigurationResult deleteConfiguration(
            DeleteConfigurationRequest deleteConfigurationRequest) {
        return (DeleteConfigurationResult) this.makeApiCall(
                deleteConfigurationRequest,
                DeleteConfigurationRequestMarshaller.getInstance(),
                DeleteConfigurationResultUnmarshaller.getInstance());
    }

    @Override
    public UpdateNotifyCfgResult updateNotifyCfg(
            UpdateNotifyCfgRequest updateNotifyCfgRequest) {
        return (UpdateNotifyCfgResult) this.makeApiCall(
                updateNotifyCfgRequest,
                UpdateNotifyCfgRequestMarshaller.getInstance(),
                UpdateNotifyCfgResultUnmarshaller.getInstance());
    }

    @Override
    public RecoverStreamResult recoverStream(
            RecoverStreamRequest recoverStreamRequest) {
        return (RecoverStreamResult) this.makeApiCall(
                recoverStreamRequest,
                RecoverStreamRequestMarshaller.getInstance(),
                RecoverStreamResultUnmarshaller.getInstance());
    }

    @Override
    public GetWarningScreenshotsResult getWarningScreenshots(
            GetWarningScreenshotsRequest getWarningScreenshotsRequest) {
        return (GetWarningScreenshotsResult) this.makeApiCall(
                getWarningScreenshotsRequest,
                GetWarningScreenshotsRequestMarshaller.getInstance(),
                GetWarningScreenshotsResultUnmarshaller.getInstance());
    }
}
