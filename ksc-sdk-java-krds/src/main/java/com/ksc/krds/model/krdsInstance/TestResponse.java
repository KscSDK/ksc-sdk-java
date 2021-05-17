package com.ksc.krds.model.krdsInstance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestResponse {

    private Instance DBInstance;

    public Instance getDBInstance() {
        return DBInstance;
    }

    public void setDBInstance(Instance DBInstance) {
        this.DBInstance = DBInstance;
    }
}
