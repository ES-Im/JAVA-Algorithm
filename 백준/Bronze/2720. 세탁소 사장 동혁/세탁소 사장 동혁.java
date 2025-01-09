import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> kind = new LinkedHashMap<>();
        kind.put("Quarter", 25);
        kind.put("Dime", 10);
        kind.put("Nickel", 5);
        kind.put("Penny", 1);

        int cnt = sc.nextInt();
        Deque<Integer> result = new ArrayDeque<>(4*cnt); // 거스름돈 수
        Deque<Integer> gettedMoney = new ArrayDeque<>(cnt); // 받은 돈
        for (int i = 0; i < cnt; i++) {
            gettedMoney.offer(sc.nextInt());
        }

        while(!gettedMoney.isEmpty()) {
            int targetMoney = gettedMoney.pop();
            for (Integer value : kind.values()) {
                int max = targetMoney / value;
                result.offer(max);

                targetMoney -= value * max;
            }
        }

        int printCnt = 0;

        for (Integer i : result) {
            System.out.print(i + " ");
            printCnt++;
            if(printCnt % 4 == 0) {
                System.out.println();
            }
        }




    }
}