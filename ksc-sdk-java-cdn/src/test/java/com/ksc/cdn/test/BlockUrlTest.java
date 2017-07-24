package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.model.domain.blockurl.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * description：一键屏蔽url单元测试
 * author：YANGXUEYI
 * date: 2017/7/18
 * mail：yangxueyi@kingsoft.com
 */
public class BlockUrlTest {

    KscCdnClient client;

    @Before
    public void setup() {
        client = new KscCdnClient("AKLTak2xkznHTVSs7a-8klJWug",
                "OEZTydYQ7suCyRwmv+s5L89g7gpNvB3PxJmPvxw3MXLIe6/N8Hsm8aXKPXD5+VvCKQ==",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-2",
                "cdn");
    }


    @Test
    public void testBlockDomainUrl() throws Exception {
        BlockDomainUrlRequest request = new BlockDomainUrlRequest();
        request.setBlockTime(3600L);
        request.setBlockType("block");
        List<TaskUrl> urls = new ArrayList<TaskUrl>();
        TaskUrl url1 = new TaskUrl();
        url1.setUrl("http://v6.365yg.com/video/m/220dffb44d4bcfe4473b44169b14e1575d911487f30000375a9b6a2f42/");
        urls.add(url1);
        request.setUrls(urls);
        request.setRefreshOnUnblock("off");
        client.blockDomainUrl(request);
    }

    /**
     * 获取屏蔽URL任务进度百分比及状态，查看任务是否在全网生效。
     * @throws Exception
     */
    @Test
    public void testGetBlockUrlTask() throws Exception {
        GetBlockUrlTaskRequest request = new GetBlockUrlTaskRequest();
        request.setPageNumber(1L);
        request.setPageSize(5L);
        GetBlockUrlTaskResponse response = client.getBlockUrlTask(request);
        Assert.assertNotNull(response);
    }

    /**
     * 获取屏蔽URL最大限制数量，及剩余的条数
     * @throws Exception
     */
    @Test
    public void testGetBlockUrlQuota() throws Exception {
        GetBlockUrlQuotaResponse response = client.getBlockUrlQuota();
        Assert.assertNotNull(response);
    }
}
