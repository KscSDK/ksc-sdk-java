package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DescribeLoadBalancerAclsRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeLoadBalancerAcls.
 * </p>
 */
@Data
public class DescribeLoadBalancerAclsRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeLoadBalancerAclsRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * LoadBalancerAcl的ID
     */
    private com.ksc.internal.SdkInternalList<String> loadBalancerAclIds;
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

        DescribeLoadBalancerAclsRequest that = (DescribeLoadBalancerAclsRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (loadBalancerAclIds != null ? !loadBalancerAclIds.equals(that.loadBalancerAclIds) : that.loadBalancerAclIds != null)
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
        result = 31 * result + (loadBalancerAclIds != null ? loadBalancerAclIds.hashCode() : 0);
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
        public void addLoadBalancerAclIds(String... loadBalancerAclIds){
            if (this.loadBalancerAclIds == null) {
                this.loadBalancerAclIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : loadBalancerAclIds){
                this.loadBalancerAclIds.add(value);
            }
        }

    @Override
    public Request<DescribeLoadBalancerAclsRequest> getDryRunRequest() {
        Request<DescribeLoadBalancerAclsRequest> request = new DescribeLoadBalancerAclsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeLoadBalancerAclsRequest clone() {
        return (DescribeLoadBalancerAclsRequest) super.clone();
    }
}

