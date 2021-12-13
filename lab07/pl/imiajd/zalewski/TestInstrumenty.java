package pl.ozalewski.po.lab07.pl.imiajd.zalewski;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args)
    {
        ArrayList<Instrument> orkiestra = new ArrayList<>(100);
        orkiestra.add(new Skrzypce("Yamaha", 2000, 1, 14));
        orkiestra.add(new Fortepian("Yamaha", 2005, 12, 1));
        orkiestra.add(new Flet("Yamaha", 2004, 8, 19));
        orkiestra.add(new Fortepian("Yamaha", 2010, 6, 30));
        orkiestra.add(new Skrzypce("Yamaha", 2011, 4, 26));

        for (Instrument instrument : orkiestra) {
            System.out.println(instrument.dzwiek());
            System.out.println(instrument);
        }
    }
}

