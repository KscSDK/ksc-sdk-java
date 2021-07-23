package com.ksc.bill.billunion.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class ResponseConversion {

    public static <T> SummaryResponse<T> invoke(JsonParser jsonParser, Class<T> clazz) throws IOException {
        SummaryResponse<T> response = new SummaryResponse<T>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        JsonNode jsonNode = objectMapper.readTree(jsonParser);
        response.setRequestId(jsonNode.get("RequestId").asText());
        response.setCurrency(jsonNode.get("Currency").asText("CNY"));
        JsonNode realTotalCost = jsonNode.get("RealTotalCost");
        response.setRealTotalCost(realTotalCost == null ? "0" : realTotalCost.asText("0"));
        JavaType collectionType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
        response.setSummaryOverview(objectMapper.<List<T>>readValue(jsonNode.get("SummaryOverview").toString(), collectionType));
        return response;
    }


    public static InstanceSummaryResponse invokeInstanceSummary(JsonParser jsonParser) throws IOException {
        InstanceSummaryResponse response = new InstanceSummaryResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        JsonNode jsonNode = objectMapper.readTree(jsonParser);
        response.setRequestId(jsonNode.get("RequestId").asText());
        response.setCustomerId(jsonNode.get("CustomerId").asText());
        response.setEmail(jsonNode.get("Email").asText());
        response.setPageNum(Integer.parseInt(jsonNode.get("PageNum").asText()));
        response.setPageSize(Integer.parseInt(jsonNode.get("PageSize").asText()));
        response.setTotalCount(Integer.parseInt(jsonNode.get("TotalCount").asText()));
        JavaType collectionType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, InstanceSummaryItem.class);
        response.setSummaryOverview(objectMapper.<List<InstanceSummaryItem>>readValue(jsonNode.get("SummaryOverview").toString(), collectionType));
        return response;
    }


    public static ProductGroupInfoResponse invokeProductGroupInfo(JsonParser jsonParser) throws IOException {
        ProductGroupInfoResponse response = new ProductGroupInfoResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        JsonNode jsonNode = objectMapper.readTree(jsonParser);
        response.setRequestId(jsonNode.get("RequestId").asText());
        JavaType collectionType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, KvPair.class);
        response.setProductGroupSet(objectMapper.<List<KvPair>>readValue(jsonNode.get("ProductGroupSet").toString(), collectionType));
        return response;
    }


}
