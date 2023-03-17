// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class AverageOfThreeNumbers {

    //Start of the Program
    public static void main(String[] args) {
        
         // This is the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
         // This will print the string literal ""Give the first number:" into the Output
        System.out.println("Give the first number:");
        
         // This will read first input from the users from a text and convert into whole number.
        int first = Integer.valueOf(scanner.nextLine());
        
        // This will print the string literal ""Give the second number:" into the Output
        System.out.println("Give the second number:");
        
        // This will read second input from the users from a text and convert into whole number.
        int second = Integer.valueOf(scanner.nextLine());
        
        // This will print the string literal ""Give the third number:" into the Output
        System.out.println("Give the third number:");
        
         // This will read third input from the users from a text and convert into whole number.
        int third = Integer.valueOf(scanner.nextLine());
        
        // This will print the string literal "The average numbers is ", It will then type cast the reference of the first user inputted  add it up with the reference second user inputted add it up again by reference the third user inputted and it then it will print the result of it in the Ouput. 
        System.out.println("The average is " + ((double)first + second + third)/3);

    }// End of the Program
}// End of the name of the source code
