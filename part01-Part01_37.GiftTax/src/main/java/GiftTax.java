// introduce the Scanner tool used for reading User input
import java.util.Scanner;

// Name of the file that contain the name of the source code
public class GiftTax {

    // Start of the program
    public static void main(String[] args) {
        
        // This is the input that comes from the scanner tool from Java
        Scanner scan = new Scanner(System.in);
         
         // This will print the string literal "Value of the gift" into the Output
        System.out.println("Value of the gift?");
         
         // This will read the first number  user input
        int valueOfGift = scan.nextInt(); 
        
        //This will reference the user inputted number  it is less than 5000 if it is,  it will move to the next block
        if(valueOfGift < 5000){
            
            // This will print the string literal "No tax!" into the Output.
            System.out.println("No Tax!");
            
          // "else" it will reference if what the user inputted number  greater than or equal 5000 and reference if what the user inputted is less than or equal to 25000 if it is it will move to the next block
        } else if (valueOfGift >= 5000 && valueOfGift <=25000){
            
             // This will do 100 plus the type casting double to convert the intger to reference what the user inputted number - 5000 and mutiply it by 0.08 and store into the idouble variable name "calculation"
            double calculation1 = (100+((double)valueOfGift-5000)*0.08);
            
            // This will print the string literal"Tax: " plus reference the stored double variable name that did the calculation1 and print the result of it into the Ouput
            System.out.println("Tax: " + calculation1);
            
          // "else" it will reference if what the user inputted number  greater than or equal 25000 and reference if what the user inputted is less than or equal to 55000 if it is it will move to the next block
        }else if(valueOfGift >=25000 && valueOfGift <=55000){
            
            // This will do 1700 plus the type casting double to convert it to intger to reference what the user inputted number - 25000 and mutiply it by 0.10 and store into the idouble variable name "calculation"
            double calculation2 = (1700+((double)valueOfGift-25000)*0.10);
            
            // This will print the string literal"Tax: " plus reference the stored double variable name that did the calculation2 and print the result of it into the Ouput
            System.out.println("Tax: " + calculation2);
            
          // "else" it will reference if what the user inputted number  greater than or equal 55000 and reference if what the user inputted is less than or equal to 200000 if it is it will move to the next block
        } else if(valueOfGift >=55000 && valueOfGift < 200000){
            
            // This will do 4700 plus the type casting into double to convert it into intger,  reference what the user inputted number - 55000 and mutiply it by 0.08 and store into the idouble variable name "calculation"
            double calculation3 = (4700+((double)valueOfGift-55000)*0.12);  
            
            // This will print the string literal"Tax: " plus reference the stored double variable name that did the calculation3 and print the result of it into the Ouput
            System.out.println("Tax: " + calculation3);
            
         // "else" it will reference if what the user inputted number  greater than or equal 200000 and reference if what the user inputted is less than or equal to 1000000 if it is it will move to the next block   
        }else if(valueOfGift>=200000 && valueOfGift<=1000000){
            
             // This will do 22100 plus the type casting into double to convert it into intger to  reference what the user inputted number - 200000 and mutiply it by 0.08 and store into the idouble variable name "calculation"
            double calculation4 = (22100 +((double)valueOfGift-200000)*0.15);
            
             // This will print the string literal"Tax: " plus reference the stored double variable name that did the calculation4 and print the result of it into the Ouput
            System.out.println("Tax: " + calculation4);
            
          // "else" it will reference if what the user inputted number  greater than or equal 1000000
        }else if(valueOfGift>=1000000){
             
            // This will do 142100 plus the type casting into double to convert it into intger to  reference what the user inputted number - 1000000 and mutiply it by 0.08 and store into the idouble variable name "calculation"
            double calculation5 = (142100 + ((double)valueOfGift-1000000)*0.17);
            
            // This will print the string literal"Tax: " plus reference the stored double variable name that did the calculation5 and print the result of it into the Ouput
            System.out.println("Tax: " + calculation5);
        }// Close the for the block last else.      
    }// End of the program 
}// End of the name of the source code
