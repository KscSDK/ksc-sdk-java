package com.ksc.cdn.model.logsetting;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * ListLogSettingsRequest
 * 日志查询结果列表
 * @author jiangran@kingsoft.com
 * @date 2016/11/30
 */
@Deprecated
public class ListLogSettingsRequest implements GeneralRequest {
    /**
     * 粒度（可选，默认为all）（若传值，只能是0和1）（0:小时，1:天, 2:5分钟）
     */
    private String granularity;
    /**
     * 日志开启状态（可选，默认为all）（若传值，只能是0和1）（0 关闭，1 开启）
     */
    private String status;
    /**
     * 加速类型（可选，默认为all）（若传值，只能是1,2,3,4,5）（1 下载加速，2 直播加速，3 点播加速，4 上行加速，5 网页加速）
     */
    private String type;
    /**
     * 域名（可选，默认为all）
     */
    private String domain;
    /**
     * 页码（可选，默认为0）
     */
    private String pageIndex;
    /**
     * 每页大小（可选，默认为10）
     */
    private String pageSize;

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("GetLogSetting","2016-05-20","/2016-05-20/log/logSetting");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {

        Map<String,String> params=new HashMap<String, String>();
        if (StringUtils.isNotBlank(granularity)) {
            params.put("granularity", granularity);
        }
        if (StringUtils.isNotBlank(status)) {
            params.put("status", status);
        }
        if (StringUtils.isNotBlank(type)) {
            params.put("type", type);
        }
        if (StringUtils.isNotBlank(domain)) {
            params.put("domain", StringUtils.replace(domain, " ", ""));
        }
        if (StringUtils.isNotBlank(pageIndex)) {
            params.put("pageIndex", pageIndex);
        }
        if (StringUtils.isNotBlank(pageSize)) {
            params.put("pageSize", pageSize);
        }

        return params;
    }
}
