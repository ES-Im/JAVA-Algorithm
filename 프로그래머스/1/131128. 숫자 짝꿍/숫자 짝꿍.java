import java.util.*;

// 0~9까지 배열 생성
// countX[digit] 와 countY[digit] 중 작은 값 만큼이 실제 공통으로 쓸 수 있는 개수.
import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for(int i = 0; i < X.length(); i++) {
            countX[X.charAt(i) - '0']++;
        }
        
        for(int i = 0; i < Y.length(); i++) {
            countY[Y.charAt(i) - '0']++;
        }
        
        for(int i = 9; i >= 0; i--) {
            int common = Math.min(countX[i], countY[i]);
            for(int j = 0; j < common; j++) {
                answer.append(i);
            }
        }
        
        if(answer.length() == 0) return "-1";       // 공통 없음
        if(answer.charAt(0) == '0') return "0";     // 0만 있는 경우
        return answer.toString();
    }
}

// 시간 초과 : 
// 원인 1 - 이중 for문: X 길이 × Y 길이 → 최악 O(N×M)
// 원인 2 - PriorityQueue: 삽입 시 log n 연산, 반복되면 누적됨
// 원인 3 - String += 연산

// import java.util.*;

// class Solution {
//     public String solution(String X, String Y) {
//         String answer = "";

//         PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
//         StringBuilder yB = new StringBuilder(Y);
        
        
//         for(int i = 0; i < X.length(); i++) {
//             for(int j = 0; j < yB.length(); j++) {
//                 if(X.charAt(i) == yB.charAt(j)) {
//                     que.add(X.charAt(i) - '0');
//                     yB.deleteCharAt(j);
//                     break;
//                 }
//             }
//         }
        
//         if(que.isEmpty()) return "-1";
//         while(!que.isEmpty()) {
//             answer += que.poll() + "";
//         }
        
//         // 0이연속되면 0으로 치환
//         if(answer.replace("0","").isEmpty()) return "0";
        
        
//         return answer;
//     }
// }