package com.ksc.monitor.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.monitor.model.transform.GetMetricStatisticsRequestMarshaller;

import lombok.ToString;

@ToString
public class GetMetricStatisticsRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<GetMetricStatisticsRequest> {
	/**
	 * 被监控实例的唯一标示
	 */
	private String instanceId;
	/**
	 * 监控指标对应的关键字
	 */
	private String metricName;
	/**
	 * 一个过滤产品类型的字段(ksc)
	 */
	private String namespace;
	/**
	 * 开始时间的时间戳
	 */
	private String startTime;
	/**
	 * 结束时间的时间戳
	 */
	private String endTime;
	/**
	 * 单位为秒，此数值必须60秒的整数倍，如果此参数大于监控指标的采样周期，云监控将会按照聚合规则处理数据返回。 
	 */
	private Integer period;
	/**
	 * 获取监控指标的聚合方法：Average,Sum,Count,Max,Min 
	 */
	private String aggregate;
	/**
	 * POST获取监控指标的body
	 */
	private String data;
	
	/**
	 * This method is intended for internal use only. Returns the marshaled
	 * request configured with additional parameters to enable operation
	 * dry-run.
	 */
	@Override
	public Request<GetMetricStatisticsRequest> getDryRunRequest() {
		Request<GetMetricStatisticsRequest> request = new GetMetricStatisticsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getMetricName() {
		return metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public String getAggregate() {
		return aggregate;
	}

	public void setAggregate(String aggregate) {
		this.aggregate = aggregate;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
