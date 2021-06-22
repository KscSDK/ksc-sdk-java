import com.ksc.krds.AuditStatisticClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.auditstatistic.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AuditStatisticTest extends BaseTest {

    private AuditStatisticClient client;

    @Before
    public void init() {
        client = new AuditStatisticClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    @Test
    public void testDescribeAuditHotDuration() {
        DescribeAuditHotDurationRequest request = new DescribeAuditHotDurationRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setTimeRange("LASTEST_ONE_WEEK");
        RdsResponse<List<AuditHotDurationResponse>> response = client.describeAuditHotDuration(request);
        System.out.println(response.getData());
    }

    @Test
    public void testSqlAuditReport() {
        AuditTemplateRequest request = new AuditTemplateRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setTimeRange("LASTEST_ONE_WEEK");
        AuditTemplateResponse<List<AuditTemplateData>> response = client.sqlAuditReport(request);
        System.out.println(response.getData());
    }

    @Test
    public void testSqlAuditLineChart() {
        SqlAuditLineChartRequest request = new SqlAuditLineChartRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setTimeRange("LASTEST_ONE_WEEK");
        RdsResponse<List<SqlAuditLineChartData>> response = client.sqlAuditLineChart(request);
        System.out.println(response.getData());
    }

    @Test
    public void testDescribeAuditHotCount() {
        AuditHotStatisticRequest request = new AuditHotStatisticRequest();
        request.setDBInstanceIdentifier(getInstanceId());
        request.setTimeRange("LASTEST_ONE_WEEK");
        RdsResponse<List<AuditHotStatisticResponse>> response = client.describeAuditHotCount(request);
        System.out.println(response.getData());

    }
}
