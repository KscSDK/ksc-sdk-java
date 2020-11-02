package com.ksc.cdn;

import com.ksc.cdn.model.domain.ipcheck.IpCheckRequest;
import com.ksc.cdn.model.domain.ipcheck.IpCheckResponse;

/**
 * Ip检测
 */
public interface KscIpCheck {

    /**
     * Ip检测
     * @param request
     */
    public IpCheckResponse ipCheck(IpCheckRequest request) throws Exception;

}
