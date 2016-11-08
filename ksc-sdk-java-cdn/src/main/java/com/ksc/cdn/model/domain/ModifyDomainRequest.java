package com.ksc.cdn.model.domain;


import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/** 更新域名基础信息参数bean
 * Created by jiangran on 9/18/16.
 */
public class ModifyDomainRequest {

    @FieldValidate
    private String DomainId;

    private String Regions;
    private String OriginType;
    private String OriginPort;
    private String Origin;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public String getOriginType() {
        return OriginType;
    }

    public void setOriginType(String originType) {
        OriginType = originType;
    }

    public String getOriginPort() {
        return OriginPort;
    }

    public void setOriginPort(String originPort) {
        OriginPort = originPort;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public Map<String,String> buildParams() throws KscClientException {
        CommonValidUtil.check(this);

        Map<String,String> params=new HashMap<String, String>();

        if(StringUtils.isNotBlank(DomainId))
            params.put("DomainId",DomainId);

        if(StringUtils.isNotBlank(Regions))
            params.put("Regions",Regions);

        if(StringUtils.isNotBlank(OriginType))
            params.put("OriginType",OriginType);

        if(StringUtils.isNotBlank(OriginPort))
            params.put("OriginPort",OriginPort);

        if(StringUtils.isNotBlank(Origin))
            params.put("Origin",Origin);

        return params;
    }
}
