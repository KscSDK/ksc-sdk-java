package com.ksc.cdn.model.enums;

import lombok.Getter;

/**
 * Created by CrazyHorse on 8/23/16.
 * openAPI 带宽数据返回类型
 * 0:多域名多计费区域数据做合并
 * 1：每个域名每个计费区域的数据分别返回
 */
@Getter
public enum ResultTypeEnum {

    MERGE("0", "合并返回"),
    ALONE("1", "分别返回");

    private String code;

    private String value;

    ResultTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
