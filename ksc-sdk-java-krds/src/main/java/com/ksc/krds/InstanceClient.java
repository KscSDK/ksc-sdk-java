package com.ksc.krds;

import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsInstance.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.krds.transform.krdsInstance.InstanceUnmarshaller;

import static com.ksc.krds.transform.ActionEnum.*;

public class InstanceClient extends Client {

    public InstanceClient(AWSCredentials credentials) {
        super(credentials);
    }

    public CreateKrdsResponse createKRDS(CreateKrdsRequest createKrdsRequest) {
        return null;
    }

    public KrdsResponse modifyInstance(ModifyInstanceRequest req) {
        Response<InstanceResponse> execute = doExecute(req, new BaseMarshaller<ModifyInstanceRequest>(MODIFY));
        return execute.getKscResponse();
    }

    public KrdsResponse modifyInstanceType(ModifyInstanceTypeRequest req) {
        Response<InstanceResponse> response = doExecute(req, new BaseMarshaller<ModifyInstanceTypeRequest>(MODIFY_TYPE));
        return response.getKscResponse();
    }

    public KrdsResponse SwitchDBInstanceHA(SwitchHARequest req) {
        Response<InstanceResponse> response = doExecute(req, new BaseMarshaller<SwitchHARequest>(SWITCH_HA));
        return response.getKscResponse();
    }

    public KrdsResponse createDBInstanceReadReplica(CreateReadReplicaRequest req) {
        Response<InstanceResponse> response = doExecute(req, new BaseMarshaller<CreateReadReplicaRequest>(CREATE_READ_REPLICA));

        return response.getKscResponse();
    }

    public KrdsResponse upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request) {
        Response<InstanceResponse> response = doExecute(request,
                new BaseMarshaller<UpgradeDBInstanceEngineVersionRequest>(UPGRADE_ENGINE_VERSION)
        );

        return response.getKscResponse();
    }

    public KrdsResponse modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request) {
        Response<InstanceResponse> response = doExecute(request, new BaseMarshaller<ModifyDBInstanceSpecRequest>(MODIFY_SPEC));

        return response.getKscResponse();
    }

    public KrdsResponse unLockDBInstance(UnLockDBInstanceRequest request) {
        Response<InstanceResponse> response = doExecute(request, new BaseMarshaller<UnLockDBInstanceRequest>(UN_LOCK));
        return response.getKscResponse();
    }

    public KrdsResponse modifyDBInstanceAvailabilityZone(ModifyDBInstanceAvailabilityZoneRequest request) {
        Response<InstanceResponse> response = doExecute(request, new BaseMarshaller<ModifyDBInstanceAvailabilityZoneRequest>(MODIFY_AVAILABILITY_ZONE));
        return response.getKscResponse();
    }

    public KrdsResponse rebootDBInstance(RebootDBInstanceRequest request) {
        Response<InstanceResponse> response = doExecute(request, new BaseMarshaller<RebootDBInstanceRequest>(REBOOT));
        return response.getKscResponse();
    }

    public KrdsResponse lockDBInstance(LockDBInstanceRequest request) {
        Response<InstanceResponse> response = doExecute(request, new BaseMarshaller<LockDBInstanceRequest>(REBOOT));
        return response.getKscResponse();
    }

    public <T extends BaseRequest> Response<InstanceResponse> doExecute(T in, BaseMarshaller<T> marshaller) {
        return execute(marshaller, new InstanceUnmarshaller<InstanceResponse>(), in);
    }
}