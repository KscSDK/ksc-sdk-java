package com.ksc.network.eip.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.internal.SdkInternalList;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.eip.model.transform.DescribeAddressesRequestMarshaller;
import com.ksc.util.json.Jackson;

/**
 * <p>
 * Contains the parameters for DescribeAddresses.
 * </p>
 */
public class DescribeAddressesRequest extends KscWebServiceRequest implements
		Serializable, Cloneable,
		DryRunSupportedRequest<DescribeAddressesRequest> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3126063320884833699L;
	/**
	 * <p>
	 * One or more filters. Filter names and values are case-sensitive.
	 * </p>
	 * <ul>
	 * <li>
	 * <p>
	 * <code>association-id</code> - The association ID for the address.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>instance-type</code> - instance-type, if any.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>network-interface-id</code> - The ID of the network interface that
	 * the address is associated with, if any.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>internet-gateway-id</code> - internet-gateway-id.
	 * </p>
	 * </li>
	 * </ul>
	 */
	private com.ksc.internal.SdkInternalList<Filter> filters;
	/**
	 * <p>
	 * One or more allocation IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your Elastic IP addresses.
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<String> allocationIds;

	private Integer maxResults;

	private String nextToken;
	/**
	 * 项目ID
	 */
	private com.ksc.internal.SdkInternalList<String> projectIds;

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

		this.filters = new com.ksc.internal.SdkInternalList<Filter>(filters);
	}

	/**
	 * <p>
	 * One or more filters. Filter names and values are case-sensitive.
	 * </p>
	 * <ul>
	 * <li>
	 * <p>
	 * <code>association-id</code> - The association ID for the address.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>instance-type</code> - instance-type, if any.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>network-interface-id</code> - The ID of the network interface that
	 * the address is associated with, if any.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>internet-gateway-id</code> - internet-gateway-id.
	 * </p>
	 * </li>
	 * </ul>
	 * <p>
	 * <b>NOTE:</b> This method appends the values to the existing list (if
	 * any). Use {@link #setFilters(java.util.Collection)} or
	 * {@link #withFilters(java.util.Collection)} if you want to override the
	 * existing values.
	 * </p>
	 * 
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public DescribeAddressesRequest withFilters(Filter... filters) {
		if (this.filters == null) {
			setFilters(new com.ksc.internal.SdkInternalList<Filter>(
					filters.length));
		}
		for (Filter ele : filters) {
			this.filters.add(ele);
		}
		return this;
	}

	/**
	 * <p>
	 * One or more filters. Filter names and values are case-sensitive.
	 * </p>
	 * <ul>
	 * <li>
	 * <p>
	 * <code>association-id</code> - The association ID for the address.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>instance-type</code> - instance-type, if any.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>network-interface-id</code> - The ID of the network interface that
	 * the address is associated with, if any.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>internet-gateway-id</code> - internet-gateway-id.
	 * </p>
	 * </li>
	 * </ul>
	 */

	public DescribeAddressesRequest withFilters(
			java.util.Collection<Filter> filters) {
		setFilters(filters);
		return this;
	}

	/**
	 * <p>
	 * One or more allocation IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your Elastic IP addresses.
	 * </p>
	 * 
	 * @return One or more allocation IDs.</p>
	 *         <p>
	 *         Default: Describes all your Elastic IP addresses.
	 */

	public java.util.List<String> getAllocationIds() {
		if (allocationIds == null) {
			allocationIds = new com.ksc.internal.SdkInternalList<String>();
		}
		return allocationIds;
	}

	/**
	 * <p>
	 * One or more allocation IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your Elastic IP addresses.
	 * </p>
	 * 
	 * @param allocationIds
	 *            One or more allocation IDs.</p>
	 *            <p>
	 *            Default: Describes all your Elastic IP addresses.
	 */

	public void setAllocationIds(java.util.Collection<String> allocationIds) {
		if (allocationIds == null) {
			this.allocationIds = null;
			return;
		}

		this.allocationIds = new com.ksc.internal.SdkInternalList<String>(
				allocationIds);
	}

	public void addProjectIds(String... projectIds) {
		if (this.projectIds == null) {
			this.projectIds = new com.ksc.internal.SdkInternalList<String>();
		}
		for (String value : projectIds) {
			this.projectIds.add(value);
		}
	}

	/**
	 * <p>
	 * One or more allocation IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your Elastic IP addresses.
	 * </p>
	 * <p>
	 * <b>NOTE:</b> This method appends the values to the existing list (if
	 * any). Use {@link #setAllocationIds(java.util.Collection)} or
	 * {@link #withAllocationIds(java.util.Collection)} if you want to override
	 * the existing values.
	 * </p>
	 * 
	 * @param allocationIds
	 *            One or more allocation IDs.</p>
	 *            <p>
	 *            Default: Describes all your Elastic IP addresses.
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public DescribeAddressesRequest withAllocationIds(String... allocationIds) {
		if (this.allocationIds == null) {
			setAllocationIds(new com.ksc.internal.SdkInternalList<String>(
					allocationIds.length));
		}
		for (String ele : allocationIds) {
			this.allocationIds.add(ele);
		}
		return this;
	}

	/**
	 * <p>
	 * One or more allocation IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your Elastic IP addresses.
	 * </p>
	 * 
	 * @param allocationIds
	 *            One or more allocation IDs.</p>
	 *            <p>
	 *            Default: Describes all your Elastic IP addresses.
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public DescribeAddressesRequest withAllocationIds(
			java.util.Collection<String> allocationIds) {
		setAllocationIds(allocationIds);
		return this;
	}
	
	public Integer getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public SdkInternalList<String> getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(SdkInternalList<String> projectIds) {
		this.projectIds = projectIds;
	}

	/**
	 * This method is intended for internal use only. Returns the marshaled
	 * request configured with additional parameters to enable operation
	 * dry-run.
	 */
	@Override
	public Request<DescribeAddressesRequest> getDryRunRequest() {
		Request<DescribeAddressesRequest> request = new DescribeAddressesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	/**
	 * Returns a string representation of this object; useful for testing and
	 * debugging.
	 *
	 * @return A string representation of this object.
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Jackson.toJsonString(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DescribeAddressesRequest that = (DescribeAddressesRequest) o;

		if (filters != null ? !filters.equals(that.filters) : that.filters != null) return false;
		if (allocationIds != null ? !allocationIds.equals(that.allocationIds) : that.allocationIds != null)
			return false;
		if (maxResults != null ? !maxResults.equals(that.maxResults) : that.maxResults != null) return false;
		if (nextToken != null ? !nextToken.equals(that.nextToken) : that.nextToken != null) return false;
		return projectIds != null ? projectIds.equals(that.projectIds) : that.projectIds == null;
	}

	@Override
	public int hashCode() {
		int result = filters != null ? filters.hashCode() : 0;
		result = 31 * result + (allocationIds != null ? allocationIds.hashCode() : 0);
		result = 31 * result + (maxResults != null ? maxResults.hashCode() : 0);
		result = 31 * result + (nextToken != null ? nextToken.hashCode() : 0);
		result = 31 * result + (projectIds != null ? projectIds.hashCode() : 0);
		return result;
	}

	@Override
	public DescribeAddressesRequest clone() {
		return (DescribeAddressesRequest) super.clone();
	}
}