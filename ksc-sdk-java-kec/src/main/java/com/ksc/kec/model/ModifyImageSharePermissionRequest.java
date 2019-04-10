package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.internal.SdkInternalList;
import com.ksc.kec.model.transform.ImageCopyRequestMarshaller;
import com.ksc.kec.model.transform.ModifyImageSharePermissionMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyImageSharePermissionRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<ModifyImageSharePermissionRequest>{

	private static final long serialVersionUID = 1L;
	/**
	 * <p>
	 * 共享镜像id
	 * 是否可缺省: 否
	 * </p>
	 */
	private String ImageId;
    /**
     * <p>
     * 共享镜像操作类型
     * 是否可缺省: 否
     * </p>
     */
    private String Permission;
    /**
     * <p>
     * 需要共享的用户
     * 是否可缺省: 否
     * </p>
     */
    private SdkInternalList<String> accountIdList;

    public void withAccountIds(String... accountIds) {
        if (this.accountIdList == null) {
            setAccountIdList(new SdkInternalList<String>());
        }
        for (String ele : accountIds) {
            this.accountIdList.add(ele);
        }
    }
	@Override
	public Request<ModifyImageSharePermissionRequest> getDryRunRequest() {
		Request<ModifyImageSharePermissionRequest> request = new ModifyImageSharePermissionMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public String getPermission() {
        return Permission;
    }

    public void setPermission(String permission) {
        Permission = permission;
    }

    public SdkInternalList<String> getAccountIdList() {
        return accountIdList;
    }

    public void setAccountIdList(SdkInternalList<String> accountIdList) {
        this.accountIdList = accountIdList;
    }
}
