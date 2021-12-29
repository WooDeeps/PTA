import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(input.nextInt());
        }
        list.sort(Comparator.naturalOrder());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}