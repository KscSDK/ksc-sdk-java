package com.ksc.network.slb.model;


import com.ksc.internal.SdkInternalList;
import lombok.Data;

import java.io.Serializable;

@Data
public class ListPrivateLinkServerResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<PrivateLink> PrivateLinkSet;
    /**
     * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
     */
    private String NextToken;

    public void addPrivateLinks(PrivateLink... privateLinks) {
        if (this.PrivateLinkSet == null) {
            this.PrivateLinkSet = new SdkInternalList<PrivateLink>();
        }
        for (PrivateLink privateLink : privateLinks) {
            this.PrivateLinkSet.add(privateLink);
        }
    }
}
