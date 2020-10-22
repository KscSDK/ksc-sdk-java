package com.ksc.network.vpc.model.peering;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyVpcPeeringConnection.
 * </p>
 */
@Data
public class ModifyVpcPeeringConnectionResult implements Serializable, Cloneable {

    private String RequestId;
    private VpcPeeringConnection VpcPeeringConnection;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyVpcPeeringConnectionResult that = (ModifyVpcPeeringConnectionResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (VpcPeeringConnection != null ? !VpcPeeringConnection.equals(that.VpcPeeringConnection) : that.VpcPeeringConnection != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (VpcPeeringConnection != null ? VpcPeeringConnection.hashCode() : 0);
        return result;
    }


    @Override
    public ModifyVpcPeeringConnectionResult clone() {
        try {
            return (ModifyVpcPeeringConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
