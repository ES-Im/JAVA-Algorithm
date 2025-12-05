import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        
        for (int i = 1; i < len; i++) {
            for(int j = 0; j < triangle[i].length; j++) {
                if(j == 0) triangle[i][j] += triangle[i-1][j];
                else if(j == i) triangle[i][j] += triangle[i-1][j-1];
                else triangle[i][j] = Math.max(triangle[i][j]+triangle[i-1][j-1], triangle[i][j]+triangle[i-1][j]);
            }
        }
        
        for(int j : triangle[len - 1]) {
            answer = Math.max(answer, j);
        }
        
        return answer;
        
    }
}
