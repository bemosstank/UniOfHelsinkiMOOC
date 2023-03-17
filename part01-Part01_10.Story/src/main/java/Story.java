// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file of the source code
public class Story {

    //Start of the Program 
    public static void main(String[] args) {
        
        // This the input that comes from the scanner tool from Java
        Scanner scanner = new Scanner(System.in);
        
         // This will print the string literal "I will tell you a story, but I need some information first." into the output
        System.out.println("I will tell you a story, but I need some information first.");
        
        // This will print the string literal "What is the main character called?" into the output
        System.out.println("What is the main character called?");
        
        // This will read  input from the user
        String Message1 = scanner.nextLine();
        
         //This will print the string literal "What is their job?" into the output
        System.out.println("What is their job?");
        
        // This will read  input from the user
        String Message2 = scanner.nextLine();
        
        // This will print the string literal "Here is the story:" into the output
        System.out.println("Here is the story:");
        
        // This will print the string literal "Once upon a time there was", leave a space,  will then reference the first user input  with string literal ",",  leave a space, it will then print out string literal "Who was, leave a space, reference the second time the user inputted and lastly the string literal "."
        System.out.println("Once upon a time there was" + " " + Message1 + "," + " " + "who was" + " " + Message2 + "." );
        
         // This will print the string literal "On the way to work,", leave a space, will then reference the first user input, it, leave a space, then lastly, it will print the string literal "reflected on life."
        System.out.println("On the way to work," + " " + Message1 + " " + "reflected on life.");
        
        // This will print the string literal "Perhaps", leave a space, then it will reference the first user input, leave a space, it will print out the string literal "will not be", it will leave out a space, reference the seond user input, leave out a space, lastly,  it will print the string literal "forver"
        System.out.println("Perhaps" + " " + Message1 + " " + "will not be" + " " + Message2 + " " + "forever." );
    }
}
