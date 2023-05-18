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

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int weight) {
        this.maximumWeight = weight;
        this.items = new ArrayList<>();

    }

    public void addItem(Item item) {
        if (items.isEmpty()) {
            if (item.getWeight() <= maximumWeight) {
                items.add(item);
            }
        } else {
            items.add(item);
            if (this.totalWeight() >= maximumWeight) {
                items.remove(item);
            }
        }

    }
    public int totalWeight(){
        int totalWeight =0;
         for (Item weightItem : items) {
                totalWeight = totalWeight + weightItem.getWeight();
            }
         return totalWeight;
    }
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
       Item haviestItem = items.get(0);
      for(Item item : items){
          if(item.getWeight()> haviestItem.getWeight()){
              haviestItem = item;
          }
      }
      return haviestItem;
    }

    @Override
    public String toString() {
        String itemCount = "";
       if(items.isEmpty()){
           itemCount = "no items";
       }else  if(items.size()==1) {
           itemCount = items.size() + " item ";
       }else {
           itemCount =  items.size() + " items ";
       }
        return   itemCount + "(" + this.totalWeight() + " kg)";

    }
    
    public void printItems(){
       for(Item items : items)
            System.out.println(items);
    }
}
