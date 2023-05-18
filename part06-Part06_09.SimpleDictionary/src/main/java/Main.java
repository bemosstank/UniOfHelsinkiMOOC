
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUi = new TextUI(scanner, dictionary); 
       textUi.start();
        System.out.println(dictionary.translate("pike"));
    }
}
