package com.ksc.live;

import com.ksc.auth.AWSCredentials;
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

    KSCLiveClient live_client = null;
    private String version = "2016-10-26";
    private String uniquename = "maxi";
    private int marker = 0;
    private int limit = 20;
    private String app = "live";
    private String pubdomain = "live.moxiulive.com";


    @Before
    public void setup() {
        AWSCredentials aws = new AWSCredentials() {
            @Override
            public String getAWSAccessKeyId() {
                return "AKLTNZ4r_XpvSOSdAnAmfWEUsg";
            }


            @Override
            public String getAWSSecretKey() {
                return "OKtoHRyb5Em3oFgTFhFN7ypvjot0SRoqTzbQB8eSD2BpUrBgwy3MlHoJC637BhVF1g";
            }

        };
        live_client = new KSCLiveClient(aws);
        live_client.setEndpoint("http://live.api.ksyun.com");

    }

    @Test
    public void testListPubStreamsInfo() {
        GetListRequest request = new GetListRequest();
        request.setVersion(this.version);
        request.setUniquename(this.uniquename);
        request.setApp(this.app);
//        request.setPubdomain(this.pubdomain);
        request.setMarker(this.marker);
        request.setLimit(this.limit);
        LiveResult result = live_client.listPubStreamsInfo(request);
        System.out.println("=============================");
        log.info(result.getCount());
        log.info(result.getErrno());
        log.info(result.getErrmsg());
        log.info(result.getTotal());
        log.info(result.getResult());
        System.out.println("=============================");
    }
}
