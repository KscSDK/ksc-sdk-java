package com.ksc.vcs.model;

import com.ksc.KscWebServiceRequest;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for UpdateArchiveCfg.
 * </p>
 */
@ToString
public class UpdateArchiveCfgRequest extends KscWebServiceRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3128552534003641518L;

	private String uniqueName;

    private String app;
    
    private ScreenshotArchive screenshotArchive;

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

    public ScreenshotArchive getScreenshotArchive() {
        return screenshotArchive;
    }

    public void setScreenshotArchive(ScreenshotArchive screenshotArchive) {
        this.screenshotArchive = screenshotArchive;
    }

}
