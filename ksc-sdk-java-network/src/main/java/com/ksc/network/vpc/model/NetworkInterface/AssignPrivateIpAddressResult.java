
package com.ksc.network.vpc.model.NetworkInterface;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of AssignPrivateIpAddress.
 * </p>
 */
@Data
public class AssignPrivateIpAddressResult implements Serializable, Cloneable {

	private String RequestId;

	private NetworkInterface networkInterface;

    @Override
    public AssignPrivateIpAddressResult clone() {
        try {
            return (AssignPrivateIpAddressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}