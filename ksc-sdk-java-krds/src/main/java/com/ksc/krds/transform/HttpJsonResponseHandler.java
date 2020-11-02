package com.ksc.krds.transform;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.http.HttpResponse;
import com.ksc.http.HttpResponseHandler;
import com.ksc.krds.exception.KWSClientException;
import com.ksc.util.IOUtils;

import java.io.IOException;

public class HttpJsonResponseHandler implements HttpResponseHandler<JsonNode> {
    private ObjectMapper objectMapper;

    public HttpJsonResponseHandler() {
        objectMapper = new ObjectMapper();
    }

    @Override
    public JsonNode handle(HttpResponse response) throws KWSClientException {
        try {
            if (null == response.getContent()) {
                return null;
            }
            String string = IOUtils.toString(response.getContent());
            if(string.isEmpty()){
                string = "{}";
            }
            return objectMapper.readTree(string);
        } catch (IOException e) {
            throw new KWSClientException(e.getMessage(), e.getCause());
        }
    }
    public boolean needsConnectionLeftOpen(){
        return false;
    }
}
