package com.ksc.kls.model;

import java.util.List;

/**
 * Created by yangfan on 2017/5/22.
 */
public class PubStreamHistoryDetail {
    private List<StreamDetail> Detail;
    private String Stream;

    public List<StreamDetail> getDetail() {
        return Detail;
    }

    public void setDetail(List<StreamDetail> detail) {
        Detail = detail;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }
}
