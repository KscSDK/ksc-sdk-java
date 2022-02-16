import com.ksc.krds.AuditClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.audit.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Retention;

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
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        RdsResponse<ListAuditResponse> response = client.listAudit(request);
        print(response);
    }

    @Test
    public void testAuditStatistic() {
        AuditStatisticRequest request = new AuditStatisticRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        RdsResponse response = client.auditStatistic(request);
        print(response);
    }

    @Test
    public void testStartAuditDetailExportTask() {
        StartAuditDetailExportTaskRequest request = new StartAuditDetailExportTaskRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        request.setExportFileds("ExecTime,Sql,RunResult");
        request.setAuditBeginTime("2021-09-24 17:20:40");
        request.setAuditEndTime("2021-09-24 17:20:40");
        RdsResponse response = client.startAuditDetailExportTask(request);
        print(response);
    }

    @Test
    public void testListAuditDetailExportTask() {
        ListAuditDetailExportTaskRequest request = new ListAuditDetailExportTaskRequest();
        request.setDBInstanceIdentifier("5e5e661f-00a4-4329-ba94-152e4d88a205");
        ListAuditDetailExportTaskResponse response = client.listAuditDetailExportTask(request);
        print(response);
    }

    @Test
    public void testStartAudit() {
        StartAuditRequest request = new StartAuditRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        RdsResponse response = client.startAudit(request);
        print(response);
    }

    @Test
    public void testStopAudit() {
        StopAuditRequest request = new StopAuditRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        RdsResponse response = client.stopAudit(request);
        print(response);
    }
}
