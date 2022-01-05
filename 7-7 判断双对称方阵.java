import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            int n = input.nextInt();
            int[][] matrix = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrix[j][k] = input.nextInt();
                }
            }
            boolean flag = false;
            if (isJi(n)) {//奇数
                int m = (n - 1) / 2;//m表示中间，同时表示比较多少次
                //首先比较列
                for (int j = 1; j <= m; j++) {
                    int[] left_lie = new int[n];
                    int[] right_lie = new int[n];
                    for (int k = 0; k < n; k++) {
                        left_lie[k] = matrix[k][m - j];
                        right_lie[k] = matrix[k][m + j];
                    }
                    if (Arrays.equals(left_lie, right_lie)) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                //然后比较行
                if (flag) {
                    for (int j = 1; j <= m; j++) {
                        int[] up_hang = new int[n];
                        int[] down_hang = new int[n];
                        for (int k = 0; k < n; k++) {
                            up_hang[k] = matrix[m - j][k];
                            down_hang[k] = matrix[m + j][k];
                        }
                        if (Arrays.equals(up_hang, down_hang)) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            } else {//偶数
                int right_and_down = n / 2;
                int left_and_up = right_and_down - 1;
                int m = right_and_down;
                //首先比较列
                for (int j = 0; j < m; j++) {
                    int[] left_lie = new int[n];
                    int[] right_lie = new int[n];
                    for (int k = 0; k < n; k++) {
                        left_lie[k] = matrix[k][left_and_up - j];
                        right_lie[k] = matrix[k][right_and_down + j];
                    }
                    if (Arrays.equals(left_lie, right_lie)) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                //然后比较行
                if (flag) {
                    for (int j = 0; j < m; j++) {
                        int[] up_hang = new int[n];
                        int[] down_hang = new int[n];
                        for (int k = 0; k < n; k++) {
                            up_hang[k] = matrix[left_and_up - j][k];
                            down_hang[k] = matrix[right_and_down + j][k];
                        }
                        if (Arrays.equals(up_hang, down_hang)) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isJi(int n) {
        return n % 2 != 0;
    }
}