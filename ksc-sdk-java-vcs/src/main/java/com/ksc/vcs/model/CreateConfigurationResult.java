package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

/**
 * <p>
 * Contains the output of CreateConfiguration.
 * </p>
 */
@ToString
public class CreateConfigurationResult extends BaseResult {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8203220546642531789L;

	@JsonProperty(ParamConstant.UNIQUE_NAME)
    private String uniqueName;

    @JsonProperty(ParamConstant.APP)
    private String app;

    @JsonProperty(ParamConstant.CONF)
    private AppConf conf;

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public AppConf getConf() {
        return conf;
    }

    public void setConf(AppConf conf) {
        this.conf = conf;
    }

}
