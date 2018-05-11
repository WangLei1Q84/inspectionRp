package com.wanglei.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by wangl on 2018/5/11.
 */
public class DateUtil {

    public static String toDateString(String formart) {
        DateFormat df = new SimpleDateFormat(formart);
        Calendar calendar = Calendar.getInstance();
        String dateStr = df.format(calendar.getTime());
        return  dateStr;
    }
}
