package com.elsa.smart_buffet.utils;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TimeUtil {

    public int getDayTime() {
        Date date = new Date();
        int year = date.getYear();
        year = year - 100;
        year = 2000 + year;
        year = year * 10000;
        int month = date.getMonth() + 1;
        month = month * 100;
        int day = date.getDate();
        int dId = year + month + day;
        return dId;
    }

    public int getMonthTime() {
        Date date = new Date();
        int year = date.getYear();
        year = year - 100;
        year = 2000 + year;
        year = year * 100;
        int month = date.getMonth() + 1;
        int mId = year + month;
        return mId;
    }

    public int getYearTime() {
        Date date = new Date();
        int year = date.getYear();
        year = year - 100;
        int yId = 2000 + year;
        return yId;
    }

}
