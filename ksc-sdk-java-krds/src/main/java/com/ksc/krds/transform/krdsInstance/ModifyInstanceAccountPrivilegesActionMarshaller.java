package com.ksc.krds.transform.krdsInstance;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.krds.model.database.CreateInstanceAccountActionRequest;
import com.ksc.krds.model.database.ModifyInstanceAccountPrivilegesActionRequest;
import com.ksc.transform.Marshaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/***
 * @ClassName: ModifyInstanceAccountPrivilegesActionMarshaller
 * @Description:TODO
 * @version : V1.0
 */
public class ModifyInstanceAccountPrivilegesActionMarshaller extends BaseMarshaller<ModifyInstanceAccountPrivilegesActionRequest> {

    @Override
    public Request<ModifyInstanceAccountPrivilegesActionRequest> marshall(ModifyInstanceAccountPrivilegesActionRequest in) throws Exception {
        if (in == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ModifyInstanceAccountPrivilegesActionRequest> request = new DefaultRequest<ModifyInstanceAccountPrivilegesActionRequest>(in, "krds");
        request.addParameter("Action", "CreateInstanceAccountAction");
        String version = in.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-07-01";
        }
        request.addParameter("Version", version);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(request);

        request.setContent(new ByteArrayInputStream(s.getBytes()));

        return  request;
    }
}
