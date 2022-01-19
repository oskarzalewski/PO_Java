package pl.ozalewski.po.lab10;

import java.util.LinkedList;

public class lab10linkedlist {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        for (int i = n-1; i<pracownicy.size();i+=n-1){
            pracownicy.remove(i);
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        LinkedList<T> klon = (LinkedList<T>) lista.clone();
        lista.clear();
        while (klon.size()!=0){
            lista.addFirst(klon.removeFirst());
        }
    }

    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("A");
        pracownicy.add("B");
        pracownicy.add("C");
        pracownicy.add("D");
        pracownicy.add("E");
        pracownicy.add("F");
        pracownicy.add("G");
        pracownicy.add("H");
        redukuj(pracownicy, 2);
        System.out.println("Zadanie 1:");
        for (String a : pracownicy){
            System.out.println(a);
        }
        System.out.println("Zadanie 3:");
        odwroc(pracownicy);
        for (String a : pracownicy){
            System.out.println(a);
        }
    }
}
