// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class DifferentTypesOfInput {

     // Start of the program
    public static void main(String[] args) {
        
         // This the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
        // This will print the string literal ""Give a string" into the Output
        System.out.println("Give a string:");
        
         // This will read input from the users from a text and convert into text.
        String value1 = String.valueOf(scan.nextLine());
        
         // This will print the string literal ""Give a integer" into the Output
        System.out.println("Give an integer:");
        
        // This will read input from the users from a text and convert into whole number.
        int value2 = Integer.valueOf(scan.nextLine());
        
         // This will print the string literal ""Give a double" into the Output
        System.out.println("Give a double:");
        
        // This will read input from the users from a text and convert into floatingpoint or decimal numbers
        double value3 = Double.valueOf(scan.nextLine());
        
         // This will print the string literal ""Give a boolean" into the Output
        System.out.println("Give a boolean:");
        
        // This will read input from the users from a text and convert into True or false.
         boolean value4 = Boolean.valueOf(scan.nextLine());
         
            // This will print the string literal "You gave the string ", it will then reference what the user Inputted from a text and into string into the Output.
            System.out.println("You gave the string " + value1);
            
             // This will print the string literal "You gave the integer ", it will then reference what the user Inputted from a text and into number into the Output.
            System.out.println("You gave the integer " + value2);
            
            // This will print the string literal "You gave the double  ", it will then reference what the user Inputted from a text and into decimal number into the Output.
            System.out.println("You gave the double " + value3);
            
            // This will print the string literal "You gave the boolean ", it will then reference what the user Inputted from a text and into true or false into the Output.
            System.out.println("You gave the boolean " + value4);
         

    }//End of the program
}// End of the name of the source code
