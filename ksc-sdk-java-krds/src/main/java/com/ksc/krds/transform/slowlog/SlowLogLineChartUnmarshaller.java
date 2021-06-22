package com.ksc.krds.transform.slowlog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.krds.model.slowlog.SlowLogLineChartResponse;
import com.ksc.krds.model.slowlog.SlowLogReportGlobalPubResultBean;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SlowLogLineChartUnmarshaller implements Unmarshaller<SlowLogLineChartResponse<List<SlowLogReportGlobalPubResultBean>>, JsonUnmarshallerContext> {
    @Override
    public SlowLogLineChartResponse<List<SlowLogReportGlobalPubResultBean>> unmarshall(JsonUnmarshallerContext in) throws Exception {
        SlowLogLineChartResponse<List<SlowLogReportGlobalPubResultBean>> response = new SlowLogLineChartResponse<List<SlowLogReportGlobalPubResultBean>>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        JsonNode jsonNode = objectMapper.readTree(in.getJsonParser());
        JsonNode requestId = jsonNode.get("RequestId");
        if (requestId != null) {
            response.setRequestId(requestId.asText());
        }
        JsonNode totalCount = jsonNode.get("TotalCount");
        if (totalCount != null) {
            response.setTotalCount(totalCount.asLong());
        }
        JsonNode querySum = jsonNode.get("QuerySum");
        if (querySum != null) {
            response.setQuerySum(querySum.asLong());
        }
        ArrayList<SlowLogReportGlobalPubResultBean> list = new ArrayList<SlowLogReportGlobalPubResultBean>();
        response.setData(objectMapper.convertValue(jsonNode.get("data"), list.getClass()));

        return response;
    }
}
