import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[6];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 6; j++) {
                arr[j] = sc.nextInt();
            }
            if ((arr[2] == arr[0] && arr[3] == arr[1]) || (arr[4] == arr[0] && arr[5] == arr[1])) {
                System.out.println(0);
            } else if (arr[0] == 0 && arr[1] == 0) {
                System.out.println(1);
            } else {
                BigInteger[][] dp = new BigInteger[arr[1] + 1][arr[0] + 1];
                for (int m = 0; m <= dp.length - 1; m++) {
                    for (int n = 0; n <= dp[m].length - 1; n++) {
                        if ((m == arr[3] && n == arr[2]) || (m == arr[5] && n == arr[4])) {
                            dp[m][n] = new BigInteger("0");
                        } else if (m > 0 && n > 0) {
                            dp[m][n] = dp[m - 1][n].add(dp[m][n - 1]);
                        } else if (m > 0) {
                            dp[m][n] = dp[m - 1][n];
                        } else if (n > 0) {
                            dp[m][n] = dp[m][n - 1];
                        } else {
                            dp[m][n] = new BigInteger("1");
                        }
                    }
                }
                System.out.println(dp[arr[1]][arr[0]]);
            }
        }
    }
}