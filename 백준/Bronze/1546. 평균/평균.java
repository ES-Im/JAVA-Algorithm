import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ex = sc.nextInt();
        int[] origin = new int[ex];

        for (int i = 0; i < ex; i++) {
            origin[i] = sc.nextInt();
        }

        int maxScore = 0;
        for (int i : origin) {
            maxScore = Math.max(maxScore, i);
        }

        double[] fake = new double[ex];
        for (int i = 0; i < ex; i++) {
            fake[i] = ((double)origin[i])/ ((double)maxScore) * 100;
        }

        double totalFakeScore = 0;
        for (double i : fake) {
            totalFakeScore += i;
        }

        System.out.println(totalFakeScore / (double) ex);
    }
}


