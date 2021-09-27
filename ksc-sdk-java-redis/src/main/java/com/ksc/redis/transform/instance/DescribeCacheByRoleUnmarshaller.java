package com.ksc.redis.transform.instance;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.redis.model.RedisResponse;
import com.ksc.redis.model.RedisResponseConversion;
import com.ksc.redis.model.instance.DescribeCacheByRoleResponse;
import com.ksc.redis.model.instance.DescribeRedisResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName: DescribeCacheByRoleUnmarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeCacheByRoleUnmarshaller implements Unmarshaller<RedisResponse<List<DescribeCacheByRoleResponse>>, JsonUnmarshallerContext> {

    @Override
    public RedisResponse<List<DescribeCacheByRoleResponse>> unmarshall(JsonUnmarshallerContext in) throws Exception {
        List<DescribeCacheByRoleResponse> responses = new ArrayList<DescribeCacheByRoleResponse>();
        RedisResponse<List<DescribeCacheByRoleResponse>> redisResponse = new RedisResponse<List<DescribeCacheByRoleResponse>>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        JsonNode jsonNode = objectMapper.readTree(in.getJsonParser());
        redisResponse.setRequestId(jsonNode.get("RequestId").asText());
        redisResponse.setData(objectMapper.convertValue(jsonNode.get("Data"), responses.getClass()));
        return redisResponse;
    }
}
