//메소드는 선언 영역과 호출영역으로 구분.
//메소드의 선언은 클래스 안에서 한다. 또 다른 메소드 선언의 밖에서 진행.
//메소드의 호출은 메소드의 선언 영역 안에서 사용.

//메소드 선언 문법

import java.lang.reflect.Method;

//접근제한자 리턴타입 메소드명(매개변수들...) {
//(public) (void)  (hello)()
//  실행내용작성
//}
public class 메소드01 {
    public static void main(String[] args) {
        hello();
        hello2();
        hello();
    }

    public static void hello(){
        System.out.println("hello");
    }

    public static void hello2(){
        System.out.println("반갑습니다");
    }

}
