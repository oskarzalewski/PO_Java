package pl.ozalewski.po.lab10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class lab10Stack {
    public static String zmiana(String zdanie){
        String[] slowa = zdanie.split(" ");
        Stack<String> p = new Stack<>();
        StringBuffer x = new StringBuffer();
        for (String s : slowa){
            p.push(s);
            if (s.endsWith(".")){
                while (!p.empty()){
                    StringBuffer y = new StringBuffer();
                    y.append(p.pop());
                    if (p.empty()){
                        y.setCharAt(0,Character.toLowerCase(y.charAt(0)));
                        x.append(y);
                        x.append(". ");
                    }
                    else if (y.toString().equals(s)){
                        y.setCharAt(0, Character.toUpperCase(y.charAt(0)));
                        x.append(y, 0, y.length()-1);
                        x.append(" ");
                    }
                    else {
                        x.append(y);
                        x.append(" ");
                    }

                }
            }
        }
        return x.toString();
    }

    public static void cyfry(int a){
        Stack<Integer> c = new Stack<>();
        while (a!=0){
            c.push(a%10);
            a/=10;
        }
        while (!c.empty()){
            System.out.print(c.pop()+" ");
        }
    }

    public static void erastotenes(int n){
        ArrayList<Integer> x = new ArrayList<>();
        for (int i=2;i<=n;i++){
            x.add(i);
        }
        for (int i = 2;i<=Math.sqrt(n);i++){
            for (int k = i;k<x.size()-1;k++){
                if (x.get(k)%i==0 && x.get(k)!=i){
                    x.remove(k);
                }
            }
        }
        for (int o : x){
            System.out.print(o+" ");
        }
    }

    public static <T extends Iterable<?>> void print(T a){
        Iterator<?> x = a.iterator();
        while (x.hasNext()){
            System.out.print(x.next());
            if (x.hasNext()){
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(zmiana("Ala ma kota. Jej kot lubi myszy."));
        cyfry(205);
        System.out.println();
        erastotenes(50);
        System.out.println();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(500);
        lista.add(1);
        lista.add(80);
        print(lista);
    }
}
