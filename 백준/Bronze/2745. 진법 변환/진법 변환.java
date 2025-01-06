import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 대상 숫자
        String n = scanner.next();
        // 대상 진법
        int b = scanner.nextInt();
        scanner.nextLine();

        // 거듭제곱을 위한 변수, 10진수 값
        int power = 1;
        long decimal = 0L;

        for (int i = n.length() - 1; i >= 0; i--) {
            char a = n.charAt(i);

            if('0' <= a && a <= '9') {
                // 아스키 코드값 제외
                decimal += (long) (a - '0') * power;
            } else {
                decimal += (long) ( a + 10 - 'A') * power;
            }
            power *= b;
        }

        System.out.println(decimal);
        scanner.close();
    }
}