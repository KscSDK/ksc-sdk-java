package com.ksc.network.slb.model;

import lombok.Data;

/**
 * @author: hueason
 * @date: 2021/6/7 17:33
 * @description:
 */
@Data
public class ModifyPrivateLinkServerResult {

    private String RequestId;
    private PrivateLinkServer PrivateLinkServer;

    @Override
    public ModifyPrivateLinkServerResult clone() {
        try {
            return (ModifyPrivateLinkServerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
