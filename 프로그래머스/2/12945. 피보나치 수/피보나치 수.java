// DFS로? 투포인터로? → DFS + 메모리제이션 활용
class Solution {
    static int[] checkN;
    
    public static int DFS(int n) {
        if(checkN[n] > 0) return checkN[n];
        if(n == 0) return checkN[n] = 0;
        if(n == 1) return checkN[n] = 1;
        else if(n == 2) return checkN[n] = 1;
        else return checkN[n] = (DFS(n-2) + DFS(n-1)) % 1234567;
    }
    
    public int solution(int n) {
        
        checkN = new int[n+1];
        int answer = DFS(n);        
        
        return answer;
    }
}