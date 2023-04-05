
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");

        for (Person person : records) {
            System.out.println(person);

        }
        readRecordsFromFile(file);
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            String[] splitRow;
            String name;
            int age;
            while (fileScan.hasNextLine()) {
                String row = fileScan.nextLine();

                splitRow = row.split(",");
                name = splitRow[0];
                age = Integer.valueOf(splitRow[1]);
                persons.add(new Person(name, age));
            }
        } catch (IOException exe) {
            System.out.println("Error: " + exe.getMessage());
        }
        return persons;

    }
}
