package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.model.domain.ipcheck.IpCheckRequest;
import com.ksc.cdn.model.domain.ipcheck.IpCheckResponse;
import org.junit.Before;
import org.junit.Test;

public class IpCheckTest {

    KscCdnClient client;

    @Before
    public void setup() {
        client = new KscCdnClient("",
                "",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-2",
                "cdn");
    }

    @Test
    public void testIpCheck() throws Exception {
        IpCheckRequest request = new IpCheckRequest();
        request.setIp("1.1.1.1");
        IpCheckResponse result = client.ipCheck(request);
        System.out.println(result.getCdnIp());
    }
}
