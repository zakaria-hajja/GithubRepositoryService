package com.zakaria.github.utils;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Zakaria on 14/01/2018.
 */

public class Utils {
    private Context context;
    private static final String DATE_PATTERN = "yyyy-MM-dd";
    public Utils(Context context) {
        this.context = context;
    }

    public String getLast30Day(){
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
        Date today = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, -30);
        Date last30Day = cal.getTime();

        return dateFormat.format(last30Day);
    }
}
