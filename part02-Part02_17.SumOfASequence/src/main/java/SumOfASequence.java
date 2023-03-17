
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calculation =0;
        System.out.println("Last number?");
        int lastNumber = scanner.nextInt();
        for(int count = 1; count<=lastNumber; count++){
            calculation = calculation + count;
            
        }
        System.out.println("The sum is " + (calculation));
    }
}
