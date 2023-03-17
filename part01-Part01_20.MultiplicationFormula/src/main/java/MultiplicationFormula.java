// Introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class MultiplicationFormula {

    //Start of the Program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
         // This will print the string literal ""Give the first number:" into the Output
        System.out.println("Give the first number:");
       
         // This will read the first number the user input.
        int firstNumber = scanner.nextInt();
        
         // This will print the string literal ""Give the second number:" into the Output
        System.out.println("Give the second number:");
        
         // This will read the second number the user input.
        int secondNumber = scanner.nextInt();
        
        // This will reference the first number user inputted and mutiply the reference of the seond  user inputted number and store in the container of integer variable name "sum"
        int sum = firstNumber * secondNumber;
        
       // This will print the reference first user inputted, print out the string literal "*" and print the reference second number the user inputted, print out the string literal " = " and print the reference of the container that resulted the mutipication of the both reference containers of the integer names.
        System.out.println(firstNumber + " * " + secondNumber + " = " + sum);

    }// End of the Program
}// End of the name of the source code
