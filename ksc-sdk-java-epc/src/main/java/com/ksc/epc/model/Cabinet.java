package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
public class Cabinet {

    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 机柜名称
     */
    private String cabinetName;
    /**
     * 机柜类型
     */
    private String cabinetType;
    /**
     * 机柜ID
     */
    private String cabinetId;
    /**
     * 项目ID
     */
    private String projectId;


}
