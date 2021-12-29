import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            int lines = input.nextInt();
            for (int j = 0; j < lines; j++) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int k = 0; k < lines; k++) {
                    list.add(input.nextInt());
                }
                list.sort(Comparator.naturalOrder());
                for (int k = 0; k < list.size(); k++) {
                    System.out.print(list.get(k));
                    if (k!=list.size()-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}