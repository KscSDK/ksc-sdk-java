package com.ksc.cdn.model.statistic.httpcode;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;

import java.util.Map;

/**
 * HttpCodeRequest
 *
 * 客户查询单个域名或多个域名一段时间内各状态码访问次数
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class HttpCodeRequest extends CommonFieldRequest {
    @Override
    public Map<String, String> buildParams() throws KscClientException {
        CommonValidUtil.check(this);
        return super.buildParams();
    }
}
