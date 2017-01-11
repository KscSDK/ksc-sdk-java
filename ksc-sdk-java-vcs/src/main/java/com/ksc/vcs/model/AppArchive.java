package com.ksc.vcs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class AppArchive implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 188311892272213751L;
	
	@JsonProperty(ParamConstant.SCREENSHOT_ARCHIVE)
    private ScreenshotArchive screenshotArchive;

    public ScreenshotArchive getScreenshotArchive() {
        return screenshotArchive;
    }

    public void setScreenshotArchive(ScreenshotArchive screenshotArchive) {
        this.screenshotArchive = screenshotArchive;
    }
}
