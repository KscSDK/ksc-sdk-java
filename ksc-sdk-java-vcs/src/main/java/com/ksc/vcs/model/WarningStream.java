package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class WarningStream implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1908730726657211686L;

	@JsonProperty(ParamConstant.STREAM)
    private String stream;

    @JsonProperty(ParamConstant.ALARM_TIME)
    private Long alarmTime;

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public Long getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
    }

}
