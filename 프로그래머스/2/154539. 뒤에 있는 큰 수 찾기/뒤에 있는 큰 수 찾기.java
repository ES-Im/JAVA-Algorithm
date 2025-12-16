import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];
        
        for(int i = numbers.length - 1; i >= 0; i--) {
            int cur = numbers[i];
            answer[i] = -1;
            
            while(!stack.isEmpty()) {
                int top = stack.peek();
                
                if(top > cur) {
                    answer[i] = top;
                    break;
                }
                stack.pop();
            }
            
            stack.push(cur);
        }
        
        
        return answer;
    }
}