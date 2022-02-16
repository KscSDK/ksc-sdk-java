import com.ksc.krds.AuditStatisticClient;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.auditstatistic.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


/**
 *     最近1小时：LASTEST_ONE_HOUR
 *     最近3小时：LASTEST_THREE_HOUR
 *     最近1天：LASTEST_ONE_DAY
 *     最近1周：LASTEST_ONE_WEEK
 *     自定义查询时间：CUSTOM
 */

public class AuditStatisticTest extends BaseTest {

    private AuditStatisticClient client;

    @Before
    public void init() {
        client = new AuditStatisticClient(getCredentials());
        client.setEndpoint("https://krds.cn-beijing-6.api.ksyun.com");
    }

    //DescribeAuditHotDuration
    @Test
    public void testDescribeAuditHotDuration() {
        DescribeAuditHotDurationRequest request = new DescribeAuditHotDurationRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        request.setTimeRange("LASTEST_ONE_WEEK");
        request.setStartTime("2021-12-14 16:12:24");
        request.setEndTime("2021-12-14 16:13:24");
        RdsResponse<List<AuditHotDurationResponse>> response = client.describeAuditHotDuration(request);
        System.out.println(response.getData());
    }

    //SqlAuditReport
    @Test
    public void testSqlAuditReport() {
        AuditTemplateRequest request = new AuditTemplateRequest();
        request.setDBInstanceIdentifier("3cc79b94-a363-4f0b-9941-0ac2e847688f");
        request.setTimeRange("LASTEST_ONE_WEEK");
        request.setStartTime("2021-12-14 16:12:24");
        request.setEndTime("2021-12-14 16:13:24");
        AuditTemplateResponse<List<AuditTemplateData>> response = client.sqlAuditReport(request);
        System.out.println(response.getData());
    }

    //SqlAuditLineChart
    @Test
    public void testSqlAuditLineChart() {
        SqlAuditLineChartRequest request = new SqlAuditLineChartRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        request.setTimeRange("LASTEST_ONE_WEEK");
        request.setStartTime("2021-12-14 16:12:24");
        request.setEndTime("2021-12-14 16:13:24");
        RdsResponse<List<SqlAuditLineChartData>> response = client.sqlAuditLineChart(request);
        System.out.println(response.getData());
    }

    //DescribeAuditHotCount
    @Test
    public void testDescribeAuditHotCount() {
        AuditHotStatisticRequest request = new AuditHotStatisticRequest();
        request.setDBInstanceIdentifier("56575e69-dad4-4dd3-a7db-9f75141e6ac0");
        request.setTimeRange("LASTEST_ONE_WEEK");
        request.setStartTime("2021-12-14 16:12:24");
        request.setEndTime("2021-12-14 16:13:24");
        RdsResponse<List<AuditHotStatisticResponse>> response = client.describeAuditHotCount(request);
        System.out.println(response.getData());

    }
}
