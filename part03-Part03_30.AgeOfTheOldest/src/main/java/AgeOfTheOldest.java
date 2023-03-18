
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int n = 0;
        while (true) {
            String userInput = String.valueOf(scanner.nextLine());
            if (userInput.equals("")) {
                break;
            }
            String[] word = userInput.split(",");
            age = Integer.valueOf(word[1]);

            if (age > n) {
                n = age;
            }
        }
        System.out.println("Age of the oldest: " + n);
    }
}
