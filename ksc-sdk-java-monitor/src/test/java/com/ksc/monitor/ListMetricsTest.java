package com.ksc.monitor;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.ListMetricsRequest;
import com.ksc.monitor.model.ListMetricsResponse;
import org.apache.log4j.Logger;
import org.junit.Test;


public class ListMetricsTest {
	private static final Logger log = Logger.getLogger(ListMetricsTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("AKLTOfcEFLK2TzGCg64l6qWkRA",
			"OAQl7BJfhPE5typQD91MAdVqsY2L/iqZXHZIWWrTBLoCFGxsupta4wPQdSJAAgzi6g==\n");
	@Test
	public void listMetrics(){
		ListMetricsRequest request=new ListMetricsRequest();
		request.setVersion("2010-05-25");
		request.setInstanceId("c2b3554d-ddcc-48d6-ad5c-57fdb2247146");
		request.setNamespace("Kec");
		request.setPageIndex(1);
		KSCMonitorClient client=new KSCMonitorClient(credentials);
		client.setEndpoint("http://monitor.cn-beijing-6.api.ksyun.com");
		ListMetricsResponse result=client.listMetrics(request);
		System.out.println(result);
	}
}
