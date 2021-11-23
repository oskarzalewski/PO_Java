package pl.ozalewski.po.lab05;

import java.security.KeyStore;
import java.util.ArrayList;

class RachunekBankowy{
    static double rocznaStopaProcentowa;
    private double saldo;

    public double saldo(){
        return saldo;
    }

    public RachunekBankowy(double saldo){
            this.saldo = saldo;
    }

    public void obliczMiesieczneOdsetki(){
        double w;
        w=(saldo*rocznaStopaProcentowa)/12;
        saldo+=w;
    }

    public void setRocznaStopaProcentowa(double nowa){
        rocznaStopaProcentowa = nowa;
    }
}

class IntegerSet {
    static ArrayList<Integer> tab = new ArrayList<>(100);

    public static void union(ArrayList<Integer> a, ArrayList<Integer> b) {
        tab.clear();
        for (int i : a) {
            tab.add(i);
        }
        for (int i : b) {
            tab.add(i);
        }
    }

    public static void intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        tab.clear();
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    tab.add(i);
                }
            }
        }
    }

    public static void insertElement(int a) {
        tab.add(a);
    }

    public static void deleteElement(int a) {
        int x = tab.indexOf(a);
        tab.remove(x);
    }

    public String toString() {
        String w = "";
        for (int i : tab) {
            w += " " + i;
        }
        return w;
    }

    public boolean equals(ArrayList<Integer> a) {
        for (int i=0;i<tab.size();i++){
            if (tab.size()!=a.size()){
                return false;
            }
            if (tab.get(i)!=a.get(i)){
                return false;
            }
        }
        return true;
    }
}

public class lab05 {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        saver1.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Saldo po 1 miesiącu: "+saver1.saldo());
        System.out.println("Saldo po 1 miesiącu: "+saver2.saldo());
        saver1.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Saldo po 2 miesiącu: "+saver1.saldo());
        System.out.println("Saldo po 2 miesiącu: "+saver2.saldo());

        IntegerSet tablica = new IntegerSet();
        System.out.println(IntegerSet.tab);
        ArrayList<Integer> a = new ArrayList<Integer>(4);
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>(5);
        b.add(1);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        IntegerSet.union(a, b);
        System.out.println(tablica.tab);
        tablica.intersection(a, b);
        System.out.println(tablica.tab);
        tablica.insertElement(5);
        System.out.println(tablica.tab);
        tablica.deleteElement(5);
        System.out.println(tablica.tab);
        System.out.println(tablica.toString());
        ArrayList<Integer> x = new ArrayList<Integer>(4);
        x.add(1);
        x.add(4);
        x.add(9);
        System.out.println(tablica.equals(x));
    }
}