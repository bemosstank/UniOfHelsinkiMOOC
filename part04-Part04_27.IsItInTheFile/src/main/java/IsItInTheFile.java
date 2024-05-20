
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
public class IsItInTheFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;
        String row ="";
       
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                row = fileScan.nextLine();
                if(searchedFor.equals(row)){
                    isFound = true;
                }
            }
                if(isFound){
                    System.out.println("Found!");
                }else{
                    System.out.println(row);
                    System.out.println("Not found.");
                
        } catch (IOException ex) {
            System.out.println("Reading the file " + file + "failed");
        }
        
       
    }
}
