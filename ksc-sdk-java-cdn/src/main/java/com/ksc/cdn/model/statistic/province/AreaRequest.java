package com.ksc.cdn.model.statistic.province;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;

import java.text.ParseException;
import java.util.Map;

/**
 * AreaRequest
 *
 * 获取国内各省份及运营商流量、访问次数、流量占比，请求数占比，海外地区的流量、访问次数、流量占比、请求数占比。
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class AreaRequest extends CommonFieldRequest {
    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        return super.buildParams();
    }
}
