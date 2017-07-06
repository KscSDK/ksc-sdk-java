package com.ksc.monitor;

import com.ksc.monitor.model.GetMetricStatisticsResponse;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.GetMetricStatisticsRequest;


public class GetMetricStatisticsTest {
	private static final Logger log = Logger.getLogger(GetMetricStatisticsTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("AKLT3xyBQOb6S7CwdWeXRujrOQ",
			"ODLW7kNlzfELyMk58GN0l3GUmk97nU3ZTAW1uLwh0Jw/HkGV8LtCTG/Ii0cLIghYQg==");
	@Test
	public void getMetricStatistics(){
		GetMetricStatisticsRequest request=new GetMetricStatisticsRequest();
		request.setVersion("2010-05-25");
		request.setInstanceId("c2b3554d-ddcc-48d6-ad5c-57fdb2247146");
		request.setNamespace("Kec");
		request.setMetricName("system.cpu.load");
		request.setStartTime("2017-06-21T12:00:00Z");
		request.setEndTime("2017-06-21T12:20:00Z");
		request.setAggregate("Average");
		request.setPeriod(60);
		KSCMonitorClient client=new KSCMonitorClient(credentials);
		client.setEndpoint("http://monitor.cn-beijing-6.api.ksyun.com");
		GetMetricStatisticsResponse result=client.getMetricStatistics(request);
		System.out.println("----------------------------------------------");
		System.out.println(result.getGetMetricStatisticsResult());
		System.out.println("----------------------------------------------");
	}
}
