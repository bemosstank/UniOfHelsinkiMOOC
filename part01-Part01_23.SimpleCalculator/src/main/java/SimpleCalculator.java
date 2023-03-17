// Introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class SimpleCalculator {

    //Start of the Program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java      
        Scanner scanner = new Scanner(System.in);
        
         // This will print the string literal ""Give the first number:" into the Output
        System.out.println(" Give the first number:");
        
         // This will read the first number the user input.
        int first = scanner.nextInt();
        
        // This will print the string literal ""Give the second number:" into the Output
        System.out.println("Give the second number:");
        
        // This will read the second number the user input.
        int second = scanner.nextInt();
        
        // This will reference the first  user inputted number and substract the reference of the seond  the user inputted number and store in the container of integer variable name "sum"
        int substractionAnswer = first - second;
        
        // This will print the reference first user inputted number, print out the string literal "+" and  reference second user inputted  number, print out the string literal " = ", reference the first user inputted number and substract the reference second user inputted number and print out the result into the Output
        System.out.println(first + " + " + second + " = " + (first + second));
        
        // This will print the reference first user inputted number, print out the string literal "-" and  reference second user inputted  number, print out the string literal " = ", it will then reference intger container with the "sum" name and print it out into the Output. 
        System.out.println(first + " - " + second + " = " + substractionAnswer);
        
        // This will print the reference first user inputted number, print out the string literal "*" and  reference second user inputted  number, print out the string literal " = ", reference the first user inputted number and mutiply the reference second user inputted number and print out the result into the Output
        System.out.println(first + " * " + second + " = " + (first * second));
        
         // This will print the reference first user inputted number, print out the string literal "/" and  reference second user inputted  number, print out the string literal " = " it will then type cast "double" into the reference user inputted number to convert the user inputted number into decimal and divided the reference second user inoutted number and print out the result into  the Output
        System.out.println(first + " / " + second + " = " + ((double)first/second));


    }// End of the Program
}// End of the name of the source code
