package com.ksc.cdn.model.content;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * RefreshFilesRequest
 * 添加刷新文件请求
 * @author jiangran@kingsoft.com
 * @date 2016/12/1
 */
public class RefreshFilesRequest implements GeneralRequest {
    /**
     * uuid唯一标示
     */
    private String callerReference;
    /**
     * 需要刷新的文件,为具体url
     */
    private List<String> files;
    /**
     * 需要刷新的目录以/结尾
     */
    private List<String> dirs;

    public String getCallerReference() {
        return String.valueOf(UUID.randomUUID());
    }

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public List<String> getDirs() {
        return dirs;
    }

    public void setDirs(List<String> dirs) {
        this.dirs = dirs;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("CreateInvalidation","2016-07-11","/2016-07-11/distribution/invalidation");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }
}
