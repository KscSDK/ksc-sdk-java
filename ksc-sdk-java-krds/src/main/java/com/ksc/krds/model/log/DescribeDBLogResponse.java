package com.ksc.krds.model.log;

import java.util.List;

public class DescribeDBLogResponse {

    private List<LogFile> LogFiles;

    public List<LogFile> getLogFiles() {
        return LogFiles;
    }

    public void setLogFiles(List<LogFile> logFiles) {
        LogFiles = logFiles;
    }
}
