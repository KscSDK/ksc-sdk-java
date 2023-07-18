package com.ksc.monitor;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.PutMetricDataRequest;
import com.ksc.monitor.model.PutMetricDataResponse;

public class PutMetricDataTest {
    private static final Logger log = Logger.getLogger(GetMetricStatisticsTest.class);
    private AWSCredentials credentials = new BasicAWSCredentials("ak",
            "sk");

    @Test
    public void putMetricData() {
        PutMetricDataRequest request = new PutMetricDataRequest();
        request.setVersion("2017-07-01");
        String data = body();
        request.setData(data);
        KSCMonitorClient client = new KSCMonitorClient(credentials);
        client.setEndpoint("http://monitor.cn-beijing-6.api.ksyun.com");
        PutMetricDataResponse result = client.putMetricData(request);
        System.out.println(result);
    }

    private String body() throws JSONException {
        JSONArray result = new JSONArray();
        JSONObject data = new JSONObject();
        JSONArray dimensions = new JSONArray();
        data.put("namespace", "tao");
        data.put("metricName", "api.error");
        data.put("value", new Double(100));
        data.put("unit", "Seconds");
        dimensions.put("pdl=devops");
        data.put("dimensions", dimensions);
        data.put("timestamp", "2017-07-04T07:53:00Z");


        JSONObject data1 = new JSONObject();
        JSONArray dimensions1 = new JSONArray();
        data1.put("namespace", "tao");
        data1.put("metricName", "api.error");
        data1.put("value", new Double(99));
        data1.put("unit", "Seconds");
        dimensions1.put("pdl=devops");
        dimensions1.put("module=web");
        data1.put("dimensions", dimensions1);
        data1.put("timestamp", "2017-07-04T07:53:00Z");

        result.put(data);
        result.put(data1);
        return result.toString();
    }
}
