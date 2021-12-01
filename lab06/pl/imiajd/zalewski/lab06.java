package pl.ozalewski.po.lab06.pl.imiajd.zalewski;

public class lab06 {
    public static void main(String[] args)
    {
        Adres adres1 = new Adres("polna", "11", "Braniewo", "14-526");
        Adres adres2 = new Adres("polna", "11", 66, "Braniewo", "14-526");
        adres1.pokaz();
        System.out.println(adres1.przed("14-516"));
        Student student = new Student("zalewski", 2000, "informatyka");
        System.out.println(student);

        BetterRectangle w1 = new BetterRectangle(3, 5);
        System.out.println(w1.getArea());
        System.out.println(w1.getPerimeter());
    }
}
