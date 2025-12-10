import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> match = new HashMap<>();
        
        for(String[] cloth : clothes) {
            match.put(cloth[1], match.getOrDefault(cloth[1], 0) + 1);
        }
        
        int result = 1;
        
        for(Integer i : match.values()) {
            result *= (i+1);
        }
        
        return result-1;
    }
}

// 이전코드
// import java.util.*;

// class Solution {
//     public int solution(String[][] clothes) {
//         int answer = 1;
//         HashMap<String, Integer> coni = new HashMap<>();
        
//         for(int i = 0; i < clothes.length; i++) {
//             String category = clothes[i][1];
//             coni.put(category, coni.getOrDefault(category, 1)+1);   // 안입었을때 경우의 수 추가 (디폴트 : +1)
//         }
        
//         // for(String key : coni.keySet()) {
//         //     System.out.println(key + " : " + coni.get(key));
//         // }
        
//         for(Integer cnt : coni.values()) {
//             answer *= cnt;            
//         }
        
        
//         return answer - 1;
//     }
// }