package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribeResourceRequirementsRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeResourceRequirements.
 * </p>
 */
@Data
public class DescribeResourceRequirementsRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeResourceRequirementsRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * 资源需求的ID
     */
    private com.ksc.internal.SdkInternalList<String> resourceRequirementIds;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeResourceRequirementsRequest that = (DescribeResourceRequirementsRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (resourceRequirementIds != null ? !resourceRequirementIds.equals(that.resourceRequirementIds) : that.resourceRequirementIds != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
        result = 31 * result + (resourceRequirementIds != null ? resourceRequirementIds.hashCode() : 0);
        return result;
    }

    public void addFilters(Filter... filters) {
		if (this.filters == null) {
			this.filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		for (Filter filter : filters) {
			this.filters.add(filter);
		}
	}
        public void addResourceRequirementIds(String... resourceRequirementIds){
            if (this.resourceRequirementIds == null) {
                this.resourceRequirementIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : resourceRequirementIds){
                this.resourceRequirementIds.add(value);
            }
        }

    @Override
    public Request<DescribeResourceRequirementsRequest> getDryRunRequest() {
        Request<DescribeResourceRequirementsRequest> request = new DescribeResourceRequirementsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeResourceRequirementsRequest clone() {
        return (DescribeResourceRequirementsRequest) super.clone();
    }
}

