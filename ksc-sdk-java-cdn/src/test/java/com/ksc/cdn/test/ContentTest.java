package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnContent;
import com.ksc.cdn.model.content.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * ContentTest
 * 内容管理单元测试
 *
 * @author jiangran@kingsoft.com
 * @date 2016/12/1
 */
public class ContentTest {

    KscCdnContent client;

    @Before
    public void setup() {
        client = new KscCdnClient("AKTP3JFhAZ1pSv6oZXTmwMwwig",
                "OMYiBs3IPxzhIH7SSJazuMLUtAq5qrloJ5On48dZb1xtVdhL0AyaJd2UYI3ZPoVDZA==",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-1",
                "cdn");
    }

    @Test
    public void testRefreshCaches() throws Exception {
        Url[] files = new Url[2];
        files[0] = new Url("http://www.zhaofang360.com/abc.txt");
        files[1] = new Url("http://www.zhaofang360.com/abc1.txt");
        RefreshCachesRequest refreshCachesRequest = new RefreshCachesRequest();
        refreshCachesRequest.setFiles(files);
        RefreshCachesResult result = client.refreshCaches(refreshCachesRequest);
        Assert.assertNotNull(result.getRefreshTaskId());
    }

    @Test
    public void testPreloadCaches() throws Exception {
        Url[] files = new Url[2];
        files[0] = new Url("http://www.zhaofang360.com/abc.txt");
        files[1] = new Url("http://www.zhaofang360.com/abc1.txt");
        PreloadCachesRequest preloadCachesRequest = new PreloadCachesRequest();
        preloadCachesRequest.setUrls(files);
        PreloadCachesResult result = client.preloadCaches(preloadCachesRequest);
        Assert.assertNotNull(result.getPreloadTaskId());
    }

    @Test
    public void testGetRefreshOrPreloadTask() throws Exception {
        RefreshOrPreloadTaskRequest refreshOrPreloadTaskRequest = new RefreshOrPreloadTaskRequest();
        refreshOrPreloadTaskRequest.setStartTime("2017-02-28T08:00+0800");
        refreshOrPreloadTaskRequest.setEndTime("2017-02-28T18:00+0800");
        RefreshOrPreloadTaskResult result = client.getRefreshOrPreloadTask(refreshOrPreloadTaskRequest);
        Assert.assertNotNull(result);
    }

    @Test
    public void testGetRefreshOrPreloadQuota() throws Exception {
        RefreshOrPreloadQuotaRequest request = new RefreshOrPreloadQuotaRequest();
        RefreshOrPreloadQuotaResult result = client.getRefreshOrPreloadQuota(request);
        Assert.assertNotNull(result);
    }
}
