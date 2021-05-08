import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.InstanceClient;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsInstance.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InstanceTest {

    private String accessKey;
    private String secretKey;
    private AWSCredentials credentials;

    @Before
    public void init() {
        accessKey = System.getenv("KSYUN_ACCESS_KEY");
        secretKey = System.getenv("KSYUN_SECRET_KEY");
        credentials = new BasicAWSCredentials(accessKey, secretKey);
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
        InstanceClient client = new InstanceClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
        CreateKrdsResponse response = client.createKRDS(request);
        CreateKrdsResponse.Data data = response.getData();
        System.out.println(data);
    }

    @Test
    public void testList() {
        ListKrdsRequest request=new ListKrdsRequest();
        InstanceClient client=new InstanceClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
        ListKrdsResponse allResponse = new ListKrdsResponse();
        if (allResponse.getData().getInstances() == null){
            allResponse.getData().setInstances(new ArrayList<Instance>());
        }
        KrdsResponse response = client.listInstances(request);
        System.out.println(response);
    }

}
