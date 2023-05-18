/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
import java.util.Scanner;

public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - Stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("write a joke to be added:");
                String userInput = scanner.nextLine();
                manager.addJoke(userInput);
            }
            if (command.equals("2")) {
                String drawJoke = manager.drawJoke();
                System.out.println(drawJoke);
            }
            if (command.equals("3")) {
                System.out.println("Printing the jokes");
                manager.printJokes();
            }

        }
    }
}
