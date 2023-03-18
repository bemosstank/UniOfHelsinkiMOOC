
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfWord;

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty( )) {
                break;
            }
            arrayOfWord = userInput.split(" ");

            for (String word : arrayOfWord) {
                System.out.println(word);
            }

        }
    }
}
