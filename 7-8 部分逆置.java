import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int l = 0; l < count; l++) {
            int n = input.nextInt();
            int i = input.nextInt();
            int j = input.nextInt();
            int[] nums = new int[n];
            for (int k = 0; k < n; k++) {
                nums[k] = input.nextInt();
            }
            i--;
            j--;
            while (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            for (int k = 0; k < n; k++) {
                System.out.print(nums[k]);
                if (k != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}