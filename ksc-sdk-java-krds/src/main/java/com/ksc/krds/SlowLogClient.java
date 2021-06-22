package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.slowlog.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.krds.transform.slowlog.*;

import java.util.List;


public class SlowLogClient extends Client{

    public SlowLogClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }
    
    public SlowLogLineChartResponse<List<SlowLogReportGlobalPubResultBean>> slowLogLineChart(SlowLogLineChartRequest request){
        return invoke(new BaseMarshaller<SlowLogLineChartRequest>(),
                new SlowLogLineChartUnmarshaller(), request).getKscResponse();
    }
    
    public SlowLogReportResponse<List<SlowLogReportPub>> slowLogReport(SlowLogReportRequest request)  {
        return invoke(new BaseMarshaller<SlowLogReportRequest>(),
                new SlowLogReportUnmarshaller(), request).getKscResponse();
    }

    public SlowLogDetailResponse slowLogDetail(SlowLogDetailRequest request) {
        return invoke(new BaseMarshaller<SlowLogDetailRequest>(),
                new SlowLogDetailUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse startAuditDetailExportTask(StartAuditDetailExportTaskRequest request){
        return invoke(new BaseMarshaller<StartAuditDetailExportTaskRequest>(),
                new StartAuditDetailExportTaskUnmarshaller(), request).getKscResponse();
    }
    
    public ExportListResponse listAuditDetailExportTask(ListAuditRequest request){
        return invoke(new BaseMarshaller<ListAuditRequest>(),
                new ListAuditUnmarshaller(), request).getKscResponse();
    }
}
