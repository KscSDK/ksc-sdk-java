package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public class AppNotify implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6885747650391015086L;

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
