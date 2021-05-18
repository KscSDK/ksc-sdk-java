import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.ParameterGroupClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.parametergroup.*;
import org.junit.Before;
import org.junit.Test;

public class ParameterGroupTest {

    private ParameterGroupClient client;

    @Before
    public void init() {
        String accessKey = System.getenv("KSYUN_ACCESS_KEY");
        String secretKey = System.getenv("KSYUN_SECRET_KEY");
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        client = new ParameterGroupClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testDescribe() {
        DescribeDBParameterGroupRequest request = new DescribeDBParameterGroupRequest();
        RdsResponse<DescribeDBParameterGroupResponse> response = client.describeDBParameterGroup(request);
        DescribeDBParameterGroupResponse data = response.getData();
        System.out.println(data);
    }

    @Test
    public void testCreate() {
        CreateDBParameterGroupRequest request = new CreateDBParameterGroupRequest();
        request.setEngine("mysql");
        request.setDescription("lzs-test");
        request.setDBParameterGroupName("lzs-test");
        request.setEngineVersion("5.6");
//        HashMap<String, String> parameter = new HashMap<String, String>();
//        parameter.put("binlog_format","MIXED");
//        request.setParameters(parameter);
        RdsResponse<CreateDBParameterGroupResponse> response = client.createDBParameterGroup(request);
        System.out.println(response.getData());
    }

    @Test
    public void testModify() {
        ModifyDBParameterGroupRequest request = new ModifyDBParameterGroupRequest();
        request.setDBParameterGroupId("");
        request.setDBParameterGroupName("");
        client.modifyDBParameterGroup(request);
    }
}
