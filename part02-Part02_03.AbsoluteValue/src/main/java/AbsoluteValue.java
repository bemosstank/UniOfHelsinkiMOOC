// Introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Introduce the Scanner tool used for reading User input
public class AbsoluteValue {

     // Start of the program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
        // This will read the first number  user input
        int number = scanner.nextInt();
        
        // This will reference the user inputted number less than 0 if it is, it will move to the next block
        if(number <0){
            // this will reference the user inputted number and mutiply it by -1 and store it inside a container that has the int variable name "answer"
            int answer = number *-1;
            
            // This wil reference stored container with the int variable name "answer: and print it value into the Output
            System.out.println(answer);
            
         // "else" if the reference user inputted number is not less then zero it will move to the next block 
        }else {
            
            // This wil reference stored container with the int variable name "answer: and print it value into the Output
            System.out.println(number);
        }// Close the for the block last else. 
    }// End of the program 
}// End of the name of the source code
