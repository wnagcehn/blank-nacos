package com.ideapro.blank.common.util;

import com.google.common.collect.Maps;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

/**
 * 日期工具类
 *
 * @author wangchen870
 *         createAt 2019/4/24
 *         updateAt 2019/4/24
 */
public class DateUtil {

    /**
     * 日期切分
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param num 按多少天分一段
     * @return 日期的段数
     */
    public static Map<String, String> getSplitTime(String startTime, String endTime, int num) {
        Timestamp timestamp1 = Timestamp.valueOf(startTime);
        Timestamp timestamp2 = Timestamp.valueOf(endTime);

        long diffDays = getDaysDiff(timestamp1, timestamp2);
        Map<String, String> map = Maps.newLinkedHashMap();
        long site = (diffDays / num);
        for (int i = 0; i <= site; i++) {
            if ((diffDays - i * num) < num) {
                map.put(timestamp1.toString(), timestamp2.toString());
            } else {
                Timestamp endTimestamp = DateUtil.addDays(timestamp1, num);
                map.put(timestamp1.toString(), endTimestamp.toString());
                timestamp1 = endTimestamp;
            }
        }
        return map;
    }

    private static long getDaysDiff(Timestamp t1, Timestamp t2) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(t1);
//        int year1 = calendar1.get(Calendar.YEAR);
//        int month1 = calendar1.get(Calendar.MONTH) + 1;
//        int date1 = calendar1.get(Calendar.DATE);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(t2);
//        int year2 = calendar2.get(Calendar.YEAR);
//        int month2 = calendar2.get(Calendar.MONTH) + 1;
//        int date2 = calendar2.get(Calendar.DATE);
        long diffTime = (calendar2.getTimeInMillis() - calendar1.getTimeInMillis());
        return diffTime / (1000 * 60 * 60 * 24);
    }

    /**
     * 当前时间增加天数
     *
     * @param ts 当前时间
     * @param days 需要加的天数
     * @return 加完天数的时间
     */
    private static Timestamp addDays(Timestamp ts, int days) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(ts);
        cl.add(Calendar.DATE, days);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(cl.getTime());
        return Timestamp.valueOf(dateStr);
    }

}
 
