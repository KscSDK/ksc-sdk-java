package com.ksc.cdn.model.domain.domaindetail;


import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/** refer防盗链参数bean
 * Created by jiangran on 9/21/16.
 */
public class ReferProtectionRequest extends ReferProtectionConfig {
    /**
     * 域名ID
     */
    @FieldValidate
    private String DomainId;


    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }


    public Map<String,String> buildParams() throws KscClientException {
        CommonValidUtil.check(this);

        Map<String,String> params=new HashMap<String, String>();

        params.put("DomainId",DomainId);

        params.put("Enable",Enable);

        params.put("ReferType",ReferType);

        if(StringUtils.isNotBlank(ReferList))
            params.put("ReferList",ReferList);

        if(StringUtils.isNotBlank(AllowEmpty))
            params.put("AllowEmpty",AllowEmpty);

        return params;
    }
}
