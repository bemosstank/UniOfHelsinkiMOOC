/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
public class PaymentCard {
    private double balance;
    
     public PaymentCard(double openingBalance){
        this.balance = openingBalance; 
    }
    public String toString(){
        return "The card has a balance of " + this.balance +  " " +  "euros" ;
    }
   public void  eatAffordably (){
       this.balance = this.balance-2.60;
   }
   public void eatHeartily(){
       this.balance = this.balance-4.60;
   }
            
    
}
