package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnLogSetting;
import com.ksc.cdn.model.logsetting.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * LogSettingTest
 * 日志管理单元测试
 * @author jiangran@kingsoft.com
 * @date 2016/12/1
 */
public class LogSettingTest {
    KscCdnLogSetting client;
    @Before
    public void setup(){
        client=new KscCdnClient("AKTPsQVsb82QRs2dmRfZR0mYuA",
                "OLnZ7H7JZpTiJTgBC847I5lETIB7j64uTSGCgooLxDSY+Bn5RzyTu7fRLe4Mtps8Gw==",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-1",
                "cdn");
        /*client=new KscCdnClient("AKTPf-QTNRxOTfOJsue-gZ4Saw",
                "OMmwuYGPZOoc0FtZqRi3Q6aKnIgna5yHoF7VNnQlQhPuyiOYwcI2edmU0DOLpM4fkg==");*/

    }

    /**
     * 日志下载
     * @throws Exception
     */
    @Test
    public void testDownloadLogsetting() throws Exception{
        DownloadLogSettingRequest request=new DownloadLogSettingRequest();
        request.setDomain("test.dxz.ksyun.8686c.com");
        DownloadLogSettingResult downloadLogSettingResult = client.downloadLogsetting(request);
        Assert.assertNotNull(downloadLogSettingResult);
    }
}
