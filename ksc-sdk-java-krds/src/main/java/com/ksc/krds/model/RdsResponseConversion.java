package com.ksc.krds.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class RdsResponseConversion {

    public static <T> RdsResponse<T> invoke(JsonParser jsonParser, Class<T> clazz) throws IOException {
        return doInvoke(jsonParser, clazz,"data");
    }

    public static <T> RdsResponse<T> doInvoke(JsonParser jsonParser, Class<T> clazz,String key) throws IOException {
        RdsResponse<T> response = new RdsResponse<T>();
        ObjectMapper objectMapper = createObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonParser);
        JsonNode requestId = jsonNode.get("RequestId");
        if (requestId != null) {
            response.setRequestId(requestId.asText());
        }
        if (clazz != null) {
            JsonNode data = getData(jsonNode,key);
            response.setData(objectMapper.convertValue(data, clazz));
        }

        return response;
    }

    private static JsonNode getData(JsonNode jsonNode,String key) {
        JsonNode data = jsonNode.get(key);
        if (data == null) {
            data = jsonNode.get(upperCaseFirstLetter(key));
        }
        return data;
    }

    public static ObjectMapper createObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return objectMapper;
    }

    public static <T> T invoke1(JsonParser jsonParser, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = createObjectMapper();
        return objectMapper.convertValue(objectMapper.readTree(jsonParser), clazz);
    }

    public static <T> String toJson(T t) {
        if (t == null) {
            return null;
        }

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
            objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
            return objectMapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String upperCaseFirstLetter(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }
}
