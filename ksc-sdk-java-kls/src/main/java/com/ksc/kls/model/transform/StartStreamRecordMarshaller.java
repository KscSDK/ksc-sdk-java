package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.StartStreamRecordRequest;
import com.ksc.transform.Marshaller;

/**
 * Created by yangfan on 2017/4/27.
 */
public class StartStreamRecordMarshaller implements Marshaller<Request<StartStreamRecordRequest>, StartStreamRecordRequest> {

    private static StartStreamRecordMarshaller instance;

    public static StartStreamRecordMarshaller getInstance() {
        if (instance == null)
            instance = new StartStreamRecordMarshaller();
        return instance;
    }

    @Override
    public Request<StartStreamRecordRequest> marshall(StartStreamRecordRequest startStreamRecordRequest) {
        if (startStreamRecordRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<StartStreamRecordRequest> request = new DefaultRequest<StartStreamRecordRequest>(
                startStreamRecordRequest, "live");

        request.addParameter("Action", "StartStreamRecord");
        String version=startStreamRecordRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);
        request.addParameter("UniqueName", startStreamRecordRequest.getUniqueName());
        request.addParameter("App", startStreamRecordRequest.getApp());
        request.addParameter("Pubdomain", startStreamRecordRequest.getPubdomain());
        request.addParameter("Stream", startStreamRecordRequest.getStream());
        request.addParameter("Mp4VodEnable", startStreamRecordRequest.getMp4VodEnable());


        if (startStreamRecordRequest.getKs3FileNameM3u8() != null ) {
            request.addParameter("Ks3FileNameM3u8",startStreamRecordRequest.getKs3FileNameM3u8());
        }
        if (startStreamRecordRequest.getKs3FullPathMP4() != null ) {
            request.addParameter("Ks3FullPathMP4",startStreamRecordRequest.getKs3FullPathMP4());
        }

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}
