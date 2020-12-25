package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Inspection {

    /**
     * 实例ID
     */
    private String hostId;
    /**
     * Sn
     */
    private String sn;
    /**
     * 机房
     */
    private String region;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 告警状态
     */
    private String status;
    /**
     * 告警类型
     */
    private String alarmType;
    /**
     * 告警描述
     */
    private String alarmDescription;
    /**
     * 创建时间
     */
    private String createTime;


}
