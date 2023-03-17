// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file of the source code
public class Conversation {
    
    //Start of the Program 
    public static void main(String[] args) {
         
        // This the input that comes from the scanner tool from Java.
        Scanner scanner = new Scanner(System.in);
         
        // This will print the string literal "Greetings! How are you doing?" into the output
        System.out.println("Greetings! How are you doing?");
        
        // This will read  input from the user
        String Message = scanner.nextLine();
        
        // This will print the string literal "Oh, how interesting. Tell me more!" into the output
        System.out.println("Oh, how interesting. Tell me more!");
        
        // This will read  input from the user
        String Message2 = scanner.nextLine();
        
         // This will print the string literal "Thanks for sharing!" into the output
        System.out.println("Thanks for sharing!");
        
    }//End of the program
}
