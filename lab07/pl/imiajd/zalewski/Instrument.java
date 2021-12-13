package pl.ozalewski.po.lab07.pl.imiajd.zalewski;

import java.time.LocalDate;

abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, int rok, int m, int d) {
        this.producent = producent;
        this.rokProdukcji = LocalDate.of(rok, m, d);
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public abstract String dzwiek();

    public String toString() {
        return producent + " rok produkcji: " + rokProdukcji;
    }
}
