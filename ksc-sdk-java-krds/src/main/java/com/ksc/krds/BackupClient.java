package com.ksc.krds;

import com.ksc.KscWebServiceResponse;
import com.ksc.Request;
import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsBackup.*;
import com.ksc.krds.transform.krdsBackup.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.util.KscRequestMetrics;

public class BackupClient extends Client {

    public BackupClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse<CreateDBBackupResponse> createDBBackup(CreateDBBackupRequest request) {
        return invoke(new BaseMarshaller<CreateDBBackupRequest>(),
                new CreateDBBackupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse deleteDBBackup(DeleteDBBackupRequest request) {
        return invoke(new BaseMarshaller<DeleteDBBackupRequest>(),
                new CreateDBBackupUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse modifyDBBackupPolicy(ModifyDBInstanceRequest request) {
        return invoke(new BaseMarshaller<ModifyDBInstanceRequest>(),
                new CreateDBBackupUnmarshaller(), request).getKscResponse();
    }

    /**
     * 获取指定时间点附近或者备份集的库表信息
     * GetHistoryDatabaseInfo   GET
     */
    public GetHistoryDatabaseInfoResponse getHistoryDatabaseInfo(GetHistoryDatabaseInfoRequest request) {
       return invoke(new BaseMarshaller<GetHistoryDatabaseInfoRequest>(),
                new GetHistoryDatabaseInfoUnmarshaller(), request).getKscResponse();
    }

    /**
     * 获取库表可恢复时间段
     * GetTableRestorableTime   GET
     */
    public GetTableRestorableTimeResponse getTableRestorableTime(GetTableRestorableTimeRequest request) {
        return invoke(new BaseMarshaller<GetTableRestorableTimeRequest>(),
                new GetTableRestorableTimeUnmarshaller(), request).getKscResponse();
    }

    /**
     * DescribeDBBackups GET
     * 查看备份列表
     * @param backupRequest
     * @return
     */
    public ListKrdsBackupResponse describeDBBackups(ListKrdsBackupRequest backupRequest){
        ExecutionContext executionContext = createExecutionContext(backupRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ListKrdsBackupRequest> request = null;
        Response<ListKrdsBackupResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ListKrdsBackupMarshaller().marshall(super.beforeMarshalling(backupRequest));
                request.addHeader("Accept", "application/json");
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<ListKrdsBackupResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListKrdsBackupResponseJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }
}
