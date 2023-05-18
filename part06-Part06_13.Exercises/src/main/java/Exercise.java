/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
public class Exercise {
    private String name;
    private boolean isCompleted;
    
    public Exercise (String name){
        this.name = name;
        this.isCompleted = false;
    }
    public String getName(){
        return this.name;
    }
    public void setCompleted(boolean completed){
        this.isCompleted = completed;
    }
    public boolean isCompleted(){
        return isCompleted;
    }
  
}
