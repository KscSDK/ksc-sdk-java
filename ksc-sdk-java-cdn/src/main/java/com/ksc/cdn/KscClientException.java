package com.ksc.cdn;

/**
 * KscClientException
 *
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public class KscClientException extends Exception{
    String code;
    String message;
    String requestId;
    public KscClientException(){}

    public KscClientException(String message){
        this.message=message;
    }

    public KscClientException(String code,String message,String requestId){
        this.code=code;
        this.message=message;
        this.requestId=requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
