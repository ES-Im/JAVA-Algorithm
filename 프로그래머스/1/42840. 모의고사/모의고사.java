import java.util.*;

class Solution {
    
    public int[] solution(int[] answers) {
        List<Integer> answer = new LinkedList<>();
        List<Student> students = Arrays.asList(
                new Student(1, new LinkedList<>(List.of(1, 2, 3, 4, 5)), 0),
                new Student(2, new LinkedList<>(List.of(2, 1, 2, 3, 2, 4, 2, 5)), 0),
                new Student(3, new LinkedList<>(List.of(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)), 0));
        
        // 인덱스 순서대로 poll (int변수 저장) -> 같은지 비교 -> 꺼낸 int를 뒤로 보내기(add)
        for(int a : answers) {
            for(Student s : students) {
                int tmp = s.nums.poll();
                if(a == tmp) s.score += 1;
                s.nums.add(tmp);
            }
        }
        
        Collections.sort(students);
        int max = students.get(0).score;
        
        for(Student s : students) {
            if(max == s.score) {
                answer.add(s.id);
            }
        }
        
        // ★ List<Integer> → int[] 변환 
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

class Student implements Comparable<Student> {
    int id;
    Queue<Integer> nums;
    int score;
    
    public Student(int id, Queue<Integer> nums, int score) {
        this.id = id;
        this.nums = nums;
        this.score = score;
    }
    
    @Override
    public int compareTo(Student s) {
        return Integer.compare(s.score, this.score);
    }
    
}