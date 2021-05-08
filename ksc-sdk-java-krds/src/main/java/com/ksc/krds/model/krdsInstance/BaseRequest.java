package com.ksc.krds.model.krdsInstance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.ActionEnum;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public abstract class BaseRequest<T extends BaseRequest> extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<T> {

    private String RequestId;

    private String DBInstanceIdentifier;

    private String DBInstanceName;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getDBInstanceName() {
        return DBInstanceName;
    }

    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    protected  ActionEnum action(){
        Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return ActionEnum.getByReq(clazz);
    }

    private BaseMarshaller getMarshaller(){
        return new BaseMarshaller<T>(action());
    };

    @Override
    public Request<T> getDryRunRequest() {
        Request<T> request = null;
        try {
            request = getMarshaller().marshall( this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
