package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.slb.model.transform.DescribePrivateLinkRequestMarshaller;
import lombok.Data;

import java.io.Serializable;


@Data
public class DescribePrivateLinkRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribePrivateLinkRequest> {
    /**
     * PrivateLink的ID
     */
    private com.ksc.internal.SdkInternalList<String> privateLinkIdList;

    /**
     * 单次调用可返回的最大条目数量.
     */
    private String maxResults;
    /**
     * 获取另一页返回结果的 token.
     */
    private String nextToken;

    public void addPrivateLinkIds(String... privateLinkIds) {
        if (this.privateLinkIdList == null) {
            this.privateLinkIdList = new com.ksc.internal.SdkInternalList<String>();
        }
        for (String value : privateLinkIds) {
            this.privateLinkIdList.add(value);
        }
    }

    @Override
    public Request<DescribePrivateLinkRequest> getDryRunRequest() {
        Request<DescribePrivateLinkRequest> request = new DescribePrivateLinkRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribePrivateLinkRequest clone() {
        return (DescribePrivateLinkRequest) super.clone();
    }
}
