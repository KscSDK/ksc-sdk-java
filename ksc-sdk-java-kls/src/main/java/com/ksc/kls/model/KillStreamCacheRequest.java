package com.ksc.kls.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.auth.policy.Action;

/**
 * Created by yangfan on 2017/5/19.
 */
public class KillStreamCacheRequest extends KscWebServiceRequest {
    private String Action;
    private String Version;
    private String[] NodeIPs;
    private String PullDomain;
    private String App;
    private String Stream;

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String[] getNodeIPs() {
        return NodeIPs;
    }

    public void setNodeIPs(String[] nodeIPs) {
        NodeIPs = nodeIPs;
    }

    public String getPullDomain() {
        return PullDomain;
    }

    public void setPullDomain(String pullDomain) {
        PullDomain = pullDomain;
    }

    public String getApp() {
        return App;
    }

    public void setApp(String app) {
        App = app;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String stream) {
        Stream = stream;
    }
}
