package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ModifyResourceRequirementRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyResourceRequirement.
 * </p>
 */
@Data
public class ModifyResourceRequirementRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyResourceRequirementRequest> {

    /**
     * 资源需求工单ID
     */
    private String resourceRequirementId;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 备注
     */
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyResourceRequirementRequest that = (ModifyResourceRequirementRequest) o;
        if (resourceRequirementId != null ? !resourceRequirementId.equals(that.resourceRequirementId) : that.resourceRequirementId != null)
            return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (resourceRequirementId != null ? resourceRequirementId.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyResourceRequirementRequest> getDryRunRequest() {
        Request<ModifyResourceRequirementRequest> request = new ModifyResourceRequirementRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyResourceRequirementRequest clone() {
        return (ModifyResourceRequirementRequest) super.clone();
    }
}

