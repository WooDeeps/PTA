import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        double[][] new_matrix = new double[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!(i == 0 || j == 0 || i == matrix.length - 1 || j == matrix[i].length - 1)) {
                    new_matrix[i][j] = (double) (matrix[i][j] + matrix[i - 1][j] + matrix[i + 1][j] + matrix[i][j - 1] + matrix[i][j + 1]) / 5;
                } else {
                    new_matrix[i][j] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < new_matrix.length; i++) {
            for (int j = 0; j < new_matrix[i].length; j++) {
                System.out.print((int) (new_matrix[i][j] + 0.5));
                if (j != new_matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}