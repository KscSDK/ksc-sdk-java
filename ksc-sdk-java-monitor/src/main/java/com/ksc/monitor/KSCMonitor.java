package com.ksc.monitor;

import com.ksc.monitor.model.GetMetricStatisticsRequest;
import com.ksc.monitor.model.GetMetricStatisticsResponse;
import com.ksc.monitor.model.ListMetricsRequest;
import com.ksc.monitor.model.ListMetricsResponse;

public interface KSCMonitor {
	/**
	 * <p>
	 * getMetricStatistics.
	 * </p>
	 * 
	 * @param getMetricStatisticsRequest
	 *            Contains the parameters for getMetricStatistics.
	 * @return Result of the GetMetricStatisticsResponse operation returned by
	 *         the service.
	 * @sample KSC.GetMetricStatistics
	 */
	public GetMetricStatisticsResponse getMetricStatistics(GetMetricStatisticsRequest getMetricStatisticsRequest);

	/**
	 * <p>
	 * listMetrics.
	 * </p>
	 * 
	 * @param listMetricsRequest
	 *            Contains the parameters for listMetrics.
	 * @return Result of the ListMetricsResponse operation returned by the
	 *         service.
	 * @sample KSC.ListMetrics
	 */
	public ListMetricsResponse listMetrics(ListMetricsRequest listMetricsRequest);
}
