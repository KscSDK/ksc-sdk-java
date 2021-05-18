package com.ksc.krds.model.audit;

import java.util.Map;

public class AuditStatisticResponse {
    private AuditStatistic AuditStatistic = new AuditStatistic();

    public AuditStatisticResponse.AuditStatistic getAuditStatistic() {
        return AuditStatistic;
    }

    public void setAuditStatistic(AuditStatisticResponse.AuditStatistic auditStatistic) {
        AuditStatistic = auditStatistic;
    }

    public class AuditStatistic{
        Map<String, Integer> AccessSqlLanguage;
        Map<String, Integer> AccessSqlStatement;

        public Map<String, Integer> getAccessSqlLanguage() {
            return AccessSqlLanguage;
        }

        public void setAccessSqlLanguage(Map<String, Integer> accessSqlLanguage) {
            AccessSqlLanguage = accessSqlLanguage;
        }

        public Map<String, Integer> getAccessSqlStatement() {
            return AccessSqlStatement;
        }

        public void setAccessSqlStatement(Map<String, Integer> accessSqlStatement) {
            AccessSqlStatement = accessSqlStatement;
        }
    }
}
