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

public class Bird {

    private String birdName;
    private String latinName;
    private int observations = 0;
 

    public Bird(String birdName, String latinName) {
        this.birdName = birdName;
        this.latinName = latinName;
        
    }


    public String getBirdName() {
        return this.birdName;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        this.observations = observations + 1;
        return observations;
    }

    @Override
    public String toString() {
        return this.birdName + "(" + this.latinName + ")" + ": " + this.observations + " " + "observations";
    }

}
