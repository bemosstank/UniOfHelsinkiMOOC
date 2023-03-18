
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = String.valueOf(scanner.nextLine());
            if (userInput.equals("")) {
                break;
            }
            String[] word = userInput.split(" ");
            System.out.println(word[0]);
        }

    }
}
