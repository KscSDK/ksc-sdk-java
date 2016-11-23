package com.ksc.cdn.model.statistic.hitrate;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.statistic.GeneralRequestParam;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * HitRateRequest
 * <p>
 * 获取域名某一时间段内流量命中率、请求数命中率数据<p>
 * 支持按指定的起止时间查询，两者需要同时指定<p>
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
 * 最多可获取最近一年内93天跨度的数据<p>
 * 说明<p>
 * Hit访问次数=边缘请求数-回源请求数<p>
 * Miss访问次数=回源请求数<p>
 * Hit访问流量=边缘流量-回源流量<p>
 * Miss访问流量=回源流量<p>
 *
 * @author jiangran@kingsoft.com
 * @date 10/11/2016
 */
public class HitRateRequest extends CommonFieldRequest{

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        return super.buildParams();
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetHitRateData","2016-09-01","/2016-09-01/statistics/GetHitRateData");
    }
}
