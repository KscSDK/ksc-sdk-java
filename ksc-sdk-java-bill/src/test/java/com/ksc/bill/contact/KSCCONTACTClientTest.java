package com.ksc.bill.contact;

import com.ksc.auth.BasicAWSCredentials;
import com.ksc.bill.contact.client.KSCCONTACTClient;
import com.ksc.bill.contact.model.ContactResponse;
import com.ksc.bill.contact.model.MailRequest;
import com.ksc.bill.contact.model.MailResult;
import com.ksc.regions.RegionUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class KSCCONTACTClientTest {

    private static final Logger log = Logger.getLogger(KSCCONTACTClientTest.class);
    KSCCONTACTClient kscContactClient;

    @Before
    public void setup() {
        kscContactClient = new KSCCONTACTClient(new BasicAWSCredentials("ak", "sk"), null);
        kscContactClient.setRegion(RegionUtils.getRegion("cn-beijing-6"));
        kscContactClient.setEndpoint("http://contact.api.ksyun.com");
    }

    @Test
    /**
     *
     * https://docs.ksyun.com/documents/40148
     */
    public void queryMailInList() {
        MailRequest req = new MailRequest("2021-01-01 00:00:00", "2021-06-01 00:00:00");
        req.setPageNumber(1);
        req.setPageSize(10);
        ContactResponse<MailResult> result = kscContactClient.queryMailInList(req);
        log.debug(result.getData());
    }
}
