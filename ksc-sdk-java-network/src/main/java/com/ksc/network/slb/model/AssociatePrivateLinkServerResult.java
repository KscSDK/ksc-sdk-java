package com.ksc.network.slb.model;

import lombok.Data;


@Data
public class AssociatePrivateLinkServerResult {

    private String RequestId;
    private PrivateLink PrivateLink;

    @Override
    public AssociatePrivateLinkServerResult clone() {
        try {
            return (AssociatePrivateLinkServerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
