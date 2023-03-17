// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class DoubleInput {

    // Start of the program
    public static void main(String[] args) {
         
        // This the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);

        // This will print the string literal ""Give a number" into the Output
        System.out.println("Give a number:");
         
        // This will read input from the users from a text and convert into floatingPoint/Decimal Number.
        double value = Double.valueOf(scanner.nextLine());
        
        // This will print the string literal "You gave the number", it will then reference what the user Inputted from a text and into the decimal number into the Output.
        System.out.println("You gave the number " + value);
        
    } //End of the program
} // End of the name of the source code
