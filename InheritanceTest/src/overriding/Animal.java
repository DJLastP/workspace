package overriding;

public class Animal {
    public void sound(){
        System.out.println("동물이 웁니다.");
    }
}

class Dog extends Animal{
        //메소드 오버라이딩
        //
    public void sound(){
        //부모클래스의 메소드를 호출할 때에는
        //super. 을 사용한다
        //super.sound();
        System.out.println("멍멍");

    }
}
