// f(n) = f(n-1) + f(n-2) 피보나치 수열
import java.util.*;

class Solution {
    static long[] checkIdx = new long[2001];

    public long solution(int n) {
        
        Arrays.fill(checkIdx, -1);
        return DFS(n);
    }
    
    static long DFS(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;
        if(x == 2) return 2;
        
        if(checkIdx[x] != -1) return checkIdx[x];    
        
        
        checkIdx[x] = DFS(x-1) + DFS(x-2);
        return checkIdx[x] % 1234567;
    }
}