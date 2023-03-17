// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file of the source code
public class Greeting {
    
     // Start of the program
    public static void main(String[] args) {
        
        // This the input that comes from the scanner tool from Java.
        Scanner scanner = new Scanner(System.in);
        
        // This will print the string literal "What's your name into the output
        System.out.println("What's your name?");
        
        // This will read  input from the user
        String Message = scanner.nextLine();
        
        // This will print the String literal "Hi" and reference what the user inputted back into the output.
        System.out.println("Hi " + Message);

    }// End of the Program
}
