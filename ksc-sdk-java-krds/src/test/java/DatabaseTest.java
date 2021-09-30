import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.ksc.krds.DatabaseClient;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.database.*;
import com.ksc.krds.model.krdsInstance.RebootDBInstanceRequest;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTest extends BaseTest{

    private DatabaseClient client;

    @Before
    public void init() {
        client = new DatabaseClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testDescribeAccount() {
        DescribeAccountRequest request = new DescribeAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<DescribeAccountResponse> response = client.describeAccount(request);
        print(response);
    }

    @Test
    public void testCreateAccount() {
        CreateAccountRequest request = new CreateAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setInstanceAccountName("lzs01");
        request.setInstanceAccountPassword("Co0perate1");
        RdsResponse response = client.createAccount(request);
        print(response);
    }

    @Test
    public void testModifyInstanceAccount() {
        ModifyAccountRequest request = new ModifyAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setInstanceAccountName("lzs01");
        request.setInstanceAccountDescription("lzs01");
        RdsResponse<DescribeAccountResponse> response = client.modifyInstanceAccount(request);
        print(response);
    }

    @Test
    public void testModifyInstanceAccountPassword() {
        ModifyAccountPasswordRequest request = new ModifyAccountPasswordRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setInstanceAccountName("lzs01");
        request.setInstanceAccountPassword("Co0perate1");
        RdsResponse response = client.modifyInstanceAccountPassword(request);
        print(response);
    }

    @Test
    public void testDescribeCollations() {
        InstanceRequest request = new InstanceRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        RdsResponse<GetMysqlCollationsResponse> response = client.describeCollations(request);
        print(response);
    }

    @Test
    public void testCreateInstanceDatabase() {
        CreateDatabaseRequest request = new CreateDatabaseRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        request.setInstanceDatabaseName("lb-test");
        RdsResponse response = client.createInstanceDatabase(request);
        print(response);
    }

    @Test
    public void testDescribeInstanceDatabases() {
        DescribeDatabaseRequest request = new DescribeDatabaseRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        RdsResponse<DescribeDatabaseResponse> response = client.describeInstanceDatabases(request);
        print(response);
    }

    @Test
    public void testModifyInstanceDatabaseInfo() {
        ModifyDatabaseInfoRequest request = new ModifyDatabaseInfoRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        request.setInstanceDatabaseName("test_table");
        //request.setInstanceDatabaseDescription("测试功能2");
        RdsResponse response = client.modifyInstanceDatabaseInfo(request);
        print(response);
    }

    @Test
    public void testDeleteInstanceDatabase() {
        DeleteDatabaseRequest request = new DeleteDatabaseRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        request.setInstanceDatabaseName("test-01,test-02");
        RdsResponse response = client.DeleteInstanceDatabaseAction(request);
        print(response);
    }

    @Test
    public void testDeleteInstanceAccount() {
        DeleteAccountRequest request = new DeleteAccountRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        request.setInstanceAccountName("test_0011112");
        RdsResponse response = client.DeleteInstanceAccountAction(request);
        print(response);
    }
   /*
   *数据库库表-授权
   */
    @Test
    public void testModifyInstanceDatabasePrivileges() {
        ModifyDatabasePrivilegesRequest request = new ModifyDatabasePrivilegesRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        request.setInstanceDatabaseName("test-table");
        List<DatabasePrivilege> InstanceDatabasePrivileges = new ArrayList<DatabasePrivilege>();
        DatabasePrivilege privilege = new DatabasePrivilege();
        privilege.setInstanceAccountName("test_id123");
        privilege.setPrivilege(MysqlPrivilegeMap.FrontPrivilege.ReadOnly);
        InstanceDatabasePrivileges.add(privilege);
        request.setInstanceDatabasePrivileges(InstanceDatabasePrivileges);
        RdsResponse response = client.modifyInstanceDatabasePrivileges(request);
        print(response);
    }
    /*
     *    数据库账号 列表
     **/
    @Test
    public void testDescribeInstanceAccounts(){
        DescribeAccountRequest request = new DescribeAccountRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        RdsResponse response = client.DescribeInstanceAccounts(request);
        print(response);
    }
    /*
     *   数据库账号-创建/克隆
     */
    /*@Test
    public void testCreateInstanceAccountAction(){
        CreateInstanceAccountActionRequest request = new CreateInstanceAccountActionRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        request.setInstanceAccountName("testzhanghao2");
        request.setInstanceAccountPassword("Password111");
        request.setInstanceAccountDescription("测试接口222");
        RdsResponse response = client.CreateInstanceAccountAction(request);
        print(response);
    }*/

    /*
     *   数据库账号-修改/重置密码
     */
    @Test
    public void testModifyInstanceAccountInfo(){
        ModifyAccountPasswordRequest request = new ModifyAccountPasswordRequest();
        request.setDBInstanceIdentifier("726adc59-ff96-4fc9-9836-47f98d60ea2c");
        request.setInstanceAccountName("test_id123");
        request.setInstanceAccountPassword("Test0000");
        RdsResponse response = client.ModifyInstanceAccountInfo(request);
        print(response);
    }
    /*
     *   数据库账号-授权
     */
    /*@Test
    public void testModifyInstanceAccountPrivilegesAction() {
        ModifyInstanceAccountPrivilegesActionRequest request = new ModifyInstanceAccountPrivilegesActionRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        request.setInstanceAccountName("test_id");
       *//* List<AccountPrivilege> InstanceAccountPrivilege = new ArrayList<AccountPrivilege>();
        AccountPrivilege privilege = new AccountPrivilege();
        privilege.setInstanceDatabaseName("test-table");
        privilege.setPrivilege(MysqlPrivilegeMap.FrontPrivilege.ReadOnly);
        InstanceAccountPrivilege.add(privilege);
        request.setInstanceAccountDescription(String.valueOf(InstanceAccountPrivilege));*//*

        RdsResponse response = client.ModifyInstanceAccountPrivilegesAction(request);
        print(response);
    }*/




}
