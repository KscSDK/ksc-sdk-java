package com.ksc.network.vpc.model.vpn;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.vpc.transform.vpn.DescribeVpnTunnelsRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeVpnTunnels.
 * </p>
 */
@Data
public class DescribeVpnTunnelsRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeVpnTunnelsRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * VPN通道的ID
     */
    private com.ksc.internal.SdkInternalList<String> vpnTunnelIds;
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

        DescribeVpnTunnelsRequest that = (DescribeVpnTunnelsRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (vpnTunnelIds != null ? !vpnTunnelIds.equals(that.vpnTunnelIds) : that.vpnTunnelIds != null)
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
        result = 31 * result + (vpnTunnelIds != null ? vpnTunnelIds.hashCode() : 0);
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
        public void addVpnTunnelIds(String... vpnTunnelIds){
            if (this.vpnTunnelIds == null) {
                this.vpnTunnelIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : vpnTunnelIds){
                this.vpnTunnelIds.add(value);
            }
        }

    @Override
    public Request<DescribeVpnTunnelsRequest> getDryRunRequest() {
        Request<DescribeVpnTunnelsRequest> request = new DescribeVpnTunnelsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeVpnTunnelsRequest clone() {
        return (DescribeVpnTunnelsRequest) super.clone();
    }
}

