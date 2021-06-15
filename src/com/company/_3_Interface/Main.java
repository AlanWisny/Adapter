package com.company._3_Interface;

import com.company._1_Domein.Gesprek;
import com.company._1_Domein.Telefoon;
import com.company._1_Domein.TijdStip;
import com.company._2_Applicatie.Adapter;

public class Main {

    public static void main(String[] args) {
        TijdStip t1 = new Adapter("10:00","31-07-2018");
        TijdStip t2 = new Adapter("11:00","31-07-2018");
        Telefoon tel1 = new Telefoon("070-3299281");
        Telefoon tel2 = new Telefoon("079-4324356");
        Gesprek g1 = new Gesprek (tel1,tel2,t1,15);
        Gesprek g2 = new Gesprek (tel1,tel2,t2,10);

        g1.toonAlleGesprekken();
    }
}
