package com.ksc.cdn;

import com.ksc.cdn.model.domain.blockurl.BlockDomainUrlRequest;
import com.ksc.cdn.model.domain.blockurl.GetBlockUrlQuotaResponse;
import com.ksc.cdn.model.domain.blockurl.GetBlockUrlTaskRequest;
import com.ksc.cdn.model.domain.blockurl.GetBlockUrlTaskResponse;

/**
 * description：
 * author：YANGXUEYI
 * date: 2017/7/18
 * mail：yangxueyi@kingsoft.com
 */
public interface KscCdnBlockUrl {

    /**
     * 屏蔽、解除屏蔽URL。
     * @param request
     */
    public void blockDomainUrl(BlockDomainUrlRequest request) throws Exception;

    /**
     * 获取屏蔽URL任务进度百分比及状态，查看任务是否在全网生效。
     * @param request
     */
    public GetBlockUrlTaskResponse getBlockUrlTask(GetBlockUrlTaskRequest request) throws Exception;

    /**
     * 获取屏蔽URL最大限制数量，及剩余的条数。
     */
    public GetBlockUrlQuotaResponse getBlockUrlQuota() throws Exception;
}
