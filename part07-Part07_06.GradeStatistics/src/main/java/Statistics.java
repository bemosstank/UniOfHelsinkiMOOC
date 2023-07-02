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

public class Statistics {

    private  ArrayList<Integer> grades = new ArrayList<>();

    public void averagePoints(int count, int sum) {
        double calculateAverge = (double) sum / count;
        System.out.println("Point average (all): " + calculateAverge);
    }

    public void averagePassingPoints(int count, int sum) {
        double pointsAverage = (double) sum / count;
        if (count > 0) {
            System.out.println("Points average(passing): " + pointsAverage);
        } else {
            System.out.println("Point average (passing): -");
        }

    }

    public void passedPercentage(int countPassed, int count) {
        double approvedPercentage = 100 * (double) countPassed / count;
        System.out.println("Pass percentage: " + approvedPercentage);
    }

    public void GradeDistribution(ArrayList<Integer> points) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;

        for (Integer point : points) {
            if (point < 50) {
                zero = zero + 1;
            } else if (point < 60) {
                one = one + 1;
            } else if (point < 70) {
                two = two + 1;
            } else if (point < 80) {
                three = three + 1;
            } else if (point < 90) {
                four = four + 1;
            } else if (point >= 90) {
                five = five + 1;
            }
        }
         this.grades.add(zero);
        this.grades.add(one);
        this.grades.add(two);
        this.grades.add(three);
        this.grades.add(four);
        this.grades.add(five);
        System.out.println("Grade distribution:");

        for (int i = this.grades.size() - 1; i >= 0; i--) {
            System.out.print(i + ":"); 
            for(int j =0; j<grades.get(i); j++){
                System.out.print("*");
            }
             System.out.println("");
        }
        
       

    }
}
    

