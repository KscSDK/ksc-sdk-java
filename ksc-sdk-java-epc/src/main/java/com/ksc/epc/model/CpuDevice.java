package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class CpuDevice {

    /**
     * CPU型号
     */
    private String cpuSpec;


}
