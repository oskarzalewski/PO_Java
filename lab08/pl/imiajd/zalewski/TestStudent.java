package pl.ozalewski.po.lab08.pl.imiajd.zalewski;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> studia = new ArrayList<>(5);
        studia.add(new Student("Kowalski", 2001, 11, 22, 4.3));
        studia.add(new Student("Nowak", 2001, 11, 22, 5));
        studia.add(new Student("Mak", 1999, 12, 28, 2));
        studia.add(new Student("Gol", 1990, 5, 30, 3));
        studia.add(new Student("Gol", 1989, 3, 16, 3.5));
        for (Student a : studia) {
            System.out.println(a);
        }
        System.out.println(" ");
        studia.sort(Student::compareTo);
        for (Student a : studia) {
            System.out.println(a);
        }
    }
}
