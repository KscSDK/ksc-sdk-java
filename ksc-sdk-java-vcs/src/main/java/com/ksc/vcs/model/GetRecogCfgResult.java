package com.ksc.vcs.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.ToString;

import java.util.List;

/**
 * <p>
 * Contains the output of GetRecogCfg.
 * </p>
 */
@ToString
public class GetRecogCfgResult extends BaseResult {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2456553628579447430L;
	
	private List<AppRecog> recogCfgList;

    public List<AppRecog> getRecogCfgList() {
        return recogCfgList;
    }

    public void setRecogCfgList(List<AppRecog> recogCfgList) {
        this.recogCfgList = recogCfgList;
    }

    @Override
    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "[]";
        try {
            jsonString = objectMapper.writeValueAsString(this.getRecogCfgList());
        } catch (JsonProcessingException e) {
        }
        return jsonString;
    }
}
