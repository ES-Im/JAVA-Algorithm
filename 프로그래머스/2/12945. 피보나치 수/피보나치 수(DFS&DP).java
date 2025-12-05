class Solution {
    
    // 1. DFS + 메모이제이션
    static int[] checkN;
    
    public static int DFS(int n) {
        
        if(checkN[n] != 0) return checkN[n];
        
        if(n == 0 || n == 1) return checkN[n] = n;
        
        return checkN[n] = (DFS(n-1) + DFS(n-2)) % 1234567;
    }
    
    // 2. DP Bottom-up
    public int DP(int n) {
        if(n < 2) return n;
        
        int a = 0, b = 1;
        for(int i = 2; i <= n; i++) {
            int tmp = b;
            b = (a + b) % 1234567;
            a = tmp;
        }
        
        return b;
    }
            
        
    
    public int solution(int n) {
        
        // checkN = new int[n+1];
        // int answer = DPS(n);
        
        int answer = DP(n);        
        
        return answer;
    }
}
