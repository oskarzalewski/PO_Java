package pl.ozalewski.po.lab07.pl.imiajd.zalewski;

import java.time.LocalDate;

class Pracownik extends Osoba {
    public Pracownik(String nazwisko, String imiona, int rok, int m, int d, boolean plec, double pobory, int rokz, int mz, int dz) {
        super(nazwisko, imiona, rok, m, d, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = LocalDate.of(rokz, mz, dz);
    }

    public double getPobory() {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public String getOpis() {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}
