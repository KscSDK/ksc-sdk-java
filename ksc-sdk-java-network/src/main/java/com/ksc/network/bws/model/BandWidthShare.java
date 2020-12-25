package com.ksc.network.bws.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class BandWidthShare {

    /**
     * 共享带宽创建时间
     */
    private String createTime;
    /**
     * 项目的ID
     */
    private String projectId;
    /**
     * 共享带宽的名称
     */
    private String bandWidthShareName;
    /**
     * 共享带宽的ID
     */
    private String bandWidthShareId;
    /**
     * 共享带宽的链路类型的ID
     */
    private String lineId;
    /**
     * 共享带宽的带宽
     */
    private Integer bandWidth;
    /**
     * 弹性IP的ID
     */
    private List<AssociateBandWidthShareInfo> associateBandWidthShareInfoSet;

    public void addAssociateBandWidthShareInfoSet(AssociateBandWidthShareInfo... associateBandWidthShareInfoSet) {
        if (this.associateBandWidthShareInfoSet == null) {
            this.associateBandWidthShareInfoSet = new com.ksc.internal.SdkInternalList<AssociateBandWidthShareInfo>();
        }
        for (AssociateBandWidthShareInfo value : associateBandWidthShareInfoSet) {
            this.associateBandWidthShareInfoSet.add(value);
        }
    }

}
