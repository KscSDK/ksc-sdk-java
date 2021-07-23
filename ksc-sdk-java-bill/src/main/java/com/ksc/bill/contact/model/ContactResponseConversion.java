package com.ksc.bill.contact.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;


public class ContactResponseConversion {
    /**
     * Jackson resolves as an object through InputStream
     *
     * @param jsonParser
     * @param clazz
     * @return
     * @throws IOException
     */
    public static <T> ContactResponse<T> invoke(JsonParser jsonParser, Class<T> clazz) throws IOException {
        ContactResponse<T> response = new ContactResponse<T>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        JsonNode jsonNode = objectMapper.readTree(jsonParser);
        response.setRequestId(jsonNode.get("RequestId").asText());
        if (clazz != null) {
            response.setData(objectMapper.convertValue(jsonNode.get("Data"), clazz));
        }

        return response;
    }


}
