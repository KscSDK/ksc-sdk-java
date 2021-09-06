package com.ksc.krds.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map;

public class RdsResponseConversion {

    public static <T> RdsResponse<T> invoke(JsonParser jsonParser, Class<T> clazz) throws Exception {
        return doInvoke(jsonParser, clazz);
    }

    public static <T> RdsResponse<T> doInvoke(JsonParser jsonParser, Class<T> clazz) throws Exception {
        RdsResponse<T> response = new RdsResponse<T>();
        ObjectMapper objectMapper = createObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonParser);
        Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> next = fields.next();
            String field = next.getKey();
            JsonNode value = next.getValue();
            if (value == null) {
                continue;
            }
            if ("RequestId".equals(field)) {
                response.setRequestId(value.asText());
                continue;
            }
            if (clazz == null) {
                continue;
            }
            response.setData(objectMapper.convertValue(value, clazz));
        }

        return response;
    }

    public static ObjectMapper createObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return objectMapper;
    }

    public static <T> T invoke1(JsonParser jsonParser, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = createObjectMapper();
        return objectMapper.convertValue(jsonParser, clazz);
//        return objectMapper.convertValue(objectMapper.readTree(jsonParser), clazz);
    }

}
