package com.ksc.cdn.model.statistic.top.refer;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.Map;

/**
 * Created by qichao on 2017/2/27.
 */
public class TopReferRequest extends CommonFieldRequest {

    /**
     * 热门Refer条数，取值为1-200，最大200，默认100
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
        return new GeneralRequestParam("GetTopReferData","2016-09-01","/2016-09-01/statistics/GetTopReferData");
    }

}
