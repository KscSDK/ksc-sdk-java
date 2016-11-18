package com.ksc.cdn.model.statistic.isp;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;

import java.text.ParseException;
import java.util.Map;

/**
 * IspRequest
 *
 * 获取各运营商流量、访问次数、流量占比、访问次数占比
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class IspRequest extends CommonFieldRequest {
    @Override
    public Map<String, String> buildParams() throws KscClientException,ParseException {
        CommonValidUtil.check(this);
        return super.buildParams();
    }
}
