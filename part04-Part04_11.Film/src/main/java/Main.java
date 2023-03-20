
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Film chipmunks = new Film("Alvin and the Chipmunks: Squeakquesl", 0);
        System.out.println("how old are you? ");
        int age = userInput.nextInt();
        System.out.println();
        if (age >= chipmunks.ageRating()){
            System.out.println("You may watch the film " + chipmunks.name());
        }else{
            System.out.println("You may not watch the film " + chipmunks.name());
        }
        
    }
}
