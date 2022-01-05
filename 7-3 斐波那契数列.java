import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            int[] a = new int[47];
            a[0] = 0;
            a[1] = 1;
            for (int j = 2; j < 47; j++) {
                a[j] = a[j - 1] + a[j - 2];
            }
            int n = input.nextInt();
            System.out.println(a[n]);
        }
    }
}