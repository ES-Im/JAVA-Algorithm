import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            list.add(sc.nextInt());
        }
        sc.nextLine();

        for (Integer i : list) {
            if(i < b) {
                System.out.print(i + " ");
            }
        }


    }
}


