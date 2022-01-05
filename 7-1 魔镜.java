import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String len = input.next();
            int length = len.length();
            while (length != 1) {
                String ahead = len.substring(0, length / 2);
                StringBuilder back = new StringBuilder(len.substring(length / 2, length));
                back.reverse();
                if (ahead.equals(back.toString())) {
                    length /= 2;
                }else {
                    break;
                }
            }
            System.out.println(length);
        }
    }
}