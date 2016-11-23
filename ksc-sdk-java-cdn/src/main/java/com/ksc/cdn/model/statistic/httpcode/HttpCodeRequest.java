package com.ksc.cdn.model.statistic.httpcode;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.statistic.GeneralRequestParam;
import com.ksc.cdn.model.valid.CommonValidUtil;

import java.text.ParseException;
import java.util.Map;

/**
 * HttpCodeRequest
 * <p>
 * 客户查询单个域名或多个域名一段时间内各状态码访问次数<p>
 * 支持按指定的起止时间查询，两者需要同时指定<p>
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
 * 最多可获取最近三年内93天跨度的数据<p>
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class HttpCodeRequest extends CommonFieldRequest {
    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        return super.buildParams();
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetHttpCodeData","2016-09-01","/2016-09-01/statistics/GetHttpCodeData");
    }
}
