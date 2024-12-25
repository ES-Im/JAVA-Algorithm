package sort;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMain {
    public static void main(String[] args) {
        Integer[] array = {3,2,1};
        System.out.println(Arrays.toString(array)); // 3,2,1

        // 0. 기본 정렬 : Arrays.sort : 데이터가 작을 때 Dual-PivotQuickSort 사용, 클때는 TimSort 사용 (O(n log n)성능
        Arrays.sort(array);
        System.out.println("기본 정렬 = " + Arrays.toString(array)); // 1,2,3

        System.out.println("Comparator 비교======================================================================");
        // 1. AscComparator
        Arrays.sort(array, new AscComparator()); // Sort(Array, Comparator) : 사용자 지정 정렬 기준으로 적용
        System.out.println("AscComparator = " + Arrays.toString(array));    // 1,2,3
        // 2. DescComparator
        Arrays.sort(array, new DescComparator());
        System.out.println("DescComparator = " + Arrays.toString(array));   // 3,2,1
        // 3. Comparator 구현체에 .reversed() 메서드를 사용하면, 비교의 결과를 반대로 변경한다
        Arrays.sort(array, new AscComparator().reversed());
        System.out.println("Asc.reverse = " + Arrays.toString(array));      // 3,2,1
    }

    /* Comparator 인터페이스에서는 int Comparator(T o1, T o2) 필드 有 : 두 값을 비교하여 더 작은 값을 반환하는게 앞으로 온다.*/
    // 오름차순 구현
    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }
    // 내림차순 구현
    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}
