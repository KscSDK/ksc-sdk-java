package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnContent;
import com.ksc.cdn.model.content.*;
import com.ksc.cdn.model.enums.RefreAndLoadType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * ContentTest
 * 内容管理单元测试
 * @author jiangran@kingsoft.com
 * @date 2016/12/1
 */
public class ContentTest {
    KscCdnContent client;
    @Before
    public void setup(){
        client=new KscCdnClient("AKTPXI1AeCOGT8GOq1gh5O8Xlw",
                "ONSoVHDBb0IepB879k3Z48J/dkZcdGHqZM/6W/nJBEK+WS4wCkNJFhf2UCbTmgf2Dw==",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-1",
                "cdn");
        /*client=new KscCdnClient("AKTPf-QTNRxOTfOJsue-gZ4Saw",
                "OMmwuYGPZOoc0FtZqRi3Q6aKnIgna5yHoF7VNnQlQhPuyiOYwcI2edmU0DOLpM4fkg==");*/

    }

    /**
     * 刷新文件或目录
     * @throws Exception
     */
    @Test
    public void testAddRefreshFiles() throws Exception {
        RefreshFilesRequest request=new RefreshFilesRequest();
        request.setFiles(Arrays.asList("http://www.cnic.cn/l.html"));//要刷新的文件
        request.setDirs(Arrays.asList("http://www.cnic.cn/l/"));//要刷新的目录
        client.addRefreshFiles(request);
    }

    /**
     * 预加载文件
     * @throws Exception
     */
    @Test
    public void testPreloadFiles() throws Exception{
        PreloadFilesRequest request=new PreloadFilesRequest();
        request.setFiles(Arrays.asList("http://appinstall2.ks3-cn-beijing.ksyun.com/l.html"));//需要预加载的文件
        client.preloadFiles(request);
    }

    /**
     * 查询当前配额
     * @throws Exception
     */
    @Test
    public void testGetQuotaConfig() throws Exception{
        GetQuotaConfigRequest request=new GetQuotaConfigRequest();
        String quotaConfig = client.getQuotaConfig(request);
        Assert.assertNotNull(quotaConfig);
    }

    /**
     * 查询当前配额的使用量
     * @throws Exception
     */
    @Test
    public void testGetQuotaUsageAmount()throws Exception{
        GetQuotaUsageAmountRequest request=new GetQuotaUsageAmountRequest();
        String quotaUsageAmount = client.getQuotaUsageAmount(request);
        Assert.assertNotNull(quotaUsageAmount);
    }

    /**
     * 查询刷新及预加载结果
     * @throws Exception
     */
    @Test
    public void testListInvalidationsByContentPath() throws Exception{
        ListInvalidationsByContentPathRequest request=new ListInvalidationsByContentPathRequest();
        request.setStartTime("1480476366935");//查询开始时间
        request.setEndTime("1480694340000");//查询结束时间
        request.setPageIndex("0");//页码,从0开始
        request.setPageSize("10");//每页大小
        request.setType(RefreAndLoadType.REFREFILE.getType());//查询类型,文件、目录、预加载
        String s = client.listInvalidationsByContentPath(request);
        Assert.assertNotNull(s);
    }
}
