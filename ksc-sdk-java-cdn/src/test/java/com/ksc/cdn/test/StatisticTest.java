package com.ksc.cdn.test;

import com.ksc.cdn.KscCdnClient;
import com.ksc.cdn.model.enums.CdnTypeEnum;
import com.ksc.cdn.model.statistic.BpsResult;
import com.ksc.cdn.model.statistic.StatisticsQuery;
import org.junit.Assert;
import org.junit.Test;

/**
 * StatisticTest
 *
 * @author jiangran@kingsoft.com
 * @date 07/11/2016
 */
public class StatisticTest {
    @Test
    public void testGetBandwidthData(){
        KscCdnClient cdnClient=new KscCdnClient();
        StatisticsQuery statisticsQuery=new StatisticsQuery();
        statisticsQuery.setStartTime("2016-09-19T08:00+0800");
        statisticsQuery.setEndTime("2016-09-18T08:00+0800");
        statisticsQuery.setCdnType(CdnTypeEnum.download.getOpenApiValue());
        statisticsQuery.setResultType("0");
        try {
            BpsResult bandwidthData = cdnClient.getBandwidthData(statisticsQuery);
            Assert.assertNotNull(bandwidthData.getDatas());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
