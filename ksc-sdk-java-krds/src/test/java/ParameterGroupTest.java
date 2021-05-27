import com.ksc.krds.ParameterGroupClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.parametergroup.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class ParameterGroupTest extends BaseTest{

    private ParameterGroupClient client;

    @Before
    public void init() {
        client = new ParameterGroupClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testCreateDBParameterGroup() {
        CreateDBParameterGroupRequest request = new CreateDBParameterGroupRequest();
        request.setDescription("lzs-test");
        request.setDBParameterGroupName("lzs-test");
        request.setEngine("mysql");
        request.setEngineVersion("5.6");
        HashMap<String, String> parameter = new HashMap<String, String>();
        parameter.put("binlog_format","MIXED");
        request.setParameters(parameter);
        RdsResponse<CreateDBParameterGroupResponse> response = client.createDBParameterGroup(request);
        System.out.println(response.getData());
    }

    @Test
    public void testModifyDBParameterGroup() {
        ModifyDBParameterGroupRequest request = new ModifyDBParameterGroupRequest();
        request.setDBParameterGroupId("bd696e5c-3f39-44f5-8afb-3b9e6dd20d7f");
        request.setDBParameterGroupName("lzs-test-1");
        RdsResponse<ResetDBParameterGroupResponse> response = client.modifyDBParameterGroup(request);
        log.info("{}", response);
    }

    @Test
    public void testDescribeDBParameterGroup(){
        DescribeDBParameterGroupRequest request = new DescribeDBParameterGroupRequest();
//        request.setDBParameterGroupId("bd696e5c-3f39-44f5-8afb-3b9e6dd20d7f");
        RdsResponse<DescribeDBParameterGroupResponse> response = client.describeDBParameterGroup(request);
        log.info("{}", response);
    }

    @Test
    public void testDeleteDBParameterGroup() {
        DeleteDBParameterGroupRequest request = new DeleteDBParameterGroupRequest();
        request.setDBParameterGroupId("bd696e5c-3f39-44f5-8afb-3b9e6dd20d7f");
        RdsResponse response = client.deleteDBParameterGroup(request);
        log.info("{}", response);
    }

    @Test
    public void testDescribeEngineDefaultParameters() {
        DescribeEngineDefaultParametersRequest request = new DescribeEngineDefaultParametersRequest();
        request.setEngine("mysql");
        request.setEngineVersion("5.6");
        RdsResponse<DescribeEngineDefaultParametersResponse> response = client.describeEngineDefaultParameters(request);
        log.info("{}",response);
    }

    @Test
    public void testResetDBParameterGroup(){
        ResetDBParameterGroupRequest request = new ResetDBParameterGroupRequest();
        request.setDBParameterGroupId("aa707114-e0a9-47d7-b327-8771cb203b17");
        RdsResponse<ModifyDBParameterGroupResponse> response = client.resetDBParameterGroup(request);
        log.info("{}",response);
    }
}
