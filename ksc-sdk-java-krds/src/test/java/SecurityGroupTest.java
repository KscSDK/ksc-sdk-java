import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.krds.SecurityGroupClient;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupRequest;
import org.junit.Before;
import org.junit.Test;

public class SecurityGroupTest {

    private String accessKey;
    private String secretKey;
    private AWSCredentials credentials;

    @Before
    public void init() {
        accessKey = System.getenv("KSYUN_ACCESS_KEY");
        secretKey = System.getenv("KSYUN_SECRET_KEY");
        credentials = new BasicAWSCredentials(accessKey, secretKey);
    }

    @Test
    public void describeSecurityGroups() {
        DescribeSecurityGroupRequest request=new DescribeSecurityGroupRequest();
        SecurityGroupClient client=new SecurityGroupClient(credentials);
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");


    }
}
