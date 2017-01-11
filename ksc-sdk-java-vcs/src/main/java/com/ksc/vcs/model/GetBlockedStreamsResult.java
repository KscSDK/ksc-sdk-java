package com.ksc.vcs.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.ToString;

import java.util.List;

/**
 * <p>
 * Contains the output of GetBlockedStreams.
 * </p>
 */
@ToString
public class GetBlockedStreamsResult extends BaseResult {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9057180828583250050L;
	
	private List<BlockedStream> blockedStreamsList;

    public List<BlockedStream> getBlockedStreamsList() {
        return blockedStreamsList;
    }

    public void setBlockedStreamsList(List<BlockedStream> blockedStreamsList) {
        this.blockedStreamsList = blockedStreamsList;
    }

    @Override
    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "[]";
        try {
            jsonString = objectMapper.writeValueAsString(this.getBlockedStreamsList());
        } catch (JsonProcessingException e) {
        }
        return jsonString;
    }
}
