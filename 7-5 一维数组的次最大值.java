import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        U2D_sort(nums);
//        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                System.out.println(nums[i + 1]);
                break;
            }
        }
    }

    public static void U2D_sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}