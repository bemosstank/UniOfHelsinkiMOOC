
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> listItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a name, empty will stop: ");
            String item = String.valueOf(scanner.nextLine());
            if (item.isEmpty()) {
                break;
            }
            listItems.add(new Item(item));
        }

        for (Item item : listItems) {
            System.out.println(item);
        }

    }
}
