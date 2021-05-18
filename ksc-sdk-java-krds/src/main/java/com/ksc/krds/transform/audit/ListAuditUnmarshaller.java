package com.ksc.krds.transform.audit;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.audit.ListAuditResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListAuditUnmarshaller implements Unmarshaller<RdsResponse<ListAuditResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<ListAuditResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        RdsResponse<ListAuditResponse> rdsResponse = RdsResponseConversion.invoke(in.getJsonParser(),null);
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
//        JsonNode jsonNode = objectMapper.readTree(in.getJsonParser());
//        rdsResponse.setRequestId(jsonNode.get("RequestId").asText());
//        ListAuditResponse data = new ListAuditResponse();
//        data.setMarker(jsonNode.get("Marker").asLong());
//        data.setTotalCount(jsonNode.get("TotalCount").asLong());
//        data.setAuditRows(objectMapper.convertValue(jsonNode.get("AuditRows"), ArrayList.class));
        rdsResponse.setData(RdsResponseConversion.invoke1(in.getJsonParser(), ListAuditResponse.class));
        return rdsResponse;
    }
}
