
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!(this.meals.contains(meal))) {
            this.meals.add(meal);
        }

    }

    public void printMeals() {
        for (String list : this.meals) {
            System.out.println(list);
        }

    }

    public void clearMenu() {
        meals.clear();
    }
}
// implement the required methods here

