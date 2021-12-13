package pl.ozalewski.po.lab07.pl.imiajd.zalewski;


class Student extends Osoba {
    public Student(String nazwisko, String imiona, int rok, int m, int d, boolean plec, String kierunek, double sredniaOcen) {
        super(nazwisko, imiona, rok, m, d, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis() {
        return "kierunek studiów: " + kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen){
        this.sredniaOcen = sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}
