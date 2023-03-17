// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class Ancient {
    
   // Start of the program
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
        // This will print the string literal ""Give the first number:" into the Output
        System.out.println("Give a year:");
        
        // This will read the first number the user input.
        int year = scan.nextInt();
        
        // This will reference the first user inputted numbr and check if what the user inputted  number is greater less than 120. If the user inputted is less than 120 it will do execuate nothing
        if (year < 2015) { //Open block of the if statement 
            
            // This will print the string literal print string literal "Ancient History" into the Ouput, if the reference first user inputted number is less than 2015.
            System.out.println("Ancient history!");
                 
        }// Close the block of if statement
    }// End of the Program
}// End of the name of the source code
