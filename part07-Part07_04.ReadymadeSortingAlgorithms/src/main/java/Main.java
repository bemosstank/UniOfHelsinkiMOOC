
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
       ArrayList<String>List = new ArrayList<>();
       List.add("Magdalene");
       List.add("Emmanuel");
       List.add("Hillary");
        int[] array = {3, 1, 5, 99, 3, 12};
        Main.sort(array);
        
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    
    }

    public static void sortIntegers(ArrayList<Integer> Integers) {
        Collections.sort(Integers);
    }
    
    public static void sortStrings(ArrayList<String>strings){
        Collections.sort(strings);
    }

}
