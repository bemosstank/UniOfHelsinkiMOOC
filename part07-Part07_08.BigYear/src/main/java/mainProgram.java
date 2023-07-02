
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdInterface birdInterface = new BirdInterface(scan);
        while (true) {
            System.out.println("?");
            String userInput = scan.nextLine();
            if (userInput.equals("Add")) {
                birdInterface.addBirdName();
            } else if (userInput.equals("Observation")) {
                birdInterface.observedBird();
            } else if (userInput.equals("All")) {
                birdInterface.printAllBirdAndObservation();
            } else if (userInput.equals("One")) { 
               birdInterface.promptOneBird();
            }else if(userInput.equals("Quit")){
                break;
            }
        }

    }
}
