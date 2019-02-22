package com.ksc.krds.exception;


/**
 * 继承自 KWSClientException，我们会根据服务器端返回的消息中的错误码来生成对应的KWSServiceExceptions。
 * 如果是服务器不可达或者无响应，将返回KWSClientException。
 */
public class KWSServiceException extends KWSClientException {
    private static final long serialVersionUID = 1L;

    private String requestId;
    private int httpCode;
    private String errorCode;
    private String errorMsg;

    public KWSServiceException(String errorMessage) {
        super(errorMessage);
        this.errorMsg = errorMessage;
    }

    public KWSServiceException(String errorMessage, Exception cause) {
        super(errorMessage, cause);
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setHttpCode(int httpcode) {
        this.httpCode = httpcode;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("RequestID: " + getRequestId() + ",");
        sb.append("ErrorCode: " + (this.getErrorCode() == null ? "null" : this.getErrorCode()) + ",");
        sb.append("ErrorMsg: " + (this.getErrorMsg() == null ? "null" : this.getErrorMsg()) + ",");
        sb.append("HttpCode: " + getHttpCode() + ",");
        sb.append("}");

        return sb.toString();
    }

}

