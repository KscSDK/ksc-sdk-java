package com.ksc.vcs.model;

import com.ksc.KscWebServiceRequest;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for UpdateNotifyCfg.
 * </p>
 */
@ToString
public class UpdateNotifyCfgRequest extends KscWebServiceRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8125278714275111194L;

	private String uniqueName;

    private String app;

    private AppNotify notifyCfg;

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

    public AppNotify getNotifyCfg() {
        return notifyCfg;
    }

    public void setNotifyCfg(AppNotify notifyCfg) {
        this.notifyCfg = notifyCfg;
    }
}
