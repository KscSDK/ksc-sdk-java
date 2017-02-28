package com.ksc.cdn.model.statistic.top.ip;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * 本接口用于获取域名某天内某一时段的TOP IP访问数据，仅包含Top 200且访问次数大于15次的独立请求的IP的访问次数、访问流量，并按次数排序
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔
 * 最多可获取最近一年内24小时跨度的数据
 * 时效性：30分钟延迟
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class TopIpRequest extends CommonFieldRequest {

    /**
     * 独立请求的IP数，取值为1-200，最大200，默认100
     */
    private String LimitN;

    public String getLimitN() {
        return LimitN;
    }

    public void setLimitN(String limitN) {
        LimitN = limitN;
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        Map<String, String> params = super.buildParams();
        if (StringUtils.isNotBlank(this.getLimitN()))
            params.put("LimitN", this.getLimitN());
        return params;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetTopIpData", "2016-09-01", "/2016-09-01/statistics/GetTopIpData");
    }
}
