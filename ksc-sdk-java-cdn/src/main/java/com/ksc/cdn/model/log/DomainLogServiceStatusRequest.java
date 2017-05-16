package com.ksc.cdn.model.log;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;

import java.text.ParseException;
import java.util.Map;

/**
 * 获取域名日志服务状态。
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class DomainLogServiceStatusRequest implements GeneralRequest {

    /**
     * 需要查询日志服务的域名ID，支持批量域名查询，多个域名ID用逗号（半角）分隔
     */
    private String DomainIds;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetDomainLogServiceStatus", "2016-09-01", "/2016-09-01/log/GetDomainLogServiceStatus");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
    }
}
