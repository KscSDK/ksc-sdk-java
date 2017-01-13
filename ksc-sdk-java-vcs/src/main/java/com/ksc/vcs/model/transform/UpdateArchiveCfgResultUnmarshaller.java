package com.ksc.vcs.model.transform;

import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.vcs.model.UpdateArchiveCfgResult;

/**
 * UpdateArchiveCfgResult Unmarshaller
 */

public class UpdateArchiveCfgResultUnmarshaller extends BaseJsonUnmarshaller<UpdateArchiveCfgResult, JsonUnmarshallerContext> {

    private static UpdateArchiveCfgResultUnmarshaller instance;

    public synchronized static UpdateArchiveCfgResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateArchiveCfgResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public UpdateArchiveCfgResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateArchiveCfgResult result = new UpdateArchiveCfgResult();
        this.handleSuccess(result, context);
        return result;
    }

    @Override
    public UpdateArchiveCfgResult handleException(Exception e) {
        UpdateArchiveCfgResult result = new UpdateArchiveCfgResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
