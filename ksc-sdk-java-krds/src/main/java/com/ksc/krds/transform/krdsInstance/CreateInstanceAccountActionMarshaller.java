package com.ksc.krds.transform.krdsInstance;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.krds.model.database.CreateInstanceAccountActionRequest;
import com.ksc.krds.model.database.DescribeAccountRequest;
import com.ksc.krds.model.krdsInstance.ListKrdsRequest;
import com.ksc.krds.transform.ActionEnum;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/***
 * @ClassName: CreateInstanceAccountActionMarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class CreateInstanceAccountActionMarshaller implements Marshaller<Request<CreateInstanceAccountActionRequest>, CreateInstanceAccountActionRequest> {

    @Override
    public Request<CreateInstanceAccountActionRequest> marshall(CreateInstanceAccountActionRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<CreateInstanceAccountActionRequest> request = new DefaultRequest<CreateInstanceAccountActionRequest>(in, "krds");
        request.addParameter("Action", "CreateInstanceAccountAction");
        String version = in.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);

        for (Field field: in.getClass().getDeclaredFields()){
            try {
                String firstLetter = field.getName().substring(0, 1).toUpperCase();
                String getter = "get" + firstLetter + field.getName().substring(1);
                Method getMethod = in.getClass().getMethod(getter);
                Object value = getMethod.invoke(in);
                if (value !=null) {
                    request.addParameter(field.getName(), value.toString());
                }
            }catch (Exception e){

            }
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(request);
        oos.flush();
        oos.close();
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        request.setContent(is);

        return  request;
    }
}
