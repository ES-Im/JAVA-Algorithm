import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().toCharArray();
        int i = sc.nextInt() - 1;
        System.out.println(c[i]);
    }
}