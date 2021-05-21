package com.ksc.krds;

import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsInstance.*;
import com.ksc.krds.transform.krdsInstance.*;

import static com.ksc.krds.transform.ActionEnum.*;

public class InstanceClient extends Client {

    public InstanceClient(AWSCredentials credentials) {
        super(credentials);
    }

    public CreateKrdsResponse createKRDS(CreateKrdsRequest createKrdsRequest) {
        return null;
    }

    public RdsResponse<InstancesResponse> modifyInstance(ModifyInstanceRequest request) {
        return invoke(new BaseMarshaller<ModifyInstanceRequest>(),
                new ModifyInstanceUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<InstanceResponse> modifyInstanceType(ModifyInstanceTypeRequest request) {
        return invoke(new BaseMarshaller<ModifyInstanceTypeRequest>(), new RebootUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> SwitchDBInstanceHA(SwitchHARequest request) {
        return invoke(new BaseMarshaller<SwitchHARequest>(), new RebootUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> createDBInstanceReadReplica(CreateReadReplicaRequest request) {
        return invoke(new BaseMarshaller<CreateReadReplicaRequest>(), new RebootUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request) {
        return invoke(new BaseMarshaller<UpgradeDBInstanceEngineVersionRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request) {
        return invoke(new BaseMarshaller<ModifyDBInstanceSpecRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> modifyDBInstanceAvailabilityZone(ModifyDBInstanceAvailabilityZoneRequest request) {
        return invoke(new BaseMarshaller<ModifyDBInstanceAvailabilityZoneRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> rebootDBInstance(RebootDBInstanceRequest request) {
        return invoke(new BaseMarshaller<RebootDBInstanceRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> lockDBInstance(LockDBInstanceRequest request) {
        return invoke(new BaseMarshaller<LockDBInstanceRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> unLockDBInstance(UnLockDBInstanceRequest request) {
        return invoke(new BaseMarshaller<UnLockDBInstanceRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> sdkRestoreDBInstanceFromDBBackup(SDKRestoreDBInstanceFromDBBackupRequest request) {
        return invoke(new BaseMarshaller<SDKRestoreDBInstanceFromDBBackupRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> overrideDBInstance(OverrideDBInstanceRequest request) {
        return invoke(new BaseMarshaller<OverrideDBInstanceRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }
}