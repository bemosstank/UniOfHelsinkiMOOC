// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class GradesAndPoints {

    // Start of the program
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
        
        // This will print the string literal "Give points [0-100]:" into the Output
        System.out.println("Give points [0-100]:");
        
        // This will read the first number the user input
        int gradePoint = scan.nextInt();
        
         // This will reference the first user inputted numbr  less than 0, it will move to the next block
        if (gradePoint < 0) {
          
             // This will print the string literal print string literal "Impossible!" into the Ouput.
            System.out.println("Impossible!");
            
          // else if it will reference the first user inputted number is less than or equal 49, it will move to the next else if block
        } else if (gradePoint <= 49) {
            
            // This will print the string literal print string literal "failed" into the Ouput.
            System.out.println("failed");
            
          // else if it will reference the first user inputted number is less than or equal 59 it will move to the next else if block
        } else if (gradePoint <= 59) {
            
            // This will print the string literal print string literal "Grade 1" into the Ouput.
            System.out.println("Grade: 1");
            
          // else if it will reference the first user inputted number is less than or equal 69 it will move to the next else if block
        } else if (gradePoint <= 69) {
            
            // This will print the string literal print string literal "Grade 2" into the Ouput.
            System.out.println("Grade: 2");
            
          // else if it will reference the first user inputted number is less than or equal 79 it will move to the next else if block
        } else if (gradePoint <= 79) {
            
             // This will print the string literal print string literal "Grade 3" into the Ouput.
            System.out.println("Grade: 3");
            
         // else if it will reference the first user inputted number is less than or equal 89 it will move to the next else if block  
        } else if(gradePoint <=89){
            
            // This will print the string literal print string literal "Grade 4" into the Ouput.
            System.out.println("Grade: 4");
            
           // else if it will reference the first user inputted number is less than or equal 100 it will move to the next else if block    
        } else if(gradePoint<=100){
            
            // This will print the string literal print string literal "Grade 5" into the Ouput.
            System.out.println("Grade: 5");
            
         // else if it will reference the first user inputted number is less than or equal 101 it will move to the next else if block  
        } else if (gradePoint <= 101){
             // This will print the string literal print string literal "Incredible" into the Ouput.
            System.out.println("Incredible!");
            
        } // Closing block for last else if block
    } // End of the program 
}// End of the name of the source code
