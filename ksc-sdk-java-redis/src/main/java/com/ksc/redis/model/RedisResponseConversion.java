package com.ksc.redis.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;


public class RedisResponseConversion {
    /**
     * Jackson resolves as an object through InputStream
     *
     * @param jsonParser
     * @param clazz
     * @return
     * @throws IOException
     */
    public static <T> RedisResponse<T> invoke(JsonParser jsonParser, Class<T> clazz) throws IOException {
        RedisResponse<T> redisResponse = new RedisResponse<T>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        JsonNode jsonNode = objectMapper.readTree(jsonParser);
        redisResponse.setRequestId(jsonNode.get("RequestId").asText());
        if (clazz != null) {
            redisResponse.setData(objectMapper.convertValue(jsonNode.get("Data"), clazz));
        }

        return redisResponse;
    }

    public static <T> T invoke1(JsonParser jsonParser, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return objectMapper.convertValue(objectMapper.readTree(jsonParser), clazz);
    }

    /**
     * Jackson parses JSON objects as strings
     *
     * @param t
     * @param <T>
     * @return
     */
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
}
