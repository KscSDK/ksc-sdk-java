package com.ksc.vcs.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.ToString;

import java.util.List;

/**
 * <p>
 * Contains the output of ListWarningStreams.
 * </p>
 */
@ToString
public class ListWarningStreamsResult extends BaseResult {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2055380034000750077L;
	
	private List<WarningStream> warningStreamsList;

    public List<WarningStream> getWarningStreamsList() {
        return warningStreamsList;
    }

    public void setWarningStreamsList(List<WarningStream> warningStreamsList) {
        this.warningStreamsList = warningStreamsList;
    }

    @Override
    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "[]";
        try {
            jsonString = objectMapper.writeValueAsString(this.getWarningStreamsList());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

}
