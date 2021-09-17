package com.ksc.redis.model.parameter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ksc.redis.model.instance.ListRedisResponse;

import java.util.Date;
import java.util.List;

/***
 * @ClassName: DescribeCacheParameterGroupsResponse
 * @Description:TODO
 * @version : V1.0
 */
public class DescribeCacheParameterGroupsResponse {
    public List<Listparameter> getList() {
        return list;
    }

    public void setList(List<Listparameter> list) {
        this.list = list;
    }

    private List<Listparameter> list;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Listparameter {
        private String id;
        private String name;
        private String description;
        private String paramVersion;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getParamVersion() {
            return paramVersion;
        }

        public void setParamVersion(String paramVersion) {
            this.paramVersion = paramVersion;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public Date getCreated() {
            return created;
        }

        public void setCreated(Date created) {
            this.created = created;
        }

        public Date getUpdated() {
            return updated;
        }

        public void setUpdated(Date updated) {
            this.updated = updated;
        }

        private String engine;
        private Date created;
        private Date updated;


    }

}
