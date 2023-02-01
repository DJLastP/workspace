package overriding;

//연관이 있는 여러 클래스를 공통적 규악을 줌으로써 일괄적 관리에 용이.
//

public class Overriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        //오버라이딩으로 구현된 메소드는
        //자식 클래스에서 재정의된 메소드만 호출 가능!
        d1.sound();

    }
}
