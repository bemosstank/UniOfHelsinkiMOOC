
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        
        fileName = scanner.nextLine();
        
        findFile(fileName);
    }

    public static void findFile(String fileName) {
        try {
            Scanner scan = new Scanner(Paths.get(fileName));
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }

}
