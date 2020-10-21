package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DeleteRuleRequestMarshaller;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteRule.
 * </p>
 */
@Data
public class DeleteRuleRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteRuleRequest> {

    /**
     * 规则ID
     */
    private String ruleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteRuleRequest that = (DeleteRuleRequest) o;
        if (ruleId != null ? !ruleId.equals(that.ruleId) : that.ruleId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (ruleId != null ? ruleId.hashCode() : 0);
        return result;
    }


    @Override
    public Request<DeleteRuleRequest> getDryRunRequest() {
        Request<DeleteRuleRequest> request = new DeleteRuleRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteRuleRequest clone() {
        return (DeleteRuleRequest) super.clone();
    }
}

