
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingAFile {

    public static void main(String[] args) {
        printFile();
    }

    public static void printFile() {
        try {Scanner scan = new Scanner(Paths.get("data.txt"));
        while(scan.hasNextLine()){
            String row = scan.nextLine();
            System.out.println(row);
        }
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
        
    }
}
