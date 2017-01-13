package com.ksc.vcs.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.ToString;

import java.util.List;


/**
 * <p>
 * Contains the output of ListConfigurations.
 * </p>
 */
@ToString
public class ListConfigurationsResult extends BaseResult {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5622901808222525670L;
	
	private List<GetConfigurationResult> configurationsList;

    public List<GetConfigurationResult> getConfigurationsList() {
        return configurationsList;
    }

    public void setConfigurationsList(List<GetConfigurationResult> configurationsList) {
        this.configurationsList = configurationsList;
    }

    @Override
    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "[]";
        try {
            jsonString = objectMapper.writeValueAsString(this.getConfigurationsList());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }
}
