package com.ksc.vcs.model.transform;

import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;
import com.ksc.vcs.model.BlockStreamRequest;
import com.ksc.vcs.model.ParamConstant;
import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;

/**
 * BlockStreamRequest Marshaller
 */

public class BlockStreamRequestMarshaller extends
        BaseMarshaller<BlockStreamRequest> implements
        Marshaller<Request<BlockStreamRequest>, BlockStreamRequest> {

    private static BlockStreamRequestMarshaller instance;

    private BlockStreamRequestMarshaller() {
    }

    public synchronized static BlockStreamRequestMarshaller getInstance() {
        if (instance == null) {
            instance = new BlockStreamRequestMarshaller();
        }
        return instance;
    }

    @Override
    public Request<BlockStreamRequest> marshall(
            BlockStreamRequest blockStreamRequest) throws Exception {
        Request<BlockStreamRequest> request = this.doCommonProc(
                blockStreamRequest, HttpMethodName.PUT, ParamConstant.BLOCK_STREAM_ACTION,
                blockStreamRequest.getVersion());
        request.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        request.addParameter(ParamConstant.UNIQUE_NAME,
                blockStreamRequest.getUniqueName());
        request.addParameter(ParamConstant.APP, blockStreamRequest.getApp());
        request.addParameter(ParamConstant.STREAM, blockStreamRequest.getStream());
        return request;
    }

    @Override
    public void validateArgument(BlockStreamRequest originalRequest)
            throws Exception {
        if (originalRequest == null
                || StringUtils.isNullOrEmpty(originalRequest.getUniqueName())
                || StringUtils.isNullOrEmpty(originalRequest.getApp())
                || StringUtils.isNullOrEmpty(originalRequest.getStream())) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
    }

}
