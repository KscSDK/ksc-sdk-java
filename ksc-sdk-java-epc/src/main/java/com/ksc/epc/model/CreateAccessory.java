package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class CreateAccessory {

    /**
     * 配件类型
     */
    private String accessoryType;
    /**
     * 配件规格
     */
    private String accessorySuit;
    /**
     * 配件名称
     */
    private String accessoryName;
    /**
     * 计费类型
     */
    private String chargeType;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 购买时长
     */
    private Integer purchaseTime;
    /**
     * 项目ID
     */
    private String projectId;


}
