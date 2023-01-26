//자동차를 만들기 위한 설계도
//class(설계도)를 구성하는 요소
//1. 변수
//2. 메소드의 선언
//3. 생성자
//변수의 종류
//멤버변수 : 클래스 안에서 선언된 변수
//지역변수 : 메소드 안에서 선언된 변수, 초기화필수.
//매개변수 :

public class Car {
    //차량명, 제조사, 가격
    String carName; //멤버변수, 필드
    String brand;
    int price;

    //시동을 켜는 기능 : 접근제한자 리턴타입 메소드명
    public void powerOn(){
        System.out.println("시동을 켭니다.");
    }

    //차가 움직이는 기능
    public void moveCar(){
        System.out.println("차가 움직입니다.");
    }

    //차가 멈추는 기능
    public void stopCar(){
        System.out.println("차가 멈춥니다.");
    }
}
