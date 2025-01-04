public class Main {
    public static void main(String[] args) {
        int l = 2, m = 3, n = 4;

        double[][] A = {{1., 2., 3.}, {4., 5., 6.}};
        double[][] B = {{0., 1., 2., 1}, {2., 1., 3., 2.}, {1., 0., 4., 1.}};

        double[][] C = new double[l][n];

        for (int i = 0; i < l; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < m; j++) {
                    C[i][k] += A[i][j] * B[j][k];
                }
            }
        }

        for (int i = 0; i < l; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(C[i][k] + " ");
            }
            System.out.println();
        }
    }
}