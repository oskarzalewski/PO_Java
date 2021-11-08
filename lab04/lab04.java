package pl.ozalewski.po.lab04;

import java.util.ArrayList;

public class lab04 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> w = new ArrayList<Integer>(a.size()+b.size());
        for (int i : a){
            w.add(i);
        }
        for (int i : b){
            w.add(i);
        }
        return w;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> w = new ArrayList<Integer>(a.size()+b.size());
        if (a.size()>b.size()){
            for (int i = 0;i<a.size();i++){
                if (i>=b.size())
                {
                    w.add(a.get(i));
                    continue;
                }
                else {
                    w.add(a.get(i));
                    w.add(b.get(i));
                }
            }
        }
        else {
            for (int i = 0;i<b.size();i++)
                if (i >= a.size()) {
                    w.add(b.get(i));
                    continue;
                } else {
                    w.add(a.get(i));
                    w.add(b.get(i));
                }
        }
        return w;
    }

    public static int min(ArrayList<Integer> a){
        ArrayList<Integer> w = new ArrayList<Integer>(1);
        w.add(a.get(0));
        for (int i = 1;i<a.size();i++){
            if (a.get(i)<w.get(0))
                w.set(0,a.get(i));
        }
        return w.get(0);
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> w = new ArrayList<Integer>();
        ArrayList<Integer> x = (ArrayList<Integer>) a.clone();
        ArrayList<Integer> y = (ArrayList<Integer>) b.clone();
        for (int i = 0;i<a.size()+b.size();i++){
            if (x.size()==0){
                w.add(min(y));
            }
            else if (y.size()==0){
                w.add(min(x));
            }
            else {
                int a1 = min(x);
                int b1 = min(y);
                if (a1<=b1){
                    w.add(a1);
                    int n = x.indexOf(a1);
                    x.remove(n);
                }
                else {
                    w.add(b1);
                    int m = y.indexOf(b1);
                    y.remove(m);
                }
            }
        }
        return w;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> w = new ArrayList<Integer>();
        for (int i=a.size()-1;i>=0;i--){
            w.add(a.get(i));
        }
        return w;
    }

    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> x = (ArrayList<Integer>) a.clone();
        int z=0;
        for (int i=a.size()-1;i>=0;i--){
            a.set(z, x.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(4);
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>(5);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        ArrayList<Integer> w1 = append(a, b);
        System.out.println("zad1: "+w1);
        ArrayList<Integer> w2 = merge(a, b);
        System.out.println("zad2: "+w2);
        ArrayList<Integer> w3 = mergeSorted(a, b);
        System.out.println("zad3: "+w3);
        ArrayList<Integer> w4 = reversed(w3);
        System.out.println("zad4: "+w4);
        reverse(w4);
        System.out.println("zad5: "+w4);
    }
}
