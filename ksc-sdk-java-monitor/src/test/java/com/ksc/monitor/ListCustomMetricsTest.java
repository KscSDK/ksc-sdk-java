package com.ksc.monitor;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.ListCustomMetricsRequest;
import com.ksc.monitor.model.ListCustomMetricsResponse;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class ListCustomMetricsTest {
	private static final Logger log = Logger.getLogger(GetMetricStatisticsTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("AKLT3xyBQOb6S7CwdWeXRujrOQ",
			"ODLW7kNlzfELyMk58GN0l3GUmk97nU3ZTAW1uLwh0Jw/HkGV8LtCTG/Ii0cLIghYQg==");

	@Test
	public void listCustomMetrics(){
		ListCustomMetricsRequest request=new ListCustomMetricsRequest();
		request.setVersion("2017-07-01");
		String data=body();
		request.setData(data);
		KSCMonitorClient client=new KSCMonitorClient(credentials);
		client.setEndpoint("http://monitor.cn-beijing-6.api.ksyun.com");
		ListCustomMetricsResponse  result=client.listCustomMetrics(request);
		System.out.println(result);
	}
	private String body() throws JSONException{
		JSONObject data = new JSONObject();
		data.put("namespace", "tao");

		return data.toString();
	}
	
}
