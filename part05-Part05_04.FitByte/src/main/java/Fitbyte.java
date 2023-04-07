/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
public class Fitbyte {
   private int restingHeartRate;
    private int age;
 
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartRate = 206.3-(0.711*this.age);
        return ((maximumHeartRate-restingHeartRate)*(percentageOfMaximum) + restingHeartRate);
    }
}
