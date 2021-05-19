package com.ksc.krds;

import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.auditstatistic.AuditHotStatisticRequest;
import com.ksc.krds.model.auditstatistic.AuditTemplateRequest;
import com.ksc.krds.model.auditstatistic.DescribeAuditHotDurationRequest;
import com.ksc.krds.model.auditstatistic.SqlAuditLineChartRequest;
import com.ksc.krds.transform.auditstatistic.AuditHotStatisticUnmarshaller;
import com.ksc.krds.transform.auditstatistic.AuditTemplateUnmarshaller;
import com.ksc.krds.transform.auditstatistic.DescribeAuditHotDurationUnmarshaller;
import com.ksc.krds.transform.auditstatistic.SqlAuditLineChartUnmarshaller;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;

public class AuditStatisticClient extends Client{

    public AuditStatisticClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public RdsResponse describeAuditHotCount(AuditHotStatisticRequest request){
        return invoke(new BaseMarshaller<AuditHotStatisticRequest>(),
                new AuditHotStatisticUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse describeAuditHotDuration(DescribeAuditHotDurationRequest request){
        return invoke(new BaseMarshaller<DescribeAuditHotDurationRequest>(),
                new DescribeAuditHotDurationUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse sqlAuditReport(AuditTemplateRequest request){
        return invoke(new BaseMarshaller<AuditTemplateRequest>(),
                new AuditTemplateUnmarshaller(), request).getKscResponse();
    }

    public RdsResponse sqlAuditLineChart(SqlAuditLineChartRequest request){
        return invoke(new BaseMarshaller<SqlAuditLineChartRequest>(),
                new SqlAuditLineChartUnmarshaller(), request).getKscResponse();
    }
}
