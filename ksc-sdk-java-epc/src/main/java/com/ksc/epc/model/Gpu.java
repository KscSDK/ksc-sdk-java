package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Gpu {

    /**
     * GPU型号
     */
    private String model;
    /**
     * 显存大小，此参数新版本后展示为None
     */
    private String frequence;
    /**
     * CUDA核心数，此参数新版本后展示为None
     */
    private Integer count;
    /**
     * 计算能力，此参数新版本后展示为None
     */
    private Integer coreCount;
    /**
     * GPU的数量
     */
    private Integer gpuCount;


}
