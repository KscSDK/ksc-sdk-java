package com.ksc.network.slb.model;

import lombok.Data;

/**
 * @author: hueason
 * @date: 2021/6/7 15:48
 * @description:
 */
@Data
public class CreatePrivateLinkServerResult {

    private String RequestId;
    private PrivateLinkServer PrivateLinkServer;

    @Override
    public CreatePrivateLinkServerResult clone() {
        try {
            return (CreatePrivateLinkServerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
