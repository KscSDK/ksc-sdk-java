package com.ksc.krds.exception;

/**
 * KWS Exception基类，调用服务过程中抛出的任何exception都将继承此类
 * <p>
 * 其有一个子类KWSServiceExceptions， 我们会根据服务器端返回的消息中的错误码来生成对应的KWSServiceExceptions。
 * 如果是服务器不可达或者无响应，将返回KWSClientException。
 *
 * @see KWSServiceException
 */
public class KWSClientException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public KWSClientException(String message, Throwable t) {
        super(message + " Inner Exception:" + (t == null ? "" : t.getMessage()), t);
    }

    public KWSClientException(String message) {
        super(message);
    }

    public KWSClientException(Throwable t) {
        super(t);
    }

    public boolean isRetryable() {
        return true;
    }
}
