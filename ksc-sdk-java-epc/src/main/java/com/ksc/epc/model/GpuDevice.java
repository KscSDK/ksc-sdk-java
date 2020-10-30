package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class GpuDevice {

    /**
     * GPU型号
     */
    private String gpuModel;
    /**
     * 数量
     */
    private String gpuCount;


}
