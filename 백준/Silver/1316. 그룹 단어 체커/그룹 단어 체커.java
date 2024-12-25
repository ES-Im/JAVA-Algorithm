import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        if(cnt > 100) System.exit(0);

        StringBuilder[] arr = new StringBuilder[cnt];
        for(int i = 0; i < cnt; i++) {
            arr[i] = new StringBuilder(sc.nextLine());
        }
        int count = 0;  

        loopOut :
        for (int i = 0; i < cnt; i++) {
            StringBuilder compressed = arr[i];
            for (int j = 0; j < compressed.length() - 1; j++) {
                if(compressed.charAt(j) == compressed.charAt(j+1)) {
                    compressed.deleteCharAt(j+1);
                    j--;
                }
            }
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < compressed.length(); j++) {
                if(!set.add(compressed.charAt(j))){
                    continue loopOut;
                }
            }
            count++;
        }

        System.out.println(count);
    }
}