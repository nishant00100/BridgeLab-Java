import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Multiples of " + n + " below 100 are:");
        int i = n;
        while (i < 100) {
            System.out.print(i + " ");
            i += n;
        }
    }
}
