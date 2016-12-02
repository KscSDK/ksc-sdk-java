package com.ksc.cdn.model.statistic.top.url;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.CommonValidUtil;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * TopUrlRequest
 * <p>
 * 获取单个域名或多个域名某天内某一时段的TOP Url访问数据，仅包含Top200且访问次数大于15次的 Url的访问次数、访问流量，并按次数排序<p>
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔<p>
 * 最多可获取最近一年内一天跨度的数据<p>
 * 时效性：30分钟延迟<p>
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class TopUrlRequest extends CommonFieldRequest{
    /**
     * 热门Url条数，取值为1-200，最大200，默认100
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
        Map<String,String> params= super.buildParams();
        if(StringUtils.isNotBlank(this.getLimitN()))
            params.put("LimitN",this.getLimitN());
        return params;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetTopUrlData","2016-09-01","/2016-09-01/statistics/GetTopUrlData");
    }
}
