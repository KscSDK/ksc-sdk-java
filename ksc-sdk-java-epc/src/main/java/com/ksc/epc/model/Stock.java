package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Stock {

    /**
     * 机型
     */
    private String hostType;
    /**
     * 数量
     */
    private Integer instanceCount;
    /**
     * 可用区
     */
    private String availabilityZone;


}
