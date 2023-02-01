package phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        SmartPhone p2 = new SmartPhone();

        //---------------------------------
        //다형성
        //부모클래스형으로 자식클래스 객체생성가능
        //부모클래스의 변수와 메소드만 사용가능.
        //

        Phone p3 = new SmartPhone();

        //오류!
//      SmartPhone p4 = new Phone();
    }
}
