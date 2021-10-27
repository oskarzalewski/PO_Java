package pl.ozalewski.po.lab02;

import java.util.Scanner;
import java.util.Random;

public class lab02 {

    public static void generuj (int[] tab, int n, int min, int max) {
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(2*max)+min;
        }
    }

    public static void wypisz(int[] tab) {
        for (long el : tab) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

    public  static int ileNieparzystych(int[] tab) {
        int w=0;
        for(int j=0;j<tab.length;++j){
            if(tab[j]%2!=0){
                w++;
            }
        }
        return w;
    }

    public  static int ileParzystych(int[] tab) {
        int w=0;
        for(int j=0;j<tab.length;j++){
            if(tab[j]%2==0){
                w++;
            }
        }
        return w;
    }

    public  static int ileDodatnich(int[] tab) {
        int w=0;
        for (int j=0;j<tab.length;j++){
            if(tab[j]>0){
                w++;
            }
        }
        return w;
    }

    public  static int ileUjemnych(int[] tab) {
        int w=0;
        for (int j=0;j<tab.length;j++){
            if(tab[j]<0){
                w++;
            }
        }
        return w;
    }

    public  static int ileZerowych(int[] tab) {
        int w=0;
        for (int j=0;j<tab.length;j++){
            if(tab[j]==0){
                w++;
            }
        }
        return w;
    }

    public  static int ileMaksymalnych(int[] tab) {
        int w=0;
        int max=tab[0];
        for (int j=1;j<tab.length;j++){
            if(tab[j]>max){
                max=tab[j];
            }
        }
        for (int j=0;j<tab.length;j++){
            if(tab[j]==max){
                w++;
            }
        }
        return w;
    }

    public  static int sumaDodatnich(int[] tab) {
        int w=0;
        for (int j=0;j<tab.length;j++){
            if(tab[j]>0){
                w+=tab[j];
            }
        }
        return w;
    }

    public  static int sumaUjemnych(int[] tab) {
        int w=0;
        for (int j=0;j<tab.length;j++){
            if(tab[j]<0){
                w+=tab[j];
            }
        }
        return w;
    }

    public  static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab) {
        int w=1;
        int m=1;
        for (int j=0;j<tab.length-1;j++){
            if(tab[j]>0 && tab[j+1]>0){
                w++;
                if (m<w){
                    m=w;
                }
            }
            else {
                w=0;
            }
        }
        return m;
    }

    public  static void signum(int[] tab) {
        int[] tab1 = new int[tab.length];
        for (int j=0;j<tab.length;j++){
            if(tab[j]<0){
                tab1[j]=-1;
            }
            else if(tab[j]>0){
                tab1[j]=1;
            }
        }
        for (long el : tab1) {
            System.out.print(el + " ");
        }
        System.out.println("\n");
    }

    public  static void odwrocFragment(int[] tab, int lewy, int prawy) {
        int a;
        for (int j=0;j<=(prawy-lewy)/2;j++) {
            a=tab[lewy+j];
            tab[lewy+j]=tab[prawy-j];
            tab[prawy-j]=a;
        }
    }

    public  static void zad3(int m, int n, int k) {
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][] c = new int[m][k];
        Random r = new Random();
        System.out.println("a:");
        for (int i=0; i<m;i++)
        {
            for (int j=0; j<n;j++)
            {
                a[i][j] = r.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("b:");
        for (int i=0; i<n;i++)
        {
            for (int j=0; j<k;j++)
            {
                b[i][j] = r.nextInt(10);
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("c:");
        for (int x=0;x<m;x++)
        {
            for (int d=0;d<k;d++)
            {
                c[x][d]=0;
                for(int z=0;z<n;z++)
                {
                    c[x][d] += a[x][z] * b[z][d];

                }
                System.out.print(c[x][d] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] tab = new int[x];
        generuj(tab, x, -999, 999);
        wypisz(tab);
        System.out.println("Nieparzyste: "+ileNieparzystych(tab));
        System.out.println("Parzyste: "+ileParzystych(tab));
        System.out.println("Dodatnie: "+ileDodatnich(tab));
        System.out.println("Ujemne: "+ileUjemnych(tab));
        System.out.println("Zera: "+ileZerowych(tab));
        System.out.println("Maksymalna występuje: "+ileMaksymalnych(tab));
        System.out.println("Suma Dodatnich: "+sumaDodatnich(tab));
        System.out.println("Suma Ujemnych: "+sumaUjemnych(tab));
        System.out.println("Ciąg dodatnich: "+dlugoscMaksymalnegoCiaguDodatnich(tab));
        signum(tab);
        int lewy = scanner.nextInt();
        while(true){
            if (lewy<1||lewy>=x){
                lewy = scanner.nextInt();
            }
            else {
                break;
            }
        }
        int prawy = scanner.nextInt();
        while(true){
            if (prawy<lewy||prawy>=x){
                prawy = scanner.nextInt();
            }
            else {
                break;
            }
        }
        odwrocFragment(tab, lewy, prawy);
        wypisz(tab);
        // zad3
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        zad3(m, n, k);
    }
}
