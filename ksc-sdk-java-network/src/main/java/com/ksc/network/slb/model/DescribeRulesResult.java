package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeRules.
 * </p>
 */
@Data
public class DescribeRulesResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Rule> RuleSet;
    /**
     * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
     */
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeRulesResult that = (DescribeRulesResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (RuleSet != null ? !RuleSet.equals(that.RuleSet) : that.RuleSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (RuleSet != null ? RuleSet.hashCode() : 0);
        return result;
    }

    public void addRuleSet(Rule... rules) {
		if (this.RuleSet == null) {
			this.RuleSet = new SdkInternalList<Rule>();
		}
		for (Rule rule : rules) {
			this.RuleSet.add(rule);
		}
	}


    @Override
    public DescribeRulesResult clone() {
        try {
            return (DescribeRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
