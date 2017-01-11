package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.List;

/**
 * <p>
 * Contains the output of GetNotifyCfg.
 * </p>
 */
@ToString
public class GetNotifyCfgResult extends BaseResult {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7199804262192446734L;

	@JsonProperty(ParamConstant.URL)
    private String url;

    @JsonProperty(ParamConstant.NOTIFY_TYPE)
    private List<String> notifyType;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(List<String> notifyType) {
        this.notifyType = notifyType;
    }
}
