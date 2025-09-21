import java.util.*;

// 3. Stream API 이용
class Solution {
    public String solution(String s) {
        IntSummaryStatistics stats = Arrays.stream(s.split(" "))
                                           .mapToInt(Integer::parseInt)
                                           .summaryStatistics();
        return stats.getMin() + " " + stats.getMax();
    }
}

// 2. Integer의 MAX_VALUE와 MIN_VALUE 이용
// class Solution {
//     public String solution(String s) {
//         String[] arr = s.split(" ");
        
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
        
//         for(String a : arr) {
//             int cur = Integer.parseInt(a);
//             min = (cur < min)? cur : min;
//             max = (cur > max)? cur : max;
//         }
        
//         return min + " " + max;
//     }
// }

// 1. split -> for(integer 파싱) -> 정렬 : 불필요한 정렬로 시간복잡도 증가
// class Solution {
//     public String solution(String s) {
//         StringBuilder answer = new StringBuilder();
//         String[] arr = s.split(" ");
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(String a : arr) {
//             list.add(Integer.parseInt(a));    
//         }

//         Collections.sort(list);
        
//         answer.append(list.get(0) + " " + list.get(arr.length-1));
        
//         return answer.toString();
//     }
    
// }

