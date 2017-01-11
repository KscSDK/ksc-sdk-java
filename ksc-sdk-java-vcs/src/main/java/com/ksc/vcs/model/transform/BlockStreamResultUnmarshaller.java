package com.ksc.vcs.model.transform;

import com.ksc.KscServiceException;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.vcs.model.BlockStreamResult;

/**
 * BlockStreamResult Unmarshaller
 */

public class BlockStreamResultUnmarshaller extends BaseJsonUnmarshaller<BlockStreamResult, JsonUnmarshallerContext> {

    private static BlockStreamResultUnmarshaller instance;

    public synchronized static BlockStreamResultUnmarshaller getInstance() {
        if (instance == null) {
            instance = new BlockStreamResultUnmarshaller();
        }
        return instance;
    }

    @Override
    public BlockStreamResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BlockStreamResult result = new BlockStreamResult();
        this.handleSuccess(result, context);
        return result;
    }

    @Override
    public BlockStreamResult handleException(Exception e) {
        BlockStreamResult result = new BlockStreamResult();
        if (e instanceof KscServiceException) {
            this.handleKscServiceException(result, (KscServiceException) e);
        }
        return result;
    }
}
