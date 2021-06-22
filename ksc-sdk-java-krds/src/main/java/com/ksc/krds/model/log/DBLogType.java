package com.ksc.krds.model.log;

public enum DBLogType {
    SlowLog("slowquery"), ErrorLog("errlog"), Binlog("binlog"), Log("errlog");

    private String logTypeName;

    DBLogType(String slowQuery) {
        this.logTypeName = slowQuery;
    }
}
