import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        String[] arr = Arrays.stream(numbers)
                             .mapToObj(String::valueOf)
                             .toArray(String[]::new);
        
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if(arr[0].equals("0")) return "0";
        
        for(int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }
        
        
        return answer.toString();
    }
}