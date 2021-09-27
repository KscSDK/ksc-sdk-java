package com.ksc.redis.model.instance;

/***
 * @ClassName: AllocateEipResponse
 * @Description:TODO
 * @version : V1.0
 */
public class AllocateEipResponse {
    private String master;
    private String readonly;
    private String proxy;
    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getReadonly() {
        return readonly;
    }

    public void setReadonly(String readonly) {
        this.readonly = readonly;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

}
