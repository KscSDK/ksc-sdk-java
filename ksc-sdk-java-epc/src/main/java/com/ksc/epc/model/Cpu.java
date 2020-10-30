package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Cpu {

    /**
     * CPU型号
     */
    private String model;
    /**
     * CPU主频，此参数新版本后展示为None
     */
    private String frequence;
    /**
     * CPU个数
     */
    private Integer count;
    /**
     * CPU核数
     */
    private Integer coreCount;


}
