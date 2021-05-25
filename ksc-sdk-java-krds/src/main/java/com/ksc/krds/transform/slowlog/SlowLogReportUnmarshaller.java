package com.ksc.krds.transform.slowlog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.krds.model.slowlog.SlowLogReportPub;
import com.ksc.krds.model.slowlog.SlowLogReportResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SlowLogReportUnmarshaller implements Unmarshaller<SlowLogReportResponse<List<SlowLogReportPub>>, JsonUnmarshallerContext> {

    @Override
    public SlowLogReportResponse<List<SlowLogReportPub>> unmarshall(JsonUnmarshallerContext in) throws Exception {
        SlowLogReportResponse response = new SlowLogReportResponse();
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
            response.setTotalCount(totalCount.asInt());
        }
        JsonNode marker = jsonNode.get("Marker");
        if (marker != null) {
            response.setMarker(marker.asInt());
        }
        List<SlowLogReportPub> list = new ArrayList<SlowLogReportPub>();
        response.setData(objectMapper.convertValue(jsonNode.get("data"), list.getClass()));

        return response;
    }
}
