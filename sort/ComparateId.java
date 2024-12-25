package sort;

import java.util.*;

import static java.util.Arrays.compare;
// MyUser 필드에서 Id를 비교하고 싶을때 -> Comparator을 구현하여 compare 메서드를 오버라이딩해서 가져다 쓰면 된다.
// 일회성으로 쓰는거라면 람다식으로 이용하면 된다.

public class ComparateId {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 25);

        List<MyUser> users = new ArrayList<>();
        users.add(myUser1);
        users.add(myUser2);
        users.add(myUser3);

        // 람다식 정렬
        Comparator<MyUser> comparator = (o1, o2) -> o1.getId().compareTo(o2.getId());
        // comparator 기준 정렬
        users.sort(comparator);

        System.out.println(Arrays.toString(users.toArray()));
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=25}]

    }
}