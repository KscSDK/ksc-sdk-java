package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.ParamConstant;
import com.ksc.vcs.model.UpdateArchiveCfgRequest;

import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * UpdateArchiveCfgRequest Marshaller
 */

public class UpdateArchiveCfgRequestMarshaller extends
        BaseMarshaller<UpdateArchiveCfgRequest> implements
        Marshaller<Request<UpdateArchiveCfgRequest>, UpdateArchiveCfgRequest> {

    private static UpdateArchiveCfgRequestMarshaller instance;

    private UpdateArchiveCfgRequestMarshaller() {
    }

    public synchronized static UpdateArchiveCfgRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateArchiveCfgRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<UpdateArchiveCfgRequest> marshall(
            UpdateArchiveCfgRequest updateArchiveCfgRequest) throws Exception {
        Request<UpdateArchiveCfgRequest> request = this.doCommonProc(
                updateArchiveCfgRequest, HttpMethodName.PUT, ParamConstant.UPDATE_ARCHIVE_CFG_ACTION,
                updateArchiveCfgRequest.getVersion());
        request.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        request.addParameter(ParamConstant.UNIQUE_NAME,
                updateArchiveCfgRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, updateArchiveCfgRequest.getApp());

        Map<String, Object> contentMap = new HashMap<String, Object>();
        contentMap.put(ParamConstant.SCREENSHOT_ARCHIVE, updateArchiveCfgRequest.getScreenshotArchive());
        ObjectMapper objectMapper = new ObjectMapper();
        String screenshotArchiveStr = objectMapper.writeValueAsString(contentMap);

        request.setContent(new ByteArrayInputStream(screenshotArchiveStr
                .getBytes("UTF-8")));
        return request;
    }

    @Override
    public void validateArgument(UpdateArchiveCfgRequest originalRequest)
            throws Exception {
        if (originalRequest == null
                || StringUtils.isNullOrEmpty(originalRequest.getUniqueName())
                || StringUtils.isNullOrEmpty(originalRequest.getApp())
                || originalRequest.getScreenshotArchive() == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }

}
