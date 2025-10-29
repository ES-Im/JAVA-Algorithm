import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        StringBuilder tmp = new StringBuilder(s);
        int idx;
        int cnt = 0;
        int deleteZero = 0;
        
        while(!tmp.toString().equals("1")) {
            while((idx = tmp.indexOf("0")) != -1) {
                tmp.replace(idx, idx+1,"");
                deleteZero++;
            }
            
            tmp = new StringBuilder(Integer.toBinaryString(tmp.length())); 
            
            cnt++;
        }
        
        answer[0] = cnt;
        answer[1] = deleteZero;
        return answer;
    }
}
