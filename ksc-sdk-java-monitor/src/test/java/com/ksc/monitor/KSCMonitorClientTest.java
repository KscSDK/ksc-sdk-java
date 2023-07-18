package com.ksc.monitor;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.ListMetricsRequest;

public class KSCMonitorClientTest {
	private static final Logger log = Logger.getLogger(GetMetricStatisticsTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("ak",
			"sk");
	@Test
	public void ListMetrics(){
		ListMetricsRequest request=new ListMetricsRequest();
		request.setVersion("2010-05-25");
		request.setInstanceId("048c8283-af24-4b72-af07-502caf128bdf");
		request.setNamespace("Kec");
		request.setPageIndex(new Integer(1));
		request.setPageSize(new Integer(100));
		KSCMonitorClient client=new KSCMonitorClient(credentials);
		client.setEndpoint("http://monitor.cn-beijing-6.api.ksyun.com");
		Object result=client.listMetrics(request);
		System.out.println(result);
		log.debug(result);
	}
}
