
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    
    public static void main(String[] args) {
        int count=0;
        ArrayList<String>list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
       
    
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {

                list.add(fileScan.nextLine());
                
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        for (String item : list) {
            int number = Integer.valueOf(item);
            if (number >= lowerBound && number <= upperBound) {
                count = count +1;
            } 
            
            
        }
        System.out.println("Numbers: " + count);
    }
}


