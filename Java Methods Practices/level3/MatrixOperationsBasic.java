import java.util.Arrays;
import java.util.Random;

public class MatrixOperationsBasic {

    public static int[][] createRandomMatrix(int rows, int cols, int minVal, int maxVal) {
        Random rnd = new Random();
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++)
            m[i][j] = minVal + rnd.nextInt(maxVal - minVal + 1);
        return m;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int r1 = a.length, c1 = a[0].length, r2 = b.length, c2 = b[0].length;
        if (c1 != r2) throw new IllegalArgumentException("Incompatible matrix sizes for multiplication");
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) sum += a[i][k] * b[k][j];
                res[i][j] = sum;
            }
        }
        return res;
    }

    public static void printMatrix(int[][] m) {
        for (int[] row : m) System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        int[][] A = createRandomMatrix(2, 3, 0, 9);
        int[][] B = createRandomMatrix(2, 3, 0, 9);

        System.out.println("Matrix A:"); printMatrix(A);
        System.out.println("Matrix B:"); printMatrix(B);

        System.out.println("A + B:"); printMatrix(addMatrices(A, B));
        System.out.println("A - B:"); printMatrix(subtractMatrices(A, B));

        // For multiplication create compatible matrices
        int[][] C = createRandomMatrix(3, 2, 0, 9);
        System.out.println("Matrix C (for A * C):"); printMatrix(C);
        System.out.println("A * C:"); printMatrix(multiplyMatrices(A, C));
    }
}
