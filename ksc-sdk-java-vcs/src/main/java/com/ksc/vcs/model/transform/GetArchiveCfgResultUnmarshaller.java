package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.vcs.model.GetArchiveCfgResult;
import com.ksc.vcs.model.ParamConstant;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetArchiveCfgResult Unmarshaller
 */

public class GetArchiveCfgResultUnmarshaller extends
        BaseJsonUnmarshaller<GetArchiveCfgResult, JsonUnmarshallerContext> {

    private static GetArchiveCfgResultUnmarshaller instance;

    public synchronized static GetArchiveCfgResultUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetArchiveCfgResultUnmarshaller();
        return instance;
    }

    @Override
    public GetArchiveCfgResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetArchiveCfgResult result = new GetArchiveCfgResult();
        this.handleSuccess(result, context);

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression(ParamConstant.SCREENSHOT_ARCHIVE, targetDepth)) {
                    context.nextToken();
                    result.setScreenshotArchive(ScreenshotArchiveUnmarshaller
                            .getInstance().unmarshall(context));
                }

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
    public GetArchiveCfgResult handleException(Exception e) {
        GetArchiveCfgResult result = new GetArchiveCfgResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}