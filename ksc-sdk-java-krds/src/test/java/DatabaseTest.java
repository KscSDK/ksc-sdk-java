import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.ksc.krds.DatabaseClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.database.*;
import com.ksc.krds.model.krdsInstance.RebootDBInstanceRequest;
import org.junit.Before;
import org.junit.Test;

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
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<GetMysqlCollationsResponse> response = client.describeCollations(request);
        print(response);
    }

    @Test
    public void testCreateInstanceDatabase() {
        CreateDatabaseRequest request = new CreateDatabaseRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setInstanceDatabaseName("lzs-test");
        RdsResponse response = client.createInstanceDatabase(request);
        print(response);
    }

    @Test
    public void testDescribeInstanceDatabases() {
        DescribeDatabaseRequest request = new DescribeDatabaseRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<DescribeDatabaseResponse> response = client.describeInstanceDatabases(request);
        print(response);
    }

    @Test
    public void testModifyInstanceDatabaseInfo() {
        ModifyDatabaseInfoRequest request = new ModifyDatabaseInfoRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setInstanceDatabaseName("lzs-test");
        request.setInstanceDatabaseDescription("lzs-test");
        RdsResponse response = client.modifyInstanceDatabaseInfo(request);
        print(response);
    }

    @Test
    public void testDeleteInstanceDatabase() {
        DeleteDatabaseRequest request = new DeleteDatabaseRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setInstanceDatabaseName("lzs-test");
        RdsResponse response = client.deleteInstanceDatabase(request);
        print(response);
    }

    @Test
    public void testDeleteInstanceAccount() {
        DeleteAccountRequest request = new DeleteAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setInstanceAccountName("lzs01");
        client.deleteInstanceAccount(request);
    }

    @Test
    public void testModifyInstanceDatabasePrivileges() {
        ModifyDatabasePrivilegesRequest request = new ModifyDatabasePrivilegesRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setInstanceDatabaseName("lzs-test");
        List<DatabasePrivilege> privileges = new ArrayList<DatabasePrivilege>();
        DatabasePrivilege privilege = new DatabasePrivilege();
        privilege.setInstanceAccountName("lzs01");
        privilege.setPrivilege(MysqlPrivilegeMap.FrontPrivilege.ReadOnly);
        privileges.add(privilege);
        request.setInstanceDatabasePrivileges(privileges);
        RdsResponse response = client.modifyInstanceDatabasePrivileges(request);
        print(response);
    }

}
