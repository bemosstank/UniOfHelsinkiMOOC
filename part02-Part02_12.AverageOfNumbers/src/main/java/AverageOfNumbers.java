// Introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class AverageOfNumbers {

    // Start of the program
    public static void main(String[] args) {
       
        // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
        // The Variable Type int  name "count" that is assigned with a value of "0"
        int count = 0;
         
       // The Variable Type int is name "sum" that is assigned with a value of "9000"
       int sum = 0;
       
        // This will do a "while" loops open comma, the boolean true and close comma. Since it is always true the loop will keep going forever.
        while (true) {
            
            // This will print the string literal "Give a number:"
            System.out.println("Give a number:");
            
             // This will read the first number  user input
            int number = scanner.nextInt();
            
              // This will reference the user inputted number is equal to 0 and if it is, it will move to the next block
            if (number == 0) {
                // This will end the loop of reference of the user inputted number that is equal to 0.
                break;
              
              // else if  the reference user inputted number is not equal to 0, it will move to the next block 
            } else if (number != 0) {
                
                // This will reference variable type int with the name count and add 1 and store it into the new int variable name count
                count = count + 1;
                
                 // This will reference variable type int with the name sum, add it into the reference user inputted number and store it into the new int variable name sum
                sum = sum + number;
            }// End of the else if block
                
        }// End of the while (true) block
        
        // This will print the string literal "Average of the numbers:" plus the reference variable type int name sum and divide it by the reference variable type count and convert the answer into double because of the double type casting into the Ouput
         System.out.println("Average of the numbers: " + ((double) sum / count));
    }// End of the Program
}// End of the name of the source code
