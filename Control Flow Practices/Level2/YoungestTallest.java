import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();

        int youngestAge = Integer.MAX_VALUE;
        int tallestHeight = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter age of friend " + i + ": ");
            int age = sc.nextInt();
            System.out.print("Enter height of friend " + i + " (in cm): ");
            int height = sc.nextInt();

            if (age < youngestAge)
                youngestAge = age;
            if (height > tallestHeight)
                tallestHeight = height;
        }

        System.out.println("\nYoungest age: " + youngestAge);
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
}
