import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int len = triangle.length;
        long[][] arr = new long[len][len];
        arr[0][0] = triangle[0][0];
        
        for (int i = 1; i < len; i++) { 
            for(int j = 0; j <= i; j++) { // 시작 [i][0] 끝 [i][i]
                
                if(j == 0) arr[i][j] = arr[i-1][j] + triangle[i][j];
                if(j == i) arr[i][j] = arr[i-1][i-1] + triangle[i][j];
                if(j != 0 && j != i) {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i-1][j-1]) + triangle[i][j];  // 이전층 좌우 Max 비교 & 해당 자리 숫자 +
                }
                
            }
        }
        
        // for(long[] i : arr) {
        //     for(long l : i) {
        //         System.out.print(l + " ");        
        //     }
        //     System.out.println();
        // }
        
        long answer = 0L;
        
        for(long z : arr[len-1]) {
            answer = (answer < z)? z : answer;
        }
        
        
        return (int) answer;
    }
}