import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            ArrayList<Integer> odds = new ArrayList<>();
            ArrayList<Integer> evens = new ArrayList<>();
            int num_count = input.nextInt();
            for (int j = 0; j < num_count; j++) {
                int num = input.nextInt();
                if (num % 2 == 0) {
                    evens.add(num);
                } else {
                    odds.add(num);
                }
            }
            odds.sort(Comparator.naturalOrder());
            evens.sort(Comparator.naturalOrder());
            for (int j = 0; j < odds.size(); j++) {
                System.out.print(odds.get(j));
                if (j != odds.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < evens.size(); j++) {
                System.out.print(evens.get(j));
                if (j != evens.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}