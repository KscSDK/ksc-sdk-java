package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Disk {

    /**
     * 磁盘类型
     */
    private String diskType;
    /**
     * 系统盘大小，单位G，仅在磁盘类型
     */
    private String systemDiskSpace;
    /**
     * Raid等级
     */
    private String raid;
    /**
     * 磁盘属性
     */
    private String diskAttribute;
    /**
     * 磁盘数量
     */
    private String diskCount;
    /**
     * 磁盘可用容量，单位G
     */
    private String space;


}
