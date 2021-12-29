package com.ksc.krds;

import com.ksc.KscWebServiceResponse;
import com.ksc.Request;
import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.account.*;
import com.ksc.krds.model.account.CreateInstanceAccountActionRequest;
import com.ksc.krds.model.database.DescribeInstanceAccountsResponse;
import com.ksc.krds.transform.account.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.util.KscRequestMetrics;

public class AccountClient extends Client{

    public AccountClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse<ListAccountResponse> listAccount(ListAccountRequest request){
        return invoke(new BaseMarshaller<ListAccountRequest>(),
                new ListAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeAccountResponse> createAccount(CreateAccountRequest request){
        return invoke(new BaseMarshaller<CreateAccountRequest>(),
                new CreateAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeAccountResponse> describeAccount(DescribeAccountRequest request){
        return invoke(new BaseMarshaller<DescribeAccountRequest>(),
                new DescribeAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeAccountResponse> modifyAccount(ModifyAccountRequest request){
        return invoke(new BaseMarshaller<ModifyAccountRequest>(),
                new ModifyAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<ListAccountSupportPrivilegesResponse> listAccountSupportPrivileges(ListAccountSupportPrivilegesRequest request){
        return invoke(new BaseMarshaller<ListAccountSupportPrivilegesRequest>(),
                new ListAccountSupportPrivilegesUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse deleteAccount(DeleteAccountRequest request){
        return invoke(new BaseMarshaller<DeleteAccountRequest>(),
                new DeleteAccountUnmarshaller(), request).getKscResponse();
    }

    /**
     * 1.DescribeInstanceAccounts GET
     */
    public RdsResponse<DescribeInstanceAccountsResponse> describeInstanceAccounts(DescribeInstanceAccountsRequest request){
        return invoke(new BaseMarshaller<DescribeInstanceAccountsRequest>(),
                new DescribeInstanceAccountsUnmarshaller(), request).getKscResponse();
    }

    /**
     * 2.CreateInstanceAccountAction    POST
     */
    public RdsResponse createInstanceAccountAction(CreateInstanceAccountActionRequest baseRequest) throws Exception {
        ExecutionContext executionContext = createExecutionContext(baseRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<CreateInstanceAccountActionRequest> request = null;
        Response<RdsResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new CreateInstanceAccountActionMarshaller().marshall(super.beforeMarshalling(baseRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<RdsResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateInstanceAccountActionUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }
    /**
     * 3.ModifyInstanceAccountInfo GET
     */
    public RdsResponse modifyInstanceAccountInfo(ModifyInstanceAccountInfoRequest request){
        return invoke(new BaseMarshaller<ModifyInstanceAccountInfoRequest>(),
                new ModifyInstanceAccountInfoUnmarshaller(), request).getKscResponse();
    }

    /**
     * 4.DeleteInstanceAccountAction POST
     */
    public RdsResponse deleteInstanceAccountAction(DeleteInstanceAccountActionRequest baseRequest) throws Exception {
        ExecutionContext executionContext = createExecutionContext(baseRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<DeleteInstanceAccountActionRequest> request = null;
        Response<RdsResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceAccountActionMarshaller().marshall(super.beforeMarshalling(baseRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<RdsResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteInstanceAccountActionUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    /**
     * 5.ModifyInstanceAccountPrivilegesAction POST
     */
    public RdsResponse modifyInstanceAccountPrivilegesAction(ModifyInstanceAccountPrivilegesActionRequest baseRequest) throws Exception {
        ExecutionContext executionContext = createExecutionContext(baseRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ModifyInstanceAccountPrivilegesActionRequest> request = null;
        Response<RdsResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ModifyInstanceAccountPrivilegesActionMarshaller().marshall(super.beforeMarshalling(baseRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<RdsResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ModifyInstanceAccountPrivilegesActionUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }
}
