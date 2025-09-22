import java.util.Scanner;

class SpringSeasonChecker {
    public boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        SpringSeasonChecker checker = new SpringSeasonChecker();
        boolean isSpring = checker.isSpringSeason(month, day);

        if (isSpring) System.out.println("It's a Spring Season");
        else System.out.println("Not a Spring Season");

        scanner.close();
    }
}
