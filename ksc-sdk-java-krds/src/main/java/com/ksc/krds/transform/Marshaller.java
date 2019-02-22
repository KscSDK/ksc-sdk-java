package com.ksc.krds.transform;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.ksc.krds.exception.KWSClientException;
import com.ksc.krds.exception.KWSServiceException;
import com.xebia.jacksonlombok.JacksonLombokAnnotationIntrospector;
import lombok.extern.log4j.Log4j;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.ksc.krds.transform.TypeHelper.getPropertyDescriptors;


@Log4j
public abstract class Marshaller<TMarshall,TUnmashall> {
    private static ObjectMapper objectMapper = new ObjectMapper();
    private static Gson gson = new Gson();

    {
        objectMapper.setAnnotationIntrospector(new JacksonLombokAnnotationIntrospector());
        // to avoid new feature(field of response) added make client error
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        // ignored null params
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public Marshaller() {
    }

    abstract public RequestMessage<JsonNode> marshall(TMarshall request);

    public MultiValueMap<String,Object> marshall_content_as_query_params(TMarshall request){
        MultiValueMap params= new LinkedMultiValueMap<String, String>();
        try {
//            checkRequestOrResponse(request);
            Class<?> object_class = request.getClass();
            for (PropertyDescriptor propertyDescriptor :
                    getPropertyDescriptors(object_class)) {
                if (Objects.equals(propertyDescriptor.getName(), "class"))
                    continue;
                Field field = TypeHelper.getPropertyFieldWithinSuperClass(object_class, propertyDescriptor);
                field.setAccessible(true);
                for (Annotation annotation: field.getAnnotations()) {
                    if(annotation.annotationType()==QueryParam.class){
                        Object fieldValue = null;
                        QueryParam paramAnnotation = (QueryParam) annotation;
                        String paramName = paramAnnotation.paramName();
                        if(paramName.isEmpty()){
                            paramName = field.getName();
                        }
                        try {
                            fieldValue = field.get(request);
                        } catch (IllegalAccessException e) {
                            log.error("error dump query params",e);
                        }
                        if(fieldValue!=null){
                            if(fieldValue instanceof List){
                                if(((List) fieldValue).size()!=0)
                                    params.add(paramName,(List)fieldValue);
                            }else {
                                params.add(paramName, fieldValue.toString());
                            }
                        }
                    }

                }
            }
        } catch (NullPointerException e){
            throw new KWSClientException(String.format("Request param error:%s",e.getMessage()));
        }
        return params;
    }

    public String marshall_content(TMarshall request) throws KWSClientException {
        try {
//            checkRequestOrResponse(request);
            return objectMapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            throw new KWSClientException(e.getMessage(), e.getCause());
        } catch (NullPointerException e){
            throw new KWSClientException(String.format("Request param error:%s",e.getMessage()));
        }
    }
    abstract public TUnmashall unmarshall(ResponseMessage<JsonNode> response) throws KWSClientException ;

    protected TUnmashall unmarshall(JsonNode response, Class<TUnmashall> type) throws KWSClientException,KWSServiceException {
        try {
            TUnmashall result= objectMapper.treeToValue(response, type);
//            checkRequestOrResponse(result);
            return result;
        } catch (IOException e) {
            log.error("error parse json in unmarshall", e);
            throw new KWSClientException(e.getMessage(), e.getCause());
        } catch (NullPointerException e){
            throw new KWSClientException(String.format("Server response error:%s",e.getMessage()));
        } catch (Exception e){
            throw new KWSClientException(String.format("Fillin Uknown Error: %s",e.getMessage()));
        }
    }

    protected TUnmashall unmarshall_with_gson(JsonNode response, Class<TUnmashall> type) throws KWSClientException, KWSServiceException {
        try {
            TUnmashall result = gson.fromJson(response.toString(), type);
//            checkRequestOrResponse(result);
            return result;
        } catch (NullPointerException e) {
            throw new KWSClientException(String.format("Server response error:%s", e.getMessage()));
        }

    }
//    public <T> boolean checkRequestOrResponse(T request) {
//        return RequiredFieldChecker.check(request);
//    }
}

