package com.ksc.cdn;

/**
 * KscClientException
 *
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public class KscClientException extends Exception{
    String message;
    public KscClientException(){}
    public KscClientException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
