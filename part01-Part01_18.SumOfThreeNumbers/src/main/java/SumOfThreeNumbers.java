// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class SumOfThreeNumbers {
    
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
        
        // This will print the string literal ""Give the third number:" into the Output
        System.out.println("Give the third number:");
        
        // This will read the number the user input.
        int thirdNumber = scanner.nextInt();
        
         // This will print string literal "The sum of the numbers is ", calculate the references integer variables names and the result will be in the Output
        System.out.println("The sum of the numbers is " +(firstNumber + secondNumber + thirdNumber));

    }// End of the program
}// End of the name of the source code
