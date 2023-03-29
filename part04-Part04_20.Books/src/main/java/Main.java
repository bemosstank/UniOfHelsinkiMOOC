import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
         while (true){
            System.out.println("Title:");
            String title = userInput.nextLine();
            
            if(title.isEmpty()){
                break;
            }
             System.out.println("Pages:");
             int pages = Integer.valueOf(userInput.nextLine());
             
             System.out.println("Publication year:");
             int publicationYear = Integer.valueOf(userInput.nextLine());
             
             books.add(new Book(title, pages, publicationYear));
        }
         System.out.println("What information will be printed?");
         String printOut = userInput.nextLine();
         
         for(Book book : books){
             if(printOut.equals("everything")){
                 System.out.println(book.getInstanceTitle() + ", " + book.getInstancePages() + " pages, " + book.getInstanceYear());
                  
                 
             }else if(printOut.equals("name")){
                  System.out.println(book.getInstanceTitle());
             }
         }
       

    }
}
