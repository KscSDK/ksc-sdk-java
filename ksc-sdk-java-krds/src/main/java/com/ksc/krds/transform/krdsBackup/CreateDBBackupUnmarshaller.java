package com.ksc.krds.transform.krdsBackup;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.krds.model.krdsBackup.CreateDBBackupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CreateDBBackupUnmarshaller implements Unmarshaller<RdsResponse<CreateDBBackupResponse>, JsonUnmarshallerContext> {

    @Override
    public RdsResponse<CreateDBBackupResponse> unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), CreateDBBackupResponse.class);
    }
}
