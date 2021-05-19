import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.AccountClient;
import com.ksc.krds.AuditStatisticClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.account.ListAccountRequest;
import com.ksc.krds.model.account.ListAccountResponse;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

    private AccountClient client;

    @Before
    public void init() {
        String accessKey = System.getenv("KSYUN_ACCESS_KEY");
        String secretKey = System.getenv("KSYUN_SECRET_KEY");
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        client = new AccountClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testList() {
        ListAccountRequest request = new ListAccountRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        RdsResponse<ListAccountResponse> response = client.listAccount(request);
        System.out.println(response.getData());
    }
}
