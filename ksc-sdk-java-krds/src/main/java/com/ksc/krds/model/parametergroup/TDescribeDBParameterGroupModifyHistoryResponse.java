package com.ksc.krds.model.parametergroup;

import lombok.ToString;

import java.util.ArrayList;

@ToString
public class TDescribeDBParameterGroupModifyHistoryResponse {
    private Integer total_count;
    private String request_id;
    private ArrayList<History> history;

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public ArrayList<History> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<History> history) {
        this.history = history;
    }
    @ToString
    static class History{
        private String id;
        private String configuration_key;
        private String old_value;
        private String new_value;
        private String created;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getConfiguration_key() {
            return configuration_key;
        }

        public void setConfiguration_key(String configuration_key) {
            this.configuration_key = configuration_key;
        }

        public String getOld_value() {
            return old_value;
        }

        public void setOld_value(String old_value) {
            this.old_value = old_value;
        }

        public String getNew_value() {
            return new_value;
        }

        public void setNew_value(String new_value) {
            this.new_value = new_value;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }
    }
}