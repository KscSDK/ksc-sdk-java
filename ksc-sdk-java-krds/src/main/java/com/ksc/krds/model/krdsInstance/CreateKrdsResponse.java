package com.ksc.krds.model.krdsInstance;

public class CreateKrdsResponse {
    Data Data = new Data();
    private String RequestId;

    public CreateKrdsResponse.Data getData() {
        return Data;
    }

    public void setData(CreateKrdsResponse.Data data) {
        Data = data;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public class Data{
        Instance DBInstance;

        public Instance getDBInstance() {
            return DBInstance;
        }

        public void setDBInstance(Instance DBInstance) {
            this.DBInstance = DBInstance;
        }
    }
}
