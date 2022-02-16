package com.ksc.network.vpc.model.havip;

import lombok.Data;

import java.util.List;

@Data
public class HaVip {
    /**
     * HaVip的id
     */
    private String haVipId;
    /**
     * 子网的ID
     */
    private String subnetId;
    /**
     * HaVip的IP地址
     */
    private String ipAddress;
    /**
     * SlaveNetworkInterfaceIdSet
     */
    private List<String> slaveNetworkInterfaceIdSet;
    /**
     * 与HaVip绑定的主弹性网卡ID
     */
    private String masterNetworkInterfaceId;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * Vpc的ID
     */
    private String vpcId;

    public void adSlaveNetworkInterfaceIdSet(String... slaveNetworkInterfaceId) {
        if (this.slaveNetworkInterfaceIdSet == null) {
            this.slaveNetworkInterfaceIdSet = new com.ksc.internal.SdkInternalList<String>();
        }
        for (String id : slaveNetworkInterfaceId) {
            this.slaveNetworkInterfaceIdSet.add(id);
        }
    }
}
