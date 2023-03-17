
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number?");
        int firstNumber = scanner.nextInt();
        System.out.println("Second Number?");
        int secondNumber = scanner.nextInt();
        int sum = 1;
        int calculation = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
           calculation = calculation + i;
       }
        System.out.println("The sum is " + (calculation));
       
    }
}
