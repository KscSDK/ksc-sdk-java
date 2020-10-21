package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateSlbRule.
 * </p>
 */
@Data
public class CreateSlbRuleResult implements Serializable, Cloneable {

    private String RequestId;
    private Rule Rule;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateSlbRuleResult that = (CreateSlbRuleResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (Rule != null ? !Rule.equals(that.Rule) : that.Rule != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (Rule != null ? Rule.hashCode() : 0);
        return result;
    }


    @Override
    public CreateSlbRuleResult clone() {
        try {
            return (CreateSlbRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
