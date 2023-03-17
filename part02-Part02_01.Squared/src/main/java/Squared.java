// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class Squared {
    
    // Start of the program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
        // This will read the first number  user input
        int number = scanner.nextInt();
        // This will reference what the user inputted number and mutiply it to the reference user inputted number and store it into container of the integer variable name "calculation"
        int calculation = number *number;
        
        // This will reference the store container with the integer varaible name "calculation" and print the value that reference store container with the integer varaible name "calculation" into the Output
        System.out.println(calculation);

    }// End of the program 
}// End of the name of the source code
