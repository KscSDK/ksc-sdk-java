package com.ksc.kec;

import com.ksc.kec.model.*;
import com.ksc.regions.Region;

/**
 * Interface for accessing ksyun kec.
 * <p>
 * <fullname>KingSoft Elastic Compute Cloud</fullname>
 * </p>
 */
public interface KSCKEC {

	void setEndpoint(String endpoint);

	void setRegion(Region region);

	/**
	 * Simplified method form for invoking the DescribeInstances operation.
	 *
	 * @see #describeInstances(DescribeInstancesRequest)
	 */
	DescribeInstancesResult describeInstances();

	/**
	 * <p>
	 * Describes one or more of your instances.
	 * </p>
	 * <p>
	 * Recently terminated instances might appear in the returned results. This
	 * interval is usually less than one hour.
	 * </p>
	 * 
	 * @param describeInstancesRequest
	 *            Contains the parameters for DescribeInstances.
	 * @return Result of the DescribeInstances operation returned by the
	 *         service.
	 * @sample KSC.KEC.DescribeInstances
	 */
	DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest);

	/**
	 * <p>
	 * Starts an kec instance that you've previously stopped.
	 * </p>
	 * 
	 * @param startInstancesRequest
	 *            Contains the parameters for StartInstances.
	 * @return Result of the StartInstances operation returned by the service.
	 * @sample KSC.KEC.StartInstances
	 */
	StartInstancesResult startInstances(StartInstancesRequest startInstancesRequest);

	/**
	 * <p>
	 * Stop an kec instance that you've previously stopped.
	 * </p>
	 * 
	 * @param stopInstancesRequest
	 *            Contains the parameters for StopInstances.
	 * @return Result of the StopInstances operation returned by the service.
	 * @sample KSC.KEC.StopInstances
	 */
	StopInstancesResult stopInstances(StopInstancesRequest stopInstancesRequest);

	/**
	 * <p>
	 * Reboot an kec instance that you've previously stopped.
	 * </p>
	 * 
	 * @param rebootInstancesRequest
	 *            Contains the parameters for StopInstances.
	 * @return Result of the RebootInstances operation returned by the service.
	 * @sample KSC.KEC.RebootInstances
	 */
	RebootInstancesResult rebootInstances(RebootInstancesRequest rebootInstancesRequest);

	/**
	 * <p>
	 * Describes one or more of your Images.
	 * </p>
	 * <p>
	 * Recently terminated instances might appear in the returned results. This
	 * interval is usually less than one hour.
	 * </p>
	 * 
	 * @param describeImagesRequest
	 *            Contains the parameters for DescribeImages.
	 * @return Result of the DescribeInstances operation returned by the
	 *         service.
	 * @sample KSC.KEC.DescribeImages
	 */
	DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest);

	/**
	 * <p>
	 * Run an kec instance that you've previously stopped.
	 * </p>
	 *
	 * @param runInstancesRequest
	 * @return Result of the RunInstances operation returned by the service.
	 * @sample KSC.KEC.RunInstances
	 */
	RunInstancesResult runInstances(RunInstancesRequest runInstancesRequest);
	/**
	 * <p>
	 * Terminate an kec instance.
	 * </p>
	 *
	 * @param terminateInstancesRequest
	 * @return Result of the TerminateInstances operation returned by the service.
	 * @sample KSC.KEC.TerminateInstances
	 */
	TerminateInstancesResult terminateInstances(TerminateInstancesRequest terminateInstancesRequest);
	/**
	 * <p>
	 * ModifyInstanceAttribute an kec instance.
	 * </p>
	 *
	 * @param modifyInstanceAttributeRequest
	 * @return Result of the ModifyInstanceAttribute operation returned by the service.
	 * @sample KSC.KEC.ModifyInstanceAttribute
	 */
	ModifyInstanceAttributeResult modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest);
	/**
	 * <p>
	 * MonitorInstances an kec instance.
	 * </p>
	 *
	 * @param monitorInstancesRequest
	 * @return Result of the MonitorInstances operation returned by the service.
	 * @sample KSC.KEC.MonitorInstances
	 */
	MonitorInstancesResult monitorInstances(MonitorInstancesRequest monitorInstancesRequest);
	/**
	 * <p>
	 * UnmonitorInstances an kec instance.
	 * </p>
	 *
	 * @param unmonitorInstancesRequest
	 * @return Result of the UnmonitorInstances operation returned by the service.
	 * @sample KSC.KEC.UnmonitorInstances
	 */
	UnmonitorInstancesResult unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest);
	
	/**
	 * 创建镜像
	 * @param createImageRequest
	 * @return
	 */
	CreateImageResult createImage(CreateImageRequest createImageRequest);
	
	/**
	 * 修改镜像
	 * @param modifyImageAttributeRequest
	 * @return
	 */
	ModifyImageAttributeResult modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest);
	
	/**
	 * 刪除鏡像
	 * @param removeImagesRequest
	 * @return
	 */
	RemoveImagesResult removeImages(RemoveImagesRequest removeImagesRequest);
	
	/**
	 * 創建本地盤快照
	 * @param createLocalVolumeSnapshotRequest
	 * @return
	 */
	CreateLocalVolumeSnapshotResult createLocalVolumeSnapshot(CreateLocalVolumeSnapshotRequest createLocalVolumeSnapshotRequest);
	
	/**
	 * 回滚本地盘快照
	 * @param rollbackLocalVolumeRequest
	 * @return
	 */
	RollbackLocalVolumeResult rollbackLocalVolume(RollbackLocalVolumeRequest rollbackLocalVolumeRequest);
	
	/**
	 * 刪除本地盤快照
	 * @param deleteLocalVolumeSnapshotRequest
	 * @return
	 */
	DeleteLocalVolumeSnapshotResult deleteLocalVolumeSnapshot(DeleteLocalVolumeSnapshotRequest deleteLocalVolumeSnapshotRequest);
	
	/**
	 * 描述本地盘信息
	 * @param describeLocalVolumesRequest
	 * @return
	 */
	DescribeLocalVolumesResult describeLocalVolumes(DescribeLocalVolumesRequest describeLocalVolumesRequest);
	
	/**
	 * 描述本地盘快照信息
	 * @param describeLocalVolumeSnapshotsRequest
	 * @return
	 */
	DescribeLocalVolumeSnapshotsResult describeLocalVolumeSnapshots(DescribeLocalVolumeSnapshotsRequest describeLocalVolumeSnapshotsRequest);
	
	/**
	 * 升级实例套餐类型
	 * @param modifyInstanceTypeRequest
	 * @return
	 */
	ModifyInstanceTypeResult modifyInstanceType(ModifyInstanceTypeRequest modifyInstanceTypeRequest);
	
	/**
	 * 更换或者重新安装实例操作系统
	 * @param modifyInstanceImageRequest
	 * @return
	 */
	ModifyInstanceImageResult modifyInstanceImage(ModifyInstanceImageRequest modifyInstanceImageRequest);
	
	/**
	 * 获取VNC信息
	 * @param describeInstanceVncRequest
	 * @return
	 */
	DescribeInstanceVncResult describeInstanceVnc(DescribeInstanceVncRequest describeInstanceVncRequest);
	
	/**
	 * 为主机添加网卡
	 * @param attachNetworkInterfaceRequest
	 * @return
	 */
	AttachNetworkInterfaceResult attachNetworkInterface(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest);
	
	/**
	 * 修改网络接口属性信息
	 * @param modifyNetworkInterfaceAttributeRequest
	 * @return
	 */
	ModifyNetworkInterfaceAttributeResult modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest);


	/**
	 * 删除主机网络接口
	 * @param detachNetworkInterfaceRequest
	 * @return
	 */
	DetachNetworkInterfaceResult detachNetworkInterface(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest);

	/**
	 * 查询可用区列表
	 * @param describeRegionsRequest
	 * @return
	 */
	DescribeRegionsResult describeRegions(DescribeRegionsRequest describeRegionsRequest);

	/**
	 * 查询可用区列表
	 * @param describeAvailabilityZonesRequest
	 * @return
	 */
	DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest);

	/**
	 * 查询机型套餐配置信息
	 * @param describeInstanceTypeConfigsRequest
	 * @return
	 */
	DescribeInstanceTypeConfigsResult describeInstanceTypeConfigs(DescribeInstanceTypeConfigsRequest describeInstanceTypeConfigsRequest);

	/**
	 * 查询机型配置信息
	 * @param describeInstanceFamilysRequest
	 * @return
	 */
	DescribeInstanceFamilysResult describeInstanceFamilys(DescribeInstanceFamilysRequest describeInstanceFamilysRequest);
	/**
	 * 导入镜像
	 * @param imageImportRequest
	 * @return
	 */
	ImageImportResult imageImport(ImageImportRequest imageImportRequest);
	/**
	 * 复制镜像
	 * @param imageCopyRequest
	 * @return
	 */
	ImageCopyResult imageCopy(ImageCopyRequest imageCopyRequest);
	/**
	 * 共享、取消共享镜像
	 * @param modifyImageSharePermissionRequest
	 * @return
	 */
	ModifyImageSharePermissionResult modifyImageSharePermission(ModifyImageSharePermissionRequest modifyImageSharePermissionRequest);
	/**
	 * 查询镜像共享用户
	 * @param describeImageSharePermissionRequest
	 * @return
	 */
	DescribeImageSharePermissionResult describeImageSharePermission(DescribeImageSharePermissionRequest describeImageSharePermissionRequest);

}
