import java.util.*;

class Solution {
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
}