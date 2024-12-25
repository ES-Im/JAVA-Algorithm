package sort;
import sort.MyUser;

import java.util.Arrays;

public class ComparableMain {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("A", 30);
        MyUser user2 = new MyUser("B", 25);
        MyUser user3 = new MyUser("C", 20);

        MyUser[] array = {user1, user2, user3};
        System.out.println("기본 정렬 = " + Arrays.toString(array));
        // [MyUser{id='A', age=30}, MyUser{id='B', age=25}, MyUser{id='C', age=20}]

        Arrays.sort(array); // MyUser 클래스에서 구현한 compareTo 대로 정렬이 된다.
        System.out.println("Comparable 기본 정렬 = " + Arrays.toString(array));
        //  [MyUser{id='C', age=20}, MyUser{id='B', age=25}, MyUser{id='A', age=30}]
    }

}
