// Program Name: MatrixSum.java
// Description: Create a 2D array, display elements, and compute their sum

import java.util.Scanner;

class MatrixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take rows and columns input
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid dimensions.");
            System.exit(0);
        }

        // Declare 2D array
        int[][] matrix = new int[rows][cols];

        // Take matrix input
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Display matrix and compute sum
        int sum = 0;
        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum of all elements = " + sum);
        input.close();
    }
}
