package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.internal.SdkInternalList;
import com.ksc.kec.model.transform.ImageCopyRequestMarshaller;
import com.ksc.kec.model.transform.ImageImportRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@ToString
@EqualsAndHashCode(callSuper = false)
public class ImageCopyRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<ImageCopyRequest>{

	private static final long serialVersionUID = 1L;
	/**
	 * <p>
	 * 导入镜像名称
	 * 是否可缺省: 否
	 * </p>
	 */
	private String DestinationImageName;
    /**
     * <p>
     * 需要复制的镜像id列表
     * 是否可缺省: 否
     * </p>
     */
    private com.ksc.internal.SdkInternalList<String> imageIdList;
    /**
     * <p>
     * 复制的镜像到的机房
     * 是否可缺省: 否
     * </p>
     */
    private com.ksc.internal.SdkInternalList<String> destinationRegionList;

    public void withImageIds(String... imageIds) {
        if (this.imageIdList == null) {
            setImageIdList(new com.ksc.internal.SdkInternalList<String>());
        }
        for (String ele : imageIds) {
            this.imageIdList.add(ele);
        }
    }
    public void withDestinationRegions(String... destinationRegions) {
        if (this.destinationRegionList == null) {
            setDestinationRegionList(new com.ksc.internal.SdkInternalList<String>());
        }
        for (String ele : destinationRegions) {
            this.destinationRegionList.add(ele);
        }
    }
	@Override
	public Request<ImageCopyRequest> getDryRunRequest() {
		Request<ImageCopyRequest> request = new ImageCopyRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

    public String getDestinationImageName() {
        return DestinationImageName;
    }

    public void setDestinationImageName(String destinationImageName) {
        DestinationImageName = destinationImageName;
    }

    public SdkInternalList<String> getImageIdList() {
        return imageIdList;
    }

    public void setImageIdList(SdkInternalList<String> imageIdList) {
        this.imageIdList = imageIdList;
    }

    public SdkInternalList<String> getDestinationRegionList() {
        return destinationRegionList;
    }

    public void setDestinationRegionList(SdkInternalList<String> destinationRegionList) {
        this.destinationRegionList = destinationRegionList;
    }
}
