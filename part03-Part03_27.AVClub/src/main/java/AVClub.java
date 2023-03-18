
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String userInput = String.valueOf(scanner.nextLine());
            if(userInput.equals("")){
                break;
            }
            String[] arrayToWord = userInput.split(" ");
            for(String word : arrayToWord){
                if(word.contains("av")){
                    System.out.println(word); 
                }
                
            }
            
            
            
        }

    }
}
