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
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String jokes) {
        this.jokes.add(jokes);
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }

    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int randomIndex = draw.nextInt(jokes.size());
      return jokes.get(randomIndex);
    }
}
