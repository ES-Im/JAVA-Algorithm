class Solution {
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        DFS(numbers, target, 0, 0); // (3)idx = 배열의 현재 숫자 인덱스, (4) 합계
        return answer;
    }
    
    public void DFS(int[] numbers, int target, int idx, int sum) {
        
        // 모든 숫자 다 쓸 때 return / sum = target 이면 answer ++; 
        if(idx == numbers.length) {
            if(target == sum) answer++;
            
            return;
        }
        
        // +일때 DFS
        DFS(numbers, target, idx + 1, sum + numbers[idx]);
        
        // -일때 DFS
        DFS(numbers, target, idx + 1, sum - numbers[idx]);
        
    }

 
}
