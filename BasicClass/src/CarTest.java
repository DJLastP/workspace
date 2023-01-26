public class CarTest {
    public static void main(String[] args) {
        //Car 클래스의 객체 선언.
        //문법 : class명 객체명;

        Car car1;
        //선언한 객체 생성
        car1 = new Car();

        //객체의 선언 및 생성

        Car car2 = new Car();

        //car2 차량의 차량명을 출력
        //객체가 가진 변수 혹은 메소드 접근
        //문법 : 객체명.변수명, 객체명.메소드명
        System.out.println(car2.carName);

        //car2 차량의 금액을 1000원으로 변경하는 코드
        car2.price = 1000;


        car2.powerOn();
    }
}
