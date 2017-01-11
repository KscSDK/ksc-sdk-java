package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.ParamConstant;
import com.ksc.vcs.model.UpdateNotifyCfgRequest;
import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;

import java.io.ByteArrayInputStream;

/**
 * UpdateNotifyCfgRequest Marshaller
 */

public class UpdateNotifyCfgRequestMarshaller extends BaseMarshaller<UpdateNotifyCfgRequest> implements
        Marshaller<Request<UpdateNotifyCfgRequest>, UpdateNotifyCfgRequest> {

    private static UpdateNotifyCfgRequestMarshaller instance;

    private UpdateNotifyCfgRequestMarshaller() {
    }

    public synchronized static UpdateNotifyCfgRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateNotifyCfgRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<UpdateNotifyCfgRequest> marshall(UpdateNotifyCfgRequest updateNotifyCfgRequest) throws Exception {
        Request<UpdateNotifyCfgRequest> request = this.doCommonProc(updateNotifyCfgRequest, HttpMethodName.PUT, ParamConstant.UPDATE_NOTIFY_CFG_ACTION, updateNotifyCfgRequest.getVersion());
        request.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        request.addParameter(ParamConstant.UNIQUE_NAME, updateNotifyCfgRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, updateNotifyCfgRequest.getApp());

        ObjectMapper objectMapper = new ObjectMapper();
        String serviceRecogCfgListStr = objectMapper.writeValueAsString(updateNotifyCfgRequest.getNotifyCfg());

        request.setContent(new ByteArrayInputStream(serviceRecogCfgListStr.getBytes("UTF-8")));
        return request;
    }

    @Override
    public void validateArgument(UpdateNotifyCfgRequest originalRequest) throws Exception {
        if (originalRequest == null ||
                StringUtils.isNullOrEmpty(originalRequest.getUniqueName()) ||
                StringUtils.isNullOrEmpty(originalRequest.getApp()) ||
                originalRequest.getNotifyCfg() == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}
