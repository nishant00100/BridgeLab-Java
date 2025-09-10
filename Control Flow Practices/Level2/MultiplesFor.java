import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Multiples of " + n + " below 100 are:");
        for (int i = n; i < 100; i += n) {
            System.out.print(i + " ");
        }
    }
}
