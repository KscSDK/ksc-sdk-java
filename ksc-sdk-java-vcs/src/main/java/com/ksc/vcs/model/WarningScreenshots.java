package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public class WarningScreenshots implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8328745519736797057L;

	@JsonProperty(ParamConstant.BUCKET)
    private String bucket;

    @JsonProperty(ParamConstant.KEY)
    private String key;

    @JsonProperty(ParamConstant.TIME)
    private Long time;

    @JsonProperty(ParamConstant.RECOG)
    private List<WarningScreenshotsRecog> recog;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<WarningScreenshotsRecog> getRecog() {
        return recog;
    }

    public void setRecog(List<WarningScreenshotsRecog> recog) {
        this.recog = recog;
    }
}
