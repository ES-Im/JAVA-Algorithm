import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 바구니 갯수
        int m = sc.nextInt();   // 얼마나 섞을 건지 횟수 지정
        if(n > 100 || m > 100) {
            System.exit(0);
        }

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            // end - start = 짝수 일 경우 : end - start/2 번 바꾸면 됨
            // end - start = 홀수 일 경우 : (end - start + 1)/2 번 바꾸면 된다.
            int mix = (end - start) % 2 == 0? (end - start)/2 : (end - start + 1)/2;

            for (int j = 0; j < mix; j++) {
                int temp = arr[start + j - 1];
                arr[start + j - 1] = arr[end - j - 1];
                arr[end - j - 1] = temp;
            }

            sc.nextLine();
            //System.out.println((i+1) + "번째 = " + Arrays.toString(arr));
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }



    }
}
