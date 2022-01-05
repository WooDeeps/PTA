import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            int n = input.nextInt();
            int[][] matrix = new int[n][n];
            int a = 1;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j >= k) {
                        matrix[j][k] = a;
                        a++;
                    }
                }
            }
            for (int k = 1; k < n; k++) {
                while (matrix[0][k] == 0) {
                    for (int j = 0; j < n - 1; j++) {
                        matrix[j][k] = matrix[j + 1][k];
                    }
                    matrix[n - 1][k] = 0;
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (matrix[j][k] != 0) {
                        System.out.print(matrix[j][k]);
                        if (k != n - 1) {
                            if (matrix[j][k+1] != 0){
                                System.out.print(" ");
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}