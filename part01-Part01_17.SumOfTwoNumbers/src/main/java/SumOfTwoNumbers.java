// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class SumOfTwoNumbers {

    //Start of the Program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
        // This will print the string literal "Give the first number:" into the Output
        System.out.println("Give the first number:");
        
         // This will read input from the users from a text and convert into whole number.
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        // This will print the string literal "Give the first number:" into the Output
        System.out.println("Give the second number:");
        
         // This will read input from the users from a text and convert into whole number.
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        // This will print the string literal "The sum of the numbers is ", it will then reference what the user inputted from a text and into number and add the two numbers together and print the result into the Ouput.
        System.out.println("The sum of the numbers is " + (firstNumber + secondNumber));
        
    }//End of the program
}// End of the name of the source code
