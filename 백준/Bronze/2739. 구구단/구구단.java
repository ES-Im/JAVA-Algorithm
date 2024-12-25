import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[9];
        for (int i = 0; i < 9; i++) {
            b[i] = i+1;
            System.out.printf("%d * %d = %d", a, b[i], a * b[i]);
            System.out.println();
        }
    }
}
