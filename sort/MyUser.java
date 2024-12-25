package sort;

public class MyUser implements Comparable<MyUser> {

    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    //  비교할 객체 클래스에 Comparable을 구현하려면 compareTo메서드를 오버라이딩한다.
    @Override
    public int compareTo(MyUser o) {    // 파라미터에는 현재의 객체와 비교할 다른 객체가 들어간다.
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public String getId() {
        return id;
    }
}
