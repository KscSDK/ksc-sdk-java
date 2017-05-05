package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.CreateRecordRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/4/24.
 */
public class CreateRecordRequestMarshaller implements Marshaller<Request<CreateRecordRequest>, CreateRecordRequest> {

    private static CreateRecordRequestMarshaller instance;

    public static CreateRecordRequestMarshaller getInstance() {
        if (instance == null)
            instance = new CreateRecordRequestMarshaller();
        return instance;
    }

    public Request<CreateRecordRequest> marshall(CreateRecordRequest createRecordRequest){
        if (createRecordRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateRecordRequest> request = new DefaultRequest<CreateRecordRequest>(createRecordRequest, "kls");

        request.addParameter("Action", "CreateRecordTask");
        String version=createRecordRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        request.addParameter("UniqueName", createRecordRequest.getUniqueName());
        request.addParameter("App", createRecordRequest.getApp());
        request.addParameter("Pubdomain", createRecordRequest.getPubdomain());
        request.addParameter("Stream", createRecordRequest.getStream());
        request.addParameter("StartUnixTime", StringUtils.fromInteger(createRecordRequest.getStartUnixTime()));
        request.addParameter("EndUnixTime", StringUtils.fromInteger(createRecordRequest.getEndUnixTime()));
        request.addParameter("Mp4VodEnable", StringUtils.fromInteger(createRecordRequest.getMp4VodEnable()));

        if(createRecordRequest.getKs3FileNameM3U8() != null ){
            request.addParameter("Ks3FileNameM3U8", createRecordRequest.getKs3FileNameM3U8());
        }

        if(createRecordRequest.getKs3FullPathMP4() != null ){
            request.addParameter("Ks3FullPathMP4", createRecordRequest.getKs3FullPathMP4());
        }

        request.setHttpMethod(HttpMethodName.POST);

        return request;
    }
}
