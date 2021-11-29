import com.google.gson.Gson;
import com.ksc.krds.SecurityGroupsClient;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.securityGroup.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * security group client test for version 2020-08-25
 *
 */
public class SecurityGroupsTest extends BaseTest{

    SecurityGroupsClient client;

    @Before
    public void init() {
        client = new SecurityGroupsClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    //1.CreateSecurityGroup 新建安全组
    @Test
    public void testCreateSecurityGroup(){
        CreateSecurityGroupRequest request = new CreateSecurityGroupRequest();
        request.setSecurityGroupName("zhebin-sdk-test222223");
        request.setSecurityGroupDescription("哲斌测试sdk书写");

        List<String> ids = new ArrayList<String>(Arrays.asList("f71f5e7a-381a-439d-8535-d702b313142a"));
        request.setDBInstanceIdentifier(ids);

        CreateSecurityGroupRequest.SecurityGroupRule rule = new CreateSecurityGroupRequest.SecurityGroupRule();
        rule.setSecurityGroupRuleName("zhebin-tt");
        rule.setSecurityGroupRuleCidr("10.10.10.10/32");
        List<CreateSecurityGroupRequest.SecurityGroupRule> securityGroupRules = new ArrayList<CreateSecurityGroupRequest.SecurityGroupRule>(Arrays.asList(rule));

        request.setSecurityGroupRule(securityGroupRules);
        DescribeSecurityGroupResponse response = client.createSecurityGroupRule(request);
        print(response);
    }

    //2.DescribeSecurityGroup 查看安全组
    @Test
    public void testDescribeSecurityGroup() {
        DescribeSecurityGroupRequest request = new DescribeSecurityGroupRequest();
        request.setSecurityGroupId(Arrays.asList("64599","64793"));
        DescribeSecurityGroupResponse response = client.describeSecurityGroup(request);
        log.info("{}",new Gson().toJson(response));
    }
    
    //3.CloneSecurityGroup 复制(克隆)安全组
    @Test
    public void testCloneSecurityGroup() {
        CreateSecurityGroupRequest request = new CreateSecurityGroupRequest();
        request.setSecurityGroupId("64877");
        request.setSecurityGroupName("zhebin-clone-2321333");
        request.setSecurityGroupDescription("zhebin-test-clone");
        DescribeSecurityGroupResponse response = client.cloneSecurityGroup(request);
        print(response);
    }
    
    //4.测试删除安全组
    @Test
    public void testDeleteSecurityGroup() {
        DeleteSecurityGroupRequest request = new DeleteSecurityGroupRequest();
        List<String> securityGroupIds = new ArrayList<String>(1);
        securityGroupIds.add("64846");
        securityGroupIds.add("64856");
        request.setSecurityGroupId(securityGroupIds);
        KrdsResponse response = client.deleteSecurityGroup(request);
        print(response);
    }

    //5.ModifySecurityGroupRule 修改安全组规则
    @Test
    public void testModifySecurityGroupRule() {

        ModifySecurityGroupRuleRequest request = new ModifySecurityGroupRuleRequest();
        request.setSecurityGroupId("64832");
        request.setSecurityGroupRuleAction("Attach");

        CreateSecurityGroupRequest.SecurityGroupRule e = new CreateSecurityGroupRequest.SecurityGroupRule();
        e.setSecurityGroupRuleName("DragonBase-poc-test-5");
        e.setSecurityGroupRuleCidr("10.111.111.10/24");

        List<CreateSecurityGroupRequest.SecurityGroupRule>  rules = new ArrayList<CreateSecurityGroupRequest.SecurityGroupRule>();
        rules.add(e);

        request.setSecurityGroupRule(rules);
        DescribeSecurityGroupResponse response = client.modifySecurityGroupRule(request);
        print(response);
    }

    //6.SecurityGroupRelation 修改安全组绑定实例
    @Test
    public  void testsecurityGroupRelation(){
        SecurityGroupRelationRequest request = new SecurityGroupRelationRequest();
        request.setRelationAction("Attach");
        request.setSecurityGroupId("64864");
        List<String> instanceIds = new ArrayList<String>();
        instanceIds.add("f71f5e7a-381a-439d-8535-d702b313142a");
        instanceIds.add("561b7a1b-d42d-40e3-a246-21b1d0483546");
        request.setDBInstanceIdentifier(instanceIds);
        DescribeSecurityGroupResponse describeSecurityGroupResponse = client.securityGroupRelation(request);
        print(describeSecurityGroupResponse);
    }
    
    //7.ModifySecurityGroup 修改安全组
    @Test
    public void testModifySecurityGroup() {
        CreateSecurityGroupRequest request = new CreateSecurityGroupRequest();
        request.setSecurityGroupId("64864");
        request.setSecurityGroupName("zhebin-sdk-sdk");
        request.setSecurityGroupDescription("zhebin-sdk-test");
        DescribeSecurityGroupResponse response = client.modifySecurityGroup(request);
        log.info("{}", response);
    }

    //8.ModifySecurityGroupRuleName 修改安全组规则备注
    @Test
    public void testModifySecurityGroupRuleName() {
        ModifySecurityGroupRuleNameRequest request = new ModifySecurityGroupRuleNameRequest();
        request.setSecurityGroupId("64864");
        request.setSecurityGroupRuleId(132340);
        request.setSecurityGroupRuleName("zhebing-test-change-describetions");
        KrdsResponse response = client.modifySecurityGroupRuleName(request);
        print(response);
    }
}
