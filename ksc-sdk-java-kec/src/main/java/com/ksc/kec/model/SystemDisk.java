package com.ksc.kec.model;

import lombok.Data;

@Data
public class SystemDisk {

    /**
     * <p>
     * 系统盘类型，取值范围：
     *
     * Local_SSD：本地SSD硬盘
     * SSD3.0：SSD云硬盘3.0
     * EHDD：高效云盘
     *
     * 类型：String
     * 是否可缺省：是
     * </p>
     */
    private String DiskType;

    /**
     * <p>
     * 系统盘大小
     * </p>
     */
    private Integer DiskSize;

}
