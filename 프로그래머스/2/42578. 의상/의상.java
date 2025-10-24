import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> coni = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            String category = clothes[i][1];
            coni.put(category, coni.getOrDefault(category, 1)+1);   // 안입었을때 경우의 수 추가 (디폴트 : +1)
        }
        
        // for(String key : coni.keySet()) {
        //     System.out.println(key + " : " + coni.get(key));
        // }
        
        for(Integer cnt : coni.values()) {
            answer *= cnt;            
        }
        
        
        return answer - 1;
    }
}