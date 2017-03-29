package com.ksc.cdn.model.statistic.billing;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.statistic.CommonFieldRequest;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JIANGYANG1 on 2017/3/22.
 */
@Setter
@Getter
@ToString(callSuper = true)
public class BillingModeRequest extends CommonFieldRequest {
    /**
     * 产品类型只允许输入一种,下载download,直播live
     * @see com.ksc.cdn.model.enums.CdnTypeEnum
     */
    @FieldValidate
    private String cdnType;

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {

        if(cdnType == null){
            throw new KscClientException(String.format("field %s not null","CdnType"));
        }

        Map params = new HashMap();

        if (StringUtils.isNotBlank(this.getCdnType())) {
            params.put("CdnType", this.getCdnType());
        }
        return params;
    }


    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetBillingMode", "2016-09-01", "/2016-09-01/service/GetBillingMode");
    }
}
