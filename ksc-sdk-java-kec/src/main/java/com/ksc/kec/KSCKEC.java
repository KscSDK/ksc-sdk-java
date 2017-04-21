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
	 * Reboot an kec instance that you've previously stopped.
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
}
