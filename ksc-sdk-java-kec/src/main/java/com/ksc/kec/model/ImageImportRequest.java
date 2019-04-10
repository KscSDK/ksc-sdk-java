package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeInstanceFamilysRequestMarshaller;
import com.ksc.kec.model.transform.ImageImportRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@ToString
@EqualsAndHashCode(callSuper = false)
public class ImageImportRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<ImageImportRequest>{

	private static final long serialVersionUID = 1L;
	/**
	 * <p>
	 * 导入镜像名称
	 * 是否可缺省: 否
	 * </p>
	 */
	private String ImageName;
    /**
     * <p>
     * 导入镜像Ks3地址
     * 是否可缺省: 否
     * </p>
     */
    private String ImageUrl;
    /**
     * <p>
     * 导入镜像系统类型
     * 是否可缺省: 否
     * </p>
     */
    private String Platform;
    /**
     * <p>
     * 导入镜像系统位数
     * 是否可缺省: 否
     * </p>
     */
    private String Architecture;
    /**
     * <p>
     * 导入镜像系统格式
     * 是否可缺省: 否
     * </p>
     */
    private String ImageFormat;
	@Override
	public Request<ImageImportRequest> getDryRunRequest() {
		Request<ImageImportRequest> request = new ImageImportRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public String getArchitecture() {
        return Architecture;
    }

    public void setArchitecture(String architecture) {
        Architecture = architecture;
    }

    public String getImageFormat() {
        return ImageFormat;
    }

    public void setImageFormat(String imageFormat) {
        ImageFormat = imageFormat;
    }
}
