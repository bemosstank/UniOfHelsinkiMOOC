
public class StarSign {

    public static void main(String[] args) {

        printStars(3);

        // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int starCount = 0;
        while (starCount < number) {
            System.out.print("*");
            starCount = starCount + 1;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int squareStar =0;
        while(squareStar < size){
            printStars(size);
            squareStar = squareStar+1;
        }
    }

    public static void printRectangle(int width, int height) {
        int rectangleStar = 0;
        while(rectangleStar < height){
            printStars(width);
            rectangleStar = rectangleStar+1;
        }
    }

    public static void printTriangle(int size) {
        int triangleStar =0;
        while(triangleStar <= size){
            printStars(triangleStar);
            triangleStar = triangleStar +1;
        }
    }
}
