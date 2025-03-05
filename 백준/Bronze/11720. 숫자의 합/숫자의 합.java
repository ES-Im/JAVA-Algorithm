import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        char[] array = sc.nextLine().toCharArray();
        
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += Integer.parseInt(String.valueOf(array[j]));
        }

        System.out.println(sum);
    }
}