package com.ksc.monitor;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.GetMetricStatisticsRequest;


public class KSCMonitorClientTest {
	private static final Logger log = Logger.getLogger(KSCMonitorClientTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("AKLT84MHF72mQ5SXCumQxSiY7A ",
			"OABUj0HSiGVmJt1ICDbsdfdgfhgNnulbjgcdS0SLDw==");
	@Test
	public void getMetricStatistics(){
		GetMetricStatisticsRequest request=new GetMetricStatisticsRequest();
		request.setVersion("2010-05-25");
		request.setInstanceId("048c8283-af24-4b72-af07-502caf128bdf");
		request.setNamespace("Kec");
		request.setMetricName("system.cpu.load");
		request.setStartTime("2017-06-21T12:00:00Z");
		request.setEndTime("2017-06-21T12:20:00Z");
		request.setAggregate("Average");
		request.setPeriod(60);
		KSCMonitorClient client=new KSCMonitorClient(credentials);
		client.setEndpoint("http://monitor.cn-beijing-6.api.ksyun.com");
		Object result=client.getMetricStatistics(request);
		System.out.println(result);
		log.debug(result);
	}
}
