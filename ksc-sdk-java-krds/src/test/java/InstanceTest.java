import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.InstanceClient;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.krdsInstance.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InstanceTest {

    private InstanceClient client;

    @Before
    public void init() {
        String accessKey = System.getenv("KSYUN_ACCESS_KEY");
        String secretKey = System.getenv("KSYUN_SECRET_KEY");
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        client = new InstanceClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testCreate() {
        CreateKrdsRequest request = new CreateKrdsRequest();
        request.setDBInstanceName("testKRDSInstance");
        request.setDBInstanceType("HRDS");
        request.setMem(1);
        request.setDisk(10);
        request.setEngine("MySQL");
        List<String> availabilityZoneList = new ArrayList<String>(1);
        availabilityZoneList.add("cn-beijing-6a");
//        availabilityZoneList.add("cn-beijing-6b");
        request.setAvailabilityZone(availabilityZoneList);
        request.setEngineVersion("5.6");
        request.setMasterUserName("admin");
        request.setMasterUserPassword("testAA123");
        request.setVpcId("214a1292-108e-45d1-8b9c-b45d2ab41c0c");
        request.setSubnetId("f80ce68d-eca2-475e-938b-666d90308212");
        request.setBillType("DAY");
        request.setProjectId(103800);
        CreateKrdsResponse response = client.createKRDS(request);
        CreateKrdsResponse.Data data = response.getData();
        System.out.println(data);
    }

    @Test
    public void testLock() {
        LockDBInstanceRequest request = new LockDBInstanceRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        KrdsResponse response = client.lockDBInstance(request);
        System.out.println(response);
    }

    @Test
    public void testReboot() {
        RebootDBInstanceRequest request = new RebootDBInstanceRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
//        KrdsResponse response = client.rebootDBInstance(request);
//        BaseData data = response.getData();
//        System.out.println(data.getDBInstance());
        RdsResponse<TestResponse> response = client.rebootDBInstance(request);
        TestResponse data = response.getData();
        System.out.println(data);
    }

    @Test
    public void testUpgradeDBInstanceEngineVersion() {
        UpgradeDBInstanceEngineVersionRequest request = new UpgradeDBInstanceEngineVersionRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        request.setEngine("mysql");
        request.setEngineVersion("5.7");
        client.upgradeDBInstanceEngineVersion(request);
    }

    @Test
    public void testCreateDBInstanceReadReplica() {
        CreateReadReplicaRequest request = new CreateReadReplicaRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        request.setDBInstanceName("lzs-test-rr");
//        List<String> availabilityZones = new ArrayList<String>();
//        availabilityZones.add("cn-beijing-6a");
//        request.setAvailabilityZone(availabilityZones);
        client.createDBInstanceReadReplica(request);
    }

    @Test
    public void describe() {
        ListKrdsRequest request = new ListKrdsRequest();
//        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        ListKrdsResponse allResponse = new ListKrdsResponse();
        if (allResponse.getData().getInstances() == null) {
            allResponse.getData().setInstances(new ArrayList<Instance>());
        }

//        while (true) {
//            KrdsResponse response = client.listInstances(request);
//
//            allResponse.getData().getInstances().addAll(response.getData().getInstances());
//            if (response.getData().getMarker() >= response.getData().getTotalCount()) {
//                allResponse.getData().setTotalCount(response.getData().getTotalCount());
//                allResponse.getData().setMarker(response.getData().getMarker());
//                allResponse.getData().setMaxRecords(response.getData().getMaxRecords());
//                allResponse.setRequestId(response.getRequestId());
//                break;
//            }
//            request.setMarker(response.getData().getMarker());
//        }

        System.out.println(allResponse.getData().getInstances());
    }

}
