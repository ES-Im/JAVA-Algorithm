import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 수 ( 1 2 3 4 5 번호가 매겨져있음)
        int M = sc.nextInt(); // M번 공을 넣는다
        int[] basket = new int[N]; // 바구니

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();  // a번째 바구니 부터
            int b = sc.nextInt();  // b번째 바구니 까지 ( b > a )
            int c = sc.nextInt();  // c번 공을 넣는다

            for (int j = a-1; j < b; j++) {
                basket[j] = c;
            }
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }

    }
}


