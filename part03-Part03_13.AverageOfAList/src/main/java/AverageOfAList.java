
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int addSum = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        
    
        for (int i : list) {
            sum = sum + i;
            addSum++;
        }
        System.out.println("Average: " + ((double)sum / addSum));
    }
}
