// Introduce the Scanner tool used for reading user input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class SumOfNumbers {

    // Start of the program
    public static void main(String[] args) {

        // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);

        // The variable type int  name "sum" that is assigned with a value of "0"
        int sum = 0;

        // This will do a "while" loops open comma, the boolean true and close comma. Since it is always true the loop will keep going forever.
        while (true) {

            // This will print the String literal "Give a number:" into the Output
            System.out.println("Give a number:");

            // This will read the first number  user input
            int number = scanner.nextInt();

            // This will reference the user inputted number is equal to 0 and if it is, it will move to the next block
            if (number == 0) {

                // This will end the loop of reference of the user inputted number that is equal to 0.
                break;
                
              // "else if" it will reference user inputted number is less than 0 or greater than 0 , if it is, it will move to the next block  
            } else if (number < 0 || number > 0) {
                
                // This will reference variable type int with the name sum add it to the reference user inputted number and store it into the new int variable name sum
                sum = sum + number;
            }// End of else if block

        }// End of the while (true) loop
        
        // This will print the string literal "Sum of the numbers: " plus it reference variable type int name numberOfNumbers and into it into the Ouput
        System.out.println("Sum of the numbers: " + sum);
    } // End of the Program 
}// End of the name of the source code
