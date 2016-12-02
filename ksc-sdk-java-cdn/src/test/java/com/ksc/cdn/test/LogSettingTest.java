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
     * 查询日志列表
     * @throws Exception
     */
    @Test
    public void testGetLogsetting() throws Exception{
        ListLogSettingsRequest request=new ListLogSettingsRequest();
        request.setPageSize("10");
        request.setPageIndex("0");
        request.setGranularity("1");
        request.setStatus("1");
        request.setType("1");
        ListLogSettingsResult logsetting = client.getLogsetting(request);
        Assert.assertNotNull(logsetting);
        Assert.assertTrue(logsetting.getData().length>0);
    }

    /**
     * 日志更新（创建、开启、关闭）
     * @throws Exception
     */
    @Test
    public void testUpdateLogsetting() throws Exception{
        UpdateLogSettingRequest request=new UpdateLogSettingRequest();
        request.setDomain("cdn.rtmplive.ks-cdn.com");
        request.setGranularity("1");
        request.setStatus("1");
        UpdateLogSettingResult updateLogSettingResult = client.updateLogsetting(request);
        Assert.assertNotNull(updateLogSettingResult);

    }

    /**
     * 删除日志
     * @throws Exception
     */
    @Test
    public void testDeleteLogsetting() throws Exception{
        DeleteLogSettingRequest request=new DeleteLogSettingRequest();
//        request.setDomain("appinstall2.ks3-cn-beijing.ksyun.com");
        request.setDomain("test23.cdn.ksyun.com");
        request.setIds("476406");
        client.deleteLogsetting(request);
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
