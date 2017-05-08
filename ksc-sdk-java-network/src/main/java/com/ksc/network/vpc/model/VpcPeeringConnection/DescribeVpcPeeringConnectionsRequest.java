package com.ksc.network.vpc.model.VpcPeeringConnection;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;

import lombok.ToString;

/**
 * <p>
 * Contains the parameters for DescribeVpcPeeringConnections.
 * </p>
 */
@ToString
public class DescribeVpcPeeringConnectionsRequest extends KscWebServiceRequest implements
         DryRunSupportedRequest<DescribeVpcPeeringConnectionsRequest> {

    private com.ksc.internal.SdkInternalList<String> vpcPeeringConnectionIds;
    
    private com.ksc.internal.SdkInternalList<Filter> filters;


    public java.util.List<String> getVpcPeeringConnectionIds() {
        if (vpcPeeringConnectionIds == null) {
            vpcPeeringConnectionIds = new com.ksc.internal.SdkInternalList<String>();
        }
        return vpcPeeringConnectionIds;
    }


    public void setVpcPeeringConnectionIds(java.util.Collection<String> vpcPeeringConnectionIds) {
        if (vpcPeeringConnectionIds == null) {
            this.vpcPeeringConnectionIds = null;
            return;
        }

        this.vpcPeeringConnectionIds = new com.ksc.internal.SdkInternalList<String>(vpcPeeringConnectionIds);
    }



    public DescribeVpcPeeringConnectionsRequest withVpcPeeringConnectionIds(String... vpcPeeringConnectionIds) {
        if (this.vpcPeeringConnectionIds == null) {
            setVpcPeeringConnectionIds(new com.ksc.internal.SdkInternalList<String>(
                    vpcPeeringConnectionIds.length));
        }
        for (String ele : vpcPeeringConnectionIds) {
            this.vpcPeeringConnectionIds.add(ele);
        }
        return this;
    }



    public DescribeVpcPeeringConnectionsRequest withVpcPeeringConnectionIds(java.util.Collection<String> vpcPeeringConnectionIds) {
        setVpcPeeringConnectionIds(vpcPeeringConnectionIds);
        return this;
    }

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.ksc.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.ksc.internal.SdkInternalList<Filter>(
                filters);
    }

    public DescribeVpcPeeringConnectionsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.ksc.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    public DescribeVpcPeeringConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescribeVpcPeeringConnectionsRequest that = (DescribeVpcPeeringConnectionsRequest) o;

        if (!vpcPeeringConnectionIds.equals(that.vpcPeeringConnectionIds)) return false;
        return filters.equals(that.filters);
    }

    @Override
    public int hashCode() {
        int result = vpcPeeringConnectionIds.hashCode();
        result = 31 * result + filters.hashCode();
        return result;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeVpcPeeringConnectionsRequest> getDryRunRequest() {
       /*Request<DescribeSecurityGroupsRequest> request = new DescribeSubnetsRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;*/
    	return null;
    }
   
}