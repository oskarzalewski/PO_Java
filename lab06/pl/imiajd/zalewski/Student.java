package pl.ozalewski.po.lab06.pl.imiajd.zalewski;

class Student extends Osoba{
    String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String toString() {
        return super.toString()+" "+kierunek;
    }
}
