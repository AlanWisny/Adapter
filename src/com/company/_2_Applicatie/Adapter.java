package com.company._2_Applicatie;

import com.company._0_Bibliotheek.TimePoint;
import com.company._1_Domein.TijdStip;

public class Adapter implements TijdStip {
    private TimePoint tp;
    private String time;
    private String date;

    public Adapter(String tijd, String datum) {
        time = tijd;
        date = datum;
        tp = new TimePoint(tijd, datum);
    }

    @Override
    public String tijd() {
        return time;
    }

    @Override
    public String datum() {
        return date;
    }
}
