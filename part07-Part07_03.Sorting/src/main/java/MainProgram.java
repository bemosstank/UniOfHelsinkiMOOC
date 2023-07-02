
import java.util.Arrays;
public class MainProgram {

    
    public static void main(String[] args) {
        int[] array = {6, 5, 8, 7, 11};
        int [] numbers = {-1, 6, 9, 8, 12};
        int [] number = {3, 2, 5, 4, 8};
        int [] arrays = {8, 3, 7, 9, 1, 2, 4};
        
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        System.out.println(Arrays.toString(number));
        MainProgram.swap(number, 1, 0);
        System.out.println(Arrays.toString(number));
        MainProgram.swap(number, 0, 3);
        System.out.println(Arrays.toString(number));
        MainProgram.sort(arrays);
    }

    public static int smallest(int[] array) {
        int smallNumber = array[0];
        for (int number : array) {
            if (number < smallNumber) {
                smallNumber = number;
            }
        }
        return smallNumber;
    }

    public static int indexOfSmallest(int[] array) {
       int smallest = array[0];
        int index =0;
        for(int i =0; i< array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table,  int startIndex){
        int index = startIndex;
        int smallest = table[index];
        for(int i= startIndex; i<table.length; i++){
            if(table[i] < smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap (int [] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
         
    }
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        
        for(int index =0; index < array.length; index++){
            swap(array, index,indexOfSmallestFrom(array, index));
           }
        }
    }
