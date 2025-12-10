import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        
        for(int t : topping) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }
        
        for(int i = 0; i < topping.length; i++) {
            int targetKey = topping[i];
            left.put(targetKey, left.getOrDefault(targetKey, 0) + 1);
            right.put(targetKey, right.get(targetKey) - 1);
            if(right.get(targetKey) == 0) right.remove(targetKey);
            if(right.size() == left.size()) answer++;
        }
        
        return answer;
    }
}