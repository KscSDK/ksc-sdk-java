package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyInstanceAutoDeleteTime.
 * </p>
 */
@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyInstanceAutoDeleteTimeResult implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;

    private String RequestId;
    private Boolean Return;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public Boolean getReturn() {
        return Return;
    }

    public void setReturn(Boolean aReturn) {
        Return = aReturn;
    }
}
