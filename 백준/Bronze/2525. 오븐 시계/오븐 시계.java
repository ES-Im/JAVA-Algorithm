import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();

        if ((b + c) >= 60) {
            a = a + ((b + c) / 60);
            b = b + c - (60 * ((b + c) / 60));
        } else {
            b = (b + c);
        }

        if (a >= 24) {
            a = a - 24;
        }

        System.out.println(a + " " + b);
    }
}
