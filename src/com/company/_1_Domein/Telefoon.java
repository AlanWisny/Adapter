package com.company._1_Domein;

import java.util.ArrayList;
import java.util.List;

public class Telefoon {
    private String Nr;
    private List<Gesprek> Uitgaand = new ArrayList<Gesprek>();
    private List<Gesprek> Binnenkomend = new ArrayList<Gesprek>();

    public Telefoon(String n) {
        Nr = n;
    }

    public String nr() {
        return Nr;
    }

    public void addGesprekUitgaand(Gesprek g) {
        Uitgaand.add(g);
    }

    public void addGesprekBinnenkomend(Gesprek g) {
        Binnenkomend.add(g);
    }
}
