import java.sql.SQLOutput;

public class Man {
    String name;

    public Man(){
        System.out.println("Man 생성자 호출");
        this.name = "";
    }

    public void tellName(){
        System.out.println("이름은 " + name);
    }
}


//상속의 문법 : 클래스명  + extends + 상속 받을 클래스명
//상속 받은 클래스에서 정의된 변수 및 메소드를 가지게 된다.
//        Man              BusinessMan
//     부모클래스              자식클래스
//     수퍼클래스              서브클래스
//     상위클래스              하위클래스
class BusinessMan extends Man{
    String company;

    public BusinessMan(){
        super(); //부모클래스의 기본 생성자 호출
        System.out.println("BussinessMan 생성자 호출");
        this.company = "";
    }

    public void tellInfo(   ){
        System.out.println("제 직장은 " + company);
    }

}
