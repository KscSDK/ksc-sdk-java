
package com.ksc.network.vpc.model.havip;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateHaVip.
 * </p>
 */
@Data
public class CreateHaVipResult implements Serializable, Cloneable {

	private String requestId;

	private HaVip haVip;

    @Override
    public CreateHaVipResult clone() {
        try {
            return (CreateHaVipResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}