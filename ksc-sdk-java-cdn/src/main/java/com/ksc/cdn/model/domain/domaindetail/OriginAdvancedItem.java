package com.ksc.cdn.model.domain.domaindetail;

import com.ksc.cdn.model.valid.FieldValidate;

/**
 * OriginAdvancedItem
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class OriginAdvancedItem {
    /**
     * 源站线路，取值: default：默认源； un： 联通源; ct: 电信源; cm: 移动源。
     */
    @FieldValidate
    private String OriginLine;
    /**
     * 回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入。
     */
    @FieldValidate
    private String Origin;

    public String getOriginLine() {
        return OriginLine;
    }

    public void setOriginLine(String originLine) {
        OriginLine = originLine;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }
}
