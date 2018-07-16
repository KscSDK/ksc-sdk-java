package com.ksc.monitor.model;

import java.util.HashMap;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.monitor.model.transform.ListMetricsRequestMarshaller;

import lombok.ToString;

@ToString
public class ListMetricsRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<ListMetricsRequest>{
	private String InstanceId;
	private String Namespace;
	private String MetricName;
	private Integer PageIndex;
	private Integer PageSize;
	/**
	 * 监控指标维度，目前只支持docker 
	**/
	private HashMap<String,String> dimensions;
	
	@Override
	public Request<ListMetricsRequest> getDryRunRequest() {
		Request<ListMetricsRequest> request = new ListMetricsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceID) {
		InstanceId = instanceID;
	}

	public String getNamespace() {
		return Namespace;
	}

	public void setNamespace(String namespace) {
		Namespace = namespace;
	}

	public String getMetricName() {
		return MetricName;
	}

	public void setMetricName(String metricName) {
		MetricName = metricName;
	}

	public Integer getPageIndex() {
		return PageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		PageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return PageSize;
	}

	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}

	public HashMap<String, String> getDimensions() {
		return dimensions;
	}

	public void setDimensions(HashMap<String, String> dimensions) {
		this.dimensions = dimensions;
	}
}
