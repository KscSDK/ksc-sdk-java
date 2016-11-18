package com.ksc.cdn.model.statistic.hitrate;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * HitRateRequest
 *
 * @author jiangran@kingsoft.com
 * @date 10/11/2016
 */
public class HitRateRequest extends CommonFieldRequest{

    public Map<String, String> buildParams() throws KscClientException, ParseException {
        CommonValidUtil.check(this);
        return super.buildParams();
    }
}
