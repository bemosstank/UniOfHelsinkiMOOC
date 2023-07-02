
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        System.out.println("File to read: " + fileName + "\n");
        ArrayList<Recipe> recipes = readFile(fileName);

        showMenu(scanner, recipes);

    }

    private static ArrayList<Recipe> readFile(String fileName) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            String ingredient;
            while (scanner.hasNextLine()) {
                String recipeName = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipes.add(recipe);
                while (scanner.hasNextLine()) {
                    ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }

            }

        } catch (Exception exe) {
            System.out.println("Error " + exe.getMessage());
        }

        return recipes;
    }

    public static void showMenu(Scanner in, ArrayList<Recipe> recipes) {
        System.out.println("Commands: \n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");
        while (true) {
            System.out.println("Enter Command:");
            String userInput = in.nextLine();
           if (userInput.equals("stop")) {
                return;
            } else if (userInput.equals("list")) {
                listRecipes(recipes);
            } else if (userInput.equals("find name")) {
                String word = String.valueOf(in.nextLine());
                System.out.println("Searched: " + word);
                listByName(recipes, word);
            } else if (userInput.equals("find cooking time")){
             System.out.println("Max cooking time");
                int cookingTime = Integer.parseInt(in.nextLine());
               
                searchForCookingTime(recipes, cookingTime);
            } else if (userInput.equals("find ingredient")) {
                String ingredient = String.valueOf(in.nextLine());
                System.out.println("Ingredient: " + ingredient);
                searchForRecipe(recipes, ingredient);
            }

        }

    }

    public static void listRecipes(ArrayList<Recipe> recipes) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    private static void listByName(ArrayList<Recipe> recipes, String word) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeName().contains(word)) {
                System.out.println(recipe);
            }

        }
    }

    public static void searchForCookingTime(ArrayList<Recipe> recipes, int cookingTime) {
        System.out.println("Recipies: ");
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeTimer() <= cookingTime) {
                System.out.println(recipe);
            }
        }

    }

    public static void searchForRecipe(ArrayList<Recipe> recipes, String ingredient) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }

    }
}
