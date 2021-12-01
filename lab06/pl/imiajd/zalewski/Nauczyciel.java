package pl.ozalewski.po.lab06.pl.imiajd.zalewski;

class Nauczyciel extends Osoba{
    double pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return super.toString()+" "+pensja;
    }
}
