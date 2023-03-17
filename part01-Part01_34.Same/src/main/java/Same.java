// introduce the Scanner tool used for reading User input
import java.util.Scanner;
// Name of the file that contain the name of the source code
public class Same {

    
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
         // This will print the string literal "Enter the first string" into the Output
        System.out.println("Enter the first string");
        
        // This will read the first text the user input
        String firstString = scan.nextLine();
        
        // This will print the string literal "Enter the second string" into the Output
        System.out.println("Enter the second string");
        
        // This will read the first text the user input
        String secondString = scan.nextLine();
        
        // This will reference the first user inputted text equals to reference second user inputted number if it equals to it, it will move to the next block
        if(firstString.equals(secondString)){
             // This will print the string literal print string literal "Same".
            System.out.println("Same");
            
         // "else" if it is not equal to the reference second user inputted number it will move to the next block
        }else{
            // This will print the string literal print string literal "Different".
            System.out.println("Different");
        }// Close the for the block last else. 
    }// End of the program 
}// End of the name of the source code
