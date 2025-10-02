import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            PriorityQueue<Integer> prio = new PriorityQueue<>();
            
            for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
                prio.offer(array[j]);
            }
            
            int cnt = commands[i][2]-1;
            int cur = 0;            
            while(cnt-- >= 0) {
                cur = prio.poll();
            }
            
            answer[i] = cur;
        }
        
        return answer;
    }
}