package com.ksc.monitor;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.PutMetricDataRequest;

public class KSCMonitorClientTest3 {
	private static final Logger log = Logger.getLogger(KSCMonitorClientTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("AKLTykLPqrtyT6WTvhf4RFI5Kw",
			"OBN5Vczebl2X43dndCAej3tVrFie6MBveS+LmW+4lFpZ6mfQIwOIQdWn03HMleRAdg==");
	@Test
	public void putMetricData(){
		PutMetricDataRequest request=new PutMetricDataRequest();
		request.setVersion("2017-07-01");
		String data=body();
		request.setData(data);
		KSCMonitorClient client=new KSCMonitorClient(credentials);
		client.setEndpoint("http://monitor.cn-beijing-3.api.ksyun.com");
		Object result=(Object)client.putMetricData(request);
		System.out.println(result);
		log.debug(result);
	}
	private String body() throws JSONException{
		JSONArray result = new JSONArray();
		JSONObject data = new JSONObject();
		JSONArray dimensions = new JSONArray();
		data.put("nameSpace", "tst");
		data.put("metricName", "openapi.lantcy.0");
		data.put("value", new Double(100));
		data.put("unit", "Seconds");
		
		dimensions.put("k1=v1");
		dimensions.put("k2=v2");
		dimensions.put("k3=v3");
		data.put("dimensions", dimensions);
		for (int i=0;i<10;i++){
			String message="2017-07-02T09:0"+i+":00Z";
			data.put("timestamp", message);
			result.put(data);
		}
		return result.toString();
	}
}
