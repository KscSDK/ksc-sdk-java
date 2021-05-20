import com.ksc.krds.DatabaseClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.database.DescribeAccountRequest;
import org.junit.Before;
import org.junit.Test;

public class DatabaseTest extends BaseTest{

    private DatabaseClient client;

    @Before
    public void init() {
        client = new DatabaseClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void test() {
        DescribeAccountRequest request = new DescribeAccountRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse response = client.describeAccount(request);
        System.out.println(response.getData());
    }

}
