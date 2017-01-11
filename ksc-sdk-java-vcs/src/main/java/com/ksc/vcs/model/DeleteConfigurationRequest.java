package com.ksc.vcs.model;

import com.ksc.KscWebServiceRequest;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteConfiguration.
 * </p>
 */
@ToString
public class DeleteConfigurationRequest extends KscWebServiceRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7698378084973021254L;

	private String uniqueName;

    private String app;

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
}
