import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        int base = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        while(decimal > 0) {
            // 나머지가 10 이하라면 그대로 붙이기
            if(decimal % base < 10) {
                sb.append(decimal % base);
            } else {
                // 나머지가 10 초과라면 "A(11) ... ~ Z(35)" 등 알파벳으로 나타남
                // 'A'를 시작점으로 아스키 코드를 증가시킨 값을 붙이기
                sb.append((char)(decimal % base - 10 + 'A'));
            }
            decimal /= base;
        }
        System.out.println(sb.reverse());
    }
}