package pl.ozalewski.po.lab09;

public class PairUtilDema {

    public static void main(String[] args)
    {
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        mm.swap();
        System.out.println("swap: ");
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        Pair<String> w = PairUtil.swap(mm);
        System.out.println("min = " + w.getFirst());
        System.out.println("max = " + w.getSecond());
    }
}
