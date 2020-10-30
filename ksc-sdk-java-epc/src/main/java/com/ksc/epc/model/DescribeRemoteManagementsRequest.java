package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribeRemoteManagementsRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeRemoteManagements.
 * </p>
 */
@Data
public class DescribeRemoteManagementsRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeRemoteManagementsRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * 带外管理ID
     */
    private com.ksc.internal.SdkInternalList<String> remoteManagementIds;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeRemoteManagementsRequest that = (DescribeRemoteManagementsRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (remoteManagementIds != null ? !remoteManagementIds.equals(that.remoteManagementIds) : that.remoteManagementIds != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
        result = 31 * result + (remoteManagementIds != null ? remoteManagementIds.hashCode() : 0);
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
        public void addRemoteManagementIds(String... remoteManagementIds){
            if (this.remoteManagementIds == null) {
                this.remoteManagementIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : remoteManagementIds){
                this.remoteManagementIds.add(value);
            }
        }

    @Override
    public Request<DescribeRemoteManagementsRequest> getDryRunRequest() {
        Request<DescribeRemoteManagementsRequest> request = new DescribeRemoteManagementsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeRemoteManagementsRequest clone() {
        return (DescribeRemoteManagementsRequest) super.clone();
    }
}

