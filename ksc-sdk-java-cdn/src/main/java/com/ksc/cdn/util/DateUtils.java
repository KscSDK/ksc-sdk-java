package com.ksc.cdn.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.security.InvalidParameterException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * DateUtils
 *
 * @author jiangran@kingsoft.com
 * @date 04/11/2016
 */
public class DateUtils {

    public static final String DATE_PATTERN = "yyyy-MM-dd";

    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static final String DATA_TIME_PATTERN_UTC = "yyyy-MM-dd'T'HH:mm+0800";

    /**
     * 统计两个日期之间包含的天数。包含date1，但不包含date2
     *
     * @param date1 第一个日期
     * @param date2 第二个日期
     * @return 两个日期之间相隔的整天数
     */
    public static int getDayDiff(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new InvalidParameterException("date1 and date2 cannot be null!");
        }
        Date startDate = org.apache.commons.lang3.time.DateUtils.truncate(date1, Calendar.DAY_OF_MONTH);
        Date endDate = org.apache.commons.lang3.time.DateUtils.truncate(date2, Calendar.DAY_OF_MONTH);
        if (startDate.after(endDate)) {
            throw new InvalidParameterException("date1 cannot be after date2!");
        }
        return (int) ((endDate.getTime() - startDate.getTime()) / org.apache.commons.lang3.time.DateUtils.MILLIS_PER_DAY);
    }

    /**
     * 时间戳转时间 date
     *
     * @param timestamp
     * @return
     * @throws ParseException
     */
    public static Date timestamp2Datetime(long timestamp) throws ParseException {
        return timestamp2Datetime(timestamp, DATE_TIME_PATTERN);
    }

    public static Date timestamp2Datetime(long timestamp, String pattern) throws ParseException {
        String dateString = DateFormatUtils.format(timestamp, pattern);
        Date date = org.apache.commons.lang3.time.DateUtils.parseDate(dateString, pattern);
        return date;
    }

    /**
     * 时间戳转时间 string
     *
     * @param timestamp
     * @return
     */
    public static String timestamp2String(long timestamp) {
        return timestamp2String(timestamp, DATE_TIME_PATTERN);
    }

    public static String timestamp2String(long timestamp, String pattern) {
        String dateString = DateFormatUtils.format(timestamp, pattern);
        return dateString;
    }


    /**
     * @param UTCDate
     * @return
     * @throws ParseException
     */
    public static Date getTimestampByUTCDate(String UTCDate) throws ParseException {
        Date date = org.apache.commons.lang3.time.DateUtils.parseDate(UTCDate, DATA_TIME_PATTERN_UTC);
        return date;
    }

    /**
     * utc格式日期转换成yyyy-MM-dd HH:mm:ss格式日期
     * @param UTCDate
     * @return
     * @throws ParseException
     */
    public static String utcTime2String(String UTCDate) throws ParseException {
        String date = DateFormatUtils.format(org.apache.commons.lang3.time.DateUtils.parseDate(UTCDate, DATA_TIME_PATTERN_UTC),DATE_TIME_PATTERN);
        return date;
    }

}
