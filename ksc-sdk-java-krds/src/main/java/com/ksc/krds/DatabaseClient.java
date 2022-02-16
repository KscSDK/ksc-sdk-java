package com.ksc.krds;

import com.ksc.KscWebServiceResponse;
import com.ksc.Request;
import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.database.*;
import com.ksc.krds.transform.account.ModifyAccountUnmarshaller;
import com.ksc.krds.transform.database.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.util.KscRequestMetrics;

public class DatabaseClient extends Client{

    public DatabaseClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse createAccount(CreateAccountRequest request){
        return invoke(new BaseMarshaller<CreateAccountRequest>(),
                new CreateAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeAccountResponse> describeAccount(DescribeAccountRequest request){
        return invoke(new BaseMarshaller<DescribeAccountRequest>(),
                new DescribeAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyInstanceAccountPassword(ModifyAccountPasswordRequest request){
        return invoke(new BaseMarshaller<ModifyAccountPasswordRequest>(),
                new ModifyAccountPasswordUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyInstanceAccount(ModifyAccountRequest request){
        return invoke(new BaseMarshaller<ModifyAccountRequest>(),
                new ModifyAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse deleteInstanceAccount(DeleteAccountRequest request){
        return invoke(new BaseMarshaller<DeleteAccountRequest>(),
                new DeleteAccountUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<GetMysqlCollationsResponse> describeCollations(InstanceRequest request){
        return invoke(new BaseMarshaller<InstanceRequest>(),
                new InstanceUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse createInstanceDatabase(CreateDatabaseRequest request){
        return invoke(new BaseMarshaller<CreateDatabaseRequest>(),
                new CreateDatabaseUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyInstanceDatabasePrivileges(ModifyDatabasePrivilegesRequest request){
        return invoke(new BaseMarshaller<ModifyDatabasePrivilegesRequest>(),
                new ModifyDatabasePrivilegesUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeDatabaseResponse> describeInstanceDatabases(DescribeDatabaseRequest request){
        return invoke(new BaseMarshaller<DescribeDatabaseRequest>(),
                new DescribeDatabaseUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse deleteInstanceDatabase(DeleteDatabaseRequest request){
        return invoke(new BaseMarshaller<DeleteDatabaseRequest>(),
                new DeleteDatabaseUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyInstanceDatabaseInfo(ModifyDatabaseInfoRequest request){
        return invoke(new BaseMarshaller<ModifyDatabaseInfoRequest>(),
                new ModifyDatabaseInfoUnmarshaller(), request).getKscResponse();
    }

    /**
     * 1.DeleteInstanceDatabaseAction POST
     */
    public RdsResponse deleteInstanceDatabaseAction(DeleteInstanceDatabaseActionRequest baseRequest) throws Exception {
        ExecutionContext executionContext = createExecutionContext(baseRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<DeleteInstanceDatabaseActionRequest> request = null;
        Response<RdsResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceDatabaseActionMarshaller().marshall(super.beforeMarshalling(baseRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }
            HttpResponseHandler<KscWebServiceResponse<RdsResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteInstanceDatabaseActionUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();
        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }
}
