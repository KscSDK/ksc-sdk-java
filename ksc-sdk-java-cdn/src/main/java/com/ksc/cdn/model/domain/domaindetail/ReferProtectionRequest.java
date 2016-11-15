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
public class ReferProtectionRequest {
    @FieldValidate
    private String DomainId;
    /**
     * 配置是否开启或关闭 取值：on、off，默认值为off关闭。开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项目。
     */
    @FieldValidate
    private String Enable;
    /**
     * refer类型，取值：block：黑名单；allow：白名单，开启后必填
     */
    @FieldValidate
    private String ReferType;

    /**
     * 逗号隔开的域名列表
     */
    private String ReferList;
    /**
     * 是否允许空refer访问,取值：on：允许；off：不允许；默认值：on。注：仅当选择白名单时，此项才生效
     */
    private String AllowEmpty;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getReferType() {
        return ReferType;
    }

    public void setReferType(String referType) {
        ReferType = referType;
    }

    public String getReferList() {
        return ReferList;
    }

    public void setReferList(String referList) {
        ReferList = referList;
    }

    public String getAllowEmpty() {
        return AllowEmpty;
    }

    public void setAllowEmpty(String allowEmpty) {
        AllowEmpty = allowEmpty;
    }
    public Map<String,String> buildParams() throws KscClientException {
        CommonValidUtil.check(this);

        Map<String,String> params=new HashMap<String, String>();

        if(StringUtils.isNotBlank(DomainId))
            params.put("DomainId",DomainId);

        if(StringUtils.isNotBlank(Enable))
            params.put("Enable",Enable);

        if(StringUtils.isNotBlank(ReferType))
            params.put("ReferType",ReferType);

        if(StringUtils.isNotBlank(ReferList))
            params.put("ReferList",ReferList);

        if(StringUtils.isNotBlank(AllowEmpty))
            params.put("AllowEmpty",AllowEmpty);

        return params;
    }
}
