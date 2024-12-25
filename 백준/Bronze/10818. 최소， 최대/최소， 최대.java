import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            list.add(sc.nextInt());
        }
        sc.nextLine();
        int min = list.get(0);
        int max = list.get(0);
        for (Integer i : list) {
            min = min < i? min : i;
            max = max > i? max : i;
        }

        System.out.println(min + " " + max);


    }
}


