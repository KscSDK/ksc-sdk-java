package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.KscCdnLog;
import com.ksc.cdn.model.enums.ActionTypeEnum;
import com.ksc.cdn.model.log.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * LogSettingTest
 * 日志管理单元测试
 *
 * @author jiangran@kingsoft.com
 * @date 2016/12/1
 */
public class LogTest {

    KscCdnLog client;

    @Before
    public void setup() {
        client = new KscCdnClient("your ak",
                "your sk",
                "http://cdn.api.ksyun.com",
                "cn-shanghai-1",
                "cdn");

    }

    /**
     * 获取指定域名的原始访问日志的下载地址。
     */
    @Test
    public void testGetDomainLogs() throws Exception {
        DomainLogsRequest request = new DomainLogsRequest();
        request.setDomainId("2D09NK5");
        DomainLogsResult result = client.getDomainLogs(request);
        Assert.assertNotNull(result);
    }

    /**
     * 用于启用、停用某个加速域名的日志服务。
     */
    @Test
    public void testSetDomainLogService() throws Exception {
        DomainLogServiceRequest request = new DomainLogServiceRequest();
        request.setDomainIds("2D09NK5");
        request.setActionType(ActionTypeEnum.START);
        request.setGranularity(60L);
        client.setDomainLogService(request);
    }

    /**
     * 获取域名日志服务状态
     */
    @Test
    public void testGetDomainLogServiceStatus() throws Exception {
        DomainLogServiceStatusRequest request = new DomainLogServiceStatusRequest();
        request.setDomainIds("2D09NK5");
        DomainLogServiceStatusResult result = client.getDomainLogServiceStatus(request);
        Assert.assertNotNull(result);
    }
}
