package com.ksc.redis.model.instance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatisticDBInstancesResponse {
    private List<Partition> partition;
    private Partition count;

    public List<Partition> getPartition() {
        return partition;
    }

    public void setPartition(List<Partition> partition) {
        this.partition = partition;
    }

    public Partition getCount() {
        return count;
    }

    public void setCount(Partition count) {
        this.count = count;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Partition {
        private String name;
        private String code;
        private Integer total;
        private List<Statistics> statistics;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public List<Statistics> getStatistics() {
            return statistics;
        }

        public void setStatistics(List<Statistics> statistics) {
            this.statistics = statistics;
        }
    }


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Statistics {
        private String name;
        private String code;
        private Integer total;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }
    }
}
