import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int max = citations.length;
        int lt = 0;
        
        while(lt < citations.length) {
            if(citations[lt] >= max) return max;
            max--; lt++;
        }
        return 0;
    }
}