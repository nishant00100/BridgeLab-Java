import java.util.Scanner;

public class CollinearChecker {
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // To avoid division by zero, compare cross multiplication:
        // (y2 - y1)/(x2 - x1) == (y3 - y2)/(x3 - x2) -> (y2 - y1)*(x3 - x2) == (y3 - y2)*(x2 - x1)
        double lhs = (y2 - y1) * (x3 - x2);
        double rhs = (y3 - y2) * (x2 - x1);
        return Math.abs(lhs - rhs) < 1e-9;
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        // sample demonstration
        double x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;
        System.out.println("Points A(2,4), B(4,6), C(6,8) - slope method: " + areCollinearBySlope(x1,y1,x2,y2,x3,y3));
        System.out.println("Points A(2,4), B(4,6), C(6,8) - area method: " + areCollinearByArea(x1,y1,x2,y2,x3,y3));

        // interactive
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        x1 = sc.nextDouble(); y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        x2 = sc.nextDouble(); y2 = sc.nextDouble();
        System.out.print("Enter x3 y3: ");
        x3 = sc.nextDouble(); y3 = sc.nextDouble();

        System.out.println("Collinear by slope? " + areCollinearBySlope(x1,y1,x2,y2,x3,y3));
        System.out.println("Collinear by area?  " + areCollinearByArea(x1,y1,x2,y2,x3,y3));
    }
}
