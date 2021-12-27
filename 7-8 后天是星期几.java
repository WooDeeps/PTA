import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int now = input.nextInt();
        int next = now + 2;
        if (next > 7) {
            next -= 7;
        }
        System.out.print(next);
    }
}