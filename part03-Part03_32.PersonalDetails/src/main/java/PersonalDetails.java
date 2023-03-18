
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int nameLength = 0;
        int temp = 0;
        String name = "";
        while (true) {
            String userInput = String.valueOf(scanner.nextLine());
            if (userInput.equals("")) {
                break;
            }
            String[] word = userInput.split(",");
            sum = sum + Integer.valueOf(word[1]);
            count = count + 1;
            nameLength = word[0].length();

            if (temp < nameLength) {
                temp = nameLength;
                name = word[0];
            }
        }
        System.out.println("Longest name:" +  name );
        System.out.println("Longest name:" + ((double)sum / count));
    }
}
