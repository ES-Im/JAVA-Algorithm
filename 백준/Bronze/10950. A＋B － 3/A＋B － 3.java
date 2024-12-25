import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int[] c = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < a; i++) {
            System.out.println(b[i] + c[i]);
        }
    }
}
