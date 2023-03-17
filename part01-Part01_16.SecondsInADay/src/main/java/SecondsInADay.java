// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class SecondsInADay {
       
    //Start of the Program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
                 
        // This will print the string literal "How many days would you like to convert to seconds?"" into the Output
        System.out.println("How many days would you like to convert to seconds?");
        
        // This will read the number the user input.
        int secondInDay = scanner.nextInt();
        
        // This will reference what the user inputted and mutiply it by "86400" and store it into intger variable name "sum" container
        int sum = secondInDay * 86400;
        
        // This will print out the reference integer name "sum" container into the Output
        System.out.println(sum);
    
    }// End of the program
}// End of the name of the source code
