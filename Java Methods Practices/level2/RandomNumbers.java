// 12. Random 4-digit numbers (5 values)
import java.util.*;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = 1000 + rand.nextInt(9000); // 1000–9999
        }

        int sum = 0, min = arr[0], max = arr[0];
        for (int n : arr) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }

        double avg = sum / 5.0;
        System.out.println("Numbers: " + Arrays.toString(arr));
        System.out.println("Average: " + avg);
        System.out.println("Min: " + min + ", Max: " + max);
    }
}
