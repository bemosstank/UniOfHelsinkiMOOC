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

    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;

    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner) {
        this.scanner = scanner;
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
    }

    public void start() {
        while (true) {

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];

            int amount = Integer.valueOf(parts[1]);

            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("move")) {
                if ((firstContainer.contains() - amount) >= 0) {
                    this.firstContainer.remove(amount);
                    this.secondContainer.add(amount);
                } else {
                    int moveBuffer = this.firstContainer.contains();
                    this.firstContainer.remove(this.firstContainer.contains());
                    this.secondContainer.add(this.firstContainer.contains() + moveBuffer);
                }
            } else if (command.equals("remove")) {
                this.secondContainer.remove(amount);
            }
        }
        System.out.println("First: " + firstContainer);
        System.out.println("Second: " + secondContainer);

    }
}
