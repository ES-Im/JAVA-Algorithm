import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> totalPlayTime = new HashMap<>();
        List<Music> songs = new ArrayList<>();
        
        for(int i = 0; i < genres.length; i++) {
            Music m = new Music(i, genres[i], plays[i]);
            songs.add(m);
            totalPlayTime.put(m.genrn, totalPlayTime.getOrDefault(m.genrn, 0) + m.play);
        }
        
        // ★ 새로 알게 된 것 : keySet으로 리스트로 변환 <- Map은 Collections.sort 사용 불가
        List<String> list = new ArrayList<>(totalPlayTime.keySet());
        Collections.sort(list, (a, b) -> totalPlayTime.get(b) - totalPlayTime.get(a));

        // for (String k : list) {
        //     System.out.println(k + " : " + totalPlayTime.get(k));
        // }
        
        Collections.sort(songs);
        for (String g : list) {
            int count = 0;
            for (Music m : songs) {
                if (m.genrn.equals(g)) {
                    answer.add(m.id);
                    count++;
                }
                if (count == 2) break; 
            }
        }


        return answer.stream().mapToInt(i -> i).toArray();
    }
}

class Music implements Comparable<Music> {
    int id;
    String genrn;
    int play;
    
    public Music(int id, String genrn, int play) {
        this.id = id;
        this.genrn = genrn;
        this.play = play;
    }
    
    @Override
    public int compareTo(Music m) {
        return Integer.compare(m.play, this.play);    
    }
}