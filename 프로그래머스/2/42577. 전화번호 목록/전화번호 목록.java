// phone_book에서 가장 길이가 짧은거 기준, 해당 길이만큼 각 인덱스 값을 잘라서 HashSet에 저장
// phone_book의 length와 set의 size가 같은지 확인 (같으면 false / 다르면 true)

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
    

    // 정확성 테스트 실패 -> 중간 크기의 String이 접두사가 된다면 테스트 미통과
//     public boolean solution(String[] phone_book) {
//         boolean answer = true;
        
//         Set<String> set = new HashSet<>();
        
//         int min = Integer.MAX_VALUE;
//         for(String p : phone_book) min = Math.min(min, p.length());
//         for(String p : phone_book) {
//             set.add(p.substring(0, min));
//         }
        
//         if(phone_book.length != set.size()) answer = false;
        
//         return answer;
//     }
}