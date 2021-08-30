package com.ksc.bill.billunion;

import com.ksc.auth.BasicAWSCredentials;
import com.ksc.bill.billunion.client.KSCBILLUNIONClient;
import com.ksc.bill.billunion.model.request.InstanceSummaryRequest;
import com.ksc.bill.billunion.model.request.SummaryRequest;
import com.ksc.bill.billunion.model.response.*;
import com.ksc.regions.RegionUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class KSCBILLUNIONClientTest {

    private static final Logger log = Logger.getLogger(KSCBILLUNIONClientTest.class);
    KSCBILLUNIONClient kscbillunionClient;

    @Before
    public void setup() {
        kscbillunionClient = new KSCBILLUNIONClient(new BasicAWSCredentials("ak", "sk"), null);
        kscbillunionClient.setRegion(RegionUtils.getRegion("cn-beijing-6"));
        kscbillunionClient.setEndpoint("http://bill-union.api.ksyun.com");
    }

    /**
     * https://docs.ksyun.com/documents/39112
     */
    @Test
    public void describeBillSummaryByPayMode() {
        SummaryRequest req = new SummaryRequest("2021-06", "2021-06");
        SummaryResponse<PayModeSummaryItem> resp = kscbillunionClient.describeBillSummaryByPayMode(req);
        log.debug(resp);
    }


    /**
     * https://docs.ksyun.com/documents/39113
     */
    @Test
    public void describeBillSummaryByProduct() {
        SummaryRequest req = new SummaryRequest("2021-06", "2021-06");
        SummaryResponse<ProductSummaryItem> resp = kscbillunionClient.describeBillSummaryByProduct(req);
        log.debug(resp);
    }

    /**
     * https://docs.ksyun.com/documents/39114
     */
    @Test
    public void describeBillSummaryByProject() {
        SummaryRequest req = new SummaryRequest("2021-06", "2021-06");
        SummaryResponse<ProjectSummaryItem> resp = kscbillunionClient.describeBillSummaryByProject(req);
        log.debug(resp);
    }

    @Test
    public void describeInstanceSummaryBills() {
        InstanceSummaryRequest req = new InstanceSummaryRequest("2021-06");
        req.setPage(1);
        req.setSize(100);
        InstanceSummaryResponse resp = kscbillunionClient.describeInstanceSummaryBills(req);
        log.debug(resp);
    }

    @Test
    public void describeProductCode() {
        ProductGroupInfoResponse resp = kscbillunionClient.describeProductCode();
        log.debug(resp);
    }
}
