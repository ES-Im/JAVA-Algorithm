import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            String[] arr = new String[a];
            arr[i] = ""; // 배열 초기화
            String inputBlank = ""; // 공백 초기화
            String inputStar = "*";
            for (int j = a - 1; j > i; j--) {
                inputBlank += " ";
            }
            for (int j = 0; j < i; j++) {
                inputStar += "*";
            }

            arr[i] = inputBlank + inputStar;
            System.out.println(arr[i]);
        }



    }
}
