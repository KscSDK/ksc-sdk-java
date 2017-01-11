package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

/**
 * <p>
 * Contains the output of GetArchiveCfg.
 * </p>
 */
@ToString
public class GetArchiveCfgResult extends BaseResult {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5386093875181070449L;
	
	@JsonProperty(ParamConstant.SCREENSHOT_ARCHIVE)
    private ScreenshotArchive screenshotArchive;

    public ScreenshotArchive getScreenshotArchive() {
        return screenshotArchive;
    }

    public void setScreenshotArchive(ScreenshotArchive screenshotArchive) {
        this.screenshotArchive = screenshotArchive;
    }

}