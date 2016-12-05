package com.ksc.cdn;

import com.ksc.cdn.model.logsetting.*;


/**
 * KscCdnLogSetting
 * 日志管理
 * @author jiangran@kingsoft.com
 * @date 2016/11/28
 */
public interface KscCdnLogSetting {
    /**
     * 日志下载
     * @param request
     * @return
     * @throws Exception
     */
    DownloadLogSettingResult downloadLogsetting(DownloadLogSettingRequest request) throws Exception;
}
