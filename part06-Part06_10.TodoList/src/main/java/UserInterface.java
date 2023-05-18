
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

    private Scanner scanner;
    private TodoList todolists;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.todolists = list;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String inputCommand = scanner.nextLine();
            if (inputCommand.equals("stop")) {
                break;
            } else if (inputCommand.equals("add")) {
                System.out.println("To be add: ");
                String task = scanner.nextLine();
                this.todolists.add(task);

            } else if (inputCommand.equals("list")) {
                this.todolists.print();
            } else if (inputCommand.equals("remove")) {
                System.out.println("which one is removed? ");
                int removeFromTask = Integer.valueOf(scanner.nextLine());
                this.todolists.remove(removeFromTask);
            }else{
                continue;
            }

        }
    }
}
