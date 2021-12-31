import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char que = input.next().charAt(0);
        int key = input.nextInt();
        key %= 26;
        if ((char) (que + key) <= 'z' && (char) (que + key) >= 'a') {
            System.out.println((char) (que + key));
        } else if ((char) (que + key) < 'a') {
            System.out.println((char) (que + key + 26));
        } else if ((char) (que + key) > 'z') {
            System.out.println((char) (que + key - 26));
        }
    }
}