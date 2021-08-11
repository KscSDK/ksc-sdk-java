package com.ksc.network.slb.model;

import lombok.Data;

@Data
public class AcceptPrivateLinkResult {
    /**
     * 请求ID
     */
    private String RequestId;

    /**
     * 操作是否成功
     */
    private Boolean Return;

    @Override
    public AcceptPrivateLinkResult clone() {
        try {
            return (AcceptPrivateLinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
