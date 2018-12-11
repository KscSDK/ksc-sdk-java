package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnStatistics;
import com.ksc.cdn.model.statistic.billing.BillingModeRequest;
import com.ksc.cdn.model.statistic.billing.BillingModeWebResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JIANGYANG1 on 2017/3/27.
 */
public class ServiceTest {
    KscCdnStatistics cdnClient;

    @Before
    public void setup() {
        cdnClient = new KscCdnClient("your ak",
                "your sk",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-1",
                "cdn");
    }
    /**
       获取用户当前的计费方式。
       支持按产品类型查询
       使用场景：
       客户查询当前时刻用户维度下各产品类型的计费方式
     */
    @Test
    public void testGetBillingMode() throws Exception{
        BillingModeRequest request= new BillingModeRequest();
        request.setCdnType("live");
        BillingModeWebResponse result = (BillingModeWebResponse) cdnClient.generalGetStatisticsData(request, BillingModeWebResponse.class);
        Assert.assertNotNull(result);
    }
}
