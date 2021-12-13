package pl.ozalewski.po.lab07.pl.imiajd.zalewski;

class Fortepian extends Instrument {
    public Fortepian(String producent, int rok, int m, int d) {
        super(producent, rok, m, d);
    }

    @Override
    public String dzwiek() {
        return "Fortepian";
    }
}
