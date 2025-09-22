// 9. Array of 5 Numbers
import java.util.*;

public class ArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            System.out.println(num + " is " + (num >= 0 ? "Positive" : "Negative")
                    + " and " + (num % 2 == 0 ? "Even" : "Odd"));
        }

        if (arr[0] > arr[4]) System.out.println("First > Last");
        else if (arr[0] < arr[4]) System.out.println("First < Last");
        else System.out.println("First = Last");
    }
}
