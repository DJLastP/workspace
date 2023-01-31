package study;

//static은 변수 및 메소드에서 사용가능
//static이 선언된 변수 및 메소드는 공용을 의마한다.
//static이 붙은 변수 및 메소드는 자바 문법상 클래스 안에서
//정의가 되지만, 클래스에 속한 건 아니다.
//static 변수 및 메소드는 객체가 생성되기 전에 생성된다.


public class Cnttest {
    public static void main(String[] args) {

    Cnt c1 = new Cnt();
    Cnt c2 = new Cnt();
    Cnt c3 = new Cnt();
    }
}

class Cnt{
    static int num = 0;
    public Cnt(){
        num++;
        System.out.println("객체 생성 " + num);
    }
}
