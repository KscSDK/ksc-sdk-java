package com.ksc.vcs.model.transform;

import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.vcs.model.UpdateRecogCfgResult;

/**
 * UpdateRecogCfgResult Unmarshaller
 */

public class UpdateRecogCfgResultUnmarshaller extends BaseJsonUnmarshaller<UpdateRecogCfgResult, JsonUnmarshallerContext> {

    private static UpdateRecogCfgResultUnmarshaller instance;

    public synchronized static UpdateRecogCfgResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateRecogCfgResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public UpdateRecogCfgResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateRecogCfgResult result = new UpdateRecogCfgResult();
        this.handleSuccess(result, context);
        return result;
    }

    @Override
    public UpdateRecogCfgResult handleException(Exception e) {
        UpdateRecogCfgResult result = new UpdateRecogCfgResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}