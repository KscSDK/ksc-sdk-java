import com.ksc.auth.BasicAWSCredentials;

public class BaseTest {

    private BasicAWSCredentials credentials;

    public BaseTest() {
        String accessKey = System.getenv("KSYUN_ACCESS_KEY");
        String secretKey = System.getenv("KSYUN_SECRET_KEY");
        credentials = new BasicAWSCredentials(accessKey, secretKey);
    }

    public BasicAWSCredentials getCredentials() {
        return credentials;
    }

    public String getInstanceId() {
        return  "f0b9614c-979e-4cf4-8b58-28ebc65fd329";
    }

    public String getHost() {
        return "10.8.1.150";
    }
}
