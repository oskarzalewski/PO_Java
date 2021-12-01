package pl.ozalewski.po.lab06.pl.imiajd.zalewski;

class Osoba {
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public int getRokUrodzenia(){
        return rokUrodzenia;
    }

    @Override
    public String toString() {
        return nazwisko+" "+rokUrodzenia;
    }
}
