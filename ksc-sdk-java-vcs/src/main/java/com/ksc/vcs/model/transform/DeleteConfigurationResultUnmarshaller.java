package com.ksc.vcs.model.transform;

import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.vcs.model.DeleteConfigurationResult;

/**
 * DeleteConfigurationResult Unmarshaller
 */

public class DeleteConfigurationResultUnmarshaller extends
        BaseJsonUnmarshaller<DeleteConfigurationResult, JsonUnmarshallerContext> {

    private static DeleteConfigurationResultUnmarshaller instance;

    public synchronized static DeleteConfigurationResultUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteConfigurationResultUnmarshaller();
        return instance;
    }

    @Override
    public DeleteConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteConfigurationResult result = new DeleteConfigurationResult();
        this.handleSuccess(result, context);
        return result;
    }

    @Override
    public DeleteConfigurationResult handleException(Exception e) {
        DeleteConfigurationResult result = new DeleteConfigurationResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
