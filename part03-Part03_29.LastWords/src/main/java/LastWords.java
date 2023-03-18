
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userInput = String.valueOf(scanner.nextLine());
            if (userInput.equals("")) {
                break;
            }
            String[] word = userInput.split(" ");
            System.out.println(word[word.length-1]);
        }
    }
}     
    

