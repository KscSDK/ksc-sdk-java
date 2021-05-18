import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.AuditClient;
import com.ksc.krds.LogClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.log.DBLogType;
import com.ksc.krds.model.log.DescribeDBLogFilesRequest;
import com.ksc.krds.model.log.DescribeDBLogFilesResponse;
import org.junit.Before;
import org.junit.Test;

public class LogTest {

    private LogClient client;

    @Before
    public void init() {
        String accessKey = System.getenv("KSYUN_ACCESS_KEY");
        String secretKey = System.getenv("KSYUN_SECRET_KEY");
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        client = new LogClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testDescribe() {
        DescribeDBLogFilesRequest request = new DescribeDBLogFilesRequest();
        request.setDBInstanceIdentifier("f0b9614c-979e-4cf4-8b58-28ebc65fd329");
        request.setDBLogType(DBLogType.SlowLog);
        RdsResponse<DescribeDBLogFilesResponse> response = client.describeDBLogFiles(request);
        DescribeDBLogFilesResponse data = response.getData();
        System.out.println(data);
    }
}
