package com.ksc.kec.model;

import lombok.Data;

@Data
public class Sort {

    /**
     * <p>
     * 筛选名称，大小写敏感
     * 类型: String
     * 是否可缺省: 否
     * </p>
     */
    private String name;

    /**
     * <p>
     * 筛选值
     * 类型: String 列表
     * 有效值：ASC(正序排列) | DESC(倒序排列)
     * 是否可缺省: 否
     * </p>
     */
    private String value;

}
