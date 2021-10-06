public class Start {
    public static void zad1(){
        System.out.println(62+29);
    }

    public static void zad2(){
        int w=0;
        for(int i=1;i<=10;i++){
            w+=i;
        }
        System.out.println(w);
    }

    public static void zad3(){
        int w=1;
        for(int i=2;i<=10;i++){
            w*=i;
        }
        System.out.println(w);
    }

    public static void zad4(){
        int w=1000;
        for(int i=1;i<=3;i++){
            w*=1.06;
            System.out.println(w);
        }
    }

    public static void zad5(){
        System.out.println("+----+");
        System.out.println("|Java|");
        System.out.println("+----+");
    }

    public static void zad6(String s, String a){
        System.out.println("  "+s+s+s+s+s);
        System.out.println(" +"+a+a+a+a+a+"+");
        System.out.println("(| o o |)");
        System.out.println("  | ~ |");
        System.out.println(" | `-' |");
        System.out.println(" +-----+");
    }

    public static void zad10(){
        System.out.println("Avatar,\nGladiator,\nAvengers\n");
    }

    public static void zad11(){
        System.out.println("Płaska jak stół,\n" +
                "na którym położona.\n" +
                "Nic się pod nią nie rusza\n" +
                "i ujścia sobie nie szuka.\n" +
                "Nad nią – mój ludzki oddech\n" +
                "nie tworzy wirów powietrza\n" +
                "i całą jej powierzchnię\n" +
                "zostawia w spokoju.");
    }

    public static void main(String[] args){
        System.out.println("Hello world!");
        String s = new StringBuilder().appendCodePoint(836).toString();
        String a = new StringBuilder().appendCodePoint(34).toString();
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6(s, a);
        zad10();
        zad11();
    }

}
