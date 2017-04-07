package com.ksc.network.vpc.model.Nat;

import java.io.Serializable;

import com.ksc.network.vpc.model.subnet.Subnet;

import lombok.ToString;

/**
 * <p>
 * Contains the output of CreateSubnet.
 * </p>
 */
@ToString
public class CreateNatResult implements Serializable, Cloneable {

	
	private String RequestId;

	private Subnet subnet;


	    
    @Override
    public CreateNatResult clone() {
        try {
            return (CreateNatResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }	
}