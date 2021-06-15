package com.company._0_Bibliotheek;

public class TimePoint {
    private String Time;
    private String Date;

    public TimePoint(String time, String date) {
        Time = time;
        Date = date;
    }


    public String time() {
        return Time;
    }

    public String date() {
        return Date;
    }
}
