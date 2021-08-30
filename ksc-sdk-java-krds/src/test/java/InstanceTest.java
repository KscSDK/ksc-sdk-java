import com.ksc.krds.InstanceClient;
import com.ksc.krds.KSCKRDSClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsInstance.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InstanceTest extends BaseTest{

    private InstanceClient client;

    @Before
    public void init() {
        client = new InstanceClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
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
        request.setEngine("mysql");
        request.setEngineVersion("5.7");
        RdsResponse<InstanceResponse> response = client.upgradeDBInstanceEngineVersion(request);
        log.info("{}",response);
    }

    @Test
    public void testCreateDBInstanceReadReplica() {
        CreateReadReplicaRequest request = new CreateReadReplicaRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setDBInstanceName("lzs_test_rr");
        request.setDBInstanceClass("db.ram.1|db.disk.5");
        List<String> availabilityZones = new ArrayList<String>();
        availabilityZones.add("cn-beijing-6a");
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
        request.setDBInstanceIdentifier(getInstanceId());
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
        request.setDBInstanceIdentifier(getInstanceId());
        request.setDBInstanceClass("db.ram.8|db.disk.50");
        RdsResponse<ModifyInstanceTypeResp> response = client.modifyDBInstanceSpec(request);
        print(response);
    }

    @Test
    public void testModifyDBInstanceAvailabilityZone() {
        ModifyDBInstanceAvailabilityZoneRequest request = new ModifyDBInstanceAvailabilityZoneRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        List<String> availabilityZones = new ArrayList<String>();
        availabilityZones.add("cn-beijing-6c");
        request.setAvailabilityZone(availabilityZones);
        RdsResponse<InstanceResponse> response = client.modifyDBInstanceAvailabilityZone(request);
        print(response);
    }

    @Test
    public void testSdkRestoreDBInstanceFromDBBackup() {
        SDKRestoreDBInstanceFromDBBackupRequest request = new SDKRestoreDBInstanceFromDBBackupRequest();
        request.setDBBackupIdentifier(getInstanceId());
        request.setDBBackupIdentifier("7771a227-5a2c-48c4-9fed-a4b54715c252");
        request.setDBInstanceName("lzs-rds-restore-1");
        request.setDBInstanceType("HRDS");
        RdsResponse<InstanceResponse> response = client.sdkRestoreDBInstanceFromDBBackup(request);
        print(response);
    }

    @Test
    public void testOverrideDBInstance() {
        OverrideDBInstanceRequest request = new OverrideDBInstanceRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setDBBackupIdentifier("7771a227-5a2c-48c4-9fed-a4b54715c252");
        RdsResponse<OverrideDBInstanceResponse> response = client.overrideDBInstance(request);
        print(response);
    }

    @Test
    public void testGenerateDBAdminURL() {
        GenerateDBAdminURLRequest request = new GenerateDBAdminURLRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<String> response = client.generateDBAdminURL(request);
        print(response);
    }

    @Test
    public void testAllocateDBInstanceEip() {
        AllocateDBInstanceEipRequest request = new AllocateDBInstanceEipRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setPort(33061);
        RdsResponse response = client.allocateDBInstanceEip(request);
        print(response);
    }

    @Test
    public void testReleaseDBInstanceEip() {
        ReleaseDBInstanceEipRequest request = new ReleaseDBInstanceEipRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<InstanceResponse> response = client.releaseDBInstanceEip(request);
        print(response);
    }

    @Test
    public void testDescribeDBInstanceRestorableTime() {
        DescribeDBInstanceRestoredTimeRequest request = new DescribeDBInstanceRestoredTimeRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<DescribeDBInstanceRestoredResponse> response = client.describeDBInstanceRestorableTime(request);
        print(response);
    }

    @Test
    public void testSDKRestoreDBInstanceToPointInTime() {
        SDKRestoreDBInstanceToPointInTimeRequest request = new SDKRestoreDBInstanceToPointInTimeRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setRestorableTime("2021-06-15 00:00:00");
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
    public void test() {
        ReleaseDBInstanceInnerEipRequest request = new ReleaseDBInstanceInnerEipRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse response = client.releaseDBInstanceInnerEip(request);
        print(response);
    }

    @Test
    public void describeInstances() {
        ListKrdsRequest request = new ListKrdsRequest();
        request.setDBInstanceIdentifier("fbd67f4b-bfb2-4900-9435-8ac4d0b1e534");
        RdsResponse response = client.describeInstances(request);
        print(response);
    }
}