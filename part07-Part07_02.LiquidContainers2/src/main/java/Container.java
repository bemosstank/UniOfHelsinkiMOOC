/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
public class Container {

    private int totalAmount;

    public Container() {
        this.totalAmount = 0;
    }

    public int contains() {
        return totalAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            totalAmount = totalAmount + amount;
            if (totalAmount > 100) {
                totalAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            totalAmount = totalAmount - amount;
            if (totalAmount < 0) {
                totalAmount = 0;
            }
        }
    }

    public String toString() {
        return totalAmount + "/" + 100;
    }
}
