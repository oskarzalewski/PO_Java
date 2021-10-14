package pl.ozalewski.po.lab01;

import java.lang.Math;
import java.util.Scanner;

public class lab01 {

    public static void zad11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("zad 1.1");
        int n = scanner.nextInt();
        int a=0;
        int b=1;
        int c=0;
        double d=0;
        int e=1;
        int f=0;
        int h=0;
        double j=0;
        double x=1;

        for(int i=0;i<n;i++){
            int z = scanner.nextInt();
            a+=z;
            b*=z;
            c+=Math.abs(z);
            d+=Math.sqrt(z);
            e*=Math.abs(z);
            f+=Math.pow(z,2);
            x*=i+1;
            if(i%2==0){
                h+=z;
                j-=z/x;
            }
            else{
                h-=z;
                j+=z/x;
            }
        }
        System.out.println("a) "+a);
        System.out.println("b) "+b);
        System.out.println("c) "+c);
        System.out.println("d) "+d);
        System.out.println("e) "+e);
        System.out.println("f) "+f);
        System.out.println("g) +: "+a+" *: "+b);
        System.out.println("h) "+h);
        System.out.println("j) "+j);

    }

    public static void zad12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("zad 1.2");
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            tab[i]=a;
        }
        for (int i = 1; i < n; i++) {
            System.out.println(tab[i]);
            if(i==n-1){
                System.out.println(tab[0]);
            }
        }
    }

    public static void zad21(){
        System.out.println("zad 2.1");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tab = new int[n];
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for (int i = 0; i < n; i++) {
            int z = scanner.nextInt();
            tab[i]=z;
            //a
            if(z%2==1){
                a++;
            }
            //b
            if(z%3==0 && z%5!=0){
                b++;
            }
            //c
            if(Math.sqrt(z)%2==0){
                c++;
            }
        }
        System.out.println("a) "+a);
        System.out.println("b) "+b);
        System.out.println("c) "+c);
        //d
        for (int i = 0; i < n; i++) {
            if(i!=0 && i!=n-1){
                double x=tab[i-1]+tab[i+1];
                if((x/2)>tab[i]){
                    d++;
                }
            }
        }
        System.out.println("d) "+d);
        //e
        int w2=1, e=0;
        for (int i = 1; i <= n; i++) {
            double w1=Math.pow(2,i);
            w2*=i;
            if(w1<tab[i-1]&& w2>tab[i-1]){
                e++;
            }
        }
        System.out.println("e) "+e);
        //f
        int f=0;
        for (int i = 1; i <= n; i++) {
            if((i%2==1) && (tab[i-1]%2==0)){
                f++;
            }
        }
        System.out.println("f) "+f);
        //g
        int g=0;
        for (int i = 0; i < n; i++) {
            if((tab[i]>=0) && (tab[i]%2==1)){
                g++;
            }
        }
        System.out.println("g) "+g);
        //h
        int h=0;
        for (int i = 0; i < n; i++) {
            double ww = Math.pow(i+1, 2);
            if(Math.abs(tab[i])<ww){
                h++;
            }
        }
        System.out.println("h) "+h);
    }

    public static void zad22() {
        System.out.println("zad2.2");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w=0;
        for (int i = 0; i < n; i++) {
            int z = scanner.nextInt();
            if(z>0){
                w+=z;
            }
        }
        System.out.println(w*2);
    }

    public static void zad23() {
        System.out.println("zad2.3");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dodatnie=0, ujemne=0, zera=0;
        for (int i = 0; i < n; i++) {
            int z = scanner.nextInt();
            if(z==0){
                zera++;
            }
            else if(z>0){
                dodatnie++;
            }
            else{
                ujemne++;
            }
        }
        System.out.println("dodatnie: "+dodatnie);
        System.out.println("zera: "+zera);
        System.out.println("ujemne: "+ujemne);
    }

    public static void zad24() {
        System.out.println("zad2.4");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = scanner.nextInt();
        int max=z, min=z;
        for (int i = 1; i < n; i++) {
            z = scanner.nextInt();
            if(max<z){
                max=z;
            }
            if(min>z){
                min=z;
            }
        }
        System.out.println("MIN: "+min);
        System.out.println("MAX: "+max);
    }

    public static void zad25() {
        System.out.println("zad2.5");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tab = new int[n];
        int w=0;
        for (int i = 0; i < n; i++) {
            int z = scanner.nextInt();
            tab[i]=z;
        }
        for (int i = 1; i < n; i++) {
            if (tab[i-1]>0 && tab[i]>0){
                w++;
            }
        }
        System.out.println(w);
    }

    public static void main(String[] args) {
        zad11();
        zad12();
        zad21();
        zad22();
        zad23();
        zad24();
        zad25();
    }
}
