// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class OddOrEven {
    
    // Start of the program
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
        // This will print the string literal "Give points [0-100]:" into the Output
        System.out.println("Give a number:");
        
        // This will read the first number the user input
        int number = scan.nextInt();
        
        // This will reference the first user inputted numbr  modulo by 2 and equal 0, it will move to the next block.
        if(number % 2 == 0){
            
            // This will print the string literal print string literal "Number", reference the user inputted number, and the string literal " is " and print the string literal "even" into the Ouput.
            System.out.println("Number " + number + " is " + "even");
            
         // "else" if it is not divisibile by 2 it will move to next block.   
        }else{
             // This will print the string literal print string literal "Number", reference the user inputted number, and the string literal " is " and print the string literal "even" into the Ouput.
            System.out.println("Number "  + number + " is " + "odd");
        }// Close the for the block last else.    
    }// End of the program 
}// End of the name of the source code
