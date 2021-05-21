package com.ksc.krds;

import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsBackup.*;
import com.ksc.krds.model.krdsInstance.BaseRequest;
import com.ksc.krds.transform.krdsBackup.BackupUnmarshaller;
import com.ksc.krds.transform.krdsBackup.CreateDBBackupUnmarshaller;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;

import static com.ksc.krds.transform.ActionEnum.*;

public class BackupClient extends Client {

    public BackupClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public KrdsResponse createDBBackup(CreateDBBackupRequest request) {
        Response<CreateDBBackupResponse> response =
                execute(new BaseMarshaller<CreateDBBackupRequest>(CREATE_BACKUP),
                new CreateDBBackupUnmarshaller(), request);
        return response.getKscResponse();
    }

    public KrdsResponse deleteDBBackup(DeleteDBBackupRequest request) {
        Response<KrdsResponse> response = doExecute(request, new BaseMarshaller<DeleteDBBackupRequest>(DELETE_BACKUP));
        return response.getKscResponse();
    }

    public KrdsResponse modifyDBBackupPolicy(ModifyDBInstanceRequest request) {
        Response<KrdsResponse> response = doExecute(request, new BaseMarshaller<ModifyDBInstanceRequest>(MODIFY_BACKUP_POLICY));
        return response.getKscResponse();
    }

    private <T extends BaseRequest> Response<KrdsResponse> doExecute(T in, BaseMarshaller<T> marshaller) {
        return execute(marshaller, new BackupUnmarshaller(), in);
    }

}
