
import java.util.ArrayList;
import java.util.Iterator;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfPoints() {
        int count = 0;
        int addNumber = 0;
        for (Integer sum : this.points) {
            count = count + 1;
            addNumber = sum + addNumber;
        }
        if(this.points.isEmpty()){
            return-1;
        }
        return ((double)addNumber/count);
    }

    public double averageOfGrades() {
        int sum = 0;
        int addNumber = 0;
        for (int count : this.grades) {
            sum = sum + count;
            addNumber = addNumber + 1;

        }
        if (this.grades.isEmpty()) {
            return -1;
        }
        return 1.0 * sum / addNumber;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
