package com.canteen.demo.utils;

import java.util.Calendar;

public class MyUtils {
    public final static String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };

    public final static String[] weekDaysSign = { "week7", "week1", "week2", "week3", "week4", "week5", "week6" };

    /**
     * 获取当前日期是星期几<br>
     *
     * @param
     * @return 当前日期是星期几
     */
    public static String getWeekOfDate() {
        Calendar cal = Calendar.getInstance();
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    /**
     * 获取当前日期的标记<br>
     *
     * @param
     * @return 当前日期标记
     */
    public static String getWeekSignOfDate() {
        Calendar cal = Calendar.getInstance();
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDaysSign[w];
    }
}
