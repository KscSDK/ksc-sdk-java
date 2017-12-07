package com.ksc.cdn.model.domain.domainbase;


import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.valid.CommonValidUtil;
import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/** 更新域名基础信息参数
 * Created by jiangran on 9/18/16.
 */
public class ModifyDomainRequest {


    /**
     * 域名ID
     */
    @FieldValidate
    private String DomainId;
    /**
     * 加速区域，默认CN， 可以输入多个，以逗号间隔
     */
    private String Regions;
    /**
     * 源站类型
     * @see com.ksc.cdn.model.enums.OriginTypeEnum
     */
    private String OriginType;
    /**
     * 可以指定 443, 80。默认值80
     */
    private String OriginPort;
    /**
     * 回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入。 （此项目输入，必须保证符合OriginType）
     */
    private String Origin;

    private String SearchUrl;

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

    public String getSearchUrl() {
        return SearchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        SearchUrl = searchUrl;
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

        if(StringUtils.isNotBlank(SearchUrl))
            params.put("SearchUrl",SearchUrl);

        return params;
    }
}
