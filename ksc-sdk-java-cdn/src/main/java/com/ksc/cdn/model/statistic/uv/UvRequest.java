package com.ksc.cdn.model.statistic.uv;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * 获取域名独立请求的IP个数，单位：个
 * 支持按指定的起止时间查询，两者需要同时指定
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔
 * 最多可获取最近一年内31天跨度的数据
 * 统计粒度：5分钟粒度
 * 时效性：30分钟延迟
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class UvRequest extends CommonFieldRequest {

    /**
     * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
     */
    @FieldValidate
    private String resultType;

    /**
     * 统计粒度，取值为 5（默认）：5分钟粒度；
     */
    private String granularity;

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {

        CommonValidUtil.check(this);

        Map params = super.buildParams();

        if (StringUtils.isNotBlank(this.getResultType()))
            params.put("ResultType", this.getResultType());

        if (StringUtils.isNotBlank(this.getGranularity())) {
            params.put("Granularity", this.getGranularity());
        }

        return params;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetUvData", "2016-09-01", "/2016-09-01/statistics/GetUvData");
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }
}
