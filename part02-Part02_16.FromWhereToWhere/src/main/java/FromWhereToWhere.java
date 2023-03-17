
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to");
        int finish = Integer.valueOf(scanner.nextLine());
        System.out.print("where from?");
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= finish; i++) {
            System.out.println(i);
        }
        int number = 1;

        while (number != 2) {
            System.out.println(number);
            number = 2;
            System.out.println(number);
            number = 1;
        }
    }
}
