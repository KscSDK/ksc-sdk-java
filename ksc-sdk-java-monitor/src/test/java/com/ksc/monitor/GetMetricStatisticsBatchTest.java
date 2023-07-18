package com.ksc.monitor;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.GetMetricStatisticsBatchRequest;
import com.ksc.monitor.model.GetMetricStatisticsBatchResponse;

public class GetMetricStatisticsBatchTest {
    private static final Logger log = Logger.getLogger(GetMetricStatisticsBatchTest.class);
    private AWSCredentials credentials = new BasicAWSCredentials("ak",
            "sk");

    @Test
    public void getMetricStatisticsBatch() {
    	GetMetricStatisticsBatchRequest request = new GetMetricStatisticsBatchRequest();
        request.setVersion("2018-09-29");
        String data = body();
        request.setData(data);
        KSCMonitorClient client = new KSCMonitorClient(credentials);
        client.setEndpoint("http://monitor.cn-beijing-6.api.ksyun.com");
        GetMetricStatisticsBatchResponse result = client.getMetricStatisticsBatch(request);
        System.out.println(result);
    }

    private String body() throws JSONException {
      
        JSONObject param = new JSONObject();
        param.put("Namespace", "eip");
        param.put("StartTime","2018-09-21T14:00:00Z");
        param.put("EndTime", "2018-09-21T014:59:00Z");
        param.put("Period", 1800);
        
        JSONArray aggregate = new JSONArray();
        aggregate.put("Max");
        aggregate.put("Min");
        aggregate.put("Avg");      
        param.put("Aggregate", aggregate);
     
        JSONObject metric1 = new JSONObject();
        metric1.put("InstanceID","2cdb3797-3a6b-4ff1-ad87-6038fd606dd7");
        metric1.put("MetricName","eip.bps.in");
        JSONObject metric2 = new JSONObject();
        metric2.put("InstanceID","62033090-9298-4d28-a413-1d6a08cf7270");
        metric2.put("MetricName","eip.bps.out");
        JSONArray metrics = new JSONArray();
        metrics.put(metric1);
        metrics.put(metric2);
        
        param.put("Metrics", metrics);  
        return param.toString();
    }
}
