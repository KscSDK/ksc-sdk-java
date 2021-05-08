package com.ksc.krds.transform.krdsInstance;

import com.ksc.DefaultRequest;
import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.krdsInstance.BaseRequest;
import com.ksc.krds.transform.ActionEnum;
import com.ksc.transform.Marshaller;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BaseMarshaller<T> implements Marshaller<Request<T>, T> {

    private Request<T> request;

    private final ActionEnum action;

    private final HttpMethodName method;

    private final static String SERVICE_NAME = "krds";

    static final Log log = LogFactory.getLog(BaseMarshaller.class);

    public BaseMarshaller(ActionEnum action, HttpMethodName method) {
        this.action = action;
        this.method = method;
    }

    public BaseMarshaller(ActionEnum action) {
        this.action = action;
        this.method = HttpMethodName.GET;
    }

    @Override
    public Request<T> marshall(T in) throws Exception {
        if (!(in instanceof KscWebServiceRequest)) {
            throw new IllegalArgumentException("req type must be KscWebServiceRequest");
        }
        BaseRequest req = (BaseRequest)in;
        request = new DefaultRequest<T>(req, SERVICE_NAME);
        request.addParameter("Action", action.val());
        request.setHttpMethod(method);
        String version = req.getVersion();
        if (StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        request.addHeader("x-ksc-request-id", req.getRequestId());
        request.addHeader("Accept", "application/json");
        for (Field field : req.getClass().getDeclaredFields()) {
            try {
                String getter = "get" + upperCaseFirstLetter(field.getName());
                Method getMethod = req.getClass().getMethod(getter);
                Object value = getMethod.invoke(req);
                if (value != null) {
                    request.addParameter(field.getName(), value.toString());
                }
            } catch (Exception e) {
                log.warn(e);
            }
        }

        return request;
    }

    private String upperCaseFirstLetter(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }

}
