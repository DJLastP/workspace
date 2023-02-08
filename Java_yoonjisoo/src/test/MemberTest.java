package test;

public class MemberTest {
    public static void main(String[] args) {
        Member mem = new Member();
        mem.setInfo("자바", "java", "abcd1234", 20);

        //모든 변수값 출력
        mem.showInfo();


        //로그인 결과
        if(mem.isLogin("java", "abcd1234")){
            System.out.println("로그인 가능");
        }
        else {
            System.out.println("로그인 불가능");
        }

        if(mem.isLogin("java", "abcd")){
            System.out.println("로그인 가능");
        }
        else {
            System.out.println("로그인 불가능");
        }
    }
}
