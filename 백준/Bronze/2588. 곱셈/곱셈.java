import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        scanner.nextLine();
        String B = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < B.length(); i++) {
            int j = Integer.parseInt(B.substring(B.length() - i - 1, B.length() - i));
            System.out.println(A*j);
            sum += (int) (A * j * Math.pow(10, i));
        }
        System.out.println(sum);

    }
}
