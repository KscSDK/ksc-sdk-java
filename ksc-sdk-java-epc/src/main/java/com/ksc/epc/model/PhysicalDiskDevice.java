package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class PhysicalDiskDevice {

    /**
     * 硬盘属性
     */
    private String diskAttribute;
    /**
     * 数量
     */
    private String diskCount;
    /**
     * 空间
     */
    private String space;


}
