import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        char[] line = input.next().toCharArray();
        int k = line.length;
        int m = k - (times % k);
        for (int i = m; i < k; i++) {
            System.out.print(line[i]);
        }
        for (int i = 0; i <= m - 1; i++) {
            System.out.print(line[i]);
        }
    }
}