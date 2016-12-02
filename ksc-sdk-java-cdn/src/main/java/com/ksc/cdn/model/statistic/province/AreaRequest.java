package com.ksc.cdn.model.statistic.province;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.CommonValidUtil;

import java.text.ParseException;
import java.util.Map;

/**
 * AreaRequest
 * <p>
 * 获取国内各省份及运营商流量、访问次数、流量占比，请求数占比，海外地区的流量、访问次数、流量占比、请求数占比。<p>
 * 支持按指定的起止时间查询，两者需要同时指定<p>
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
 * 最多可获取最近一年内93天跨度的数据<p>
 * 说明<p>
 * 运营商包含：电信、联通、移动、铁通、鹏博士、教育网、其他、海外ISP<p>
 * 地区包含：国内32个省、香港、台湾、澳门、其他海外地区统一合并为海外<p>
 * @author jiangran@kingsoft.com
 * @date 2016/11/18
 */
public class AreaRequest extends CommonFieldRequest {
    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        return super.buildParams();
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetAreaData","2016-09-01","/2016-09-01/statistics/GetAreaData");
    }
}
