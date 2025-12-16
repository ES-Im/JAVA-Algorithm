import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> que = new LinkedList<>();
        int time = 0;
        int aboveBridge = 0;
        int idx = 0;

        for (int i = 0; i < bridge_length; i++) que.offer(0);
        
        while(idx < truck_weights.length) {
            time++;
            
            int out = que.poll();
            aboveBridge -= out;
            
            if(aboveBridge + truck_weights[idx] <= weight) {
                que.offer(truck_weights[idx]);
                aboveBridge += truck_weights[idx];
                idx++;
            } else {
                que.offer(0);
            }
        }
        
        while(!que.isEmpty()) {
            que.poll();
            time++;
        }
        
        
        return time;
    }
}