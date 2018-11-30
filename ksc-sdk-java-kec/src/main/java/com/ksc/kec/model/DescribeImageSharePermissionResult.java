package com.ksc.kec.model;

import com.ksc.internal.SdkInternalList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeImageSharePermission.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeImageSharePermissionResult implements Serializable, Cloneable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5497651688037684990L;
	private String RequestId;
    /**
     * <p>
     * Information about one or more Elastic IP addresses.
     * </p>
     */
    private com.ksc.internal.SdkInternalList<SharePermission> SharePermissionSet;
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public SdkInternalList<SharePermission> getSharePermissionSet() {
		return SharePermissionSet;
	}

	public void setSharePermissionSet(SdkInternalList<SharePermission> sharePermissionSet) {
		SharePermissionSet = sharePermissionSet;
	}

	public void addSharePermissionSet(SharePermission... infos){
		if(this.SharePermissionSet==null){
			this.SharePermissionSet= new  com.ksc.internal.SdkInternalList<SharePermission>();
		}
		for(SharePermission info : infos){
			this.SharePermissionSet.add(info);
		}
	}
    

}
