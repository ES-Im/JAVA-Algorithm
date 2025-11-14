// map 자료구조에서 getOrDefault로 사이즈 당 갯수 정리 
// -> key만 뽑은 List 정리 및, map의 Value기준 내림차순
// -> 문제 요구사항 시행

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        List<Integer> keySet = new LinkedList<>(map.keySet());
        
        keySet.sort((n1, n2) -> map.get(n2).compareTo(map.get(n1)));
        
        for(Integer key : keySet) {
            if(k > map.get(key)) {
                k-= map.get(key);
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}
  
