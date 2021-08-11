package com.ksc.network.slb.model;

import lombok.Data;

@Data
public class RemovePrivateLinkResult {
    /**
     * 请求ID
     */
    private String RequestId;

    /**
     * 操作是否成功
     */
    private Boolean Return;

    @Override
    public RemovePrivateLinkResult clone() {
        try {
            return (RemovePrivateLinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
