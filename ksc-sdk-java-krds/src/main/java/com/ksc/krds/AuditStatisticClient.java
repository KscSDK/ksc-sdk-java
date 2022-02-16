package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.auditstatistic.*;
import com.ksc.krds.transform.auditstatistic.AuditHotStatisticUnmarshaller;
import com.ksc.krds.transform.auditstatistic.AuditTemplateUnmarshaller;
import com.ksc.krds.transform.auditstatistic.DescribeAuditHotDurationUnmarshaller;
import com.ksc.krds.transform.auditstatistic.SqlAuditLineChartUnmarshaller;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;

import java.util.List;

public class AuditStatisticClient extends Client{

    public AuditStatisticClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse<List<AuditHotStatisticResponse>> describeAuditHotCount(AuditHotStatisticRequest request){
        return invoke(new BaseMarshaller<AuditHotStatisticRequest>(),
                new AuditHotStatisticUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<List<AuditHotDurationResponse>> describeAuditHotDuration(DescribeAuditHotDurationRequest request){
        return invoke(new BaseMarshaller<DescribeAuditHotDurationRequest>(),
                new DescribeAuditHotDurationUnmarshaller(), request).getKscResponse();
    }

    public AuditTemplateResponse<List<AuditTemplateData>> sqlAuditReport(AuditTemplateRequest request){
        return invoke(new BaseMarshaller<AuditTemplateRequest>(),
                new AuditTemplateUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse<List<SqlAuditLineChartData>> sqlAuditLineChart(SqlAuditLineChartRequest request){
        return invoke(new BaseMarshaller<SqlAuditLineChartRequest>(),
                new SqlAuditLineChartUnmarshaller(), request).getKscResponse();
    }
}
