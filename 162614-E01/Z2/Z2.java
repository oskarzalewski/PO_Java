package Z2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Z2 {
    public static <T extends Iterable<?>> void printMarginal(T tab){
        Iterator<?> x= tab.iterator();
        int i = 0;
        while (x.hasNext()) {
            i++;
            x.next();
        }
        Iterator<?> y= tab.iterator();
        for (int j = 0;y.hasNext();j++) {
            if (j==0||j==i-1){
                System.out.println(y.next());
            }
            else {
                y.next();
            }
        }






    }

    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(5);
        i.add(4);
        i.add(3);
        i.add(2);
        i.add(2);
        i.add(88);
        printMarginal(i);
    }
}
