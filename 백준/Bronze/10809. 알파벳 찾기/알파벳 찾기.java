import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] target = sc.nextLine().toCharArray();
        sc.close();

        int[] result = new int[26];
        Arrays.fill(result, -1);

        for (int i = 0; i < target.length; i++) {
            if(result[(target[i]) - 97] == -1) {
                result[(target[i]) - 97] = i;
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}