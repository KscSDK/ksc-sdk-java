package com.ksc.vcs;

import com.ksc.regions.Region;
import com.ksc.vcs.model.*;

/**
 * Interface for accessing ksyun vcs.
 * <p>
 * <fullname>KingSoft Video Content Security</fullname>
 * </p>
 */
public interface KSCVCS {

	void setEndpoint(String endpoint);

	void setRegion(Region region);

	/**
	 * 
	 * @param listUniqueNamesRequest
	 * 			  Contains the parameters for ListUniqueNames. 
	 * @return Result of the ListUniqueNames operation returned by the service.
	 * @sample KSC.VCS.ListUniqueNames
	 */
	public ListUniqueNamesResult listUniqueNames(
            ListUniqueNamesRequest listUniqueNamesRequest);

	/**
	 * @param listAppsRequest
	 * 			  Contains the parameters for ListApps.
	 * @return Result of the ListApps operation returned by the service.
	 * @sample KSC.VCS.ListApps
	 */
	public ListAppsResult listApps(
            ListAppsRequest listAppsRequest);

	/**
	 * @param getRecogCfgRequest
	 * 			  Contains the parameters for GetRecogCfg.
	 * @return Result of the GetRecogCfg operation returned by the service.
	 * @sample KSC.VCS.GetRecogCfg
	 */
	public GetRecogCfgResult getRecogCfg(
            GetRecogCfgRequest getRecogCfgRequest);

	/**
	 * @param updateRecogCfgRequest
	 * 			  Contains the parameters for UpdateRecogCfg.
	 * @return Result of the UpdateRecogCfg operation returned by the service.
	 * @sample KSC.VCS.UpdateRecogCfg
	 */
	public UpdateRecogCfgResult updateRecogCfg(
            UpdateRecogCfgRequest updateRecogCfgRequest);

	/**
	 * @param getNotifyCfgRequest
	 * 			  Contains the parameters for GetNotiftCfg.
	 * @return Result of the GetNotifyCfg operation returned by the service.
	 * @sample KSC.VCS.GetNotifyCfg
	 */
	public GetNotifyCfgResult getNotifyCfg(
            GetNotifyCfgRequest getNotifyCfgRequest);

	/**
	 * @param createConfigurationRequest
	 * 			  Contains the parameters for CreateConfiguration.
	 * @return Result of the CreateConfiguration operation returned by the service.
	 * @sample KSC.VCS.CreateConfiguration
	 */
	public CreateConfigurationResult createConfiguration(
            CreateConfigurationRequest createConfigurationRequest);

    /**
     * @param listConfigurationsRequest
     * 			  Contains the parameters for ListConfigurations.
     * @return Result of the ListConfigurations operation returned by the service.
     * @sample KSC.VCS.ListConfigurations
     */
    public ListConfigurationsResult listConfigurations(
            ListConfigurationsRequest listConfigurationsRequest);

	/**
	 * @param getArchiveCfgRequest
	 * 			  Contains the parameters for GetArchiveCfg.
	 * @return Result of the GetArchiveCfg operation returned by the service.
	 * @sample KSC.VCS.GetArchiveCfg
	 */
	public GetArchiveCfgResult getArchiveCfg(
            GetArchiveCfgRequest getArchiveCfgRequest);

	/**
	 * @param getBlockedStreamsRequest
	 * 		      Contains the parameters for GetBlockedStreams.
	 * @return Result of the GetBlockedStreams operation returned by the service.
	 * @sample KSC.VCS.GetBlockedStreams
	 */
	public GetBlockedStreamsResult getBlockedStreams(
            GetBlockedStreamsRequest getBlockedStreamsRequest);

	/**
	 * @param listWarningStreamsRequest
	 * 			  Contains the parameters for ListWarningStreams.
	 * @return Result of the ListWarningStreams operation returned by the service.
	 * @sample KSC.VCS.ListWarningStreams
	 */
	public ListWarningStreamsResult listWarningStreams(
            ListWarningStreamsRequest listWarningStreamsRequest);

	/**
	 * @param updateArchiveCfgRequest
	 * 			  Contains the parameters for UpdateArchiveCfg.
	 * @return Result of the UpdateArchiveCfg operation returned by the service.
	 * @sample KSC.VCS.UpdateArchiveCfg
	 */
	public UpdateArchiveCfgResult updateArchiveCfg(
            UpdateArchiveCfgRequest updateArchiveCfgRequest);
	
	/**
	 * @param blockStreamRequest
	 * 			  Contains the parameters for BlockStream.
	 * @return Result of the BlockStream operation returned by the service.
	 * @sample KSC.VCS.BlockStream
	 */
	public BlockStreamResult blockStream(
            BlockStreamRequest blockStreamRequest);
	
	/**
	 * @param getConfigurationRequest
	 * 			  Contains the parameters for GetConfiguration.
	 * @return Result of the GetConfiguration operation returned by the service.
	 * @sample KSC.VCS.GetConfiguration
	 */
	public GetConfigurationResult getConfiguration(
            GetConfigurationRequest getConfigurationRequest);

	/**
	 * @param deleteConfigurationRequest
	 * 			  Contains the parameters for DeleteConfiguration.
	 * @return Result of the DeleteConfiguration operation returned by the service.
	 * @sample KSC.VCS.DeleteConfiguration
	 */
	public DeleteConfigurationResult deleteConfiguration(
            DeleteConfigurationRequest deleteConfigurationRequest);

	/**
	 * @param updateNotifyCfgRequest
	 * 			  Contains the parameters for UpdateNotifyCfg.
	 * @return Result of the UpdateNotifyCfg operation returned by the service.
	 * @sample KSC.VCS.UpdateNotifyCfg
	 */
	public UpdateNotifyCfgResult updateNotifyCfg(
            UpdateNotifyCfgRequest updateNotifyCfgRequest);

	
	/**
	 * @param recoverStreamRequest
	 * 			  Contains the parameters for RecoverStream.
	 * @return Result of the RecoverStream operation returned by the service.
	 * @sample KSC.VCS.RecoverStream
	 */
	public RecoverStreamResult recoverStream(
            RecoverStreamRequest recoverStreamRequest);

	/**
	 * @param getWarningScreenshotsRequest
	 * 			  Contains the parameters for GetWarningScreenshots.
	 * @return Result of the GetWarningScreenshots operation returned by the service.
	 * @sample KSC.VCS.GetWarningScreenshots
	 */
	public GetWarningScreenshotsResult getWarningScreenshots(
            GetWarningScreenshotsRequest getWarningScreenshotsRequest);

}
