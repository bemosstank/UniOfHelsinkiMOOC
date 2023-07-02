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
import java.util.ArrayList;

public class UserInterface {

    private final Scanner scanner;
    private int sum = 0;
    private int count = 0;
    private int sumPassed;
    private int countPassed = 0;
    private Statistics statistics;
    private ArrayList<Integer> points;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.statistics = new Statistics();
        this.points = new ArrayList<>();
    }

    public void start() {
        this.readPoints();
    }

    public void readPoints() {
        System.out.println("Enter point totals -1 stops");
        while (true) {
            String textNumber = scanner.nextLine();
            int convertStringToNumber = Integer.parseInt(textNumber);
            if (convertStringToNumber == -1) {
                break;
            } else if (convertStringToNumber >= 0 && convertStringToNumber <= 100) {
                sum = sum + convertStringToNumber;
                count = count + 1;
                points.add(convertStringToNumber);

                if (convertStringToNumber >= 50) {
                    sumPassed = sumPassed + convertStringToNumber;
                    countPassed = countPassed + 1;
                }
            }
        }
        statistics.averagePoints(count, sum);
        statistics.averagePassingPoints(countPassed, sumPassed);
        statistics.passedPercentage(countPassed, count);
        statistics.GradeDistribution(points);
    }

}
