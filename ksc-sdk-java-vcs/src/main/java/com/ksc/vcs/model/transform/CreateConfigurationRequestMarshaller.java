package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.CreateConfigurationRequest;
import com.ksc.vcs.model.ParamConstant;

import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;

import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * CreateConfigurationRequest Marshaller
 */

public class CreateConfigurationRequestMarshaller extends BaseMarshaller<CreateConfigurationRequest> implements
        Marshaller<Request<CreateConfigurationRequest>, CreateConfigurationRequest> {

    private static CreateConfigurationRequestMarshaller instance;

    private CreateConfigurationRequestMarshaller() {
    }

    public synchronized static CreateConfigurationRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new CreateConfigurationRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<CreateConfigurationRequest> marshall(CreateConfigurationRequest createConfigurationRequest) throws Exception {
        Request<CreateConfigurationRequest> request = this.doCommonProc(createConfigurationRequest, HttpMethodName.POST, ParamConstant.CREATE_CONFIGURATION_ACTION, createConfigurationRequest.getVersion());
        request.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());

        Map<String, Object> contentMap = new LinkedHashMap<String, Object>();
        contentMap.put(ParamConstant.UNIQUE_NAME, createConfigurationRequest.getUniqueName());
        contentMap.put(ParamConstant.APP, createConfigurationRequest.getApp());
        contentMap.put(ParamConstant.BUCKET, createConfigurationRequest.getBucket());
        if (!StringUtils.isNullOrEmpty(createConfigurationRequest.getUrl())) {
            contentMap.put(ParamConstant.URL, createConfigurationRequest.getUrl());
        }
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] content = objectMapper.writeValueAsString(contentMap).getBytes("UTF-8");

        request.setContent(new ByteArrayInputStream(content));
        request.addHeader(HttpHeaders.CONTENT_LENGTH, String.valueOf(content.length));
        return request;
    }

    @Override
    public void validateArgument(CreateConfigurationRequest originalRequest) throws Exception {
        if (originalRequest == null ||
                StringUtils.isNullOrEmpty(originalRequest.getUniqueName()) ||
                StringUtils.isNullOrEmpty(originalRequest.getApp()) ||
                StringUtils.isNullOrEmpty(originalRequest.getBucket())) {

            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}
