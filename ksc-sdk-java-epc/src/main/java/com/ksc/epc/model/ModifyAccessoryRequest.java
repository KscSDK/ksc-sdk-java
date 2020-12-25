package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ModifyAccessoryRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyAccessory.
 * </p>
 */
@Data
public class ModifyAccessoryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyAccessoryRequest> {

    /**
     * 配件ID
     */
    private String accessoryId;
    /**
     * 配件名称
     */
    private String accessoryName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyAccessoryRequest that = (ModifyAccessoryRequest) o;
        if (accessoryId != null ? !accessoryId.equals(that.accessoryId) : that.accessoryId != null)
            return false;
        if (accessoryName != null ? !accessoryName.equals(that.accessoryName) : that.accessoryName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (accessoryId != null ? accessoryId.hashCode() : 0);
        result = 31 * result + (accessoryName != null ? accessoryName.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ModifyAccessoryRequest> getDryRunRequest() {
        Request<ModifyAccessoryRequest> request = new ModifyAccessoryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyAccessoryRequest clone() {
        return (ModifyAccessoryRequest) super.clone();
    }
}

