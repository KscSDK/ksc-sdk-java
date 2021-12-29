import com.ksc.krds.AccountClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.account.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
public class AccountTest extends BaseTest {

    private AccountClient client;

    @Before
    public void init() {
        client = new AccountClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testListAccount() {
        ListAccountRequest request = new ListAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<ListAccountResponse> response = client.listAccount(request);
        log.info("{}",response);
    }

    @Test
    public void testCreateAccount() {
        CreateAccountRequest request = new CreateAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setUser("lzs3");
        request.setPassword("Co0perate");
        request.setHost(getHost());
        RdsResponse<DescribeAccountResponse> response = client.createAccount(request);
        log.info("{}",response);
    }

    @Test
    public void testModifyAccount() {
        ModifyAccountRequest request = new ModifyAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setUser("lzs");
        request.setHost(getHost());
        request.setPassword("Co0perate1");
        RdsResponse<DescribeAccountResponse> response = client.modifyAccount(request);
        log.info("{}",response);
    }

    @Test
    public void testDeleteAccount() {
        DeleteAccountRequest request = new DeleteAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setUser("lzs3");
        request.setHost(getHost());
        RdsResponse response = client.deleteAccount(request);
        print(response);
    }

    @Test
    public void testDescribeAccount() {
        DescribeAccountRequest request = new DescribeAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setHost(getHost());
        request.setUser("lzs");
        RdsResponse<DescribeAccountResponse> response = client.describeAccount(request);
        log.info("{}",response);
    }

    @Test
    public void testListAccountSupportPrivileges() {
        ListAccountSupportPrivilegesRequest request = new ListAccountSupportPrivilegesRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<ListAccountSupportPrivilegesResponse> response = client.listAccountSupportPrivileges(request);
        log.info("{}",response);
    }

    //1.DescribeInstanceAccounts
    @Test
    public void testDescribeInstanceAccounts(){
        DescribeInstanceAccountsRequest request = new DescribeInstanceAccountsRequest();
        request.setDBInstanceIdentifier("1fc2e73e-51cd-4853-b722-7b93e5506b2c");
        RdsResponse response = client.describeInstanceAccounts(request);
        print(response);
    }

    //2.CreateInstanceAccountAction   POST
    @Test
    public  void testCreateInstanceAccountAction() throws Exception {
        CreateInstanceAccountActionRequest request = new CreateInstanceAccountActionRequest();
        request.setDBInstanceIdentifier("1fc2e73e-51cd-4853-b722-7b93e5506b2c");
        request.setInstanceAccountName("zhangsan");
        request.setInstanceAccountPassword("Zhang314525617");
        request.setInstanceAccountDescription("测试");
        RdsResponse rdsResponse = client.createInstanceAccountAction(request);
        print(rdsResponse);
    }

    //3.ModifyInstanceAccountInfo GET
    @Test
    public void testModifyInstanceAccountInfo(){
        ModifyInstanceAccountInfoRequest request = new ModifyInstanceAccountInfoRequest();
        request.setDBInstanceIdentifier("1fc2e73e-51cd-4853-b722-7b93e5506b2c");
        request.setInstanceAccountName("zhangsan");
        request.setInstanceAccountPassword("Test0000");
        request.setInstanceAccountDescription("修改测试");
        RdsResponse response = client.modifyInstanceAccountInfo(request);
        print(response);
    }

    //4.DeleteInstanceAccountAction
    @Test
    public void testDeleteInstanceAccountAction() throws Exception {
        DeleteInstanceAccountActionRequest request = new DeleteInstanceAccountActionRequest();
        request.setDBInstanceIdentifier("1fc2e73e-51cd-4853-b722-7b93e5506b2c");
        request.setInstanceAccountName("zhangsan,lisi");
        RdsResponse rdsResponse = client.deleteInstanceAccountAction(request);
        print(rdsResponse);

    }

    //5.数据库账号授权
    @Test
    public void testModifyInstanceAccountPrivilegesAction() throws Exception {
        ModifyInstanceAccountPrivilegesActionRequest request = new ModifyInstanceAccountPrivilegesActionRequest();
        request.setDBInstanceIdentifier("1fc2e73e-51cd-4853-b722-7b93e5506b2c");
        request.setInstanceAccountName("zhangsan");

        List<InstanceAccountPrivilege> privileges = new ArrayList<InstanceAccountPrivilege>();
        privileges.add(new InstanceAccountPrivilege("database1","ReadWrite"));
        request.setInstanceAccountPrivileges(privileges);
        RdsResponse rdsResponse = client.modifyInstanceAccountPrivilegesAction(request);
        print(rdsResponse);
    }
}
