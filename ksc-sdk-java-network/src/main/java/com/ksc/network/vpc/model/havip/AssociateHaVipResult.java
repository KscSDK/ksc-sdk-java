
package com.ksc.network.vpc.model.havip;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of AssociateHaVip.
 * </p>
 */
@Data
public class AssociateHaVipResult implements Serializable, Cloneable {

    private String RequestId;

    private Boolean Return;

    @Override
    public AssociateHaVipResult clone() {
        try {
            return (AssociateHaVipResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}