package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
public class AppRecog implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7884994552085335736L;

	@JsonProperty(ParamConstant.RECOG_TYPE)
    private String recogType;

    @JsonProperty(ParamConstant.ENABLE)
    private Boolean enable;

    @JsonProperty(ParamConstant.THRESHOLD)
    private List<Double> threshold;

    public enum ScreenShotMonitor {
        NONE(0), PORN(1), TERRORISM(2), PORN_AND_TERRORISM(3), GROUP(4), PORN_AND_GROUP(
                5), TERRORISM_AND_GROUP(6), ALL(7);
        private int type;

        ScreenShotMonitor(int type) {
            this.setType(type);
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

    public String getRecogType() {
        return recogType;
    }

    public void setRecogType(ScreenShotMonitor recogType) {
        this.recogType = recogType.name();
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public List<Double> getThreshold() {
        return threshold;
    }

    public void setThreshold(List<Double> threshold) {
        this.threshold = threshold;
    }

}
