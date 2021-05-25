package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsBackup.CreateDBBackupRequest;
import com.ksc.krds.model.krdsBackup.CreateDBBackupResponse;
import com.ksc.krds.model.krdsBackup.DeleteDBBackupRequest;
import com.ksc.krds.model.krdsBackup.ModifyDBInstanceRequest;
import com.ksc.krds.transform.krdsBackup.CreateDBBackupUnmarshaller;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;

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
}
