import com.ksc.krds.LogClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.log.*;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class LogTest extends BaseTest {

    private LogClient client;

    @Before
    public void init() {
        client = new LogClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testDescribeDBLogFiles() {
        DescribeDBLogFilesRequest request = new DescribeDBLogFilesRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setDBLogType(DBLogType.SlowLog);
        RdsResponse<DescribeDBLogFilesResponse> response = client.describeDBLogFiles(request);
        print(response);
    }

    @Test
    public void testDescribeLastLog() {
        DescribeDBLogRequest request = new DescribeDBLogRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setDBLogType(DBLogType.SlowLog);
        RdsResponse<DescribeDBLogResponse> response = client.describeLastLog(request);
        log.info("result:{}",response.getData());

    }

    //TODO
    @Test
    public void testDeleteDBBinlog() {
        DeleteDBBinlogRequest request = new DeleteDBBinlogRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        client.deleteDBBinlog(request);
    }

}
