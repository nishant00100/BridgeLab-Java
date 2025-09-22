import java.util.Arrays;

public class MatrixOperationsAdvanced {

    public static double[][] createRandomMatrix(int rows, int cols, int minVal, int maxVal) {
        double[][] m = new double[rows][cols];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++)
            m[i][j] = minVal + Math.random() * (maxVal - minVal);
        return m;
    }

    public static double[][] transpose(double[][] a) {
        int r = a.length, c = a[0].length;
        double[][] t = new double[c][r];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) t[j][i] = a[i][j];
        return t;
    }

    public static double determinant2x2(double[][] m) {
        if (m.length != 2 || m[0].length != 2) throw new IllegalArgumentException("Require 2x2 matrix");
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        if (m.length != 3 || m[0].length != 3) throw new IllegalArgumentException("Require 3x3 matrix");
        double a = m[0][0], b = m[0][1], c = m[0][2];
        double d = m[1][0], e = m[1][1], f = m[1][2];
        double g = m[2][0], h = m[2][1], i = m[2][2];
        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (Math.abs(det) < 1e-9) throw new IllegalArgumentException("Matrix not invertible");
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    // Inverse 3x3 using adjugate/determinant
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (Math.abs(det) < 1e-9) throw new IllegalArgumentException("Matrix not invertible");
        double[][] adj = new double[3][3];

        adj[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        adj[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);

        adj[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        adj[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);

        adj[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        adj[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);
        adj[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        // transpose adj to get adjugate
        double[][] adjT = transpose(adj);
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) inv[i][j] = adjT[i][j] / det;
        return inv;
    }

    // public static double[][] transpose(double[][] a) {
    //     int r = a.length, c = a[0].length;
    //     double[][] t = new double[c][r];
    //     for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) t[j][i] = a[i][j];
    //     return t;
    // }

    public static void displayMatrix(double[][] m) {
        for (double[] row : m) System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        double[][] m2 = { {4, 7}, {2, 6} };
        System.out.println("2x2 matrix:"); displayMatrix(m2);
        System.out.println("Det 2x2: " + determinant2x2(m2));
        System.out.println("Inverse 2x2:"); displayMatrix(inverse2x2(m2));

        double[][] m3 = { {1,2,3}, {0,1,4}, {5,6,0} };
        System.out.println("3x3 matrix:"); displayMatrix(m3);
        System.out.println("Det 3x3: " + determinant3x3(m3));
        System.out.println("Inverse 3x3:"); displayMatrix(inverse3x3(m3));
        System.out.println("Transpose 3x3:"); displayMatrix(transpose(m3));
    }
}
