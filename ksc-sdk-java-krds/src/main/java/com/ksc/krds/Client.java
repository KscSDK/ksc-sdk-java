package com.ksc.krds;

import com.ksc.KscWebServiceResponse;
import com.ksc.Request;
import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsInstance.BaseRequest;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.transform.Unmarshaller;
import com.ksc.util.KscRequestMetrics;

public class Client extends KSCKRDSClient {

    public Client(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public <T extends KrdsResponse, R extends BaseRequest> Response<T> execute(BaseMarshaller<R> marshaller, Unmarshaller unmarshaller, R in) {
        ExecutionContext context = createExecutionContext(in);
        KscRequestMetrics kscRequestMetrics = context.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<R> request = null;
        Response<T> response = null;

        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {

                request = marshaller.marshall(super.beforeMarshalling(in));
                request.setKscRequestMetrics(kscRequestMetrics);
            } catch (Exception e) {
//                log.warn(e);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<T>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            unmarshaller);
            response = invoke(request, responseHandler, context);
            return response;

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

}
