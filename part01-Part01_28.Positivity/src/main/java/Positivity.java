// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class Positivity {

    // Start of the program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
        // This will print the string literal "Give a number" into the Output
        System.out.println("Give a number:");
        
         // This will read the first number the user input.
        int anyNumber = scan.nextInt();
        
         // This will reference the first user inputted numbr and check if what the user inputted  number is greater than 0. 
        if(anyNumber > 0){
            
             // This will print the string literal print string literal "The number is positive." into the Ouput, if the reference first user inputted number is greater than 0.
            System.out.println("The number is positive.");
            
             // if what the user inputted number is less than 0 it will move to the else block 
        }else{
            
            // This will print the string literal print string literal "The number is not postive" into the Ouput, if the reference first user inputted number is less than 18.
            System.out.println("The number is not postive.");
        }// Close the block of if statement      
    }// End of the Program
}// End of the name of the source code
