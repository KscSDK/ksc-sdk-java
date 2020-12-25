package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribeEpcManagementsRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeEpcManagements.
 * </p>
 */
@Data
public class DescribeEpcManagementsRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeEpcManagementsRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * 远程管理的ID
     */
    private com.ksc.internal.SdkInternalList<String> epcManagementIds;
    /**
     * 动态码
     */
    private String dynamicCode;
    /**
     * PIN码
     */
    private String pin;
    /**
     * 单次调用可返回的最大条目数量.
     */
    private String maxResults;
    /**
     * 获取另一页返回结果的 token.
     */
    private String nextToken;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeEpcManagementsRequest that = (DescribeEpcManagementsRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (epcManagementIds != null ? !epcManagementIds.equals(that.epcManagementIds) : that.epcManagementIds != null)
            return false;
        if (dynamicCode != null ? !dynamicCode.equals(that.dynamicCode) : that.dynamicCode != null)
            return false;
        if (pin != null ? !pin.equals(that.pin) : that.pin != null)
            return false;
        if (maxResults != null ? !maxResults.equals(that.maxResults) : that.maxResults != null)
            return false;
        if (nextToken != null ? !nextToken.equals(that.nextToken) : that.nextToken != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
        result = 31 * result + (epcManagementIds != null ? epcManagementIds.hashCode() : 0);
        result = 31 * result + (dynamicCode != null ? dynamicCode.hashCode() : 0);
        result = 31 * result + (pin != null ? pin.hashCode() : 0);
        result = 31 * result + (maxResults != null ? maxResults.hashCode() : 0);
        result = 31 * result + (nextToken != null ? nextToken.hashCode() : 0);
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
        public void addEpcManagementIds(String... epcManagementIds){
            if (this.epcManagementIds == null) {
                this.epcManagementIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : epcManagementIds){
                this.epcManagementIds.add(value);
            }
        }

    @Override
    public Request<DescribeEpcManagementsRequest> getDryRunRequest() {
        Request<DescribeEpcManagementsRequest> request = new DescribeEpcManagementsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeEpcManagementsRequest clone() {
        return (DescribeEpcManagementsRequest) super.clone();
    }
}

