/*
     1 1 1 1
     1 0 1 2
     1 1 2 4
     
*/

import java.util.*;

class Solution {
    static final int MOD = 1000000007;
    
    public int solution(int m, int n, int[][] puddles) {

        int[][] route = new int[n][m];
        
        // for(int[] pu : puddles) {
        //     route[pu[0]-1][pu[1]-1] = -1;
        // }
        
        boolean[][] pud = new boolean[n][m];
        for(int[] pu : puddles) {
            pud[pu[1] - 1][pu[0] - 1] = true;
        }
        
        route[0][0] = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                
                if(pud[i][j]) continue;
                
                if(i > 0) route[i][j] += route[i-1][j] % MOD;
                if(j > 0) route[i][j] += route[i][j-1] % MOD;
                
            }
        }
        
        // for(int[] ro : route) {
        //     for(int r : ro) {
        //         System.out.print(r + " ");
        //     }
        //     System.out.println();
        // }
        
        
        return route[n-1][m-1] % MOD;
    }
}