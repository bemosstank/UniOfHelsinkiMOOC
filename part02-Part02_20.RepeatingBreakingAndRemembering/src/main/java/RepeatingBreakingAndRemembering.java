
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        double average = 0;
        int count = 0;
        int even =0 ;
        int odd = 0;
        while (true) {
            System.out.println("Give numbers:");
            int number = scanner.nextInt();
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (number != -1) {
                sumOfNumbers = sumOfNumbers + number;
                count = count + 1;
                average = ((double) sumOfNumbers / count);
            }
            if (number % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
