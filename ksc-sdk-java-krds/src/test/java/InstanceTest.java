import com.ksc.krds.InstanceClient;
import com.ksc.krds.KSCKRDSClient;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsInstance.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class InstanceTest extends BaseTest{

    private InstanceClient client;
    private KSCKRDSClient ksckrdsClient;

    @Before
    public void init() {
        client = new InstanceClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");

        ksckrdsClient = new KSCKRDSClient(getCredentials());
        ksckrdsClient.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }
    @Test
    public void testLock() {
        LockDBInstanceRequest request = new LockDBInstanceRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<InstancesResponse> response = client.lockDBInstance(request);
        log.info("{}",response);
    }

    @Test
    public void testUnLock() {
        UnLockDBInstanceRequest request = new UnLockDBInstanceRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<InstancesResponse> response = client.unLockDBInstance(request);
        System.out.println(response.getData());
    }

    @Test
    public void testReboot() {
        RebootDBInstanceRequest request = new RebootDBInstanceRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<InstanceResponse> response = client.rebootDBInstance(request);
        log.info("{}",response);
    }

    @Test
    public void testUpgradeDBInstanceEngineVersion() {
        UpgradeDBInstanceEngineVersionRequest request = new UpgradeDBInstanceEngineVersionRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setDBInstanceIdentifier("49ffe987-5a70-4652-89c7-40e6b409ee9b");
        request.setEngine("mysql");
        request.setEngineVersion("5.6");
        RdsResponse<InstanceResponse> response = client.upgradeDBInstanceEngineVersion(request);
        log.info("{}",response);
    }

    @Test
    public void testCreateDBInstanceReadReplica() {
        CreateReadReplicaRequest request = new CreateReadReplicaRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        request.setDBInstanceName("rds_mysql_20210923143948");
        request.setBillType(BILLTYPE.DAY);
        request.setMem(1);
        request.setDisk(15);
        List<String> availabilityZones = new ArrayList<String>();
        request.setAvailabilityZone(availabilityZones);
        RdsResponse<InstanceResponse> response = client.createDBInstanceReadReplica(request);
        log.info("{}",response);
    }

    @Test
    public void testDescribe() {
        KSCKRDSClient client1 =new KSCKRDSClient(getCredentials());
        ListKrdsRequest request = new ListKrdsRequest();
//        request.setDBInstanceIdentifier("867d573f-e80a-4584-8cc9-42ac089eb88b");
        ListKrdsResponse allResponse = new ListKrdsResponse();
        if (allResponse.getData().getInstances() == null){
            allResponse.getData().setInstances(new ArrayList<Instance>());
        }
        while (true){
            ListKrdsResponse response = client.listkrds(request);
            allResponse.getData().getInstances().addAll(response.getData().getInstances());
            if (response.getData().getMarker() >= response.getData().getTotalCount()){
                allResponse.getData().setTotalCount(response.getData().getTotalCount());
                allResponse.getData().setMarker(response.getData().getMarker());
                allResponse.getData().setMaxRecords(response.getData().getMaxRecords());
                allResponse.setRequestId(response.getRequestId());
                break;
            }
            request.setMarker(response.getData().getMarker());
        }
        System.out.println(allResponse.getData().getInstances());
    }

    @Test
    public void testModifyInstance() {
        ModifyInstanceRequest request = new ModifyInstanceRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setDBInstanceName("lzs-mysql-2");
        RdsResponse<InstancesResponse> response = client.modifyInstance(request);
        log.info("{}",response);
    }

    @Test
    public void testModifyInstanceType() {
        ModifyInstanceTypeRequest request = new ModifyInstanceTypeRequest();
        request.setDBInstanceIdentifier("3c5d67be-b686-438d-8646-46529b9f8e27");
        request.setDBInstanceType("TRDS");
        RdsResponse<InstanceResponse> response = client.modifyInstanceType(request);
        log.info("{}",response);
    }

    @Test
    public void testSwitchDBInstanceHA() {
        SwitchHARequest request = new SwitchHARequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<InstanceResponse> response = client.switchDBInstanceHA(request);
        print(response);
    }

    @Test
    public void testModifyDBInstanceSpec() {
        ModifyDBInstanceSpecRequest request = new ModifyDBInstanceSpecRequest();
        request.setDBInstanceIdentifier("49ffe987-5a70-4652-89c7-40e6b409ee9b");
        request.setDBInstanceClass("db.ram.8|db.disk.50");
        RdsResponse<ModifyInstanceTypeResp> response = client.modifyDBInstanceSpec(request);
        print(response);
    }

    @Test
    public void testModifyDBInstanceAvailabilityZone() {
        ModifyDBInstanceAvailabilityZoneRequest request = new ModifyDBInstanceAvailabilityZoneRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        List<String> availabilityZones = new ArrayList<String>();
        availabilityZones.add("cn-beijing-6a");
        availabilityZones.add("cn-beijing-6b");
        request.setAvailabilityZone(availabilityZones);
        RdsResponse<InstanceResponse> response = client.modifyDBInstanceAvailabilityZone(request);
        print(response);
    }

    @Test
    public void testSdkRestoreDBInstanceFromDBBackup() {
        SDKRestoreDBInstanceFromDBBackupRequest request = new SDKRestoreDBInstanceFromDBBackupRequest();
        request.setDBBackupIdentifier(getInstanceId());
        request.setDBBackupIdentifier("4579ce8a-a3db-4dbf-9ba6-606455c6d643");
        request.setDBInstanceName("test-linai-o1");
        request.setDBInstanceType("HRDS");
        RdsResponse<InstanceResponse> response = client.sdkRestoreDBInstanceFromDBBackup(request);
        print(response);
    }

    @Test
    public void testOverrideDBInstance() {
        OverrideDBInstanceRequest request = new OverrideDBInstanceRequest();
        request.setDBInstanceIdentifier("91ea5165-7ed9-427a-9fc4-b48402612980");
        request.setBackupName("北京");
        request.setDBBackupIdentifier("a8ae1ab0-ff88-425d-880e-48cf00e9dced");
        RdsResponse<OverrideDBInstanceResponse> response = client.overrideDBInstance(request);
        print(response);
    }

    @Test
    public void testGenerateDBAdminURL() {
        GenerateDBAdminURLRequest request = new GenerateDBAdminURLRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        RdsResponse<String> response = client.generateDBAdminURL(request);
        print(response);
    }

    @Test
    public void testAllocateDBInstanceEip() {
        AllocateDBInstanceEipRequest request = new AllocateDBInstanceEipRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        request.setPort(65500); // rang[10000,65500]
        RdsResponse response = client.allocateDBInstanceEip(request);
        print(response);
    }

    @Test
    public void testReleaseDBInstanceEip() {
        ReleaseDBInstanceEipRequest request = new ReleaseDBInstanceEipRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        RdsResponse<InstanceResponse> response = client.releaseDBInstanceEip(request);
        print(response);
    }

    //查看实例恢复时间-DescribeDBInstanceRestorableTime
    @Test
    public void testDescribeDBInstanceRestorableTime() {
        DescribeDBInstanceRestoredTimeRequest request = new DescribeDBInstanceRestoredTimeRequest();
        request.setDBInstanceIdentifier("12f991de-6808-4b06-bba9-50a8bd22d352");
        RdsResponse<DescribeDBInstanceRestoredResponse> response = client.describeDBInstanceRestorableTime(request);
        print(response);
    }

    @Test
    public void testSDKRestoreDBInstanceToPointInTime() {
        SDKRestoreDBInstanceToPointInTimeRequest request = new SDKRestoreDBInstanceToPointInTimeRequest();
        request.setDBInstanceIdentifier("91ea5165-7ed9-427a-9fc4-b48402612980");
        request.setRestorableTime("2021-09-17 00:00:00");
        RdsResponse response = client.sdkRestoreDBInstanceToPointInTime(request);
        print(response);
    }

    @Test
    public void testListDBInstance() {
        ListDBInstanceRequest request = new ListDBInstanceRequest();
        request.setMaxRecords(10);
        request.setMarker(0);
        RdsResponse response = client.listDBInstance(request);
        print(response);
    }

    @Test
    public void testListZone() {
        ListZoneRequest request = new ListZoneRequest();
        RdsResponse response = client.listZone(request);
        print(response);
    }

    @Test
    public void testStatisticDBInstances() {
        StatisticDBInstancesRequest request = new StatisticDBInstancesRequest();
        request.setExpiryDateLessThan(7);
        RdsResponse response = client.statisticDBInstances(request);
        print(response);
    }

    @Test
    public void testCreateInstanceOrder() {
        CreateInstanceOrderRequest request = new CreateInstanceOrderRequest();
        request.setBillType(BILLTYPE.DAY);
        request.setDuration(1);
        request.setProductWhat(PRODUCTWHAT.TRIAL);
        RdsResponse response = client.createInstanceOrder(request);
        print(response);
    }

    @Test
    public void testGetCurrentDatabaseInfo() {
        GetCurrentDatabaseInfoReq request = new GetCurrentDatabaseInfoReq();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<GetCurrentDatabaseInfoResponse> response = client.getCurrentDatabaseInfo(request);
        print(response);
    }

    @Test
    public void testAllocateDBInstanceInnerEip() {
        AllocateDBInstanceInnerEipRequest request = new AllocateDBInstanceInnerEipRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse response = client.allocateDBInstanceInnerEip(request);
        print(response);
    }

    @Test
    public void testReleaseDBInstanceInnerEip() {
        ReleaseDBInstanceInnerEipRequest request = new ReleaseDBInstanceInnerEipRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse response = client.releaseDBInstanceInnerEip(request);
        print(response);
    }

    @Test
    public void describeInstances() {
        ListKrdsRequest request = new ListKrdsRequest();
        request.setDBInstanceIdentifier("91ea5165-7ed9-427a-9fc4-b48402612980");
        RdsResponse response = client.describeInstances(request);
        Assert.assertNotNull(response);
    }


    /**
     * 修改实例ip，port，vpc
     * modify instance eip
     */
    @Test
    public void testModifyDBNetwork() {
        ModifyDBNetworkRequest request = new ModifyDBNetworkRequest();
        request.setDBInstanceIdentifier("f71f5e7a-381a-439d-8535-d702b313142a");
        request.setSubnetId("953b854b-099c-41dd-9f4f-18f31ccb3936");
        request.setVpcId("530b5d42-1c88-4ea0-adad-1993c9902751");
        RdsResponse response = client.modifyDBNetwork(request);
        print(response);
    }

    /**
     * 查看默认数据库引擎版本
     * describe database engine versions
     */
    @Test
    public void testDescribeDBEngineVersions(){
        DescribeDBEngineVersionsRequest request = new DescribeDBEngineVersionsRequest();
        RdsResponse response = client.describeDBEngineVersions(request);
        print(response);
    }

    //删除实例
    @Test
    public void deleteKRDS(){
        DeleteKrdsRequest request = new DeleteKrdsRequest();
        request.setDBInstanceIdentifier("84a1d937-6254-425d-9597-74d21671e14d");
        KrdsResponse response = ksckrdsClient.deleteKRDS(request);
        print(response);
    }

    //删除实例  新
    @Test
    public void testDeleteDBInstance(){
        DeleteKrdsRequest request = new DeleteKrdsRequest();
        request.setDBInstanceIdentifier("d7f960c3-0614-4f31-b75f-6ff918b8b0e4");
        RdsResponse response = client.deleteDBInstance(request);
        print(response);
    }

    //创建实例
    @Test
    public void testCreateDBInstance() {
        CreateKrdsRequest request = new CreateKrdsRequest();
        request.setDBInstanceName("zhebin_sdk");

        request.setEngine("mysql");
        request.setEngineVersion("5.7");

        request.setMasterUserName("admin");
        request.setMasterUserPassword("Test1234");

        request.setBillType("DAY");
        request.setDBInstanceType("HRDS");

        request.setDisk(15);
        request.setMem(1);

        request.setVpcId("7e8ff294-5fb3-4a83-9e0f-eb9a286eb5ee");
        request.setSubnetId("d0fc5c60-7cdd-4712-92dd-42d32fd4cabf");

        RdsResponse<InstanceResponse> response = client.createDBInstance(request);
        print(response);
    }


    //修改自动备份时间，使用的接口为ModifyDBInstance
    @Test
    public void testModiftDBInstance(){

        ModifyInstanceRequest request = new ModifyInstanceRequest();
        request.setDBInstanceIdentifier("12f991de-6808-4b06-bba9-50a8bd22d352");
        request.setPreferredBackupTime("07:00-08:00");
        RdsResponse<InstancesResponse> response = client.modifyInstance(request);
        print(response);
    }


    //OverrideDBInstanceByPointInTime
    @Test
    public void testOverrideDBInstanceByPointInTime(){
        OverrideDBInstanceByPointInTimeRequest request = new OverrideDBInstanceByPointInTimeRequest();
        request.setDBInstanceIdentifier("12f991de-6808-4b06-bba9-50a8bd22d352");
        request.setDBBackupIdentifier("b0ffe4fd-663a-4b58-82cb-d6444a69176e");
        RdsResponse response = client.overrideDBInstanceByPointInTime(request);
        print(response);
    }

    //RestoreToCurInstance
    @Test
    public void testRestoreToCurInstance(){
        RestoreToCurInstanceRequest request = new RestoreToCurInstanceRequest();
        request.setDBInstanceIdentifier("12f991de-6808-4b06-bba9-50a8bd22d352");
        request.setDBBackupIdentifier("6a5109a9-e192-4ab5-90e3-f8c46fa34f38");

        RestoreToCurInstanceRequest.SrcDatabases srcDatabases = new RestoreToCurInstanceRequest.SrcDatabases();
        RestoreToCurInstanceRequest.DstDatabases dstDatabases = new RestoreToCurInstanceRequest.DstDatabases();

        srcDatabases.setDatabaseName("ksyusers");
        srcDatabases.setWholeDatabase("True");
        srcDatabases.setTableNames(new String[]{"dbaas_auth_group",
                "dbaas_authorization",
                "dbaas_default",
                "dbaas_login",
                "dbaas_menu",
                "dbaas_project",
                "dbaas_project_account",
                "dbaas_role",
                "dbaas_role_menu",
                "dbaas_subaccount",
                "dbaas_user",
                "dbaas_user_role",
                "dbaas_user_signout"});

        dstDatabases.setDatabaseName("_ksyusers");
        dstDatabases.setWholeDatabase("True");
        dstDatabases.setTableNames(new String[]{"dbaas_auth_group",
                "dbaas_authorization",
                "dbaas_default",
                "dbaas_login",
                "dbaas_menu",
                "dbaas_project",
                "dbaas_project_account",
                "dbaas_role",
                "dbaas_role_menu",
                "dbaas_subaccount",
                "dbaas_user",
                "dbaas_user_role",
                "dbaas_user_signout"});

        request.setSrcDatabases(Arrays.asList(srcDatabases));
        request.setDstDatabases(Arrays.asList(dstDatabases));

        RdsResponse rdsResponse = client.restoreToCurInstance(request);
        print(rdsResponse);
    }


    //RestoreToSgInstance
    @Test
    public void testRestoreToSgInstance(){
        RestoreToSgInstanceRequest request = new RestoreToSgInstanceRequest();
        request.setDBInstanceIdentifier("12f991de-6808-4b06-bba9-50a8bd22d352");
        request.setDBBackupIdentifier("6a5109a9-e192-4ab5-90e3-f8c46fa34f38");

        RestoreToSgInstanceRequest.SrcDatabases srcDatabases = new RestoreToSgInstanceRequest.SrcDatabases();
        RestoreToSgInstanceRequest.DstDatabases dstDatabases = new RestoreToSgInstanceRequest.DstDatabases();

        srcDatabases.setDatabaseName("ksyusers");
        srcDatabases.setWholeDatabase("True");
        srcDatabases.setTableNames(new String[]{"dbaas_auth_group",
                "dbaas_authorization",
                "dbaas_default",
                "dbaas_login",
                "dbaas_menu",
                "dbaas_project",
                "dbaas_project_account",
                "dbaas_role",
                "dbaas_role_menu",
                "dbaas_subaccount",
                "dbaas_user",
                "dbaas_user_role",
                "dbaas_user_signout"});

        dstDatabases.setDatabaseName("_ksyusers");
        dstDatabases.setWholeDatabase("True");
        dstDatabases.setTableNames(new String[]{"dbaas_auth_group",
                "dbaas_authorization",
                "dbaas_default",
                "dbaas_login",
                "dbaas_menu",
                "dbaas_project",
                "dbaas_project_account",
                "dbaas_role",
                "dbaas_role_menu",
                "dbaas_subaccount",
                "dbaas_user",
                "dbaas_user_role",
                "dbaas_user_signout"});

        request.setSrcDatabases(Arrays.asList(srcDatabases));
        request.setDstDatabases(Arrays.asList(dstDatabases));

        RdsResponse rdsResponse = client.restoreToSgInstance(request);
        print(rdsResponse);
    }
}