import com.ksc.krds.AuditClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.audit.*;
import org.junit.Before;
import org.junit.Test;

public class AuditTest extends BaseTest{

    private AuditClient client;

    @Before
    public void init() {
        client = new AuditClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testListAudit() {
        ListAuditRequest request = new ListAuditRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<ListAuditResponse> response = client.listAudit(request);
        print(response);
    }

    @Test
    public void testAuditStatistic() {
        AuditStatisticRequest request = new AuditStatisticRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse response = client.auditStatistic(request);
        print(response);
    }

    @Test
    public void testStartAuditDetailExportTask() {
        StartAuditDetailExportTaskRequest request = new StartAuditDetailExportTaskRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse response = client.startAuditDetailExportTask(request);
        print(response);
    }

    @Test
    public void test() {
        ListAuditDetailExportTaskRequest request = new ListAuditDetailExportTaskRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse<ListAuditDetailExportTaskResponse> response = client.listAuditDetailExportTask(request);
        print(response);
    }
}
