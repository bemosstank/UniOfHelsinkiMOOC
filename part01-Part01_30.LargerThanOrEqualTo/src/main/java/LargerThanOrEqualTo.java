// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class LargerThanOrEqualTo {

    // Start of the program
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
              
        // This will print the string literal "Give the first number" into the Output
        System.out.println("Give the first number:");
        
        // This will read the first number the user input.
        int firstNumber = scan.nextInt();
        
        // This will print the string literal "Give the second number" into the Output
        System.out.println("Give the second number:");
        
         // This will read the second number the user input.
        int secondNumber = scan.nextInt();
        
        // This will reference the first user inputted numbr and check if what the user inputted  number is equal to reference second user inputted number. it will move to the next block
        if(firstNumber == secondNumber){ // Open block for if statement
            
             // This will print the string literal print string literal "The numbers are equal!" into the Ouput,  
            System.out.println("The numbers are equal!");
            
            // else if it will reference the first user inputted number is greater than the reference second user inputted number, it will move to the next else if block
        }/* close block of first if statement*/ else if (firstNumber > secondNumber){ // Open block for else if statement
            
            // This will print the string literal print string literal "Greater number is:" and reference the first user inputted number. 
            System.out.println("Greater number is: " + firstNumber);
           
             // else if what the reference second user inputted number is less than reference first user number inputted, it will move to the next else if block
        }/* close block of firs else if statement*/  else if(secondNumber > firstNumber){ // Open block for else if statement
            
           // This will print the string literal print string literal "Greater number is:" and reference the second user inputted number.
            System.out.println("Greater number is: " + secondNumber);
            
        } // Closing block for second else if statement

    } // End of the program 
    
}// End of the name of the source code
