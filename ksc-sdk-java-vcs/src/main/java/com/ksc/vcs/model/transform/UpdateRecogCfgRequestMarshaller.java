package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.ParamConstant;
import com.ksc.vcs.model.UpdateRecogCfgRequest;
import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;

import java.io.ByteArrayInputStream;

/**
 * UpdateRecogCfgRequest Marshaller
 */

public class UpdateRecogCfgRequestMarshaller extends BaseMarshaller<UpdateRecogCfgRequest> implements
        Marshaller<Request<UpdateRecogCfgRequest>, UpdateRecogCfgRequest> {

    private static UpdateRecogCfgRequestMarshaller instance;

    private UpdateRecogCfgRequestMarshaller() {
    }

    public synchronized static UpdateRecogCfgRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateRecogCfgRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<UpdateRecogCfgRequest> marshall(UpdateRecogCfgRequest updateRecogCfgRequest) throws Exception {
        Request<UpdateRecogCfgRequest> request = this.doCommonProc(updateRecogCfgRequest, HttpMethodName.PUT, ParamConstant.UPDATE_RECOG_CFG_ACTION, updateRecogCfgRequest.getVersion());
        request.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        request.addParameter(ParamConstant.UNIQUE_NAME, updateRecogCfgRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, updateRecogCfgRequest.getApp());

        ObjectMapper objectMapper = new ObjectMapper();
        String serviceRecogCfgListStr = objectMapper.writeValueAsString(updateRecogCfgRequest.getRecogList());

        request.setContent(new ByteArrayInputStream(serviceRecogCfgListStr.getBytes("UTF-8")));
        return request;
    }

    @Override
    public void validateArgument(UpdateRecogCfgRequest originalRequest) throws Exception {
        if (originalRequest == null ||
                StringUtils.isNullOrEmpty(originalRequest.getUniqueName()) ||
                StringUtils.isNullOrEmpty(originalRequest.getApp()) ||
                originalRequest.getRecogList() == null ||
                originalRequest.getRecogList().size() <= 0) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }
}