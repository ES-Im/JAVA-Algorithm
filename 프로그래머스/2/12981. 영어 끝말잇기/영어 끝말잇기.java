import java.util.*;

class Att {
    int id;
    static Map<String, Integer> speaks = new HashMap<>();
    int cnt = 0;
    
    public Att(int id) {
        this.id = id;
    }
    
    public void addMap(String word) {
        speaks.put(word, speaks.getOrDefault(word, 0) + 1);
        cnt++;
    }
}

class Solution {
    static List<Att> ppl = new ArrayList<>();
    
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        for(int i = 0; i < n; i++) {
            ppl.add(new Att(i+1));
        }
        
        char last = words[0].charAt(words[0].length()-1);
        
        System.out.println(last);
        for(int i = 0; i < words.length; i++) {
            Att target = ppl.get(i%n);
            target.addMap(words[i]);
                
            System.out.println("Person " + target.id + ", word: " + words[i] + ", count: " + target.speaks.get(words[i]));

            if(target.speaks.get(words[i]) == 2
                || (i != 0 && last != words[i].charAt(0))) {
                System.out.println("2감지");
                answer[0] = target.id;
                answer[1] = target.cnt;
                break;
            }
            
            last = words[i].charAt(words[i].length()-1);
        }
        
        return answer;
    }
}