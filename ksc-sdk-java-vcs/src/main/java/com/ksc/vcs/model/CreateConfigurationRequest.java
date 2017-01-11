package com.ksc.vcs.model;

import com.ksc.KscWebServiceRequest;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateConfiguration.
 * </p>
 */
@ToString
public class CreateConfigurationRequest extends KscWebServiceRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3850550733272079646L;

	private String uniqueName;

    private String app;

    private String bucket;

    private String url;

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

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
