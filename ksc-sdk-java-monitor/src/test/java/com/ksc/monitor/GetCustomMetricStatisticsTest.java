package com.ksc.monitor;


import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.GetCustomMetricStatisticsRequest;
import com.ksc.monitor.model.GetCustomMetricStatisticsResponse;


public class GetCustomMetricStatisticsTest {
    private static final Logger log = Logger.getLogger(GetMetricStatisticsTest.class);
    private AWSCredentials credentials = new BasicAWSCredentials("ak",
            "sk");

    @Test
    public void getCustomMetricStatistics() {
        GetCustomMetricStatisticsRequest request = new GetCustomMetricStatisticsRequest();
        request.setVersion("2017-07-01");
        String data = body();
        request.setData(data);
        KSCMonitorClient client = new KSCMonitorClient(credentials);
        client.setEndpoint("http://monitor.cn-beijing-6.api.ksyun.com");
        GetCustomMetricStatisticsResponse result = client.getCustomMetricStatistics(request);
        System.out.println(result);
    }

    private String body() throws JSONException {
        JSONObject data = new JSONObject();
        JSONArray dimensions = new JSONArray();
        data.put("namespace", "tao");
        data.put("metricName", "api.error");
        data.put("period", new Integer(60));
        data.put("method", "avg");
        data.put("startTime", "2017-07-04T07:30:00Z");
        data.put("endTime", "2017-07-04T07:53:00Z");
        dimensions.put("pdl=devops");
        data.put("dimensions", dimensions);
        return data.toString();
    }

}
