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
public class TodoList {
   private ArrayList<String> todoLists;
    
   public TodoList(){
       this.todoLists = new ArrayList<>();
   }
   
   public void add(String task){
       this.todoLists.add(task);
   }
   
   public void print(){
     for(String todoList : todoLists){
         System.out.println((this.todoLists.indexOf(todoList)+1) + ": " + todoList);
     }
   }
   public void remove(int number){
       this.todoLists.remove(number-1 );
   }
}
