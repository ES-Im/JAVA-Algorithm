import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 수 ( 1 2 3 4 5 번호가 매겨져있음)
        int[] basket = new int[N]; // 바구니
        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }

        int M = sc.nextInt(); // M번 공을 섞는다

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;

            int temp = basket[a];
            basket[a] = basket[b];
            basket[b] = temp;
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }

    }
}


