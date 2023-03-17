
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = scanner.nextInt();
        int mutiply = 1;
        for(int i = 1; i<=number;  i++){
            mutiply = mutiply*i;
        }
        System.out.println("Factorial: " + mutiply);
       
      
    }
}
