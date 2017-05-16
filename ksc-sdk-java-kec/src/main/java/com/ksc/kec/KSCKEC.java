package com.ksc.kec;

import com.ksc.kec.model.CreateImageRequest;
import com.ksc.kec.model.CreateImageResult;
import com.ksc.kec.model.CreateLocalVolumeSnapshotRequest;
import com.ksc.kec.model.CreateLocalVolumeSnapshotResult;
import com.ksc.kec.model.DeleteLocalVolumeSnapshotRequest;
import com.ksc.kec.model.DeleteLocalVolumeSnapshotResult;
import com.ksc.kec.model.DescribeImagesRequest;
import com.ksc.kec.model.DescribeImagesResult;
import com.ksc.kec.model.DescribeInstancesRequest;
import com.ksc.kec.model.DescribeInstancesResult;
import com.ksc.kec.model.ModifyImageAttributeRequest;
import com.ksc.kec.model.ModifyImageAttributeResult;
import com.ksc.kec.model.ModifyInstanceAttributeRequest;
import com.ksc.kec.model.ModifyInstanceAttributeResult;
import com.ksc.kec.model.MonitorInstancesRequest;
import com.ksc.kec.model.MonitorInstancesResult;
import com.ksc.kec.model.RebootInstancesRequest;
import com.ksc.kec.model.RebootInstancesResult;
import com.ksc.kec.model.RemoveImagesRequest;
import com.ksc.kec.model.RemoveImagesResult;
import com.ksc.kec.model.RollbackLocalVolumeRequest;
import com.ksc.kec.model.RollbackLocalVolumeResult;
import com.ksc.kec.model.RunInstancesRequest;
import com.ksc.kec.model.RunInstancesResult;
import com.ksc.kec.model.StartInstancesRequest;
import com.ksc.kec.model.StartInstancesResult;
import com.ksc.kec.model.StopInstancesRequest;
import com.ksc.kec.model.StopInstancesResult;
import com.ksc.kec.model.TerminateInstancesRequest;
import com.ksc.kec.model.TerminateInstancesResult;
import com.ksc.kec.model.UnmonitorInstancesRequest;
import com.ksc.kec.model.UnmonitorInstancesResult;
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
	
}
