package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.internal.SdkInternalList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeInstancesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;

/**
 * <p>
 * Contains the parameters for DescribeInstances.
 * </p>
 */
@ToString
@EqualsAndHashCode(callSuper = false)
@SuppressWarnings("serial")
public class DescribeInstancesRequest extends KscWebServiceRequest implements
		Serializable, Cloneable,
		DryRunSupportedRequest<DescribeInstancesRequest> {

	/**
	 * <p>
	 * One or more instance IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your instances.
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<String> instanceIds;
	/**
	 * <p>
	 * One or more filters.
	 * </p>
	 * <ul>
	 * <li>
	 * <p>
	 * <code>instance-id</code> - instance-id 
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>subnet-id</code> - subnet-id
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>vpc-id</code> - vpc-id
	 * </p>
	 * </li>
	 */
	private com.ksc.internal.SdkInternalList<Filter> filters;
	/**
	 * <p>
	 * The token to request the next page of results.
	 * </p>
	 */
	private String nextToken;
	/**
	 * <p>
	 * The maximum number of results to return in a single call. To retrieve the
	 * remaining results, make another call with the returned
	 * <code>NextToken</code> value. This value can be between 5 and 1000. You
	 * cannot specify this parameter and the instance IDs parameter or tag
	 * filters in the same call.
	 * </p>
	 */
	
	private Integer maxResults;
	
	private Integer marker;
	
	private String Search;

	/**
	 * <p>
	 * One or more project IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your project.
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<String> projectIds;
	public SdkInternalList<String> getProjectIds() {
		if (projectIds == null) {
			projectIds = new com.ksc.internal.SdkInternalList<String>();
		}
		return projectIds;
	}

	public void setProjectIds(SdkInternalList<String> projectIds) {
		this.projectIds = projectIds;
	}
	public DescribeInstancesRequest withProjectIds(String... projectIds) {
		if (this.projectIds == null) {
			setProjectIds(new com.ksc.internal.SdkInternalList<String>(
					projectIds.length));
		}
		for (String ele : projectIds) {
			this.projectIds.add(ele);
		}
		return this;
	}

	/**
	 * <p>
	 * One or more instance IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your instances.
	 * </p>
	 * 
	 * @return One or more instance IDs.</p>
	 *         <p>
	 *         Default: Describes all your instances.
	 */
	
	public java.util.List<String> getInstanceIds() {
		if (instanceIds == null) {
			instanceIds = new com.ksc.internal.SdkInternalList<String>();
		}
		return instanceIds;
	}

	/**
	 * <p>
	 * One or more instance IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your instances.
	 * </p>
	 * 
	 * @param instanceIds
	 *            One or more instance IDs.</p>
	 *            <p>
	 *            Default: Describes all your instances.
	 */

	public void setInstanceIds(java.util.Collection<String> instanceIds) {
		if (instanceIds == null) {
			this.instanceIds = null;
			return;
		}

		this.instanceIds = new com.ksc.internal.SdkInternalList<String>(
				instanceIds);
	}

	/**
	 * <p>
	 * One or more instance IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your instances.
	 * </p>
	 * <p>
	 * <b>NOTE:</b> This method appends the values to the existing list (if
	 * any). Use {@link #setInstanceIds(java.util.Collection)} or
	 * {@link #withInstanceIds(java.util.Collection)} if you want to override
	 * the existing values.
	 * </p>
	 * 
	 * @param instanceIds
	 *            One or more instance IDs.</p>
	 *            <p>
	 *            Default: Describes all your instances.
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public DescribeInstancesRequest withInstanceIds(String... instanceIds) {
		if (this.instanceIds == null) {
			setInstanceIds(new com.ksc.internal.SdkInternalList<String>(
					instanceIds.length));
		}
		for (String ele : instanceIds) {
			this.instanceIds.add(ele);
		}
		return this;
	}

	/**
	 * <p>
	 * One or more instance IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your instances.
	 * </p>
	 * 
	 * @param instanceIds
	 *            One or more instance IDs.</p>
	 *            <p>
	 *            Default: Describes all your instances.
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public DescribeInstancesRequest withInstanceIds(
			java.util.Collection<String> instanceIds) {
		setInstanceIds(instanceIds);
		return this;
	}

	/**
	 * <p>
	 * One or more filters.
	 * </p>
	 * <ul>
	 * <li>
	 * <p>
	 * <code>instance-id</code> - instance-id 
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>subnet-id</code> - subnet-id
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * <code>vpc-id</code> - vpc-id
	 * </p>
	 * </li>
	 */

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

	public DescribeInstancesRequest withFilters(Filter... filters) {
		if (this.filters == null) {
			setFilters(new com.ksc.internal.SdkInternalList<Filter>(
					filters.length));
		}
		for (Filter ele : filters) {
			this.filters.add(ele);
		}
		return this;
	}
	
	public DescribeInstancesRequest withFilters(
			java.util.Collection<Filter> filters) {
		setFilters(filters);
		return this;
	}

	/**
	 * <p>
	 * The token to request the next page of results.
	 * </p>
	 * 
	 * @param nextToken
	 *            The token to request the next page of results.
	 */

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	/**
	 * <p>
	 * The token to request the next page of results.
	 * </p>
	 * 
	 * @return The token to request the next page of results.
	 */

	public String getNextToken() {
		return this.nextToken;
	}

	/**
	 * <p>
	 * The token to request the next page of results.
	 * </p>
	 * 
	 * @param nextToken
	 *            The token to request the next page of results.
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public DescribeInstancesRequest withNextToken(String nextToken) {
		setNextToken(nextToken);
		return this;
	}

	/**
	 * <p>
	 * The maximum number of results to return in a single call. To retrieve the
	 * remaining results, make another call with the returned
	 * <code>NextToken</code> value. This value can be between 5 and 1000. You
	 * cannot specify this parameter and the instance IDs parameter or tag
	 * filters in the same call.
	 * </p>
	 * 
	 * @param maxResults
	 *            The maximum number of results to return in a single call. To
	 *            retrieve the remaining results, make another call with the
	 *            returned <code>NextToken</code> value. This value can be
	 *            between 5 and 1000. You cannot specify this parameter and the
	 *            instance IDs parameter or tag filters in the same call.
	 */

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	/**
	 * <p>
	 * The maximum number of results to return in a single call. To retrieve the
	 * remaining results, make another call with the returned
	 * <code>NextToken</code> value. This value can be between 5 and 1000. You
	 * cannot specify this parameter and the instance IDs parameter or tag
	 * filters in the same call.
	 * </p>
	 * 
	 * @return The maximum number of results to return in a single call. To
	 *         retrieve the remaining results, make another call with the
	 *         returned <code>NextToken</code> value. This value can be between
	 *         5 and 1000. You cannot specify this parameter and the instance
	 *         IDs parameter or tag filters in the same call.
	 */

	public Integer getMaxResults() {
		return this.maxResults;
	}

	/**
	 * <p>
	 * The maximum number of results to return in a single call. To retrieve the
	 * remaining results, make another call with the returned
	 * <code>NextToken</code> value. This value can be between 5 and 1000. You
	 * cannot specify this parameter and the instance IDs parameter or tag
	 * filters in the same call.
	 * </p>
	 * 
	 * @param maxResults
	 *            The maximum number of results to return in a single call. To
	 *            retrieve the remaining results, make another call with the
	 *            returned <code>NextToken</code> value. This value can be
	 *            between 5 and 1000. You cannot specify this parameter and the
	 *            instance IDs parameter or tag filters in the same call.
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public DescribeInstancesRequest withMaxResults(Integer maxResults) {
		setMaxResults(maxResults);
		return this;
	}

	/**
	 * This method is intended for internal use only. Returns the marshaled
	 * request configured with additional parameters to enable operation
	 * dry-run.
	 */
	@Override
	public Request<DescribeInstancesRequest> getDryRunRequest() {
		Request<DescribeInstancesRequest> request = new DescribeInstancesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	@Override
	public DescribeInstancesRequest clone() {
		return (DescribeInstancesRequest) super.clone();
	}

	public Integer getMarker() {
		return marker;
	}

	public void setMarker(Integer marker) {
		this.marker = marker;
	}

	public String getSearch() {
		return Search;
	}

	public void setSearch(String search) {
		Search = search;
	}
	
}