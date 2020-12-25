package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Accessory {

    /**
     * 配件ID
     */
    private String accessoryId;
    /**
     * 配件售卖方式
     */
    private String accessorySalesType;
    /**
     * 配件类型
     */
    private String accessoryType;
    /**
     * 配件规格
     */
    private String accessorySuit;
    /**
     * 配件描述
     */
    private String accessoryDescription;
    /**
     * 所属实例ID
     */
    private String hostId;
    /**
     * 所属实例名称
     */
    private String hostName;
    /**
     * 所属实例SN
     */
    private String sn;
    /**
     * 配件名称
     */
    private String accessoryName;
    /**
     * 可用区名称
     */
    private String availabilityZone;
    /**
     * 状态
     */
    private String status;
    /**
     * 项目ID
     */
    private String projectId;
    /**
     * 创建时间
     */
    private String createTime;


}
