package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.ImageImportRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

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


    /**
     * DataImageUrl.N
     * 存放数据盘镜像的ks3对应的bucket地址
     * 类型：String
     * 有效值：http开头，有效的bucket地址
     * 是否可缺省：是
     */
    private List<String> DataImageUrl;

    /**
     * DataImageSize.N
     * 数据盘磁盘容量
     * 类型：String
     * 是否可缺省：是
     */
    private List<String> DataImageSize;

    /**
     * DataImageFormat.N
     * 选择上传的数据盘镜像格式
     * 类型：String
     * 有效值：raw、vhd、qcow2、vmdk
     * 是否可缺省：是
     */
    private List<String> DataImageFormat;


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

    public List<String> getDataImageUrl() {
        return DataImageUrl;
    }

    public void setDataImageUrl(List<String> dataImageUrl) {
        DataImageUrl = dataImageUrl;
    }

    public List<String> getDataImageSize() {
        return DataImageSize;
    }

    public void setDataImageSize(List<String> dataImageSize) {
        DataImageSize = dataImageSize;
    }

    public List<String> getDataImageFormat() {
        return DataImageFormat;
    }

    public void setDataImageFormat(List<String> dataImageFormat) {
        DataImageFormat = dataImageFormat;
    }

    public void withDataImageUrl(String... dataImageUrls) {
        if (this.DataImageUrl == null) {
            this.setDataImageUrl(new com.ksc.internal.SdkInternalList<String>());
        }
        for (String ele : dataImageUrls) {
            this.DataImageUrl.add(ele);
        }
    }

    public void withDataImageSize(String... dataImageSizes) {
        if (this.DataImageSize == null) {
            this.setDataImageSize(new com.ksc.internal.SdkInternalList<String>());
        }
        for (String ele : dataImageSizes) {
            this.DataImageSize.add(ele);
        }
    }

    public void withDataImageFormat(String... dataImageFormats) {
        if (this.DataImageFormat == null) {
            this.setDataImageFormat(new com.ksc.internal.SdkInternalList<String>());
        }
        for (String ele : dataImageFormats) {
            this.DataImageFormat.add(ele);
        }
    }
}
