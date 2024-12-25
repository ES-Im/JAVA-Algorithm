import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[42];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int cnt = 10;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cnt; i++) {
            int target = scanner.nextInt();
            arr[target%42] = -1;
        }

        int result = 0;

        for (int i : arr) {
            if(i == -1) {
                result++;
            }
        }

        System.out.println(result);

        scanner.close();
    }
}