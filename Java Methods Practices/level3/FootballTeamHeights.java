import java.util.Arrays;

public class FootballTeamHeights {
    private static final int TEAM_SIZE = 11;
    private static final int MIN_HEIGHT_CM = 150;
    private static final int MAX_HEIGHT_CM = 250;

    public static int[] generateRandomHeights(int size, int minCm, int maxCm) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * (maxCm - minCm + 1)) + minCm;
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }

    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v < m) m = v;
        return m;
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v > m) m = v;
        return m;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(TEAM_SIZE, MIN_HEIGHT_CM, MAX_HEIGHT_CM);
        System.out.println("Heights (cm): " + Arrays.toString(heights));
        System.out.println("Shortest height: " + min(heights) + " cm");
        System.out.println("Tallest height : " + max(heights) + " cm");
        System.out.printf("Mean height    : %.2f cm%n", mean(heights));
    }
}
