package pl.ozalewski.po.lab08.pl.imiajd.zalewski;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, int rok, int m, int d){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.of(rok, m, d);
    }

    public boolean equals(Osoba o){
        if (this.nazwisko.equals(o.nazwisko)){
            return this.dataUrodzenia.equals(o.dataUrodzenia);
        }
        else {
            return false;
        }
    }

    @Override
    public int compareTo(Osoba o) {
        if (this.nazwisko.equals(o.nazwisko)){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        else {
            return this.nazwisko.compareTo(o.nazwisko);
        }
    }

    public String toString(){
        return getClass()+"["+nazwisko+" "+ dataUrodzenia+"]";
    }
}

class Student extends Osoba implements Cloneable, Comparable<Osoba>{

    private double sredniaOcen;

    public Student(String nazwisko, int rok, int m, int d, double sredniaOcen) {
        super(nazwisko, rok, m, d);
        this.sredniaOcen = sredniaOcen;


    }

    public  String toString(){
        return (super.toString()+ sredniaOcen);
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }
}
