package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeResourceRequirements.
 * </p>
 */
@Data
public class DescribeResourceRequirementsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<ResourceRequirement> ResourceRequirementSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeResourceRequirementsResult that = (DescribeResourceRequirementsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (ResourceRequirementSet != null ? !ResourceRequirementSet.equals(that.ResourceRequirementSet) : that.ResourceRequirementSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (ResourceRequirementSet != null ? ResourceRequirementSet.hashCode() : 0);
        return result;
    }

    public void addResourceRequirementSet(ResourceRequirement... resourceRequirements) {
		if (this.ResourceRequirementSet == null) {
			this.ResourceRequirementSet = new SdkInternalList<ResourceRequirement>();
		}
		for (ResourceRequirement resourceRequirement : resourceRequirements) {
			this.ResourceRequirementSet.add(resourceRequirement);
		}
	}

    public void setResourceRequirementSet(List<ResourceRequirement> resourceRequirements) {
        this.ResourceRequirementSet = new SdkInternalList<ResourceRequirement>(resourceRequirements);
    }

    @Override
    public DescribeResourceRequirementsResult clone() {
        try {
            return (DescribeResourceRequirementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
