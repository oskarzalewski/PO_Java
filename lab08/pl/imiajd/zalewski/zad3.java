package pl.ozalewski.po.lab08.pl.imiajd.zalewski;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> lista = new ArrayList<String>();
        File plik = new File("zad3.txt");

        Scanner odczyt = new Scanner(plik);
        while (odczyt.hasNext()){
            String text = odczyt.nextLine();
            lista.add(text);
        }

        for (String a : lista){
            System.out.println(a);
        }

        Collections.sort(lista);

        for (String a : lista){
            System.out.println(a);
        }
    }
}
