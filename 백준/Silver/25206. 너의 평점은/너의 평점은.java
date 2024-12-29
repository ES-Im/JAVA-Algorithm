import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> gradeList = new HashMap<>();
        gradeList.put("A+", 4.5);
        gradeList.put("A0", 4.0);
        gradeList.put("B+", 3.5);
        gradeList.put("B0", 3.0);
        gradeList.put("C+", 2.5);
        gradeList.put("C0", 2.0);
        gradeList.put("D+", 1.5);
        gradeList.put("D0", 1.0);
        gradeList.put("F", 0.0);

        double cnt = 0, sum = 0;

        for (int i = 0; i < 20; i++) {
            String input = scanner.nextLine();
            String[] inputarr = input.split(" ");
            Double credit = Double.parseDouble(inputarr[1]);
            String grade = inputarr[2];
            if(grade.contentEquals("P")) continue;

            sum += gradeList.get(grade) * credit;
            cnt += credit;
        }
        cnt = cnt == 0? 1: cnt;
        System.out.println(sum / cnt);
    }
}