/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int weight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = this.totalWeight() + suitcase.totalWeight();
        if (weight <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight = totalWeight + suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases" + " (" + this.totalWeight() + " kg" + ")";
    }
}
