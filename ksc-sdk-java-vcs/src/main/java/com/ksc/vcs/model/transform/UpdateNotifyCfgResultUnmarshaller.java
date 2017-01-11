package com.ksc.vcs.model.transform;

import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.vcs.model.UpdateNotifyCfgResult;

/**
 * UpdateNotifyCfgResult Unmarshaller
 */

public class UpdateNotifyCfgResultUnmarshaller extends
        BaseJsonUnmarshaller<UpdateNotifyCfgResult, JsonUnmarshallerContext> {

    private static UpdateNotifyCfgResultUnmarshaller instance;

    public synchronized static UpdateNotifyCfgResultUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateNotifyCfgResultUnmarshaller();
        return instance;
    }

    @Override
    public UpdateNotifyCfgResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateNotifyCfgResult result = new UpdateNotifyCfgResult();
        this.handleSuccess(result, context);
        return result;
    }

    @Override
    public UpdateNotifyCfgResult handleException(Exception e) {
        UpdateNotifyCfgResult result = new UpdateNotifyCfgResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
