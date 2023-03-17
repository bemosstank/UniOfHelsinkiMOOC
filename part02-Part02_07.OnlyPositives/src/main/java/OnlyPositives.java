// Introduce the Scanner tool used for reading user input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class OnlyPositives {

    // Start of the program
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
        // This will do a "while" loops open comma, the boolean true and close comma. Since it is always true the loop will keep going forever.
        while(true){
            
            // This will print the String literal "Give a number:" into the Output
            System.out.println("Give a number");
            
            // This will read the first number user input
            int number = scanner.nextInt();
            
            // This will reference the user inputted number is equal to 0 and if it is, it will move to the next block
            if (number == 0){
                
                // This will end the loop of reference of the user inputted number that is equal to 0.
                break;
            } // End of the while (true) loop
            
            // This will reference the user inputted number is less than  0 and if it is, it will move to the next block
            if (number <0){
                
                // This will print the String literal "Unsuitable number"" into the Output
                System.out.println("Unsuitable number");
                
                // This will let it go back into the while (true) loop block 
                continue;
            }
            
            // This will reference the user inputted number is less greater than 0 and if it is, it will move to the next block
            if (number > 0){
                
                // This will reference the user inputted number and mutiply it reference user inputted number and store it into a container of variable integer type named "calculation"
                int calculation = number *number;
                
                // This will print back the store container of the variable integer type named calculation into the output
                System.out.println(calculation);
                
            }// End of the If block 
        }// end of the while (true) block
      

    }// End of the Program 
}// End of the name of the source code
