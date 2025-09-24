import java.util.*;

class Solution {
    
    // HashMap 키 중복이 안되는 점 이용 
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for(String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        for(String m : map.keySet()) {
            if(map.get(m) == 1) {
                answer = m;
                break;
            }
        }
        
        return answer;
    }
}
    
    
    // 체크 인덱스 사용 - 중첩 반복문으로 효율x
//     public String solution(String[] participant, String[] completion) {
//         String answer = "";
//         int[] checkIdx = new int[participant.length];
        
//         for(int i = 0; i < completion.length; i++) {
//             String curName = completion[i];
//             int n = 0;
            
//             while(n < participant.length) {
//                 if(checkIdx[n] == 0 && curName.equals(participant[n])) {
//                     checkIdx[n] = 1;    
//                     break;
//                 }
//                 n++;
//             }
//         }
        
//         for(int i = 0; i < checkIdx.length; i++) {
//             if(checkIdx[i] != 1) {
//                 answer = participant[i];
//                 break;
//             }
//         }
        
//         return answer;
//     }
