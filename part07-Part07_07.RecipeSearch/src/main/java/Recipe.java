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

public class Recipe {

    private String recipeName;
    private int cookingTimer;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int cookingTimer) {
        this.recipeName = recipeName;
        this.cookingTimer = cookingTimer;
        this.ingredients = new ArrayList<>();
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getRecipeTimer() {
        return cookingTimer;
    }

    public void addIngredients(String ingredients) {
       this.ingredients.add(ingredients);
    }
   
    public ArrayList<String> getIngredients(){
        return ingredients;
    }
    
    public String toString(){
        return recipeName + ", cooking time: " + cookingTimer; 
    }
}
