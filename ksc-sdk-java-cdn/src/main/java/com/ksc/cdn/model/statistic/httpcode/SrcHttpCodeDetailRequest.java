package com.ksc.cdn.model.statistic.httpcode;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * 获取域名的回源Http状态码详细访问次数及占比数据（用于绘制状态码线图）
 * 支持按指定的起止时间查询，两者需要同时指定
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔
 * 最多可获取最近一年内93天跨度的数据
 * 统计粒度：5分钟粒度；10分钟粒度；20分钟粒度；1小时粒度；4小时粒度；8小时粒度；1天粒度，以上统计粒度均取该粒度内各状态码的访问次数之和
 * 时效性：5分钟延迟
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class SrcHttpCodeDetailRequest extends CommonFieldRequest {

    /**
     * 统计粒度，取值为 5（默认）：5分钟粒度；10：10分钟粒度；20：20分钟粒度；60：1小时粒度；240：4小时粒度；480：8小时粒度；1440：1天粒度
     */
    private String Granularity;
    /**
     * 取值为0：多域名数据做合并；1：每个域名的数据分别返回
     *
     * @see com.ksc.cdn.model.enums.ResultTypeEnum
     */
    @FieldValidate
    private String ResultType;

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        Map<String, String> params = super.buildParams();
        params.put("ResultType", this.getResultType());
        if (StringUtils.isNotBlank(this.getGranularity())) {
            params.put("Granularity", this.getGranularity());
        } else {
            params.put("Granularity", getGranularity(this.getStartTime(), this.getEndTime()));
        }
        return params;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetSrcHttpCodeDetailedData", "2016-09-01", "/2016-09-01/statistics/GetSrcHttpCodeDetailedData");
    }

    public String getGranularity() {
        return Granularity;
    }

    public void setGranularity(String granularity) {
        Granularity = granularity;
    }

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String resultType) {
        ResultType = resultType;
    }
}
