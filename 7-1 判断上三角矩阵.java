import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            int line = input.nextInt();
            int[][] matrix = new int[line][line];
            for (int m = 0; m < matrix.length; m++) {
                for (int n = 0; n < matrix[m].length; n++) {
                    matrix[m][n] = input.nextInt();
                }
            }
            boolean flag1 = false;
            boolean flag2 = false;
            for (int m = 0; m < matrix.length; m++) {
                flag2 = false;
                for (int n = 0; n < matrix[m].length; n++) {
                    if (m > n) {
                        if (matrix[m][n] != 0) {
                            System.out.println("NO");
                            flag1 = true;
                            break;
                        }
                    }
                }
                if (flag1) {
                    break;
                } else {
                    flag2 = true;
                }
            }
            if (flag2) {
                System.out.println("YES");
            }
        }
    }
}