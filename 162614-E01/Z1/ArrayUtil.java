package Z1;

import java.time.LocalTime;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean jestPalindromem(T[] tab){
        T[] x = tab.clone();
        for (int i = 0;i< x.length/2;i++){
            T y = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = y;
        }
        for (int i = 0;i< x.length-1;i++){
            if (tab[i].compareTo(x[i])!=0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Integer[] i = new Integer[5];
        i[0] = 5;
        i[1] = 4;
        i[2] = 5;
        i[3] = 4;
        i[4] = 5;
        System.out.println(jestPalindromem(i));
        Integer[] i2 = new Integer[5];
        i2[0] = 5;
        i2[1] = 3;
        i2[2] = 2;
        i2[3] = 1;
        i2[4] = 0;
        System.out.println(jestPalindromem(i2));

        LocalTime[] l = new LocalTime[4];
        l[0] = LocalTime.of(4, 15);
        l[1] = LocalTime.of(1, 14);
        l[2] = LocalTime.of(1, 14);
        l[3] = LocalTime.of(4, 15);
        System.out.println(jestPalindromem(l));
        LocalTime[] l2 = new LocalTime[4];
        l2[0] = LocalTime.of(4, 15);
        l2[1] = LocalTime.of(3, 15);
        l2[2] = LocalTime.of(2, 15);
        l2[3] = LocalTime.of(1, 15);
        System.out.println(jestPalindromem(l2));
    }
}
