package com.ksc.monitor;
import com.ksc.monitor.model.GetMetricStatisticsRequest;
import com.ksc.monitor.model.GetCustomMetricStatisticsRequest;
import com.ksc.monitor.model.GetMetricStatisticsResponse;
import com.ksc.monitor.model.GetCustomMetricStatisticsResponse;
import com.ksc.monitor.model.ListMetricsRequest;
import com.ksc.monitor.model.ListCustomMetricsRequest;
import com.ksc.monitor.model.ListMetricsResponse;
import com.ksc.monitor.model.ListCustomMetricsResponse;
import com.ksc.monitor.model.PutMetricDataRequest;
import com.ksc.monitor.model.PutMetricDataResponse;
//Custom
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
	public GetCustomMetricStatisticsResponse getCustomMetricStatistics(GetCustomMetricStatisticsRequest getCustomMetricStatisticsRequest);
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
	public ListCustomMetricsResponse listCustomMetrics(ListCustomMetricsRequest listCustomMetricsRequest);
	/**
	 * <p>
	 * putMetricData.
	 * </p>
	 * 
	 * @param putMetricDataRequest
	 *            Contains the parameters for putMetricData.
	 * @return Result of the putMetricDataRequest operation returned by the
	 *         service.
	 * @sample KSC.PutMetricData
	 */
	public	PutMetricDataResponse putMetricData(PutMetricDataRequest putMetricDataRequest);

	
}
