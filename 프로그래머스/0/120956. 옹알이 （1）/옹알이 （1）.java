class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bal = {"aya", "ye", "woo", "ma"};
        String tmp = "";

        for(String i : babbling) {
            for(String j : bal) {
                tmp = i.replace(j, " ");
                i = tmp;
            }
            if(i.isBlank()) answer++;
        }
        
        return answer;
    }   
}