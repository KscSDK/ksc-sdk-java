package com.ksc.vcs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.vcs.model.BlockedStream;
import com.ksc.vcs.model.GetBlockedStreamsResult;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetBlockedStreamsResult Unmarshaller
 */

public class GetBlockedStreamsResultUnmarshaller extends
        BaseJsonUnmarshaller<GetBlockedStreamsResult, JsonUnmarshallerContext> {

    private static GetBlockedStreamsResultUnmarshaller instance;

    public synchronized static GetBlockedStreamsResultUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBlockedStreamsResultUnmarshaller();
        return instance;
    }

    @Override
    public GetBlockedStreamsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetBlockedStreamsResult result = new GetBlockedStreamsResult();
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
                result.setBlockedStreamsList(new ListUnmarshaller<BlockedStream>(
                        BlockedStreamUnmarshaller.getInstance()).unmarshall(context));
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
    public GetBlockedStreamsResult handleException(Exception e) {
        GetBlockedStreamsResult result = new GetBlockedStreamsResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
