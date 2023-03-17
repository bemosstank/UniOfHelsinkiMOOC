// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file of the source code
public class MessageThreeTimes {

// Start of the program
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        // This print out the string literal "Write a message" into the output
        System.out.println("Write a message:");
        
       // This will read  input from the user
        String Message = scanner.nextLine();
        
        // This will reference what the user inputted into the output
        System.out.println(Message);
        
        // This will reference what the user inputted into the output
        System.out.println(Message);
        
          // This will reference what the user inputted into the output
        System.out.println(Message);

    }// End of the program
}
