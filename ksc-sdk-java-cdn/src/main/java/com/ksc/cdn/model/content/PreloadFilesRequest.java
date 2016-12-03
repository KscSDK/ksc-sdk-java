package com.ksc.cdn.model.content;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * PreloadFilesRequest
 * 预加载文件
 * @author jiangran@kingsoft.com
 * @date 2016/12/1
 */
public class PreloadFilesRequest implements GeneralRequest {
    private List<String> files;

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("CreatePreload","2015-09-17","/2015-09-17/distribution/");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }
}
