package com.company._1_Domein;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Gesprek {
    private TijdStip T;
    private int duur;
    private Telefoon Van;
    private Telefoon Naar;
    private static final Map<Integer, Gesprek> Tabel = new HashMap<>();
    private static int aantal = 0;

    public Gesprek(Telefoon v, Telefoon n, TijdStip t, int d) {
        Van = v;
        Van.addGesprekUitgaand(this);
        Naar = n;
        Naar.addGesprekBinnenkomend(this);
        T = t;
        duur = d;
        bewaar();
    }

    public Telefoon van() {
        return Van;
    }

    public Telefoon naar() {
        return Naar;
    }

    public void bewaar() {
        Tabel.put(aantal, this);
        aantal = aantal + 1;
    }

    public static void toonAlleGesprekken() {
        Set<Map.Entry<Integer, Gesprek>> hashSet = Tabel.entrySet();
        for (Map.Entry g : hashSet) {
            Gesprek G = (Gesprek) g.getValue();
            System.out.println(g.getKey() + ": van " + G.Van.nr() + " naar " + G.Naar.nr() + ", duur: " + G.duur + " minuten");
        }
    }
}
