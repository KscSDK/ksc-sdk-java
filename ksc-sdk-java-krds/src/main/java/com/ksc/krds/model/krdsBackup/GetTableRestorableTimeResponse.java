package com.ksc.krds.model.krdsBackup;

public class GetTableRestorableTimeResponse {

    private RestorableTime RestorableTime;
    private String RequestId;

    public static  class RestorableTime{
        public RestorableTime(String begin, String end) {
            Begin = begin;
            End = end;
        }

        public RestorableTime() {
        }

        public String getBegin() {
            return Begin;
        }

        public void setBegin(String begin) {
            Begin = begin;
        }


        public String getEnd() {
            return End;
        }

        public void setEnd(String end) {
            End = end;
        }
        private String Begin;
        private String End;
    }

    public GetTableRestorableTimeResponse.RestorableTime getRestorableTime() {
        return RestorableTime;
    }

    public void setRestorableTime(GetTableRestorableTimeResponse.RestorableTime restorableTime) {
        RestorableTime = restorableTime;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }
}
