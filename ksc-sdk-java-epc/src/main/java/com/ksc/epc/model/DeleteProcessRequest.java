package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DeleteProcessRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteProcess.
 * </p>
 */
@Data
public class DeleteProcessRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteProcessRequest> {

    /**
     * 操作工单ID
     */
    private String operationProcessId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteProcessRequest that = (DeleteProcessRequest) o;
        if (operationProcessId != null ? !operationProcessId.equals(that.operationProcessId) : that.operationProcessId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (operationProcessId != null ? operationProcessId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteProcessRequest> getDryRunRequest() {
        Request<DeleteProcessRequest> request = new DeleteProcessRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteProcessRequest clone() {
        return (DeleteProcessRequest) super.clone();
    }
}

