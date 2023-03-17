// introduce the Scanner tool used for reading User input
import java.util.Scanner;


// Name of the file that contain the name of the source code
public class AverageOfTwoNumbers {

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
         
         // This  will add 1.0 the mutiply it into reference the first integer name the user inputted from text to number and add it to reference seond intger name the user inputted and  divided it by 2 and store into the container of doubkle variable type name
         double sum = 1.0*(first+second)/2;
         
         // This will print the string literal "The average numbers is ", it wiill then reference the result of average numbers that user inputted and print back into the Output
         System.out.println("The average is " + sum);

    }// End of the Program
}// End of the name of the source code
