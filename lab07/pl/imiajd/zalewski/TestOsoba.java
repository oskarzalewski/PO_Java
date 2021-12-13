package pl.ozalewski.po.lab07.pl.imiajd.zalewski;


public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", "Jan", 1999, 10, 25, true, 50000, 2020, 11, 4);
        ludzie[1] = new Student("Nowak", "Małgorzata", 2000, 7, 30, false, "informatyka", 4.45);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getImiona() + " " + p.getNazwisko() + " "+ p.getDataUrodzenia() + ": " + p.getOpis());
        }
    }
}


