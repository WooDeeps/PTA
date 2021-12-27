import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        int[][] matrix = new int[line][line];
        int now = 0;
        for (int n = 0; n < matrix[0].length; n++) {
            for (int m = matrix.length - 1; m >= 0; m--) {
                if (m >= n) {
                    matrix[m][n] = now;
                    now++;
                    if (now > 9) {
                        now = 0;
                    }
                } else {
                    matrix[m][n] = 0;
                }
            }
        }
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                if (m >= n) {
                    System.out.print(matrix[m][n] + " ");
                }
            }
            System.out.println();
        }
    }
}


