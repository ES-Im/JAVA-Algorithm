import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toUpperCase().toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : input) {
            set.add(c);
        }
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : set) {
            int cnt = 0;
            for (char i : input) {
                if(c == i) cnt++;
            }
            map.put(c, cnt);
        }

        List<Map.Entry<Character, Integer>> m = new ArrayList<>(map.entrySet());
        m.sort((entry1, entry2) -> {
            return entry2.getValue().compareTo(entry1.getValue());
        });

        if(m.size() > 1 && m.get(0).getValue().equals(m.get(1).getValue())) {
            System.out.println("?");
        } else {
            System.out.println(m.get(0).getKey());
        }

        scanner.close();

    }
}
