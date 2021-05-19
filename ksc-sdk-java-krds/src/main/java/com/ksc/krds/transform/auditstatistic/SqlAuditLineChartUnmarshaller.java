package com.ksc.krds.transform.auditstatistic;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.auditstatistic.SqlAuditLineChartData;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.util.ArrayList;
import java.util.List;

public class SqlAuditLineChartUnmarshaller implements Unmarshaller<RdsResponse<List<SqlAuditLineChartData>>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<List<SqlAuditLineChartData>> unmarshall(JsonUnmarshallerContext in) throws Exception {
        List<SqlAuditLineChartData> list = new ArrayList<SqlAuditLineChartData>();
        return (RdsResponse<List<SqlAuditLineChartData>>) RdsResponseConversion.invoke(in.getJsonParser(), list.getClass());
    }

}
