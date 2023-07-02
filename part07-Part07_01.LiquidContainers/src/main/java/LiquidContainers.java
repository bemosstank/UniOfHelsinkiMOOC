
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        // This will allow as to input words in the output
        // The scanner is the class, the object is scan, the new Scanner is the constructor and inside the System.in  is the system stream;
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;

        // this will allows as to loop  things inside the loop
        while (true) {

            //Allow user to input words input the input
            String input = scan.nextLine();

            // If what the user input equals quit it will end the loop
            if (input.equals("quit")) {
                break;
            }
            // This will allow the user to split what they write in the Ouput
            String[] parts = input.split(" ");

            // It will call the first split word the user input and 
            String command = parts[0];

            // it will call the second split word the user input and convert it into the integer for the user to input.
            int amount = Integer.valueOf(parts[1]);

            System.out.println("First: " + firstVolume + "/" + maxVolume);
            System.out.println("Second: " + secondVolume + "/" + maxVolume);
            
            // if what the user input is equals to add  and the amount less than equals to 0 then do everything underneath the curly bracket
            if (command.equals("add") && amount >= 0) {
                
                // if the firstVolume is less than or equals to maxVolume then underneath the curly bracket
                if (firstVolume <= maxVolume) {
                    
                    // add the first volume to the amount and store it back to the firstVolume;
                    firstVolume = firstVolume + amount;
                    
                    // if first volume less than maxVolume  then do what is underneath the curly bracket
                    if (firstVolume > maxVolume) {
                        // move the max volume to firstVolume;
                        firstVolume = maxVolume;
                        
                    } // end of the last if statement
                    
                }// end of the second if statement 
                
            }// end of the first if statement
            
            else if (command.equals("move") && amount >= 0) {
                if ((firstVolume - amount) >= 0) {
                    secondVolume = secondVolume + amount;
                    firstVolume = firstVolume - amount;
                    if (secondVolume >= maxVolume) {
                        secondVolume = maxVolume;
                    }
                } else if ((firstVolume - amount) < 0) {
                    secondVolume = secondVolume + firstVolume;
                    firstVolume = 0;
                    if (secondVolume >= maxVolume) {
                        secondVolume = maxVolume;
                    }
                }
            } else if (command.equals("remove") && amount >= 0) {
                if ((secondVolume - amount) >= 0) {
                    secondVolume = secondVolume - amount;
                } else if ((secondVolume - amount) < 0) {
                    secondVolume = 0;
                }
            }

        }
        System.out.println("First: " + firstVolume + "/" + maxVolume);
        System.out.println("Second: " + secondVolume + "/" + maxVolume);
    }
}
