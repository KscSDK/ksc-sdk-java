package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsBackup.*;
import com.ksc.krds.transform.krdsBackup.CreateDBBackupUnmarshaller;
import com.ksc.krds.transform.krdsBackup.GetHistoryDatabaseInfoUnmarshaller;
import com.ksc.krds.transform.krdsBackup.GetTableRestorableTimeUnmarshaller;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

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
}
