package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class BlockedStream implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1088497014382745336L;

	@JsonProperty(ParamConstant.STREAM)
    private String stream;

    @JsonProperty(ParamConstant.TIME)
    private Long time;

    @JsonProperty(ParamConstant.SCREENSHOT)
    Screenshot screenshot;

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Screenshot getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(Screenshot screenshot) {
        this.screenshot = screenshot;
    }
}
