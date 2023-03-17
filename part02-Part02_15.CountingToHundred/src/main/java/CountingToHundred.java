
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hundred = 100;
        int userInput = scanner.nextInt();
        for (int i = userInput; i <= hundred; i++) {
            System.out.println(i);
        }

    }
}
