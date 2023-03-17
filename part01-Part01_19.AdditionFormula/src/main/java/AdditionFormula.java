// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class AdditionFormula {

      //Start of the Program
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
        // This will print the string literal ""Give the first number:" into the Output
        System.out.println("Give the first number:");
        
         // This will read the number the user input.
        int firstNumber = scanner.nextInt();
        
        // This will print the string literal ""Give the second number:" into the Output
        System.out.println("Give the second number:");
        
        // This will read the number the user input.
        int secondNumber = scanner.nextInt();
        
        // This will print the reference first user inputed, leave a space,  print string literal "add plus", leave a space, reference the second user inputted, leave a space, print string literal "= " and add the first reference user input and the second  reference user input and print the result into the Output
        System.out.println(firstNumber + " " + "+" + " " + secondNumber + " " + "= " + (firstNumber +secondNumber));
        
    }// End of the Program
}// End of the name of the source code
