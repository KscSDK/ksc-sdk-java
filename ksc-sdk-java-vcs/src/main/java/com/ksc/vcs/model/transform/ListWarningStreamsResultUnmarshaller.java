package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.vcs.model.ListWarningStreamsResult;
import com.ksc.vcs.model.WarningStream;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListWarningStreamsResult Unmarshaller
 */

public class ListWarningStreamsResultUnmarshaller extends
        BaseJsonUnmarshaller<ListWarningStreamsResult, JsonUnmarshallerContext> {

    private static ListWarningStreamsResultUnmarshaller instance;

    public synchronized static ListWarningStreamsResultUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListWarningStreamsResultUnmarshaller();
        return instance;
    }

    @Override
    public ListWarningStreamsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListWarningStreamsResult result = new ListWarningStreamsResult();
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
                result.setWarningStreamsList(new ListUnmarshaller<WarningStream>(
                        WarningStreamUnmarshaller.getInstance()).unmarshall(context));
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
    public ListWarningStreamsResult handleException(Exception e) {
        ListWarningStreamsResult result = new ListWarningStreamsResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
