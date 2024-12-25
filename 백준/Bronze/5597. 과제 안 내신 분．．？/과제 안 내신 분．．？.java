import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] all = new int[30];
        for (int i = 0; i < 30; i++) {
            all[i] = i + 1;  // 출석번호 1부터 30까지 초기화
        }

        // 제출한 학생 처리
        for (int i = 0; i < 28; i++) {
            int submitted = scanner.nextInt();
            all[submitted - 1] = -1;  // 제출한 학생은 -1로 표시
        }

        // 제출하지 않은 학생 출력
        for (int i = 0; i < all.length; i++) {
            if (all[i] > 0) {  // -1이 아닌 값은 제출하지 않은 학생
                System.out.println(i+1);
            }
        }

    }
}