package pl.ozalewski.po.lab03;

import java.lang.String;
import java.io.File;
import java.math.RoundingMode;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.math.BigDecimal;

public class lab03 {
    public static int countChar(String str, char c) {
        int i = 0;
        for (int j = 0;j<str.length();j++){
            if (c == str.charAt(j)){
                i++;
            }
        }
        return i;

    }

    public static int countSubStr(String str, String subStr){
        int i = 0;
        int x = subStr.length();
        for (int j = 0;(j+x)<=str.length();j++){
            if (str.substring(j, j+x).equals(subStr)){

                i++;
            }
        }
        return i;
    }

    public static String middle(String str){
        int i = str.length()/2;
        if (str.length()%2!=0){
            return str.substring(i, i+1);
        }
        else {
            return str.substring(i-1, i+1);
        }
    }

    public static String repeat(String str, int n){
        String a = "";
        for (int i = 0;i<n;i++){
            a += str;
        }
        return a;
    }

    public static int[] where(String str, String subStr){
        int[] tab = new int[countSubStr(str, subStr)];
        int x = subStr.length();
        int a = 0;
        for (int j = 0;(j+x)<=str.length();j++){
            if (str.substring(j, j+x).equals(subStr)){
                tab[a]=j;
                a++;
            }
        }
        return tab;
    }

    public static String change(String str){
        StringBuffer d = new StringBuffer();
        for (int i = 0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                char nowy = Character.toLowerCase(str.charAt(i));
                d.append(nowy);
            }
            else{
                char nowy = Character.toUpperCase(str.charAt(i));
                d.append(nowy);
            }
        }
        String w = d.toString();
        return w;
    }

    public static String nice(String str, String x, int odleglosc){
        StringBuffer d = new StringBuffer();
        int a = 1;
        for (int i = str.length()-1;i>=0;i--){

            char nowy = Character.toLowerCase(str.charAt(i));
            d.append(nowy);
            if (a%odleglosc==0 && i!=0){
                d.append(x.charAt(0));
            }
            a++;
        }
        d.reverse();
        String w = d.toString();
        return w;
    }

    public static int zad2(String str, String x) throws FileNotFoundException{
        File tekst = new File(str);
        Scanner file = new Scanner(tekst);
        String zad = file.nextLine();
        int i = 0;
        for (int j = 0;j<zad.length();j++){
            if (x.charAt(0) == zad.charAt(j)){
                i++;
            }
        }
        return i;
    }

    public static int zad3(String str, String x) throws FileNotFoundException{
        File tekst = new File(str);
        Scanner file = new Scanner(tekst);
        String zad = file.nextLine();
        int i = 0;
        int l = x.length();
        for (int j = 0;(j+l)<=zad.length();j++){
            if (zad.substring(j, j+l).equals(x)){
                i++;
            }
        }
        return i;
    }

    public static String zad4(int n){
        BigInteger w = new BigInteger("2");
        BigInteger b = new BigInteger("321321321321321321321321321321");
        if (n==1){
            return "1";
        }
        else {
            n*=n;
            w = w.pow(n);
        }
        String a = w.toString();
        return a;
    }

    public static String zad5(BigDecimal k, BigDecimal p, int n){
        for (int i=0;i<n;i++){
            k=k.multiply(p);
        }
        k=k.setScale(2, RoundingMode.CEILING);
        String w = k.toString();
        return w;
    }

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("zad1 a: "+countChar("napis", 'n'));
        System.out.println("zad1 b: "+countSubStr("napis", "na"));
        System.out.println("zad1 c: "+middle("napisy"));
        System.out.println("zad1 d: "+repeat("ho", 3));
        String str = "napisna";
        String subStr = "na";
        System.out.print("zad1 e: ");
        int[] tab = new int[countSubStr(str, subStr)];
        tab = where(str, subStr);
        for (int i = 0;i<tab.length;i++){
            System.out.print(tab[i]+", ");
        }
        System.out.println("\nzad1 f: "+change("AlALa"));
        System.out.println("zad1 h: "+nice("01234567", "\"", 2));
        System.out.println("zad2: "+zad2("src/pl/ozalewski/po/lab03/zad2.txt", "b"));
        System.out.println("zad3: "+zad3("src/pl/ozalewski/po/lab03/zad2a.txt", "napis"));
        System.out.println("zad4 f: "+zad4(20));
        BigDecimal k = new BigDecimal("300");
        BigDecimal p = new BigDecimal("1.02");
        System.out.println("zad5 f: "+zad5(k, p, 5));
    }
}