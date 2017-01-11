package com.ksc.vcs.model.transform;

import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.vcs.model.RecoverStreamResult;

/**
 * RecoverStreamResult Unmarshaller
 */

public class RecoverStreamResultUnmarshaller extends BaseJsonUnmarshaller<RecoverStreamResult, JsonUnmarshallerContext> {

    private static RecoverStreamResultUnmarshaller instance;

    public synchronized static RecoverStreamResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RecoverStreamResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public RecoverStreamResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecoverStreamResult result = new RecoverStreamResult();
        this.handleSuccess(result, context);
        return result;
    }

    @Override
    public RecoverStreamResult handleException(Exception e) {
        RecoverStreamResult result = new RecoverStreamResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
