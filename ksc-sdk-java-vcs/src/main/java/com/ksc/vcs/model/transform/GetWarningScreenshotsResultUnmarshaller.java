package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.vcs.model.GetWarningScreenshotsResult;
import com.ksc.vcs.model.WarningScreenshots;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetWarningScreenshotsResult Unmarshaller
 */

public class GetWarningScreenshotsResultUnmarshaller extends BaseJsonUnmarshaller<GetWarningScreenshotsResult, JsonUnmarshallerContext> {

    private static GetWarningScreenshotsResultUnmarshaller instance;

    public synchronized static GetWarningScreenshotsResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetWarningScreenshotsResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public GetWarningScreenshotsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWarningScreenshotsResult result = new GetWarningScreenshotsResult();
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
                result.setWarningScreenshotsList(new ListUnmarshaller<WarningScreenshots>(
                        WarningScreenshotsUnmarshaller.getInstance()).unmarshall(context));
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
    public GetWarningScreenshotsResult handleException(Exception e) {
        GetWarningScreenshotsResult result = new GetWarningScreenshotsResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
