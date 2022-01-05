package pl.ozalewski.po.lab09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class ArrayUtil{
    public static <T extends Comparable> boolean isSorted(ArrayList<T> tab){
        ArrayList<T> w = new ArrayList<>(tab);
        Collections.sort(w);
        return tab.equals(w);
    }

    public static <T extends Comparable> int binSearch(ArrayList<T> tab, T a){
        int i = 0;
        for (T x : tab){
            if (x.equals(a)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T extends Comparable> void selectionSort(ArrayList<T> tab){
        int min;
        T w;
        for (int i=0; i<tab.size();i++){
            min = i;
            for (int j=i;j<tab.size();j++){
                if (tab.get(min).compareTo(tab.get(j))>0){
                    min = j;
                }
            }
            w = tab.get(i);
            tab.set(i, tab.get(min));
            tab.set(min, w);
        }
    }

    public static <T extends Comparable> void mergeSort(ArrayList<T> tab){
        if(tab.size() > 1){
            ArrayList<T> lewo = new ArrayList<>();
            ArrayList<T> prawo = new ArrayList<>();
            boolean a = true;
            while (!tab.isEmpty()){
                if (a){
                    lewo.add(tab.remove(0));
                }
                else {
                    prawo.add(tab.remove(tab.size()/2));
                }
                a = !a;
            }
            mergeSort(lewo);
            mergeSort(prawo);
            while (!lewo.isEmpty() && !prawo.isEmpty()){
                if (lewo.get(0).compareTo(prawo.get(0))<=0){
                    tab.add(lewo.remove(0));
                }
                else tab.add(prawo.remove(0));
            }
            if (!lewo.isEmpty()){
                tab.addAll(lewo);
            }
            else if (!prawo.isEmpty()){
                tab.addAll(prawo);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<Integer>();
        ArrayList<Integer> tab2 = new ArrayList<Integer>();
        tab1.add(1);
        tab1.add(2);
        tab1.add(3);
        tab2.add(3);
        tab2.add(2);
        tab2.add(1);
        System.out.println("Tablica posortowana Integer: "+isSorted(tab1));
        System.out.println("Tablica nieposortowana Integer: "+isSorted(tab2));
        ArrayList<LocalDate> tabl1 = new ArrayList<LocalDate>();
        ArrayList<LocalDate> tabl2 = new ArrayList<LocalDate>();
        tabl1.add(LocalDate.of(2000, 5, 14));
        tabl1.add(LocalDate.of(2001, 5, 14));
        tabl2.add(LocalDate.of(2001, 5, 14));
        tabl2.add(LocalDate.of(2000, 5, 14));
        System.out.println("Tablica posortowana LocalDate: "+isSorted(tabl1));
        System.out.println("Tablica nieposortowana LocalDate: "+isSorted(tabl2));
        System.out.println("Tablica Integer: "+binSearch(tab1, 3));
        System.out.println("Tablica LocalDate: "+binSearch(tabl1, LocalDate.of(2000, 5, 14)));
        selectionSort(tab2);
        for (int a : tab2){
            System.out.println(a);
        }
        selectionSort(tabl2);
        for (LocalDate a : tabl2){
            System.out.println(a);
        }
        ArrayList<Integer> tablica1 = new ArrayList<Integer>();
        tablica1.add(5);
        tablica1.add(3);
        tablica1.add(4);
        tablica1.add(1);
        tablica1.add(2);
        mergeSort(tablica1);
        for (int a : tablica1){
            System.out.println(a);
        }
        ArrayList<LocalDate> tablica2 = new ArrayList<LocalDate>();
        tablica2.add(LocalDate.of(2005, 12, 11));
        tablica2.add(LocalDate.of(2003, 12, 11));
        tablica2.add(LocalDate.of(2004, 12, 11));

        mergeSort(tablica2);
        for (LocalDate a : tablica2){
            System.out.println(a);
        }


    }
}
