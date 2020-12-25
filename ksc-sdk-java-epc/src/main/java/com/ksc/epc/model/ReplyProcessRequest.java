package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ReplyProcessRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ReplyProcess.
 * </p>
 */
@Data
public class ReplyProcessRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ReplyProcessRequest> {

    /**
     * 操作工单ID
     */
    private String operationProcessId;
    /**
     * 备注
     */
    private String remarks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ReplyProcessRequest that = (ReplyProcessRequest) o;
        if (operationProcessId != null ? !operationProcessId.equals(that.operationProcessId) : that.operationProcessId != null)
            return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (operationProcessId != null ? operationProcessId.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }


    @Override
    public Request<ReplyProcessRequest> getDryRunRequest() {
        Request<ReplyProcessRequest> request = new ReplyProcessRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ReplyProcessRequest clone() {
        return (ReplyProcessRequest) super.clone();
    }
}

