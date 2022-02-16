package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DescribePrivateLinkServerRequestMarshaller;
import lombok.Data;

import java.io.Serializable;


@Data
public class DescribePrivateLinkServerRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribePrivateLinkServerRequest> {
    /**
     * PrivateLinkServer的ID
     */
    private com.ksc.internal.SdkInternalList<String> privateLinkServerIdList;

    /**
     * 单次调用可返回的最大条目数量.
     */
    private String maxResults;
    /**
     * 获取另一页返回结果的 token.
     */
    private String nextToken;

    public void addPrivateLinkServerIds(String... privateLinkServerIds) {
        if (this.privateLinkServerIdList == null) {
            this.privateLinkServerIdList = new com.ksc.internal.SdkInternalList<String>();
        }
        for (String value : privateLinkServerIds) {
            this.privateLinkServerIdList.add(value);
        }
    }

    @Override
    public Request<DescribePrivateLinkServerRequest> getDryRunRequest() {
        Request<DescribePrivateLinkServerRequest> request = new DescribePrivateLinkServerRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribePrivateLinkServerRequest clone() {
        return (DescribePrivateLinkServerRequest) super.clone();
    }
}
