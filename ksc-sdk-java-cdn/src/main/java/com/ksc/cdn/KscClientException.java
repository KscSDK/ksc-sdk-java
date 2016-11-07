package com.ksc.cdn;

/**
 * KscClientException
 *
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public class KscClientException extends Exception{
    String message;
    String requestId;
    public KscClientException(){}
    public KscClientException(String message){
        this.message=message;
    }
    public KscClientException(String message,String requestId){
        this.message=message;
        this.requestId=requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
