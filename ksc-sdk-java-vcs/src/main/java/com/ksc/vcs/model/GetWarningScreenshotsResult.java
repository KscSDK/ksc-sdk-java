package com.ksc.vcs.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.ToString;

import java.util.List;

/**
 * <p>
 * Contains the output of GetWarningScreenshots.
 * </p>
 */
@ToString
public class GetWarningScreenshotsResult extends BaseResult {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -5167064305535628360L;
	
	private List<WarningScreenshots> warningScreenshotsList;

    public List<WarningScreenshots> getWarningScreenshotsList() {
        return warningScreenshotsList;
    }

    public void setWarningScreenshotsList(List<WarningScreenshots> warningScreenshotsList) {
        this.warningScreenshotsList = warningScreenshotsList;
    }

    @Override
    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "[]";
        try {
            jsonString = objectMapper.writeValueAsString(this.getWarningScreenshotsList());
        } catch (JsonProcessingException e) {
        }
        return jsonString;
    }
}
