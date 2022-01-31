package Z3;

import java.io.File;
import java.util.Arrays;

public class Z3 {
    public static void sortFile(File[] tab){
        Arrays.stream(tab).sorted().toArray();
    }
}
