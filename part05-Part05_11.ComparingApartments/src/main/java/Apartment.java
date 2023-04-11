
import static java.lang.Math.abs;

 
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;     

}
    public boolean moreExpensiveThan(Apartment compared){
        int currentApartment = this.squares*this.pricePerSquare;
        int comparedApartment = compared.squares * compared.pricePerSquare;
          return currentApartment > comparedApartment;
    }
    public boolean largerThan(Apartment compared){
        if(this.squares  < compared.squares){
            return false;
        }
        return true;
    }
    public int priceDifference(Apartment compared){
        int price;
        int comparedPrice;
        
        price = this.pricePerSquare*this.squares;
        comparedPrice = compared.pricePerSquare*compared.squares; 
        return abs(price-comparedPrice);
    }
}
