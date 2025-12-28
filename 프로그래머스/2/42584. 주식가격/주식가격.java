import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < prices.length; i++) {
            
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.pop();
            }
            
            stack.push(i);
        }
        
        for(int t : stack) {
            answer[t] = prices.length - 1 - t;
        }        
        
        
        return answer;
    }
}

/* 이전 코드 
import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < prices.length; i++) {
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()) {
            answer[stack.peek()] = prices.length -stack.peek() - 1;
            stack.pop();
        }
        
        
        return answer;
    }
}

*/