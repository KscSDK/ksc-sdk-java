import com.ksc.auth.BasicAWSCredentials;
import com.ksc.auth.policy.Resource;
import com.ksc.krds.AuditClient;
import com.ksc.krds.ParameterGroupClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.audit.ListAuditRequest;
import com.ksc.krds.model.audit.ListAuditResponse;
import org.junit.Before;
import org.junit.Test;

public class AuditTest {

    private AuditClient client;

    @Before
    public void init() {
        String accessKey = System.getenv("KSYUN_ACCESS_KEY");
        String secretKey = System.getenv("KSYUN_SECRET_KEY");
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        client = new AuditClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testList() {
        ListAuditRequest request = new ListAuditRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        RdsResponse<ListAuditResponse> response = client.listAudit(request);
        ListAuditResponse data = response.getData();
        System.out.println(data);
    }
}
