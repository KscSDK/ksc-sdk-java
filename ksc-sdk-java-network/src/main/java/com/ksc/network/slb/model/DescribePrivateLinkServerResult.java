package com.ksc.network.slb.model;


import com.ksc.internal.SdkInternalList;
import lombok.Data;

import java.io.Serializable;

@Data
public class DescribePrivateLinkServerResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<PrivateLinkServer> PrivateLinkServerSet;
    /**
     * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
     */
    private String NextToken;

    public void addPrivateLinkServers(PrivateLinkServer... privateLinkServers) {
        if (this.PrivateLinkServerSet == null) {
            this.PrivateLinkServerSet = new com.ksc.internal.SdkInternalList<PrivateLinkServer>();
        }
        for (PrivateLinkServer privateLinkServer : privateLinkServers) {
            this.PrivateLinkServerSet.add(privateLinkServer);
        }
    }
}
