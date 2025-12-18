import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        
        return stack.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}


// 예전 풀이 (Dec 10)
// import java.util.*;

// public class Solution {
//     public int[] solution(int[] arr) {
//         int[] answer;
//         Stack<Integer> stack = new Stack();
        
//         for(int a : arr) {
//             if(!stack.isEmpty() && stack.peek() == a) continue;
//             stack.add(a);
//         }
        
//         answer = stack.stream().mapToInt(Integer::intValue).toArray();
            
        
//         return answer;
//     }
// }