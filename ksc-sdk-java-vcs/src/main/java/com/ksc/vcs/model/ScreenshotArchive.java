package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class ScreenshotArchive implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3990350980180535353L;

	@JsonProperty(ParamConstant.BUCKET)
    private String bucket;

    @JsonProperty(ParamConstant.BLOCK_OBJECT)
    private String blockObject;

    @JsonProperty(ParamConstant.ALARM_OBJECT)
    private String alarmObject;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getBlockObject() {
        return blockObject;
    }

    public void setBlockObject(String blockObject) {
        this.blockObject = blockObject;
    }

    public String getAlarmObject() {
        return alarmObject;
    }

    public void setAlarmObject(String alarmObject) {
        this.alarmObject = alarmObject;
    }
}
