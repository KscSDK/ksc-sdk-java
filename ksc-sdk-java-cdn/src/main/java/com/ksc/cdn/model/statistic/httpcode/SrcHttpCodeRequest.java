package com.ksc.cdn.model.statistic.httpcode;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;

import java.text.ParseException;
import java.util.Map;

/**
 * 获取域名一段时间内的回源Http状态码访问次数及占比数据
 * 支持按指定的起止时间查询，两者需要同时指定
 * 支持批量域名查询，多个域名ID用逗号（半角）分隔
 * 最多可获取最近一年内93天跨度的数据
 * 时效性：5分钟延迟
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class SrcHttpCodeRequest extends CommonFieldRequest {

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        return super.buildParams();
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetSrcHttpCodeData", "2016-09-01", "/2016-09-01/statistics/GetSrcHttpCodeData");
    }
}
