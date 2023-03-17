// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class Adulthood {

     // Start of the program
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
        // This will print the string literal "How old are you" into the Output
        System.out.println("How old are you?");
        
        // This will read the first number the user input.
        int age = scan.nextInt();
        
        // This will reference the first user inputted numbr and check if what the user inputted  number is less than 18. 
        if (age <18){
            // This will print the string literal print string literal "You are not an adult" into the Ouput, if the reference first user inputted number is less than 18
            System.out.println("You are not an adult");
            
         // if what the user inputted number is greater than 18 it will move to the else block   
        }else{
              
            // This will print the string literal print string literal "You are an adult" into the Ouput, if the reference first user inputted number is greater than 18.
            System.out.println("You are an adult");
            
        }// Close the block of if statement
    }// End of the Program
}// End of the name of the source code
