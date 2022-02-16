package com.ksc.krds.transform.krdsInstance;

import com.fasterxml.jackson.databind.ObjectMapper;
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

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        this(action, HttpMethodName.GET);
    }

    public BaseMarshaller() {
        this(null);
    }

    @Override
    public Request<T> marshall(T in) throws Exception {
        if (!(in instanceof KscWebServiceRequest)) {
            throw new IllegalArgumentException("req type must be KscWebServiceRequest");
        }
        BaseRequest req = (BaseRequest) in;
        request = new DefaultRequest<T>(req, SERVICE_NAME);
        request.addParameter("Action", getAction(req).val());
        request.setHttpMethod(method);
        request.addHeader("x-ksc-request-id", req.getRequestId());
        request.addHeader("Accept", "application/json");
        request.addParameter("Version", getOrDefaultVersion(req));

        for (Field field : req.getClass().getDeclaredFields()) {
                addParameter(field);
        }

        return request;
    }

    private ActionEnum getAction(BaseRequest req) {
        if (action != null) {
            return action;
        }
        return req.action();
    }

    private void addParameter(Field field) throws Exception {
        String getter = "get" + upperCaseFirstLetter(field.getName());
        KscWebServiceRequest originalRequest = request.getOriginalRequest();
        Method method = originalRequest.getClass().getMethod(getter);
        Object value = method.invoke(originalRequest);
        if (value == null) {
            return;
        }
        Class<?> type = field.getType();
        if (Map.class.equals(type)) {
            HashMap<String, String> valueMap = (HashMap<String, String>) value;
            int index = 1;
            for (Map.Entry<String, String> entry : valueMap.entrySet()) {
                request.addParameter("Parameters.Name." + index, entry.getKey());
                request.addParameter("Parameters.Value." + index++, entry.getValue());
            }
            return;
        }
        if (List.class.isAssignableFrom(type)) {
            addListParameter(field, value);
            return;
        }
        request.addParameter(field.getName(), value.toString());
    }

    private void addListParameter(Field field, Object value) throws Exception{
        int index = 1;
        ArrayList<Object> valueList = (ArrayList<Object>) value;
        for (Object v : valueList) {
            if (v instanceof String || v instanceof Integer) {
                request.addParameter(getName(field, index++), v.toString());
                continue;
            }
            Field[] fields = v.getClass().getDeclaredFields();
            for (Field f : fields) {
                Method method = v.getClass().getMethod("get" + upperCaseFirstLetter(f.getName()));
                Object o = method.invoke(v);
                if (o == null) {
                    continue;
                }
                request.addParameter(getListName(field, index, f),o.toString());
            }
            index++;
        }
    }

    private String getListName(Field field, int index, Field f) {
        return field.getName() + "." + f.getName() + "." + index;
    }

    private String getName(Field field, int index) {
        return field.getName() + "." + index;
    }

    public String getOrDefaultVersion(BaseRequest req) {
        String version = req.getVersion();
        if (StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        return version;
    }

    private String upperCaseFirstLetter(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }

}
