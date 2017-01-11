package com.ksc.vcs.model;

import com.ksc.KscWebServiceRequest;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Contains the parameters for UpdateRecogCfg.
 * </p>
 */
@ToString
public class UpdateRecogCfgRequest extends KscWebServiceRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8314887598309389883L;

	private String uniqueName;

    private String app;

    private List<AppRecog> recogList;

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

    public List<AppRecog> getRecogList() {
        return recogList;
    }

    public void setRecogList(List<AppRecog> recogList) {
        this.recogList = recogList;
    }
}
