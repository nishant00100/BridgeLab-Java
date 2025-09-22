import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    // Generate random 2-digit score (0..99) but typical 2-digit => 10..99; choose 0..99 as general
    public static int[][] generateRandomPCM(int students) {
        Random rnd = new Random();
        int[][] scores = new int[students][3]; // columns: physics, chemistry, maths
        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + rnd.nextInt(90); // 10..99
            scores[i][1] = 10 + rnd.nextInt(90);
            scores[i][2] = 10 + rnd.nextInt(90);
        }
        return scores;
    }

    public static double[][] computeTotalsAndPercentages(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = total / 300.0 * 100.0;
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.println("No\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf(Locale.US, "%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%%n",
                    i+1, scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] scores = generateRandomPCM(students);
        double[][] stats = computeTotalsAndPercentages(scores);
        displayScorecard(scores, stats);
    }
}
