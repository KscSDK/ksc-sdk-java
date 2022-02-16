
package com.ksc.network.vpc.model.havip;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of UnAssociateHaVip.
 * </p>
 */
@Data
public class UnAssociateHaVipResult implements Serializable, Cloneable {

    private String RequestId;

    private Boolean Return;

    @Override
    public UnAssociateHaVipResult clone() {
        try {
            return (UnAssociateHaVipResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}