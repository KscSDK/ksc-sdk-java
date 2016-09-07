package com.ksc.monitor;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.GetMetricStatisticsRequest;
import com.ksc.monitor.model.GetMetricStatisticsResponse;
import com.ksc.util.StringUtils;

public class KSCMonitorClientTest {
	private static final Logger log = Logger.getLogger(KSCMonitorClientTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("AKLTWo5i_elrTUa5mPthJpEUEg",
			"OPTBA7o1ozT0RMw9FUf3zcFQnHfKPO8exNtNlHNG44d5zoBK4OfdbkfasZSDbNCbnw==");
	@Test
	public void getMetricStatistics(){
		GetMetricStatisticsRequest request=new GetMetricStatisticsRequest();
		request.setVersion("2010-05-25");
		request.setInstanceId("7af7a14d-67da-4462-9ad1-c59439345d65");
		request.setNamespace("Kec");
		request.setMetricName("vm.memory.size[used]");
		request.setStartTime("2016-08-24T04:00:00Z");
		request.setEndTime("2016-08-25T04:00:00Z");
		request.setAggregate("Sum,Count,Max,Min,Average");
		request.setPeriod(3600);
		KSCMonitorClient client=new KSCMonitorClient(credentials);
		client.setEndpoint("http://monitor.cn-beijing-5.api.ksyun.com");
		GetMetricStatisticsResponse result=client.getMetricStatistics(request);
		System.out.println(result);
		log.debug(result);
	}
}
