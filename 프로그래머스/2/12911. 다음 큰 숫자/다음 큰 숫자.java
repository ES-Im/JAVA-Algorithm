import java.util.*;

class Solution {
    public int solution(int n) {
        // 2진수 변환 - 0을 replace로 삭제 - String.length 활용
        int nLen = Integer.toBinaryString(n).replace("0","").length();
        int tLen = 0;
        
        while(true) {
            tLen = Integer.toBinaryString(++n).replace("0","").length();
            if(nLen == tLen) {
                return n;
            }
        }
    }
}