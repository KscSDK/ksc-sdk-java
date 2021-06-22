package com.ksc.krds.transform.audit;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.audit.ListAuditResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListAuditUnmarshaller implements Unmarshaller<RdsResponse<ListAuditResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<ListAuditResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        RdsResponse<ListAuditResponse> response = new RdsResponse<ListAuditResponse>();
        ObjectMapper objectMapper = RdsResponseConversion.createObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(in.getJsonParser());
        JsonNode requestId = jsonNode.get("RequestId");
        if (requestId != null) {
            response.setRequestId(requestId.asText());
        }
        response.setData(objectMapper.convertValue(jsonNode,ListAuditResponse.class));
        return response;
    }
}
