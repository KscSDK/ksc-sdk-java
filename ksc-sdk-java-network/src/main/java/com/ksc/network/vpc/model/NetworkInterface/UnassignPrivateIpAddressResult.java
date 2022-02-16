
package com.ksc.network.vpc.model.NetworkInterface;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of UnassignPrivateIpAddress.
 * </p>
 */
@Data
public class UnassignPrivateIpAddressResult implements Serializable, Cloneable {

	private String RequestId;

	private Boolean Return;

    @Override
    public UnassignPrivateIpAddressResult clone() {
        try {
            return (UnassignPrivateIpAddressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}