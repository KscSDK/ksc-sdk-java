package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnStatistics;
import com.ksc.cdn.model.statistic.billing.BillingModeRequest;
import com.ksc.cdn.model.statistic.billing.BillingModeWebResponse;
import com.ksc.cdn.model.statistic.billing.BillingRequest;
import com.ksc.cdn.model.statistic.billing.BillingWebResponse;
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
        cdnClient = new KscCdnClient("AKTP7u5zSo8fS_qHwc9t0c7hsg",
                "OEmaXB9L88DWnq2xPE7PGsQgxBVk+Z3I1KFRFU0dev9CCCV8LwytFFEZCE6rQe5rWQ==",
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
