// 원소 값이 가장 긴 변이거나 = 갯수 : [(sides[큰거]) ~ (sides합 - 1)] + 1 = sides[작은거]가 갯수
// 가장 긴게 아닐 때 = 갯수 : [(side[큰] - side[작] + 1) ~ sides[큰거]] + 1 = sides[작은거]가 갯수

import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int small = sides[0], big = sides[1];
        
        int answer = 2*small - 1;
        
        
        
        return answer;
    }
}