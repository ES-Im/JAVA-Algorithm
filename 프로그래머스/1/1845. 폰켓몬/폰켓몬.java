import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        answer = Math.min(nums.length/2, map.size());
        
        return answer;
    }
}