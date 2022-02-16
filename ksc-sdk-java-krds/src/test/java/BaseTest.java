import com.google.gson.Gson;
import com.ksc.auth.BasicAWSCredentials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {

    private BasicAWSCredentials credentials;

    Logger log = LoggerFactory.getLogger(BaseTest.class);

    public BaseTest() {
        String accessKey = System.getenv("ak");
        String secretKey = System.getenv("sk");
        credentials = new BasicAWSCredentials(accessKey, secretKey);
    }

    public BasicAWSCredentials getCredentials() {
        return credentials;
    }

    public String getInstanceId() {
        return  "33db571f-167b-40bd-972f-62e7718a888a";
    }

    public String getHost() {
        return "10.0.1.179";
    }

    public void print(Object o) {
        log.info("{}",new Gson().toJson(o));
    }
}
