import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.AuditClient;
import com.ksc.krds.AuditStatisticClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.auditstatistic.DescribeAuditHotDurationRequest;
import org.junit.Before;
import org.junit.Test;

public class AuditStatisticTest {

    private AuditStatisticClient client;

    @Before
    public void init() {
        String accessKey = System.getenv("KSYUN_ACCESS_KEY");
        String secretKey = System.getenv("KSYUN_SECRET_KEY");
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        client = new AuditStatisticClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testDescribe() {
        DescribeAuditHotDurationRequest request = new DescribeAuditHotDurationRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        request.setTimeRange("LASTEST_ONE_WEEK");
        RdsResponse response = client.describeAuditHotDuration(request);
        System.out.println(response.getData());
    }
}
