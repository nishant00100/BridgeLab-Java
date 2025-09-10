
import java.util.Scanner;

// Program to find maximum handshakes among students
class HandshakeCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes among "
                + numberOfStudents + " students is " + handshakes);

        input.close();
    }
}
