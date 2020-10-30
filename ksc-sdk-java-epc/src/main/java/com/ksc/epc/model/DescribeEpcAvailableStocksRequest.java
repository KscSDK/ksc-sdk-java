package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribeEpcAvailableStocksRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeEpcAvailableStocks.
 * </p>
 */
@Data
public class DescribeEpcAvailableStocksRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeEpcAvailableStocksRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeEpcAvailableStocksRequest that = (DescribeEpcAvailableStocksRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
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

    @Override
    public Request<DescribeEpcAvailableStocksRequest> getDryRunRequest() {
        Request<DescribeEpcAvailableStocksRequest> request = new DescribeEpcAvailableStocksRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeEpcAvailableStocksRequest clone() {
        return (DescribeEpcAvailableStocksRequest) super.clone();
    }
}

