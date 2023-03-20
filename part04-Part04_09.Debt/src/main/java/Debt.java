/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
public class Debt {

    private double balance;
    private double interestRate;

    public  Debt(double initialBlance, double initialInterestRate) {
        this.balance = initialBlance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void waitOneYear() {
        balance = balance * interestRate;
       
    }

}
