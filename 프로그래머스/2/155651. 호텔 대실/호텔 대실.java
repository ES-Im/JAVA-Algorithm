import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        List<int[]> list = new ArrayList<>();
        
        for (String[] time : book_time) {
            int start = toMinute(time[0]);
            int end = toMinute(time[1]) + 10;   // 청소시간 10분 추가
            list.add(new int[]{start, end});
        }

        // 예약 시작시간으로 정렬
        Collections.sort(list, (a, b) -> a[0] - b[0]);

        // sort된 list 기준 종료시간 최솟값을 구하기 위해 PriorityQueue 사용
        PriorityQueue<Integer> prio = new PriorityQueue<>();
        
        for (int[] t : list) {
            if (!prio.isEmpty() && prio.peek() <= t[0]) {  
                prio.poll();  // 꺼낸 종료시간이 저장된 방의 종료시간보다 크다면 이전 방 재활용
            }
            
            prio.offer(t[1]); // 대상 종료시간이 저장된 방의 종료시간보다 작다면 새로운 방 추가
        }

        return prio.size();
    }

    private int toMinute(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}