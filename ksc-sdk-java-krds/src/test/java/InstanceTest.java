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
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<InstanceResponse> response = client.lockDBInstance(request);
        System.out.println(response.getData());
    }

    @Test
    public void testUnLock() {
        UnLockDBInstanceRequest request = new UnLockDBInstanceRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<InstanceResponse> response = client.unLockDBInstance(request);
        System.out.println(response.getData());
    }

    @Test
    public void testReboot() {
        RebootDBInstanceRequest request = new RebootDBInstanceRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
//        KrdsResponse response = client.rebootDBInstance(request);
//        BaseData data = response.getData();
//        System.out.println(data.getDBInstance());
        RdsResponse<InstanceResponse> response = client.rebootDBInstance(request);
        InstanceResponse data = response.getData();
        System.out.println(data);
    }

    @Test
    public void testUpgradeDBInstanceEngineVersion() {
        UpgradeDBInstanceEngineVersionRequest request = new UpgradeDBInstanceEngineVersionRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        request.setEngine("mysql");
        request.setEngineVersion("5.7");
//        client.upgradeDBInstanceEngineVersion(request);
    }

    @Test
    public void testCreateDBInstanceReadReplica() {
        CreateReadReplicaRequest request = new CreateReadReplicaRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        request.setDBInstanceName("lzs-test-rr");
//        List<String> availabilityZones = new ArrayList<String>();
//        availabilityZones.add("cn-beijing-6a");
//        request.setAvailabilityZone(availabilityZones);
//        client.createDBInstanceReadReplica(request);
    }

    @Test
    public void testDescribe() {
        KSCKRDSClient client1 =new KSCKRDSClient(getCredentials());
        ListKrdsRequest request = new ListKrdsRequest();
//        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
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
        request.setDBInstanceName("lzs-mysql-1");
        RdsResponse<InstancesResponse> response = client.modifyInstance(request);
        System.out.println(response.getData());
    }

    @Test
    public void test() {
    }

}
