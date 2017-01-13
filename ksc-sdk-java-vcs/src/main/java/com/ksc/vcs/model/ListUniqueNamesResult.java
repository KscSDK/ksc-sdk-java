package com.ksc.vcs.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.ToString;

import java.util.List;

/**
 * <p>
 * Contains the output of ListUniqueNames.
 * </p>
 */
@ToString
public class ListUniqueNamesResult extends BaseResult {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 6892616029249549264L;
	
	private List<String> uniqueNamesList;

    public List<String> getUniqueNamesList() {
        return uniqueNamesList;
    }

    public void setUniqueNamesList(List<String> uniqueNamesList) {
        this.uniqueNamesList = uniqueNamesList;
    }

    @Override
    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "[]";
        try {
            jsonString = objectMapper.writeValueAsString(this.getUniqueNamesList());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }
}
