package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DescribeBackendServersRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeBackendServers.
 * </p>
 */
@Data
public class DescribeBackendServersRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeBackendServersRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * 后端服务的ID
     */
    private com.ksc.internal.SdkInternalList<String> registerIds;
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

        DescribeBackendServersRequest that = (DescribeBackendServersRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (registerIds != null ? !registerIds.equals(that.registerIds) : that.registerIds != null)
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
        result = 31 * result + (registerIds != null ? registerIds.hashCode() : 0);
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
        public void addRegisterIds(String... registerIds){
            if (this.registerIds == null) {
                this.registerIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : registerIds){
                this.registerIds.add(value);
            }
        }

    @Override
    public Request<DescribeBackendServersRequest> getDryRunRequest() {
        Request<DescribeBackendServersRequest> request = new DescribeBackendServersRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeBackendServersRequest clone() {
        return (DescribeBackendServersRequest) super.clone();
    }
}

