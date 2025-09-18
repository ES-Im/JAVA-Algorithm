import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {    // m 사과수량 / 3 등급 score 사과 등급
        int answer = 0;
        
        Arrays.sort(score); 
        
        // i = len  > i - m > i - 2m .... (i가 m보다 클때동안만)
        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }
        
        return answer;
    }
}