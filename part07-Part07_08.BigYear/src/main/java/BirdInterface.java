/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
import java.util.Scanner;
import java.util.ArrayList;

public class BirdInterface {

    private Scanner scan;
    private ArrayList<Bird> listOfBird;

    public BirdInterface(Scanner scan) {
        this.scan = scan;
        this.listOfBird = new ArrayList<>();

    }

    public void addBirdName() {
        System.out.println("Name");
        String birdName = this.scan.nextLine();
        System.out.println("Name in Latin:");
        String LatinName = this.scan.nextLine();
        this.listOfBird.add(new Bird(birdName, LatinName));
    }

    public void observedBird() {
        System.out.println("Bird?");
        String birdName = this.scan.nextLine();
        for (Bird bird : listOfBird) {
            if (bird.getBirdName().equals(birdName)) {
                System.out.println(bird);
                bird.getObservation();
                return;
               
            }
        }
        System.out.println("not a bird!");
    }

    public void promptOneBird() {
        System.out.println("Bird?");
        String hawk = this.scan.nextLine();
        for (Bird bird : listOfBird) {
            if (bird.getBirdName().equals(hawk)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird");
    }

    public void printAllBirdAndObservation() {
        for (Bird bird : listOfBird) {
            System.out.println(bird);
        }
    }
}
