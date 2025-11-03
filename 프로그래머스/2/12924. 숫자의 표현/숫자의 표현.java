class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for (int lt = 1; lt <= n; lt++) {
            int sum = 0;
            for(int next = lt; next <= n; next++) {
                sum += next;
                if(sum == n && (lt != next)) {
                    // System.out.println("next = " + next + "lt = " + lt);
                    
                    answer++;
                    break;
                } else if (sum > n) break;
            }
            
        }
        
        
        return answer;
    }
}