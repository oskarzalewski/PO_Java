package pl.ozalewski.po.lab08.pl.imiajd.zalewski;

import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> ludzie = new ArrayList<>(5);
        ludzie.add(new Osoba("Kowalski", 2001, 11, 22));
        ludzie.add(new Osoba("Nowak", 2001, 11, 22));
        ludzie.add(new Osoba("Mak", 1999, 12, 28));
        ludzie.add(new Osoba("Gol", 1990, 5, 30));
        ludzie.add(new Osoba("Gol", 1989, 3, 16));
        for (Osoba a : ludzie) {
            System.out.println(a);
        }
        System.out.println(" ");
        ludzie.sort(Osoba::compareTo);
        for (Osoba a : ludzie) {
            System.out.println(a);
        }
    }
}
