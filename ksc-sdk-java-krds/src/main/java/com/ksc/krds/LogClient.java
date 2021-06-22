package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.log.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.krds.transform.log.DeleteDBBinlogUnmarshaller;
import com.ksc.krds.transform.log.DescribeDBLogFilesUnmarshaller;
import com.ksc.krds.transform.log.DescribeDBLogUnmarshaller;

public class LogClient extends Client{

    public LogClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse<DescribeDBLogFilesResponse> describeDBLogFiles(DescribeDBLogFilesRequest request){
        return invoke(new BaseMarshaller<DescribeDBLogFilesRequest>(),
                new DescribeDBLogFilesUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse deleteDBBinlog(DeleteDBBinlogRequest request){
        return invoke(new BaseMarshaller<DeleteDBBinlogRequest>(),
                new DeleteDBBinlogUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<DescribeDBLogResponse> describeLastLog(DescribeDBLogRequest request){
        return invoke(new BaseMarshaller<DescribeDBLogRequest>(),
                new DescribeDBLogUnmarshaller(), request).getKscResponse();
    }
}
