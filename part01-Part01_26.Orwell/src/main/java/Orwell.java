// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class Orwell {

   // Start of the program 
    public static void main(String[] args) {
       
      // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
      // This will print the string literal ""Give the first number:" into the Output
        System.out.println("Give a number");
        
        // This will read the first number the user input.
        int number = scan.nextInt();
        
        // This will reference the first user  inputted numbr and check if what the user inputted  number is equal to 1984. If the user inputted is less than or 1984 it will execute nothing
        if (number == 1984) { // Open block of the if statement 
            
            // This will print the string literal print string literal "Orwell" into the Ouput, if the reference first user inputted number is equal to 1984.
            System.out.println("Orwell");
             
        }// Close the block of if statement
    } // End of the Program
}// End of the name of the source code
