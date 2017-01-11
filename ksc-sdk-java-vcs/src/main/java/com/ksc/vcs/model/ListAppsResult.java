package com.ksc.vcs.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.ToString;

import java.util.List;

/**
 * <p>
 * Contains the output of ListApps.
 * </p>
 */
@ToString
public class ListAppsResult extends BaseResult {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5172830970421797595L;
	
	private List<String> appsList;

    public List<String> getAppsList() {
        return appsList;
    }

    public void setAppsList(List<String> appsList) {
        this.appsList = appsList;
    }

    @Override
    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "[]";
        try {
            jsonString = objectMapper.writeValueAsString(this.getAppsList());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }
}
