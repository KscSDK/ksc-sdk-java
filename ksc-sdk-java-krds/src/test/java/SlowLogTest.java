import com.ksc.krds.DatabaseClient;
import com.ksc.krds.SlowLogClient;
import com.ksc.krds.model.slowlog.SlowLogDetailRequest;
import com.ksc.krds.model.slowlog.SlowLogDetailResponse;
import org.junit.Before;
import org.junit.Test;

public class SlowLogTest extends BaseTest{

    private SlowLogClient client;

    @Before
    public void init() {
        client = new SlowLogClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void test() {
        SlowLogDetailRequest request = new SlowLogDetailRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setStartTime("2021-05-20 00:00:00");
        request.setEndTime("2021-05-21 00:00:00");
        SlowLogDetailResponse response = client.slowLogDetail(request);
        System.out.println(response.getData());
    }

}
