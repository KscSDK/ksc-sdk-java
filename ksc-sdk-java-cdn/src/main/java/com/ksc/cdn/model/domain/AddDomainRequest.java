package com.ksc.cdn.model.domain;

import com.ksc.cdn.model.valid.FieldValidate;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/** 添加域名基础信息参数bean
 * Created by jiangran on 9/18/16.
 */
public class AddDomainRequest {
    @FieldValidate
    private String DomainName;
    /**
     * 加速域名的产品类型,取值
     * @see com.ksc.cdn.model.enums.CdnTypeEnum
     */
    @FieldValidate
    private String CdnType;
    /**
     * 加速业务子类型（业务子类型是为了细分业务，默认不填写）
     */
    private String CdnSubType;
    /**
     * 取值参考
     * @see com.ksc.cdn.model.enums.CdnProtocolEnum
     */
    @FieldValidate
    private String CdnProtocol;
    /**
     * 加速区域，默认CN， 可以输入多个，以逗号间隔。
     */
    private String Regions;
    /**
     * 源站类型 取值参考
     * @see com.ksc.cdn.model.enums.OriginTypeEnum
     */
    @FieldValidate
    private String OriginType;
    /**
     * 取值参考
     * @see com.ksc.cdn.model.enums.CdnProtocolEnum
     */
    @FieldValidate
    private String OriginProtocol;
    /**
     * 可以指定 443, 80。默认值80。443的话走https回源。
     */
    private Integer OriginPort;
    /**
     * 回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入
     */
    @FieldValidate
    private String Origin;

    public String getDomainName() {
        return DomainName;
    }

    public void setDomainName(String domainName) {
        DomainName = domainName;
    }

    public String getCdnType() {
        return CdnType;
    }

    public void setCdnType(String cdnType) {
        CdnType = cdnType;
    }

    public String getCdnSubType() {
        return CdnSubType;
    }

    public void setCdnSubType(String cdnSubType) {
        CdnSubType = cdnSubType;
    }

    public String getCdnProtocol() {
        return CdnProtocol;
    }

    public void setCdnProtocol(String cdnProtocol) {
        CdnProtocol = cdnProtocol;
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

    public String getOriginProtocol() {
        return OriginProtocol;
    }

    public void setOriginProtocol(String originProtocol) {
        OriginProtocol = originProtocol;
    }

    public Integer getOriginPort() {
        return OriginPort;
    }

    public void setOriginPort(Integer originPort) {
        OriginPort = originPort;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }
    public Map<String,String> buildParams(){
        Map<String,String> params=new HashMap<String, String>();

        if(StringUtils.isNotBlank(DomainName))
            params.put("DomainName",DomainName);
        if(StringUtils.isNotBlank(CdnType))
            params.put("CdnType",CdnType);
        if(StringUtils.isNotBlank(CdnSubType))
            params.put("CdnSubType",CdnSubType);
        if(StringUtils.isNotBlank(CdnProtocol))
            params.put("CdnProtocol",CdnProtocol);
        if(StringUtils.isNotBlank(Regions))
            params.put("Regions",Regions);
        if(StringUtils.isNotBlank(OriginType))
            params.put("OriginType",OriginType);
        if(StringUtils.isNotBlank(OriginProtocol))
            params.put("OriginProtocol",OriginProtocol);
        if(OriginPort!=null&&OriginPort>0)
            params.put("OriginPort",String.valueOf(OriginPort));
        if(StringUtils.isNotBlank(Origin))
            params.put("Origin",Origin);

        return params;
    }
    private void validField(){

    }
}
