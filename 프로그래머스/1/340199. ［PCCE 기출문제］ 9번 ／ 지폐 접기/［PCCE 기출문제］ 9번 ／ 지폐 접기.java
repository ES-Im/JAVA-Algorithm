class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(true) {

            if(checkSize(wallet, bill)) {
                return answer;
            } else {
                int halfIdx = bill[0] >= bill[1]? 0 : 1;
                bill[halfIdx] /= 2;
                answer++;
            }
            
        }
        
    }
    
    
    static boolean checkSize(int[] wallet, int[] bill) {
        
        int maxW = Math.max(wallet[0], wallet[1]);
        int maxB = Math.max(bill[0], bill[1]);
        int minW = Math.min(wallet[0], wallet[1]);
        int minB = Math.min(bill[0], bill[1]);
        
        if(maxW >= maxB && minW >= minB) return true;
        else return false;
        
    }
}