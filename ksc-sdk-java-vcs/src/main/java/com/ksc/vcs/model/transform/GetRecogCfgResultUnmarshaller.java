package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.vcs.model.AppRecog;
import com.ksc.vcs.model.GetRecogCfgResult;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRecogCfgResult Unmarshaller
 */

public class GetRecogCfgResultUnmarshaller extends BaseJsonUnmarshaller<GetRecogCfgResult, JsonUnmarshallerContext> {

    private static GetRecogCfgResultUnmarshaller instance;

    public synchronized static GetRecogCfgResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetRecogCfgResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public GetRecogCfgResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRecogCfgResult result = new GetRecogCfgResult();
        this.handleSuccess(result, context);

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;
            if (token == START_ARRAY) {
                result.setRecogCfgList(new ListUnmarshaller<AppRecog>(
                        AppRecogUnmarshaller.getInstance()).unmarshall(context));
                break;
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                        currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return result;
    }

    @Override
    public GetRecogCfgResult handleException(Exception e) {
        GetRecogCfgResult result = new GetRecogCfgResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}