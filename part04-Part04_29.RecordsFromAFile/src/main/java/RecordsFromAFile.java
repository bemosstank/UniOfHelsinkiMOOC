
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        recordsFromAFile(fileName);
    }

    public static void recordsFromAFile(String fileName) {
        String row;
        String[] array;
        String name = "";
        int age = 0;
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                row = reader.nextLine();

                array = row.split(",");
                name = array[0];
                age = Integer.valueOf(array[1]);
                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }

            }
        } catch (IOException exe) {
            System.out.println("Error: " + exe.getMessage());
        }

    }
}
