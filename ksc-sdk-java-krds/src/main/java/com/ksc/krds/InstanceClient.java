package com.ksc.krds;

import com.ksc.KscWebServiceResponse;
import com.ksc.Request;
import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsInstance.*;
import com.ksc.krds.transform.BaseUnmarshaller;
import com.ksc.krds.transform.krdsInstance.ModifyDBNetworkMarshaller;
import com.ksc.krds.transform.krdsInstance.ModifyDBNetworkUnmarshaller;
import com.ksc.krds.transform.krdsInstance.*;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.util.KscRequestMetrics;

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
        return invoke(new BaseMarshaller<ModifyInstanceTypeRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> switchDBInstanceHA(SwitchHARequest request) {
        return invoke(new BaseMarshaller<SwitchHARequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> createDBInstanceReadReplica(CreateReadReplicaRequest request) {
        return invoke(new BaseMarshaller<CreateReadReplicaRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request) {
        return invoke(new BaseMarshaller<UpgradeDBInstanceEngineVersionRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<ModifyInstanceTypeResp> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request) {
        return invoke(new BaseMarshaller<ModifyDBInstanceSpecRequest>(), new ModifyDBInstanceSpecUnmarshaller(), request)
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

    public RdsResponse<InstancesResponse> lockDBInstance(LockDBInstanceRequest request) {
        return invoke(new BaseMarshaller<LockDBInstanceRequest>(), new InstancesUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstancesResponse> unLockDBInstance(UnLockDBInstanceRequest request) {
        return invoke(new BaseMarshaller<UnLockDBInstanceRequest>(), new InstancesUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> sdkRestoreDBInstanceFromDBBackup(SDKRestoreDBInstanceFromDBBackupRequest request) {
        return invoke(new BaseMarshaller<SDKRestoreDBInstanceFromDBBackupRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<OverrideDBInstanceResponse> overrideDBInstance(OverrideDBInstanceRequest request) {
        return invoke(new BaseMarshaller<OverrideDBInstanceRequest>(), new OverrideUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<String> generateDBAdminURL(GenerateDBAdminURLRequest request) {
        return invoke(new BaseMarshaller<GenerateDBAdminURLRequest>(), new GenerateDBAdminURLUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> allocateDBInstanceEip(AllocateDBInstanceEipRequest request) {
        return invoke(new BaseMarshaller<AllocateDBInstanceEipRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<InstanceResponse> releaseDBInstanceEip(ReleaseDBInstanceEipRequest request) {
        return invoke(new BaseMarshaller<ReleaseDBInstanceEipRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<DescribeDBInstanceRestoredResponse> describeDBInstanceRestorableTime(DescribeDBInstanceRestoredTimeRequest request) {
        return invoke(new BaseMarshaller<DescribeDBInstanceRestoredTimeRequest>(), new BaseUnmarshaller<DescribeDBInstanceRestoredResponse>() {
        }, request).getKscResponse();
    }

    public RdsResponse<InstanceResponse> sdkRestoreDBInstanceToPointInTime(SDKRestoreDBInstanceToPointInTimeRequest request) {
        return invoke(new BaseMarshaller<SDKRestoreDBInstanceToPointInTimeRequest>(), new InstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<ListDBInstanceResponse> listDBInstance(ListDBInstanceRequest request) {
        return invoke(new BaseMarshaller<ListDBInstanceRequest>(), new ListDBInstanceUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<ListZoneResponse> listZone(ListZoneRequest request) {
        return invoke(new BaseMarshaller<ListZoneRequest>(), new ListZoneUnmarshaller(), request)
                .getKscResponse();
    }

    public RdsResponse<StatisticDBInstancesResponse> statisticDBInstances(StatisticDBInstancesRequest request) {
        return invoke(new BaseMarshaller<StatisticDBInstancesRequest>(), new BaseUnmarshaller<StatisticDBInstancesResponse>() {
        }, request).getKscResponse();
    }

    public RdsResponse createInstanceOrder(CreateInstanceOrderRequest request) {
        return invoke(new BaseMarshaller<CreateInstanceOrderRequest>(), new BaseUnmarshaller<Object>() {
        }, request).getKscResponse();
    }

    public RdsResponse<GetCurrentDatabaseInfoResponse> getCurrentDatabaseInfo(GetCurrentDatabaseInfoReq request) {
        return invoke(new BaseMarshaller<GetCurrentDatabaseInfoReq>(), new BaseUnmarshaller<GetCurrentDatabaseInfoResponse>() {
        }, request).getKscResponse();
    }

    public RdsResponse allocateDBInstanceInnerEip(AllocateDBInstanceInnerEipRequest request) {
        return invoke(new BaseMarshaller<AllocateDBInstanceInnerEipRequest>(), new BaseUnmarshaller<Object>() {
        }, request).getKscResponse();
    }

    public RdsResponse releaseDBInstanceInnerEip(ReleaseDBInstanceInnerEipRequest request) {
        return invoke(new BaseMarshaller<ReleaseDBInstanceInnerEipRequest>(), new BaseUnmarshaller<Object>() {
        }, request).getKscResponse();
    }

    public RdsResponse<DescribeInstanceResponse> describeInstances(ListKrdsRequest request) {
        return invoke(new BaseMarshaller<ListKrdsRequest>(), new DescribeUnmarshaller() {
        }, request).getKscResponse();
    }

    /**
     * 查询数据库引擎版本
     * https://docs.ksyun.com/documents/331
     * Query database engine version
     * @param request DescribeDBEngineVersionsRequest
     * @return RdsResponse<Object>
     */
    public RdsResponse<Object> describeDBEngineVersions(DescribeDBEngineVersionsRequest request){
        return invoke(new BaseMarshaller<DescribeDBEngineVersionsRequest>(), new BaseUnmarshaller<Object>() {
        }, request).getKscResponse();
    }

    /**
     * 选择时间点恢复到原实例(或者备份) GET
     * https://docs.ksyun.com/documents/40951
     * @param request
     * @return
     */
    public RdsResponse overrideDBInstanceByPointInTime(OverrideDBInstanceByPointInTimeRequest request) {
        return invoke(new BaseMarshaller<OverrideDBInstanceByPointInTimeRequest>(), new DescribeUnmarshaller() {
        }, request).getKscResponse();
    }

    /**
     * 修改IP/VPC PORT
     * https://docs.ksyun.com/documents/41001
     * modified instance ip or port
     * @methods POST
     * @return ModifyDBNetworkResponse
     */
    public RdsResponse modifyDBNetwork(ModifyDBNetworkRequest baseRequest){
        ExecutionContext executionContext = createExecutionContext(baseRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<ModifyDBNetworkRequest> request = null;
        Response<RdsResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new ModifyDBNetworkMarshaller().marshall(super.beforeMarshalling(baseRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<RdsResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ModifyDBNetworkUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    /**
     * RestoreToCurInstance POST
     * https://docs.ksyun.com/documents/40952
     * @param baseRequest
     * @return
     */
    public RdsResponse restoreToCurInstance(RestoreToCurInstanceRequest baseRequest){
        ExecutionContext executionContext = createExecutionContext(baseRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<RestoreToCurInstanceRequest> request = null;
        Response<RdsResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new RestoreToCurInstanceMarshaller().marshall(super.beforeMarshalling(baseRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<RdsResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RestoreToCurInstanceUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    /**
     * RestoreToSgInstance POST
     * https://docs.ksyun.com/documents/40953
     * @param baseRequest
     * @return
     */
    public RdsResponse restoreToSgInstance(RestoreToSgInstanceRequest baseRequest){
        ExecutionContext executionContext = createExecutionContext(baseRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<RestoreToSgInstanceRequest> request = null;
        Response<RdsResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new RestoreToSgInstanceMarshaller().marshall(super.beforeMarshalling(baseRequest));
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<RdsResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RestoreToSgInstanceUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }
}