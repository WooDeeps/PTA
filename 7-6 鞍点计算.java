import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        int[] max = new int[n];
        int[] min = new int[n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int maxn = matrix[i][0];
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxn) {
                    maxn = matrix[i][j];
                }
            }
            max[i] = maxn;
        }
        for (int j = 0; j < n; j++) {
            int minn = matrix[0][j];
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] < minn) {
                    minn = matrix[i][j];
                }
            }
            min[j] = minn;
        }
        boolean flag = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (min[j] == max[i]) {
                    System.out.println((i + 1) + " " + (j + 1) + " " + max[i]);
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println("not found");
        }
    }
}