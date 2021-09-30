import com.ksc.krds.SecurityGroupClient;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.securityGroup.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SecurityGroupTest extends BaseTest{

    SecurityGroupClient client;

    @Before
    public void init() {
        client = new SecurityGroupClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testCreateSecurityGroupRule() {
        CreateSecurityGroupRequest request = new CreateSecurityGroupRequest();
        /*List<String> instanceIds = new ArrayList<String>();
        instanceIds.add(getInstanceId());
        request.setDBInstanceIdentifier(instanceIds);
        request.setSecurityGroupName("libai-security-group");
        List<CreateSecurityGroupRequest.SecurityGroupRule> securityGroupRule = new ArrayList<CreateSecurityGroupRequest.SecurityGroupRule>();
        CreateSecurityGroupRequest.SecurityGroupRule e = new CreateSecurityGroupRequest.SecurityGroupRule();
        e.setSecurityGroupRuleName("libai-security-group-rule");
        e.setSecurityGroupRuleProtocol("0.0.0.1/1");
        securityGroupRule.add(e);
        request.setSecurityGroupRule(securityGroupRule);
        request.setType("mysql");
        request.setSecurityGroupDescription("lzs-test");*/
        request.setSecurityGroupName("libai-security-group");
        request.setSecurityGroupDescription("测试");
        request.setVersion("2020-08-25");
        DescribeSecurityGroupResponse response = client.createSecurityGroupRule(request);
        log.info("{}", response);
    }

    @Test
    public void testDescribeSecurityGroup() {
        DescribeSecurityGroupRequest request = new DescribeSecurityGroupRequest();
        request.setSecurityGroupId("64630");
        DescribeSecurityGroupResponse response = client.describeSecurityGroup(request);
        log.info("{}", response);
    }

    @Test
    public void testModifySecurityGroup() {
        CreateSecurityGroupRequest request = new CreateSecurityGroupRequest();
        request.setSecurityGroupId("64236");
        request.setSecurityGroupName("lzs-security-group-11");
        DescribeSecurityGroupResponse response = client.modifySecurityGroup(request);
        log.info("{}", response);
    }

    @Test
    public void testDeleteSecurityGroup() {
        DeleteSecurityGroupRequest request = new DeleteSecurityGroupRequest();
        List<String> securityGroupIds = new ArrayList<String>(1);
        securityGroupIds.add("64643");
        request.setSecurityGroupId(securityGroupIds);
        KrdsResponse response = client.deleteSecurityGroup(request);
        log.info("{}", response);
    }

    @Test
    public void testModifySecurityGroupRuleName() {
        ModifySecurityGroupRuleNameRequest request = new ModifySecurityGroupRuleNameRequest();
        request.setSecurityGroupRuleId("127370");
        request.setSecurityGroupRuleName("lzs-security-group-rule-111");
        KrdsResponse response = client.modifySecurityGroupRuleName(request);
        log.info("{}", response);
    }

    @Test
    public void testModifySecurityGroupRule() {
        ModifySecurityGroupRuleRequest request = new ModifySecurityGroupRuleRequest();
        request.setSecurityGroupId("64236");
        List<CreateSecurityGroupRequest.SecurityGroupRule> securityGroupRule = new ArrayList<CreateSecurityGroupRequest.SecurityGroupRule>();
        CreateSecurityGroupRequest.SecurityGroupRule e = new CreateSecurityGroupRequest.SecurityGroupRule();
        e.setSecurityGroupRuleName("lzs-security-group-rule-1");
        e.setSecurityGroupRuleProtocol("0.0.0.1/1");
        request.setSecurityGroupRule(securityGroupRule);
        request.setSecurityGroupRuleAction("Attach");
        DescribeSecurityGroupResponse response = client.modifySecurityGroupRule(request);
        log.info("{}", response);
    }

    @Test
    public void testSecurityGroupRelation() {
        SecurityGroupRelationRequest request = new SecurityGroupRelationRequest();
        request.setSecurityGroupId("64236");
        List<String> instanceIds = new ArrayList<String>();
        instanceIds.add(getInstanceId());
        request.setDBInstanceIdentifier(instanceIds);
        request.setRelationAction("Attach");
        DescribeSecurityGroupResponse response = client.securityGroupRelation(request);
        log.info("{}", response);
    }

    @Test
    public void testCloneSecurityGroup() {
        CreateSecurityGroupRequest request = new CreateSecurityGroupRequest();
        request.setSecurityGroupId("64236");
        request.setSecurityGroupName("lzs-security-group-clone-1");
        request.setSecurityGroupDescription("lzs-test-clone");
        DescribeSecurityGroupResponse response = client.cloneSecurityGroup(request);
        log.info("{}", response);
    }
}
