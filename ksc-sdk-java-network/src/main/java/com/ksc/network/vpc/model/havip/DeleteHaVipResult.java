
package com.ksc.network.vpc.model.havip;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DeleteHaVip.
 * </p>
 */
@Data
public class DeleteHaVipResult implements Serializable, Cloneable {

    private String RequestId;

    private Boolean Return;

    @Override
    public DeleteHaVipResult clone() {
        try {
            return (DeleteHaVipResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}