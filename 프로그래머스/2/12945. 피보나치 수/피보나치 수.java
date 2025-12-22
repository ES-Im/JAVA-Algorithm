// (1) DFS + 메모리제이션 활용  (2) DP 반복문 두가지 방법
class Solution {
    
    static int[] checkN;
    
    // (1)
    public static int DFS(int n) {
        if(checkN[n] != - 1) return checkN[n];
        
        checkN[n] = (DFS(n-1) + DFS(n-2)) % 1234567;
        
        return checkN[n];
    }
    
//     // (2) 
//     public int DP(int n) {
//         if(n<2) return n;
        
//         int fst = 0;
//         int snd = 1;
//         for(int i = 2; i <= n; i++) {
//             int tmp = snd;
//             snd = (fst + snd) % 1234567;
//             fst = tmp;
//         }
        
//         return snd;

//     }
    
    public int solution(int n) {
        checkN = new int[n+1];
        
        for(int i = 0; i <= n; i++) {
            checkN[i] = -1;
        }
        checkN[0] = 0;
        checkN[1] = 1;
        
        return DFS(n);
    }
}