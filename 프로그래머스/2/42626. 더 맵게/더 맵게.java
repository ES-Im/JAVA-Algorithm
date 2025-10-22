import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> prio = new PriorityQueue<>();
        
        for(int i : scoville) {
            prio.offer(i);
        }
        
        while(prio.peek() < K) {
            if(prio.size() == 1) return -1;
            
            int cur = prio.poll() + prio.poll()*2;
            prio.offer(cur);
            answer++;
        }
        
        return answer;
    }
}