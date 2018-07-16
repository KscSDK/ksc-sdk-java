package com.ksc.monitor;

import java.util.HashMap;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.ListMetricsRequest;
import com.ksc.monitor.model.ListMetricsResponse;
import org.apache.log4j.Logger;
import org.junit.Test;


public class ListMetricsTest {
	private static final Logger log = Logger.getLogger(ListMetricsTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("AKLT3xyBQOb6S7CwdWeXRujrOQ",
			"ODLW7kNlzfELyMk58GN0l3GUmk97nU3ZTAW1uLwh0Jw/HkGV8LtCTG/Ii0cLIghYQg==");
	@Test
	public void listMetrics(){
		ListMetricsRequest request=new ListMetricsRequest();
		request.setVersion("2010-05-25");
		request.setInstanceId("c2b3554d-ddcc-48d6-ad5c-57fdb2247146");
		request.setNamespace("Kec");
		request.setPageIndex(1);
		/**
		 *docker（kce） 没有InstanceId，需要设置Dimensions。且Dimensions只支持docker（kce）产品线，其余产品线不支持。
		**/
		/*
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("Dimensions.1.Name", "ClusterId");
		map.put("Dimensions.1.Value", "1f0dc90a-b639-43e8-8448-a0aa29fbc4df");
		map.put("Dimensions.2.Name", "NamespaceName");
		map.put("Dimensions.2.Value", "kube-system");
		map.put("Dimensions.3.Name", "DeploymentName");
		map.put("Dimensions.3.Value", "heapster-85f77cbfb9");
		map.put("Dimensions.4.Name", "PodName");
		map.put("Dimensions.4.Value", "heapster-85f77cbfb9-cl5x8");
		map.put("Dimensions.5.Name", "ContainerName");
		map.put("Dimensions.5.Value", "dnsmasq");		
		request.setDimensions(map);
		*/
		KSCMonitorClient client=new KSCMonitorClient(credentials);
		client.setEndpoint("http://monitor.cn-beijing-6.api.ksyun.com");
		ListMetricsResponse result=client.listMetrics(request);
		System.out.println(result);
	}
}
