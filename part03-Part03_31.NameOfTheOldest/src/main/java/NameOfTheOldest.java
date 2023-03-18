
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age =0;
        int n =0;
        String name = "";
        
        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            String[] word = userInput.split(",");
            age = Integer.valueOf(word[1]);
            if(age > n ){
                n =age;
                name = word[0];
                
            }          
        }
        System.out.println("Name of the oldest:"+ name);

    }
}
