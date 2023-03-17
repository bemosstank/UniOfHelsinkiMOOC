// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file of the source code
public class Message {
    
    // Start of the program
    public static void main(String[] args) {
         
        // This the input that comes from the scanner tool from Java.
        Scanner scanner = new Scanner(System.in);
        
        // This will print write a message in the output 
        System.out.println("Write a message:");
       
         // This will read input from the user
        String message = scanner.nextLine();
        
        //// This will reference what the user inputted into the output
        System.out.println(message);
        
    } // End of a program 
}
