package com.ksc.krds.model.database;

import java.util.List;
import java.util.Map;

public class GetMysqlCollationsResponse {

    private Map<String, List<String>> Collations;

    public Map<String, List<String>> getCollations() {
        return Collations;
    }

    public void setCollations(Map<String, List<String>> collations) {
        Collations = collations;
    }
}
