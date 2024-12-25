import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            list.add(i, sc.nextInt());
            sc.nextLine();
        }

        int max = list.get(0);
        int index = 0;

        for (int i = 0; i < 9; i++) {
            if(max < list.get(i)) {
                max = list.get(i);
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);

    }
}


