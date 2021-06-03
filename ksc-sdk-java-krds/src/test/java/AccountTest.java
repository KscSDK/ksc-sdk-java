import com.ksc.krds.AccountClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.account.*;
import org.junit.Before;
import org.junit.Test;

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
}
