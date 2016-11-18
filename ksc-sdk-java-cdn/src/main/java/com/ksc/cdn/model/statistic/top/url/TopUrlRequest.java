package com.ksc.cdn.model.statistic.top.url;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * TopUrlRequest
 * 客户查询单个域名或多个域名的热门Url数据
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
    public Map<String, String> buildParams() throws KscClientException {
        CommonValidUtil.check(this);
        Map<String,String> params= super.buildParams();
        if(StringUtils.isNotBlank(this.getLimitN()))
            params.put("LimitN",this.getLimitN());
        return params;
    }
}
