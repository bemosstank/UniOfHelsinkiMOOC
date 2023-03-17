// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class Password {

    // Start of the program
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
         // This will print the string literal "Password:" into the Output
        System.out.println("Passowrd");
        
        // This will read the first number user input
        String password = scan.nextLine();
        
        // This will reference the first user inputted text equals to that of string literal "Caput Draconis" if it equals to it, it will move to the next block
        if(password.equals("Caput Draconis")){
            
             // This will print the string literal print string literal "Welcome!".
            System.out.println("Welcome!");
            
          // "else" if it is not equal to the string literal "Caput Draconis" it will move to the next block
        } else{
            
             // This will print the string literal print string literal "Off with you!".
            System.out.println("Off with you!");
            
        }// Close the for the block last else.    
        
    }// End of the program 
    
}// End of the name of the source code
