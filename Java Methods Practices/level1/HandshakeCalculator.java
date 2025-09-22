import java.util.Scanner;

class HandshakeCalculator {
    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        HandshakeCalculator calculator = new HandshakeCalculator();
        int maxHandshakes = calculator.calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes possible: " + maxHandshakes);
        scanner.close();
    }
}
