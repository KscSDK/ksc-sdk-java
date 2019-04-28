package com.ksc.redis.model.security;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRedisSecurityGroupResponse {
    private String securityGroupId;
    private String name;
    private String description;
    private List<RulesVo> rules;
    private Date created;
    private Date updated;

    public static class RulesVo {
        private String securityRuleId;
        private String cidr;
        private String from_port;
        private String to_port;
        private String protocol;
        private String created;

        public String getSecurityRuleId() {
            return securityRuleId;
        }

        public void setSecurityRuleId(String securityRuleId) {
            this.securityRuleId = securityRuleId;
        }

        public String getCidr() {
            return cidr;
        }

        public void setCidr(String cidr) {
            this.cidr = cidr;
        }

        public String getFrom_port() {
            return from_port;
        }

        public void setFrom_port(String from_port) {
            this.from_port = from_port;
        }

        public String getTo_port() {
            return to_port;
        }

        public void setTo_port(String to_port) {
            this.to_port = to_port;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
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

    public List<RulesVo> getRules() {
        return rules;
    }

    public void setRules(List<RulesVo> rules) {
        this.rules = rules;
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
}
