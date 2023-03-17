
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "Give  a word:";
        System.out.println(word);
        String userInput = String.valueOf(scanner.nextLine());
        System.out.print(userInput + userInput + userInput);
        // Write your program here

    }
}
