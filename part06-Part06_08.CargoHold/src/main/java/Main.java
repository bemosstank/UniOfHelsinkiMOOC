
public class Main {

    public static void main(String[] args) {
        Item book = new Item("The Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        Suitcase adasCase= new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);
        
        Suitcase pekka = new Suitcase(10);
        pekka.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekka);
        
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();

    }

}
