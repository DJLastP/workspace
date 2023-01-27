//생성자 - 모든 멤버변수의 값을 초기화하는 작업
//생성자는 클래스에서 반드시 하나는 존재해야 함.
//개발자가 생성자를 구현하지 않으면 자동으로
//기본생성자 (default construtor)를 생성해 준다.
//기본생성자 : 생성자의 내용이 없고, 매개변수도 없는 생성자.
//좋은 클래스의 여건 :
//1. 모든 멤버변수는 초기화를 해준다.
//2. 멤버변수 선언과 동시에 초기화는 좋지않다.
//

public class ManTest {
    public static void main(String[] args) {
        //클래스명 참조변수명 = new 생성자();
        //Man() 이라는 생성자로 초기화된 값을 갖는
        //새로운 객체 man1을 생성해주세요
        Man man1 = new Man();
        man1.printMan();
        man1.initMan("홍길동", "20","울산");
        man1.setName("홍길동");
        man1.setAddr("울산");
        man1.setAge("30");
        man1.printMan();

    }
}
