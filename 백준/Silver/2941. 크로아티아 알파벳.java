import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        if (sb.length() > 100) {
            System.exit(0);
        }

        for (int i = 0; i < arr.length; i++) {
            while(sb.indexOf(arr[i]) != -1) {
                if (sb.indexOf(arr[i]) != -1) {
                    sb.replace(sb.indexOf(arr[i]), sb.indexOf(arr[i]) + arr[i].length(), "x");
                }
            }
        }
        System.out.println(sb.length());
        scanner.close();

    }
}
