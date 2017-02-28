package com.ksc.cdn.model.log;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import lombok.Data;

import java.text.ParseException;
import java.util.Map;

/**
 * 用于启用、停用某个加速域名的日志服务。
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class DomainLogServiceRequest implements GeneralRequest {

    /**
     * 操作类型，取值为start：启用；stop：停用
     */
    private String ActionType;

    /**
     * 需要启用或停用日志服务的域名ID，支持批量域名开启或停用，多个域名ID用逗号（半角）分隔
     */
    private String DomainIds;

    /**
     * 日志存储粒度，取值为60：按小时粒度存储；1440：按天粒度存储，当前暂不支持按小时粒度存储；开启时为必填，关闭时可不填
     */
    private Long Granularity;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("SetDomainLogService", "2016-09-01", "/2016-09-01/log/SetDomainLogService");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }
}
