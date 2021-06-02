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
    public void testList() {
        ListAccountRequest request = new ListAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<ListAccountResponse> response = client.listAccount(request);
        log.info("{}",response);
    }

    @Test
    public void testCreate() {
        CreateAccountRequest request = new CreateAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setUser("lzs");
        request.setPassword("Aq123.@1sdi");
        request.setHost(getHost());
        RdsResponse<DescribeAccountResponse> response = client.createAccount(request);
        System.out.println(response.getData());
    }

    @Test
    public void testModify() {
        ModifyAccountRequest request = new ModifyAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        client.modifyAccount(request);
    }

    @Test
    public void testDelete() {
        DeleteAccountRequest request = new DeleteAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        client.deleteAccount(request);
    }

    @Test
    public void testDescribe() {
        DescribeAccountRequest request = new DescribeAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<DescribeAccountResponse> response = client.describeAccount(request);
        System.out.println(response.getData());
    }
}
