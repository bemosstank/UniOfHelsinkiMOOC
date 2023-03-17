import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 9999) {
                break;
            }
            list.add(userInput);
        }
       
       
      int small = list.get(0);
      int number1 =0;
      for(int i =0; i<list.size(); i++){
           number1 = list.get(i);
          if(number1<small){
              small = number1;
          }
      }
      System.out.println("Smallest number: " + small);
      for(int i =0; i<list.size(); i++){
          if(small == list.get(i))
             System.out.println("Found at index: " + i);
      }   
       
    }
}
