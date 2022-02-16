package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.audit.*;
import com.ksc.krds.transform.audit.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;

public class AuditClient extends Client{

    public AuditClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse startAudit(StartAuditRequest request){
        return invoke(new BaseMarshaller<StartAuditRequest>(),
                new StartAuditUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse stopAudit(StopAuditRequest request){
        return invoke(new BaseMarshaller<StopAuditRequest>(),
                new StartAuditUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<ListAuditResponse> listAudit(ListAuditRequest request){
        return invoke(new BaseMarshaller<ListAuditRequest>(),
                new ListAuditUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse auditStatistic(AuditStatisticRequest request){
        return invoke(new BaseMarshaller<AuditStatisticRequest>(),
                new AuditStatisticUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse startAuditDetailExportTask(StartAuditDetailExportTaskRequest request){
        return invoke(new BaseMarshaller<StartAuditDetailExportTaskRequest>(),
                new StartAuditDetailExportTaskUnmarshaller(), request).getKscResponse();
    }

    public ListAuditDetailExportTaskResponse listAuditDetailExportTask(ListAuditDetailExportTaskRequest request){
        return invoke(new BaseMarshaller<ListAuditDetailExportTaskRequest>(),
                new ListAuditDetailExportTaskUnmarshaller(), request).getKscResponse();
    }
}
