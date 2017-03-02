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

    /**
     * 刷新节点上的文件内容。刷新指定URL内容至Cache节点，支持URL、目录批量刷新。
     * <p>
     * 说明：
     * <p>
     * 同一个 ID 每日设有提交刷新类请求条数限制额度，与控制台共享此额度，具体额度可查看控制台或调用GetRefreshOrPreloadQuota接口获取
     * 刷新预热类接口包含 RefreshCaches刷新接口和PreloadCaches 预热接口
     * Files与Dirs必须至少指定一种，可同时指定，即文件刷新和目录刷新可同时进行
     * 注意：
     * <p>
     * 每个 Url 必须以http://或者https://开头
     * 每个 Url 最大长度 1000 字符
     * 每个 Url 所在的域名必须是该用户在金山云加速的域名。
     * Url 如果包含中文字符，请使用urlencode方式提交。
     * 单次调用文件类刷新 Url上限为1000条，目录类刷新 Url 上限为30条
     * 支持Url及目录刷新，不支持正则
     */
    @Test
    public void testRefreshCaches() throws Exception {
        Url[] files = new Url[2];
        files[0] = new Url("http://www.zhaofang360.com/abc.txt");
        files[1] = new Url("http://www.zhaofang360.com/abc1.txt");
        Url[] dirs = new Url[1];
        dirs[0] = new Url("http://www.zhaofang360.com/abc");
        RefreshCachesRequest refreshCachesRequest = new RefreshCachesRequest();
        refreshCachesRequest.setFiles(files);
        refreshCachesRequest.setDirs(dirs);
        RefreshCachesResult result = client.refreshCaches(refreshCachesRequest);
        Assert.assertNotNull(result.getRefreshTaskId());
    }

    /**
     * 将源站的内容主动预热到Cache节点上，用户首次访问可直接命中缓存，缓解源站压力。
     * <p>
     * 说明：
     * <p>
     * 同一个 ID 每日设有提交预热类请求条数限制额度，与控制台共享此额度，具体额度可查看控制台或调用GetRefreshOrPreloadQuota接口获取
     * 刷新预热类接口包含 RefreshCaches刷新接口和PreloadCaches 预热接口
     * 注意：
     * <p>
     * 每个 Url 必须以http://或者https://开头
     * 每个 Url 最大长度 1000 字符
     * 每个 Url 所在的域名必须是该用户在金山云加速的域名。
     * Url 如果包含中文字符
     * 单次调用 Url 上限为1000条
     * 预热仅支持Url，不支持目录预热，不支持正则
     */
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

    /**
     * 用于获取刷新、预热任务进度百分比及状态，查看任务是否在全网生效。
     * <p>
     * 支持根据任务ID、URL获取数据
     * 支持按指定的起止时间查询，两者需要同时指定
     * 所有参数都不指定，默认查7天内，第一页的数据（20条）
     * 起止时间、TaskId、Url可以同时指定，逻辑与的关系
     * 最多可获取7天内的数据
     * 使用场景
     * 查询用户刷新或预热URL进度百分比及状态，查看是否在全网生效，用于在控制台展示
     * 客户通过API获取刷新或预热任务或URL进度百分比及状态，查看是否在全网生效
     */
    @Test
    public void testGetRefreshOrPreloadTask() throws Exception {
        RefreshOrPreloadTaskRequest refreshOrPreloadTaskRequest = new RefreshOrPreloadTaskRequest();
        refreshOrPreloadTaskRequest.setStartTime("2017-02-28T08:00+0800");
        refreshOrPreloadTaskRequest.setEndTime("2017-02-28T18:00+0800");
        RefreshOrPreloadTaskResult result = client.getRefreshOrPreloadTask(refreshOrPreloadTaskRequest);
        Assert.assertNotNull(result);
    }

    /**
     * 获取刷新、预热URL及目录的最大限制数量，及当日剩余刷新、预热URL及目录的条数
     * <p>
     * 说明：
     * 刷新预热类接口包含 RefreshCaches刷新接口和PreloadCaches 预热接口
     */
    @Test
    public void testGetRefreshOrPreloadQuota() throws Exception {
        RefreshOrPreloadQuotaRequest request = new RefreshOrPreloadQuotaRequest();
        RefreshOrPreloadQuotaResult result = client.getRefreshOrPreloadQuota(request);
        Assert.assertNotNull(result);
    }
}
