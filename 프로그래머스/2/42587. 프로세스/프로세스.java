import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Resource> que = new LinkedList<>();
        
        int id = 0;
        
        for(int p : priorities) {
            que.offer(new Resource(id++, p));
        }
        
        PriorityQueue<Resource> pque = new PriorityQueue<>(que);
        
       while (!que.isEmpty()) {
            Resource current = que.poll();

            // 현재 문서의 우선순위가 남은 pque 요소 중 중 최댓값과 같은지 확인
            if (current.prio == pque.peek().prio) {
                pque.poll();  // 최댓값 제거
                answer++;

                // 내가 찾던 id라면 종료
                if (current.id == location) {
                    return answer;
                }
            } else {
                // 뒤에 더 높은 게 있다면 다시 큐 뒤로 보냄
                que.offer(current);
            }
        }
        
        
        return answer;
    }
}

class Resource implements Comparable<Resource> {
    Integer id;
    Integer prio;
    
    Resource(Integer id, Integer prio) {
        this.id = id;
        this.prio = prio;
    }
    
    @Override
    public int compareTo(Resource r) {
        if(r.prio == this.prio) return Integer.compare(r.id, this.id);  // 가중치가 같다면 id기준 내림차순
        else return Integer.compare(r.prio, this.prio); // 가중치가 다르면 가중치 기준 내림차순
    }
}