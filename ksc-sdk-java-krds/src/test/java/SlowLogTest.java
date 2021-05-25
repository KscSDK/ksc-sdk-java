import com.ksc.krds.SlowLogClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.slowlog.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SlowLogTest extends BaseTest{

    private SlowLogClient client;

    @Before
    public void init() {
        client = new SlowLogClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testSlowLogDetail() {
        SlowLogDetailRequest request = new SlowLogDetailRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setStartTime("2021-05-24 00:00:00");
        request.setEndTime("2021-05-25 00:00:00");
        SlowLogDetailResponse response = client.slowLogDetail(request);
        log.info("{}",response.getData());
    }

    @Test
    public void testSlowLogReport() {
        SlowLogReportRequest request = new SlowLogReportRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setStartTime("2021-05-24 00:00:00");
        request.setEndTime("2021-05-25 00:00:00");
        SlowLogReportResponse<List<SlowLogReportPub>> response = client.slowLogReport(request);
        log.info("{}", response.getData());
    }

    @Test
    public void testSlowLogLineChart() {
        SlowLogLineChartRequest request = new SlowLogLineChartRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setStartTime("2021-05-24 00:00:00");
        request.setEndTime("2021-05-25 00:00:00");
        SlowLogLineChartResponse<List<SlowLogReportGlobalPubResultBean>> response = client.slowLogLineChart(request);
        log.info("{}",response.getData());
    }

    @Test
    public void testListAuditDetailExportTask() {
        ListAuditRequest request = new ListAuditRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        ExportListResponse response = client.listAuditDetailExportTask(request);
        log.info("{}", response);
    }

    //TODO
    @Test
    public void testStartAuditDetailExportTask() {
        StartAuditDetailExportTaskRequest request = new StartAuditDetailExportTaskRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        RdsResponse response = client.startAuditDetailExportTask(request);
        log.info("{}",response);
    }
}
