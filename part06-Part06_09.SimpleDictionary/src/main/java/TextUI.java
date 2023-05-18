/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ensia
 */
import java.util.Scanner;

public class TextUI {

    private final Scanner scanner;
    private final SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String userInput = scanner.nextLine();
            if (userInput.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            } else if (userInput.equals("add")) {
                System.out.println("Word:");
                String inputWord = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dictionary.add(inputWord, translation);
            } else if (userInput.equals("search")) {
                System.out.println(" To be translated:");
                String tobeTranslated = scanner.nextLine();
                String translatedWord = dictionary.translate(tobeTranslated);
                if (translatedWord == null) {
                    System.out.println("Word " + tobeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + translatedWord);
                }
            } else {
                System.out.println("Unknown command");
            }
        }

    }
}
