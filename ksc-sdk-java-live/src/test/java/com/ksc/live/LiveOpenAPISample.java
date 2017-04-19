package com.ksc.live;

import com.ksc.live.model.GetListRequest;
import com.ksc.live.model.LiveResult;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yangfan on 2017/4/19.
 */
public class LiveOpenAPISample {

    private static final Logger log = Logger.getLogger(LiveOpenAPISample.class);

    LiveClient live_client = null;
    private String version = "2016-09-25";

    @Before
    public void setup() {
        live_client = new LiveClient();
        live_client.setEndpoint("https://live.api.ksyun.com");
    }

    @Test
    public void testListPubStreamsInfo() {
        GetListRequest request = new GetListRequest();
        request.setVersion(version);
        LiveResult result = live_client.listPubStreamsInfo(request);
//        log.info("statusCode:" + result.getStatusCode() + ",requestId:" + result.getRequestId() + ",code:" + result.getCode() + ",message:" + result.getMessage());
//        log.info(result);
//        log.info(result.toJsonString());
        log.info(result);
    }
}
