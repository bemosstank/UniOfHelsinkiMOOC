// Introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class SquareRootOfSum {

    // Start of the program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
         // This will read the first number  user input
        int firstNumber = scanner.nextInt();
        
         // This will read the second number  user input
        int secondNumber = scanner.nextInt();
        
        // This will add the reference the first user inputted number  add  to the second reference user inputted number and what the result is, it will do the square root of that number and store it in the container of the double variable name "calculation"
        double calculation = Math.sqrt(firstNumber + secondNumber);
        
        // This will print the reference store conatiner that has the double variable name "calculation" and it will print the value into the Output 
        System.out.println(calculation);

    }// End of the program 
}// End of the name of the source code
