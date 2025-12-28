import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            
            int day = remainDays(progresses[i], speeds[i]);
            
            if(que.isEmpty() || que.peek() >= day) {
                que.offer(day);
            } else {
                arr.add(que.size());
                que.clear();
                que.offer(day);
            }
            
        }
        
        arr.add(que.size());
        
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int remainDays(int progress, int speed) {
        return (int) Math.ceil( (100-progress) / (double) speed ); 
    }
}


/* 이전 코드
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[] date = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0) day++;
            date[i] = day;
        }
        
        int cnt = 1;
        int target = date[0];
        for(int i = 1; i < date.length; i++) {
            if(date[i] <= target) cnt++;
            else {
                answer.add(cnt);
                target = date[i];
                cnt = 1;
            }
        }
        
        answer.add(cnt);
        
        return answer;
    }
*/