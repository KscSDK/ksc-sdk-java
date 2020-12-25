package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class ResourceRequirement {

    /**
     * 资源需求ID
     */
    private String resourceRequirementId;
    /**
     * 主机机型
     */
    private String hostType;
    /**
     * 机房
     */
    private String region;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 服务器需求数量
     */
    private Integer requirementCount;
    /**
     * 实例SN
     */
    private Integer reserveCount;
    /**
     * 远程管理密码
     */
    private String projectName;
    /**
     * 期望交付时间
     */
    private String usageDate;
    /**
     * 备注
     */
    private String description;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 工单进展
     */
    private String progress;


}
