
public class Main {

    public static void main(String[] args) {
        Song gardern = new Song("In the Gadern", 10910);
        System.out.println("The song " + gardern.name() + " has a length of " + gardern.length() + " seconds." );
        // Song class. You can for instance try this:
        // Song garden = new Song("In The Garden", 10910);
        // System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }
}
