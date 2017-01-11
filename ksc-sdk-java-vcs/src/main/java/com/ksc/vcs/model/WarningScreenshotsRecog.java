package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class WarningScreenshotsRecog implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5207083715045265669L;

	@JsonProperty(ParamConstant.RECOG_TYPE)
    private String recogType;

    @JsonProperty(ParamConstant.THRESHOLD)
    private String threshold;

    @JsonProperty(ParamConstant.RATE)
    private String rate;

    public String getRecogType() {
        return recogType;
    }

    public void setRecogType(String recogType) {
        this.recogType = recogType;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
