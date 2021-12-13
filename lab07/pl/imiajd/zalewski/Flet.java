package pl.ozalewski.po.lab07.pl.imiajd.zalewski;

class Flet extends Instrument {
    public Flet(String producent, int rok, int m, int d) {
        super(producent, rok, m, d);
    }

    @Override
    public String dzwiek() {
        return "Flet";
    }
}
