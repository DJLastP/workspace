package study;

public class MemberTest {
    public static void main(String[] args) {
        Member mem1 = new Member();
        Member mem2 = new Member();

        mem1.name = "홍길동";
        mem2.age = 30;

        mem1 = mem2;

        mem1.name = "이순신";
        mem2.age = 40;
    }
}
