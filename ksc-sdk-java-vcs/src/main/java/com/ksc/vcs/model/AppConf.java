package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public class AppConf implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8675402135140815764L;

	@JsonProperty(ParamConstant.RECOG)
    private List<AppRecog> recog;

    @JsonProperty(ParamConstant.NOTIFY)
    private AppNotify notify;

    @JsonProperty(ParamConstant.ARCHIVE)
    private AppArchive archive;

    public List<AppRecog> getRecog() {
        return recog;
    }

    public void setRecog(List<AppRecog> recog) {
        this.recog = recog;
    }

    public AppNotify getNotify() {
        return notify;
    }

    public void setNotify(AppNotify notify) {
        this.notify = notify;
    }

    public AppArchive getArchive() {
        return archive;
    }

    public void setArchive(AppArchive archive) {
        this.archive = archive;
    }
}
