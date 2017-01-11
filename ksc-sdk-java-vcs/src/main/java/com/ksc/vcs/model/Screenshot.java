package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class Screenshot implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2631419921400355295L;

	@JsonProperty(ParamConstant.BUCKET)
    private String bucket;

    @JsonProperty(ParamConstant.KEY)
    private String key;

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

}
