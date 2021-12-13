package pl.ozalewski.po.lab07.pl.imiajd.zalewski;

import java.time.LocalDate;

abstract class Osoba {
    public Osoba(String nazwisko, String imiona, int rok, int m, int d, boolean plec) {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = LocalDate.of(rok, m, d);
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean getPlec() {
        return plec;
    }

    private String nazwisko;
    private String imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}
