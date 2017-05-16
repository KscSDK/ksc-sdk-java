package com.ksc.cdn.model.domain.domaindetail;


import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Ip防盗链参数bean
 *
 * @author qichao@kingsoft.com
 * @date 2017/03/06
 */
public class IpProtectionRequest extends IpProtectionConfig {
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

    public Map<String, String> buildParams() throws KscClientException {

        CommonValidUtil.check(this);

        Map<String, String> params = new HashMap<String, String>();

        params.put("DomainId", DomainId);

        params.put("Enable", Enable);

        params.put("IpType", IpType);

        if (StringUtils.isNotBlank(IpList))
            params.put("IpList", IpList);

        return params;
    }
}
