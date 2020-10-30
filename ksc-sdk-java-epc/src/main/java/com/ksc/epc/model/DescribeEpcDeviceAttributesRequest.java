package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribeEpcDeviceAttributesRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeEpcDeviceAttributes.
 * </p>
 */
@Data
public class DescribeEpcDeviceAttributesRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeEpcDeviceAttributesRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * 机型设备ID
     */
    private com.ksc.internal.SdkInternalList<String> deviceAttributeIds;
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

        DescribeEpcDeviceAttributesRequest that = (DescribeEpcDeviceAttributesRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (deviceAttributeIds != null ? !deviceAttributeIds.equals(that.deviceAttributeIds) : that.deviceAttributeIds != null)
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
        result = 31 * result + (deviceAttributeIds != null ? deviceAttributeIds.hashCode() : 0);
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
        public void addDeviceAttributeIds(String... deviceAttributeIds){
            if (this.deviceAttributeIds == null) {
                this.deviceAttributeIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : deviceAttributeIds){
                this.deviceAttributeIds.add(value);
            }
        }

    @Override
    public Request<DescribeEpcDeviceAttributesRequest> getDryRunRequest() {
        Request<DescribeEpcDeviceAttributesRequest> request = new DescribeEpcDeviceAttributesRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeEpcDeviceAttributesRequest clone() {
        return (DescribeEpcDeviceAttributesRequest) super.clone();
    }
}

