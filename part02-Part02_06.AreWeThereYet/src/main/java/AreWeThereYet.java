// Introduce the Scanner tool used for reading user input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class AreWeThereYet {

    // Name of the file that contain the name of the source code
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
        // This will do a "while" loops open comma, the boolean true and close comma. Since it is always true the loop will keep going forever.
        while (true) {
            
            // This will print the String literal "Give a number:" into the Output
            System.out.println("Give a number:");
            
            // This will read the first number user input
            int number = scanner.nextInt();
            
            // This will reference the user inputted number is equal to 4 and if it is, it will move to the next block
            if (number == 4) {
                
                // This will end the loop of reference of the user inputted number that is equal to 4.
                break;
            }// End of the if block
        }//End of the while (true) block

    }// End of the program 

}// End of the name of the source code
