// Introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class LeapYear {
    
    // Start of the program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
        // This will print the string literal "Enter the first string" into the Output
        System.out.println("Give a year:");
        
         // This will read the first number user input
        int year = scan.nextInt();
        
        // This is will reference the user inputted number modulo by 4 is equal 0 and reference user inputted number modulo is not equal to 0 or reference user inputted number is equal to 0 then move to the next block
        if((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)){
            // This will print the string literal "The year is a leap year
            System.out.println("The year is a leap year.");
            //"else" if  reference user inputted  number is not mudulo 4 is equal 0 and reference user inputted number % 100 is not equal 0 or if the reference user inputted number is not modulo of 4 is equal 0 then move to the next block
        }else {
            // This will print the string literal i not a leap year.
            System.out.println("The year is not a leap year.");
        }// Close the for the block last else. 
               
    }// End of the program 
}// End of the name of the source code
