package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateResourceRequirement.
 * </p>
 */
@Data
public class CreateResourceRequirementResult implements Serializable, Cloneable {

    private String RequestId;
    private ResourceRequirement ResourceRequirement;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateResourceRequirementResult that = (CreateResourceRequirementResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (ResourceRequirement != null ? !ResourceRequirement.equals(that.ResourceRequirement) : that.ResourceRequirement != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (ResourceRequirement != null ? ResourceRequirement.hashCode() : 0);
        return result;
    }


    @Override
    public CreateResourceRequirementResult clone() {
        try {
            return (CreateResourceRequirementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
