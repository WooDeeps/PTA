import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
            int index = 1;
            while (list.size() != 1) {
                for (int i = 0; i < list.size(); i++) {
                    if (index % 3 == 0) {
                        list.remove(i);
                        i--;
                    }
                    index++;
                }
            }
            System.out.println(list.get(0));
        }
    }
}